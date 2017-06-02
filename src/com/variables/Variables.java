package com.variables;

public class Variables {
	
	
	private int numOfEmployee; //Instance Variable
	public int getNumOfEmployee() {							//Getter 
		return numOfEmployee;
	}
	public void setNumOfEmployee(int numOfEmployee) {			//Setter
		this.numOfEmployee = numOfEmployee;
	}

	private static int departments;

	private static int getDepartments() {							//Getter 
	return departments;
	}
	private static void setDepartments(int departments) {
	Variables.departments = departments;								//Setter
	}


public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	//The static method wouldn t be able to call a non static method hence object initiation is required	
	
	Variables var=new Variables();  					//To use the instance variable we need to access through object of the class
	var.setNumOfEmployee(40);  		                    //The setter has now the value of the 
	//Instance variable cannot be called directly 
	System.out.println("The instance variable is "+var.getNumOfEmployee());  //Get the value assgined to the variable


	//The static  method can call a static variable directly
	
	//Static variable is for the entire class .
	System.out.println("The value of the static variable number of departments is "+departments); //No instantiation required to call the department variable
	
	//Used Private scope in this example
	
	setDepartments(34);//Decalred the static private variable without any instace
	System.out.println("The value of the static variable number of departments "+getDepartments());
	}

}
