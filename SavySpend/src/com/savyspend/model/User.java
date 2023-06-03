package com.savyspend.model;

public class User {
    private String name;
    private double income;
    private double expenses;

    public User(String name, double income, double expenses) {
        this.name = name;
        this.income = income;
        this.expenses = expenses;
    }

    // Getters and setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getIncome() {
        return income;
    }

    public void setIncome(double income) {
        this.income = income;
    }

    public double getExpenses() {
        return expenses;
    }

    public void setExpenses(double expenses) {
        this.expenses = expenses;
    }
}
