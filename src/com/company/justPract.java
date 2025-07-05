package com.company;

    class Employee {

        private String name;
        private double salary;

        public Employee() {
            name = "unknown";
            salary = 10000;
        }

        public Employee(String MyName, double MySalary) {
            name = MyName;
            salary = MySalary;
        }

        public Employee(String MyName) {
            name = MyName;
            salary = 12000;
        }

        public void display() {
            System.out.println(STR."name:\{name}");
            System.out.println(STR."Salary:\{salary}");
        }
    }
        public class justPract {
        public static void main(String[] args) {
            Employee roc = new Employee();
            roc.display();
            Employee rock = new Employee("aryan", 56000);
            rock.display();
            Employee ro = new Employee("sai");
            ro.display();
        }
    }
    