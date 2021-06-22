package com.qyj.Entity.Shopping_Cart;

import lombok.Data;

@Data
public class Shopping_Cart_find {

    private int shoppingCartId;

    private int userId;
    private String username;

    private int commodityId;
    private String commodityName;

    private int inventory;

    private int quantity;

    private String mobile;

    private String email;

    private String address;

    private int price;

    private String originAddress;



}
