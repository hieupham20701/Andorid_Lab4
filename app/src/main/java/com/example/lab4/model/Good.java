package com.example.lab4.model;

public class Good {
    private String name;
    private String shopName;
    private int imageGoods;

    public Good(String name, String shopName, int imageGoods) {
        this.name = name;
        this.shopName = shopName;
        this.imageGoods = imageGoods;
    }

    public Good() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getShopName() {
        return shopName;
    }

    public void setShopName(String shopName) {
        this.shopName = shopName;
    }

    public int getImageGoods() {
        return imageGoods;
    }

    public void setImageGoods(int imageGoods) {
        this.imageGoods = imageGoods;
    }

    @Override
    public String toString() {
        return "Good{" +
                "name='" + name + '\'' +
                ", shopName='" + shopName + '\'' +
                ", imageGoods=" + imageGoods +
                '}';
    }
}
