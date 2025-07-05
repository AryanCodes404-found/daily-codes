package com.company;

public class ConstructorOverloading{
private String name;
private double salary;

//Default Constructor
public ConstructorOverloading(){
    name = "Unkown";
    salary = 10000.0; // initialize salary of 10000
}

//Constructor with parameters
public ConstructorOverloading(String employeeName){
    name = employeeName;
    salary = 10000.0;
}

//Constructor with name and salary parameter
public  ConstructorOverloading(String employeeName , double initialSalary ){

    name = employeeName;
    salary = initialSalary;

}
public void display_Employee_info(){
    System.out.println("Name: "+ name);
    System.out.println("RS." + salary + "/-");
}


public static void main(String[] args) {
    ConstructorOverloading emp1 = new ConstructorOverloading();
    emp1.display_Employee_info();

    ConstructorOverloading emp2 = new ConstructorOverloading("John");
    emp2.display_Employee_info();

    ConstructorOverloading emp3 = new ConstructorOverloading("Alice", 15000.0);
    emp3.display_Employee_info();


}
}