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
public class Departament {

    int id;
    String title = "";
    String location = "";
    //
    public void getDetails(){
        System.out.println("Id: "+id);
        System.out.println("title: "+title);
        System.out.println("location: "+location);
    }
}
