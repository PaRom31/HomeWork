package ru.gb.lesson5;

public class Employee {
    private String name;
    private String post;
    private String email;
    private String phone;
    private int salary;
    private int age;
    private Employee[] empArray;

    public Employee(String name, String post, String email, String phone, int salary, int age) {

        this.name = name;
        this.post = post;
        this.email = email;
        this.phone = phone;
        this.salary = salary;
        this.age = age;

    }

    public void printObject() {
        System.out.printf("Name: %s\n Post: %s\n Email: %s\n Phone: %s\n Salary: %s\n Age: %s \n\n",
                name, post, email, phone, salary, age);
    }
    public int getAge() {
        return this.age;
    }

}


