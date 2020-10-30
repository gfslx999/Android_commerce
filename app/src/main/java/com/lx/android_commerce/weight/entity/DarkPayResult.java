package com.lx.android_commerce.weight.entity;

public
/**
 *@author : 阿森
 *@date : 2020-10-30 16:11
 *@params : 
 *@description:
 */
class DarkPayResult {
    private double price;
    private boolean isCheckedAll = false;

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public boolean isCheckedAll() {
        return isCheckedAll;
    }

    public void setCheckedAll(boolean checkedAll) {
        isCheckedAll = checkedAll;
    }
}
