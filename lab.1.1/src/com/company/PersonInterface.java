package com.company;

public interface PersonInterface {
    int getAge();
    void setAge(int age) throws Exception;
    int getHeight();
    void setHeight(int height) throws Exception;
    String getName();
    void setName(String name);
    Gender getGender();
    void setGender(Gender gender);
    String toString();
}
