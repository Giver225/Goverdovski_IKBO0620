package com.company;

public abstract class AbstractPerson implements PersonInterface{
    protected int age, height;
    protected String name = "";
    protected Gender gender;

    public AbstractPerson() {}

    public AbstractPerson(int age, int height, String name, Gender gender) {
        this.age = age;
        this.height = height;
        this.name = name;
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (isValidAge(age)) {
            this.age = age;
        }
        else {
            System.out.println("Такого возраста не может быть");
            System.exit(0);
        }
    }

    public boolean isValidAge (int age) {
        return (age <= 150) && (age >= 0);
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height){
        if (isValidHeight(height)) {
            this.height = height;
        } else {
            System.out.println("Такого роста быть не может");
            System.exit(0);
        }
    }

    public boolean isValidHeight(int height) {
        return (height <= 250) && (height >= 100);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    @Override
    abstract public String toString();
}
