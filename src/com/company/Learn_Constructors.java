package com.company;

class employeeData{
    private int salary;
    String empName;
    int empID;
    private long empMobile;
    public int getSalary() {
        return salary;
    }
    public void setSalary(int salary) {
        this.salary = salary;
    }
    public String getEmpName() {
        return empName;
    }
    public void setEmpName(String empName) {
        this.empName = empName;
    }
    public int getEmpID() {
        return empID;
    }
    public void setEmpID(int empID) {
        this.empID = empID;
    }
    public long getEmpMobile() {
        return empMobile;
    }
    public void setEmpMobile(long empMobile) {
        this.empMobile = empMobile;
    }
    public employeeData(){
        salary = 45000;
        empMobile = 987654321;
    }
    public employeeData(int salary){
        this.salary = salary;
    }
}

public class Learn_Constructors {
    public static void main(String[] args) {
        employeeData data = new employeeData();
        System.out.println(data.getSalary());
        System.out.println(data.getEmpMobile());

        employeeData data1 = new employeeData(60000);
        System.out.println(data1.getSalary());
    }
}
