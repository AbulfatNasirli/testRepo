package com.example;

public class Coder {
    private double height;
    private double weight;
    private int age;
    private Gender gedner;

    public Coder(double v, double v1) {
    }

    public Coder(double height, double weight, int age, Gender gedner) {
        this.height = height;
        this.weight = weight;
        this.age = age;
        this.gedner = gedner;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Gender getGedner() {
        return gedner;
    }

    public void setGedner(Gender gedner) {
        this.gedner = gedner;
    }
}
