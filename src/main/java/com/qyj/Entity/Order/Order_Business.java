package com.qyj.Entity.Order;

import lombok.Data;

import java.sql.Timestamp;

@Data
public class Order_Business {

    private int order_businessId;
    private int userId;
    private String customName;
    private String commodityName;
    private String commodityType;
    private int quantity;
    private int price;
    private int totalPrice;
    private String businessAddress;
    private String customAddress;
    private String customMobile;
    private String businessMobile;
    private Timestamp datetime;

}
