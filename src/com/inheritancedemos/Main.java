package com.inheritancedemos;

import java.util.Iterator;

public class Main {
public static void main(String[] args) {
	//ABSTRACT CANNOT BE INSTANTIATED..
//	Employee emp=new Employee(10,"John",20,"HR");
//	System.out.println("Employee salary " + emp.calculateSalary());
	
	
//	PermanentEmployee pe=new PermanentEmployee(100, "James", 24, "HR", 10000.0, 200.0);
//	System.out.println("Permanent Employee " + pe.calculateSalary());
//	
//	ContractEmployee ce=new ContractEmployee(200, "Smith", 25, "INFRA",20, 250.0);
//	System.out.println("Contract Employee " + ce.calculateSalary());
	
	Employee emps[]=new Employee[5];
    emps[0]=new PermanentEmployee(1, "Adam", 20, "HR", 10000.0, 230.0);
    emps[1]=new ContractEmployee(2, "Smith", 25, "Training", 50, 250.0);
    emps[2]=new PermanentEmployee(3, "Clara", 23, "HR", 14000.0, 245.0);
    emps[3]=new Manager(4,"John",24,"Training",3.0,10000.0);
    emps[4]=new Manager(5,"James",25,"HR",4.5,12000.0);
   

    for (int i = 0; i < emps.length; i++) {
		//System.out.println(emps[i].calculateSalary());//POLYMORPHIC BEHAVIOUR
    	emps[i].displaySalary();
	}
    
    
    
    
    
    
    
	
	
}
}






