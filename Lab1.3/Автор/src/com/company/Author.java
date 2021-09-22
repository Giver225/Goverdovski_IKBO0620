package com.company;

enum Gender{
    MALE,FEMALE,GENDERFLUID_HELISEXUAL,OTHER;
}

public class Author {
    private String name;
    private String email;
    private Gender gender;

    public Author(String name, Gender gender, String email) {
        this.name = name;
        this.email = email;
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "Author" +
                "name='" + name + '\'' +
                ", gender=" + gender +
                ", email='" + email + '\'';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }
}
