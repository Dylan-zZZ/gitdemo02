package com.atguigu.boot.bean;


import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

//@Component
@ConfigurationProperties(prefix = "mycar")//只有加到容器中才能拥有springboot提供的强大功能，所以得添加注解@Component
public class Car {
    private String brand;
    private Integer price;

    public Car(String brand, Integer price) {
        this.brand = brand;
        this.price = price;
    }

    public Car() {
    }

    public String getBrand() {
        return brand;
    }

    public Integer getPrice() {
        return price;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", price=" + price +
                '}';
    }
}
