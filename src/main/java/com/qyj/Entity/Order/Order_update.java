package com.qyj.Entity.Order;

import lombok.Data;

@Data
public class Order_update {

    private int order_businessId;
    private int order_customId;
    private String commodityName;
    private String customAddress;
    private String customMobile;

}
