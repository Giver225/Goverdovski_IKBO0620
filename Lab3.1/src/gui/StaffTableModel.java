package gui;

import javax.swing.table.AbstractTableModel;
import java.util.List;

import model.Employee;

public class StaffTableModel extends AbstractTableModel{
    private List<Employee> db;
    private String[] ColsName = {"Name", "Department", "Age", "Phone", "Position", "Gender"};

    public void setData(List<Employee> db) {
        this.db = db;
    }

    public String[] getColsName() {
        return ColsName;
    }

    @Override
    public String getColumnName(int column) {
        return super.getColumnName(column);
    }

    @Override
    public int getRowCount() {
        return db.size();
    }

    @Override
    public int getColumnCount() {
        return ColsName.length;
    }

    public Object getValueAt(int row, int column) {
        Employee emp = db.get(row);

        switch (column) {
            case 0:
                return emp.getName();
            case 1:
                return emp.getDepartment();
            case 2:
                return emp.getAge();
            case 3:
                return emp.getPhone();
            case 4:
                return emp.getPosition();
            case 5:
                return emp.getGender();
        }
        return null;
    }
}
