/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package services;

import java.util.ArrayList;
import objects.Employee;
import objects.Time;

/**
 *
 * @author atlha
 */
public class Methods {
    //private Employee emp1;
    //private Time time1;
    // Return an employee with his times
    public Employee setEmployee(String st)
    {
        try{
            Employee emp1=new Employee();
            String[] part = st.split(",");
            for(int i=0;i<part.length;i++)
            {
                Time tiempo= new Time();
                if(i==0)
                {
                    emp1.setName(part[i].split("=")[0]);
                    tiempo.setTime(part[i].split("=")[1]);
                    emp1.addTime(tiempo);
                }
                else
                {
                    tiempo.setTime(part[i]);
                    emp1.addTime(tiempo);
                }
            }
            //emp1.showTime();
            return emp1;
        }catch(Exception e){
            System.out.println("Couldnt add employee error: "+e.getMessage());
            return null;
        }
    }
    // split text file to lines, each of a employee
    public String[] splitEmpl()
    {
        String Str1;
        FileRead file =new FileRead();
        Str1=file.readFile();
        String[] part = Str1.split("\n");
        return part;
    }
    public String[] splitEmpl(String path)
    {
        String Str1;
        FileRead file =new FileRead();
        Str1=file.readFile(path);
        String[] part = Str1.split("\n");
        return part;
    }
//    public void compare(ArrayList<Employee> employees)
//    {
//        for (int i = 0; i < employees.size(); i++) {
//            String result="";
//            for (int j = i+1; j < employees.size(); j++) {
//                result=result+employees.get(i).getName()+"-"+employees.get(j).getName()+":";
//                //employees[i]
//                int a=findRepeated(employees.get(i).getTime(),employees.get(j).getTime());
//                result=result+a;
//            }
//            System.out.println(result);
//        }
//        
//    }
    public String compare(ArrayList<Employee> employees)
    {
        String result="";
        for (int i = 0; i < employees.size(); i++) {
            
            for (int j = i+1; j < employees.size(); j++) {
                result=result+employees.get(i).getName()+"-"+employees.get(j).getName()+":";
                //employees[i]
                int a=findRepeated(employees.get(i).getTime(),employees.get(j).getTime());
                result=result+a+"\n";
            }
           
            //result=result+"\n";
        }
        return result;
        
    }
    public int findRepeated(ArrayList<Time> timeA,ArrayList<Time> timeB)
    {
        int ret=0;
        for (int i = 0; i < timeA.size(); i++) {
            for (int j = 0; j < timeB.size(); j++) {
                if(timeA.get(i).comapreTime(timeB.get(j)))
                {
                    ret++;
                }
            }
        }
        
        return ret;
    }
}
