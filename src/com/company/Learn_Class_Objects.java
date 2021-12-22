package com.company;
class Employee{
    int empID;
    String empName;
    String empRole;
    int empSalary;
    public int getSalary(){
        return empSalary;
    }
    public String getEmpName(){
        return empName;
    }
    public void printDetails(){
        System.out.println("Employee ID is " + empID);
        System.out.println("Employee name is " + empName);
        System.out.println("Employee role is " + empRole);
    }
}
class square{
    //int sideLength;
    public int sqareArea(int sideLength){
        int areaSquare = sideLength * sideLength;
        return areaSquare;
    }
}

class squarePeriameter{
    //int side;
    public int perimeter(int side){
      return (side + side)*2;
    }
}

public class Learn_Class_Objects {
    public static void main(String[] args) {
        Employee emp = new Employee();
        emp.empID = 2345;
        emp.empName = "Abc Xyz";
        emp.empRole = "Test Lead";
        // System.out.println(emp.empID + " " + emp.empRole + " " + emp.empName);
        emp.printDetails();
        square sq = new square();
        int squArea = sq.sqareArea(15);
        System.out.println("Area of square is " + squArea);

        squarePeriameter peri = new squarePeriameter();
        int sqaPeri = peri.perimeter(5);
        System.out.println("Perimeter of square is " + sqaPeri);
    }
}
