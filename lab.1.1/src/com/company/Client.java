package com.company;

public class Client extends AbstractPerson {
    private int orderNumber;


    public Client(int orderNumber) {
        this.orderNumber = orderNumber;
    }

    public Client(int age, int height, String name, Gender gender, int orderNumber) {
        super(age, height, name, gender);
        this.orderNumber = orderNumber;
    }

    public int getOrderNumber() {
        return orderNumber;
    }



    @Override
    public String toString() {
        return
                "Клиент:" + System.lineSeparator()
                + "\tВаш возраст: " + age + System.lineSeparator()
                + "\tВаш рост: " + height + System.lineSeparator()
                + "\tВаше имя: " + name + System.lineSeparator()
                + "\tВаш гендер: " + gender + System.lineSeparator()
                + "\tНомер заказа: " + orderNumber;
    }
}
