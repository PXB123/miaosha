/**
 * <h3>miaosha</h3>
 * <p>交易类</p>
 *
 * @author : 蒲雪冰
 * @date : 2019-08-15 13:54
 **/
package com.miaoshaproject.service.model;

import java.math.BigDecimal;

public class OrderModel {

    //交易号
    private String id;

    //购买商品的单价
    private BigDecimal itemPrice;

    //购买的用户的id
    private Integer userId;

    //购买数量
    private Integer amount;

    //购买商品id
    private Integer itemId;

    //购买金额
    private BigDecimal orderPrice;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }

    public Integer getItemId() {
        return itemId;
    }

    public void setItemId(Integer itemId) {
        this.itemId = itemId;
    }

    public BigDecimal getOrderPrice() {
        return orderPrice;
    }

    public void setOrderPrice(BigDecimal orderPrice) {
        this.orderPrice = orderPrice;
    }

    public BigDecimal getItemPrice() {
        return itemPrice;
    }

    public void setItemPrice(BigDecimal itemPrice) {
        this.itemPrice = itemPrice;
    }
}
