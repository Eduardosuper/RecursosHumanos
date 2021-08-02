/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.edu.cesba.empleados;

import javax.swing.JOptionPane;

/**
 *
 * @author tprog
 */
public class Main {

    public static void main(String[] args) {
        Empleados e1 = new Empleados();
        Empleados e2 = new Empleados();
        Departament d1=new Departament();
        Job j1=new Job();
        /* e1.Id = 1;
        e1.nombre = "Tiburcio";
        e1.apellidoPaterno = "Sanches";
        e1.apellidoMaterno = "Mora";
        e1.edad = 30;
        e1.email = "tiburcio@cesba.mx";
        e1.telefono = 2101616;
        e1.salario = 30000.00f;
        e1.hiredate = "24/07/2021";
        e2.Id = 2;
        e2.nombre = "Miguel";
        e2.apellidoPaterno = "gutierrez";
        e2.apellidoMaterno = "arriaga";
        e2.edad = 42;
        e2.email = "miguel@cesba.mx";
        e2.telefono = 2101245;
        e2.salario = 40000.00f;
        e2.hiredate = "31/07/2021";*/
        //empleado
        e1.Id = Integer.parseInt(JOptionPane.showInputDialog("ingresa el Id"));
        e1.nombre = JOptionPane.showInputDialog("Ingresa el nombre ");
        e1.apellidoPaterno = JOptionPane.showInputDialog("Ingrese el Apellido");
        e1.edad = Integer.parseInt(JOptionPane.showInputDialog("ingresa la edad"));
        e1.email = JOptionPane.showInputDialog("Ingresa el correo");
        e1.telefono = Double.parseDouble(JOptionPane.showInputDialog("ingresa el numero de telefono"));
        e1.salario = Float.parseFloat(JOptionPane.showInputDialog("ingresa el salario"));
        e1.hiredate = JOptionPane.showInputDialog("Ingresa la fecha de contratacion");
        e2.Id = Integer.parseInt(JOptionPane.showInputDialog("ingresa el Id"));
        e2.nombre = JOptionPane.showInputDialog("Ingresa el nombre ");
        e2.apellidoPaterno = JOptionPane.showInputDialog("Ingrese el Apellido");
        e2.edad = Integer.parseInt(JOptionPane.showInputDialog("ingresa la edad"));
        e2.email = JOptionPane.showInputDialog("Ingresa el correo");
        e2.telefono = Double.parseDouble(JOptionPane.showInputDialog("ingresa el numero de telefono"));
        e2.salario = Float.parseFloat(JOptionPane.showInputDialog("ingresa el salario"));
        e2.hiredate = JOptionPane.showInputDialog("Ingresa la fecha de contratacion");
        //departament
        d1.id=Integer.parseInt(JOptionPane.showInputDialog("ingresa el Id del departamento"));
        d1.title=JOptionPane.showInputDialog("ingresa el titulo del departamento");
        d1.location=JOptionPane.showInputDialog("ingresa la localizacion");
        //Job
        j1.id=Integer.parseInt(JOptionPane.showInputDialog("ingresa el Id del trabajo"));
        j1.title=JOptionPane.showInputDialog("ingresa el titulo del trabajo");
        j1.maxSalary=Double.parseDouble(JOptionPane.showInputDialog("ingresa el maximo salario"));
        j1.minSalary=Double.parseDouble(JOptionPane.showInputDialog("ingresa el minimo salario"));
        //getDetails
        e1.getDetails();
        System.out.println("--------------");
        e2.getDetails();
        System.out.println("--------------");
        d1.getDetails();
        System.out.println("--------------");
        j1.getDatails();
    }
}
