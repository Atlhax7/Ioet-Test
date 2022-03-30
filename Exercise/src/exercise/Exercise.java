/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package exercise;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import objects.Employee;
import objects.Time;
import services.FileRead;
import services.Methods;

/**
 *
 * @author atlha
 */
public class Exercise {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Code working on console with burned input
        Methods method=new Methods();
        String segments[]= method.splitEmpl();
        ArrayList<Employee> employees = new ArrayList<Employee>();
        for(int i=0;i<segments.length;i++)
        {
            employees.add(method.setEmployee(segments[i]));
        }
        method.compare(employees);
        //Wrking code with a small panel for the imput Below an example of input path
        //C:\\Users\\atlha\\Documents\\input.txt
        String segments2[]= method.splitEmpl(JOptionPane.showInputDialog("Ingrese la direccion del archivo"));
        ArrayList<Employee> employees2 = new ArrayList<Employee>();
        for(int i=0;i<segments2.length;i++)
        {
            employees2.add(method.setEmployee(segments[i]));
        }
        JOptionPane.showMessageDialog(null, "Lista de empleados:\n"+method.compare(employees2));
        System.out.println(employees2);
        System.out.println(method.compare(employees2));;
        
//        
    }

}
