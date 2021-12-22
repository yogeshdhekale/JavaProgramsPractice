package com.company;

class myEmp{
    int empID;
    String empName;
    private int empSalary;
    private String empAddress;

    public void setSalary(int n){
        empSalary = n;
    }
    public int getSalary(){
        return empSalary;
    }
    public void setAddress(String addr){
        empAddress = addr;
    }
    public String getAddress(){
        return empAddress;
    }
}

public class Getter_Setter {
    public static void main(String[] args) {

        myEmp emp = new myEmp();
        emp.empID = 1234;
        emp.empName = "Sham";
        emp.setSalary(23000);
        System.out.println("Salary of employee is " + emp.getSalary());

        emp.setAddress("Wakad, Pune, India");
        System.out.println("Address of employee is " + "\"" +emp.getAddress() +"\"");
    }
}
