package com.qyj.Config;

import cn.dev33.satoken.interceptor.SaRouteInterceptor;
import cn.dev33.satoken.router.SaRouterUtil;
import cn.dev33.satoken.stp.StpUtil;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import java.util.Arrays;

@Configuration
public class SaTokenConfigure implements WebMvcConfigurer {
    // 注册sa-token的拦截器
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        // 注册路由拦截器，自定义验证规则
        registry.addInterceptor(new SaRouteInterceptor((request, response, handler) -> {

            // 登录验证 -- 排除多个路径
            SaRouterUtil.match(Arrays.asList("/**"), Arrays.asList("/login", "/register"), () -> StpUtil.checkLogin());

            // 角色认证 -- 拦截以 /role 开头的路由，必须具备[role]角色才可以通过认证
            SaRouterUtil.match("/root/**", () -> StpUtil.checkRole("root"));
            SaRouterUtil.match("/business/**", () -> StpUtil.checkRoleOr("business","root"));
            SaRouterUtil.match("/custom/**", () -> StpUtil.checkRoleOr("custom","root"));
            SaRouterUtil.match("/allRoles/**", () -> StpUtil.checkRoleOr("custom","business","root"));

        })).addPathPatterns("/**");
    }
}
