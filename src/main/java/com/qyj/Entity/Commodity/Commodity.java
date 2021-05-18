package com.qyj.Entity.Commodity;

import lombok.Data;

@Data
public class Commodity {

    private int commodityId;
    private int userId;
    private String commodityName;
    private int price;
    private int inventory;
    private String originAddress;

}
