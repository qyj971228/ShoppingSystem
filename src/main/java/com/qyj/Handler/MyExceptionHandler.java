package com.qyj.Handler;

import cn.dev33.satoken.exception.DisableLoginException;
import cn.dev33.satoken.exception.NotLoginException;
import cn.dev33.satoken.exception.NotPermissionException;
import cn.dev33.satoken.exception.NotRoleException;
import com.qyj.Service.impl.User_Impl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

@ControllerAdvice
public class MyExceptionHandler {

    @Autowired
    User_Impl user_impl;

    /**
     * 此拦截器用于全局拦截角色认证异常
     * @param nre
     * @return 此处调试用直接返回到客户端
     */
    @ExceptionHandler(NotRoleException.class)
    @ResponseBody
    public String NotRoleHandler(NotRoleException nre){
        return "角色认证异常,你无权访问此数据";
    }

    /**
     * 此拦截器用于全局拦截权限认证异常
     * @param npe
     * @return 此处调试用直接返回到客户端
     */
    @ExceptionHandler(NotPermissionException.class)
    @ResponseBody
    public String NotPermissionHandler(NotPermissionException npe){
        return "权限认证异常,你无权访问此数据";
    }

    /**
     * 此拦截器用于全局拦截封禁异常
     * @param dle
     * @return 此处调试用直接返回到客户端
     */
    @ExceptionHandler(DisableLoginException.class)
    @ResponseBody
    public String DisableLoginException(DisableLoginException dle){
        String username = user_impl.findById(Integer.valueOf(dle.getLoginId().toString())).getUsername();
        return "当前账号:"+username+"已被封禁,剩余时间:"+dle.getDisableTime();
    }

    /**
     * 此拦截器用于全局拦截登录异常
     * 关于token异常的问题:存在无法正常捕捉token过期异常的问题,token过期时返回token无效异常,其他异常待测试
     * @param nle
     * @return 此处调试用直接返回到客户端
     */
    @ExceptionHandler(NotLoginException.class)
    @ResponseBody
    public String NotLoginHandler(NotLoginException nle){

        nle.printStackTrace();
        String message = "";

        if(nle.getType().equals(NotLoginException.NOT_TOKEN)) {
            //未提供token
            message = "请先登录";
        }else if(nle.getType().equals(NotLoginException.TOKEN_TIMEOUT)) {
            //token已过期
            message = "登录已过期";
        }else if(nle.getType().equals(NotLoginException.BE_REPLACED)) {
            //token已被顶下线
            message = "该用户已在其他地方登录";
        }else if(nle.getType().equals(NotLoginException.KICK_OUT)) {
            //token已被踢下线
            message = "你已被踢下线";
        }else if(nle.getType().equals(NotLoginException.INVALID_TOKEN)) {
            //token无效
            message = "请先登录";
        }else {
            message = "请先登录";
        }
        return message;
    }
}

