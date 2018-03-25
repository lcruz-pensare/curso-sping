package com.pensareluis.Holamundo.entity;

import javax.persistence.*;

/**
 * @author Jorge Álvarez
 * @version 1.0 - 2018/03/23
 */
@Entity
@Table(name="course")
public class Course {


    @Id
    @GeneratedValue
    @Column(name="idCourse")
    public int id;
    @Column(name="name")
    public String name;
    @Column(name="description")
    public String descrption;
    @Column(name="price")
    public int price;
    @Column(name="hours")
    public int hours;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescrption() {
        return descrption;
    }

    public void setDescrption(String descrption) {
        this.descrption = descrption;
    }


    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getHours() {
        return hours;
    }

    public void setHours(int hours) {
        this.hours = hours;
    }

    public Course() {
    }

    public Course(int id, String name, String descrption, int price, int hours) {
        this.id = id;
        this.name = name;
        this.descrption = descrption;
        this.price = price;
        this.hours = hours;
    }

    @Override
    public String toString() {
        return "Course{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", descrption='" + descrption + '\'' +
                ", price=" + price +
                ", hours=" + hours +
                '}';
    }
}
