package com.qyj.Entity.Order;


import lombok.Data;

@Data
public class Order_Custom_Simp {

    private int order_customId;
    private int userId;
    private String businessName;
    private String commodityName;
    private String commodityType;
    private int quantity;
    private int price;
    private int totalPrice;

}
