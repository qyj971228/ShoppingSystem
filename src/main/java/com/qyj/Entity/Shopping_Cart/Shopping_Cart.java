package com.qyj.Entity.Shopping_Cart;

import lombok.Data;

@Data
public class Shopping_Cart {

    private int shoppingCartId;
    private int userId;
    private int commodityId;
    private int quantity;

}
