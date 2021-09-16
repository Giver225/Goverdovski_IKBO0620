package com.company;

public class Employer extends AbstractPerson {
    private int workerID;
    public Employer(int workerID){
        this.workerID = workerID;
    }

    public Employer(int age, int height, String name, Gender gender, int workerID) {
        super(age, height, name, gender);
        this.workerID = workerID;
    }

    public int getWorkerID() {
        return workerID;
    }

    @Override
    public String toString() {
        return
                "Работник:" + System.lineSeparator()
                + "\tВаш возраст: " + age + System.lineSeparator()
                + "\tВаш рост: " + height + System.lineSeparator()
                + "\tВаше имя: " + name + System.lineSeparator()
                + "\tВаш гендер: " + gender + System.lineSeparator()
                + "\tID работника: " + workerID;
    }
}
