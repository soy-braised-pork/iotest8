package org.language.iii;

import java.util.Objects;

/**
 * @author zlx <zhulx3@>
 * Creat on 2021-11-15
 */
public class Phone {

    private String brand;
    private double price;
    private int year;


    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getYear() {
        return year;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setYear(int year) {
        this.year = year;
    }




    public Phone() {
    }

    public void phone(String brand, double price, int year){
        this.brand=brand;
        this.price=price;
        this.year=year;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Phone phone = (Phone) o;
        return Double.compare(phone.price, price) == 0 &&
                year == phone.year &&
                Objects.equals(brand, phone.brand);
    }

    @Override
    public int hashCode() {
        return Objects.hash(brand, price, year);
    }
}
