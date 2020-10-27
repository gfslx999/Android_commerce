package com.lx.android_commerce.weight.entity;

import org.greenrobot.greendao.annotation.Entity;
import org.greenrobot.greendao.annotation.Id;
import org.greenrobot.greendao.annotation.Property;
import org.greenrobot.greendao.annotation.Generated;

public
/**
 *@author : 阿森
 *@date : 2020-10-26 13:32
 *@params : 
 *@description:
 */
@Entity
class GreenShop {

    @Id(autoincrement = true)
    private Long id;
    @Property(nameInDb = "ShopEntity")
    private String shop;
    @Generated(hash = 1621756828)
    public GreenShop(Long id, String shop) {
        this.id = id;
        this.shop = shop;
    }
    @Generated(hash = 601635634)
    public GreenShop() {
    }
    public Long getId() {
        return this.id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getShop() {
        return this.shop;
    }
    public void setShop(String shop) {
        this.shop = shop;
    }

}
