/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

/**
 *
 * @author Я
 */
public class Order {
    private int Id;
    private String name;
    private String courier;
    private String dateTime;
    private OrderType type;

    public Order(int Id, String name, String courier) {
        this.Id = Id;
        this.name = name;
        this.courier = courier;
    }

    public int getId() {
        return Id;
    }

    public void setId(int Id) {
        this.Id = Id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCourier() {
        return courier;
    }

    public void setCourier(String courier) {
        this.courier = courier;
    }

    public String getDateTime() {
        return dateTime;
    }

    public void setDateTime(String dateTime) {
        this.dateTime = dateTime;
    }

    public OrderType getType() {
        return type;
    }

    public void setType(OrderType type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Order{" + "Id=" + Id + ", name=" + name + ", courier=" + courier + ", dateTime=" + dateTime + ", type=" + type + '}';
    }
    
}
enum OrderType{
срочнЫй_заказ,
обычный_заказ
}
