package controller;

import java.sql.SQLException;
import java.util.List;

import model.DataBase;
import model.Employee;
public class Controller {

    DataBase db = new DataBase();

    public Controller() {
        try {
            db.connect();
            db.getFromDataBase();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void addEmployee(Employee employee) {
        db.addEmployeeDataBase(employee);
    }
    public List<Employee> getEmployees() {
        return db.getEmployees();
    }
}
