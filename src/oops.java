class employee {
    int id;
    int salary;
    String name;
    public void printDetails(){


        System.out.println("my id is " + id);
        System.out.println("my name is" + name);
        System.out.println(" the salary is "+salary);
    }
public int getSalary(){
        return salary;
}
}

public class oops {
    public static void main(String[] args) {
        employee aryan=new employee();
        employee aman=new employee();
        aman.id=15;
        aman.salary=34;
        aman.name="aman pro";
        aryan.id=12;
        aryan.name="codeWithAryan";
//        System.out.println(aryan.id);
//        System.out.println(aryan.name);
        aryan.printDetails();
        aman.printDetails();
      int salary= aman.getSalary();
       
    }

    }




