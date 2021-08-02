/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.edu.cesba.empleados;

/**
 *
 * @author tprog
 */
public class Job {
    int id;
    String title="";
    double minSalary,maxSalary;
    public void getDatails(){
        System.out.println("Id: "+id);
        System.out.println("Title:"+title);
        System.out.println("Maximum Salario: "+maxSalary);
        System.out.println("Minimum Salario: "+minSalary);
    }
}
