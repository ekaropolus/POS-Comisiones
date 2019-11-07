/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebaempleado;

/**
 *
 * @author edvaldes
 */
public class Empleado {
    private String name;
    private String lastName;
    private double salary;
    
 public Empleado( String name , String lastName, double salary)
    {
        this.name = name;
        this.lastName = lastName;
        this.salary = salary;   
    }
 
 public void setName ( String name){ this.name = name;}
 public void setLastName ( String LastName){ this.lastName = LastName;}
 public void setSalary ( double salary){ this.salary = salary;}
 
 public String getName (){ return this.name;}
 public String getLastName (){ return this.lastName;}
 public double getSalary (){ return this.salary;}
 
}

