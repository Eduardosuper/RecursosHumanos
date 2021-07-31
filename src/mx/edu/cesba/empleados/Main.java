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
public class Main {

    public static void main(String[] args) {
        Empleados e1 = new Empleados();
        Empleados e2= new Empleados();
        e1.Id = 1;
        e1.nombre = "Tiburcio";
        e1.apellidoPaterno = "Sanches";
        e1.apellidoMaterno = "Mora";
        e1.edad = 30;
        e1.email = "tiburcio@cesba.mx";
        e1.telefono = 2101616;
        e1.salario = 30000.00f;
        e1.hiredate = "24/07/2021";
        
        e1.getDetails();
        
    }
}
