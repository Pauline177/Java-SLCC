package com.company;

public class Employee
{
   // fields

    private String lastName;

    private String firstName;

    private Double salary;

	// constructors

    public Employee(String lName, String fName, Double s){

       lastName = lName;
       firstName = fName;
//       salary = s;
       setSalary(s);

    }


   // methods

    public String getFirstName(){
        return firstName;
    }

    public String getLastName(){
        return lastName;
    }

    public double getSalary(){
        return salary;
    }

    public void setSalary(double s){
        if(s >= 0) {
            salary = s;
        }
        else {
            salary = 0.0;
        }
    }

}