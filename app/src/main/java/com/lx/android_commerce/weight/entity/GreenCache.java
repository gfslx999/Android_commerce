package com.lx.android_commerce.weight.entity;

import org.greenrobot.greendao.annotation.Entity;
import org.greenrobot.greendao.annotation.Id;
import org.greenrobot.greendao.annotation.Property;
import org.greenrobot.greendao.annotation.Generated;

public
/**
 *@author : 阿森
 *@date : 2020-10-24 10:41
 *@params : 
 *@description:
 */
@Entity
class GreenCache {
    @Id
    private Long id;
    @Property(nameInDb = "CAHCE_VALUE")
    private String value;
    @Generated(hash = 1768232652)
    public GreenCache(Long id, String value) {
        this.id = id;
        this.value = value;
    }
    @Generated(hash = 816316277)
    public GreenCache() {
    }
    public Long getId() {
        return this.id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getValue() {
        return this.value;
    }
    public void setValue(String value) {
        this.value = value;
    }
}
