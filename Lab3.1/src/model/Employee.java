package model;

final public class Employee extends AbstractPerson {

    final String department;
    final int age;
    final String phone;
    final String position;
    final String gender;

    public Employee(String name, String department, int age, String phone, String position, String gender) {
        super(name);
        this.department = department;
        this.age = age;
        this.phone = phone;
        this.position = position;
        this.gender = gender;
    }

    public String getDepartment() {
        return department;
    }

    public int getAge() {
        return age;
    }

    public String getPhone() {
        return phone;
    }

    public String getPosition() {
        return position;
    }

    public String getGender() {
        return gender;
    }

    @Override
    public String think() {
        return "I'm employee";
    }
}
