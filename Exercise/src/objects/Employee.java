/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package objects;

import java.util.ArrayList;

/**
 *
 * @author atlha
 */
public class Employee {
    private String name;
    public ArrayList<Time> time;

    public Employee(String name) {
        this.name = name;
        this.time = new ArrayList<Time>();
    }

    public Employee() {
        this.time = new ArrayList<Time>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Time> getTime() {
        return time;
    }

    public void setTime(ArrayList<Time> time) {
        this.time = time;
    }
    public void addTime(Time time) {
        try{
            this.time.add(time);
        }
        catch(Exception e)
        {
            System.out.println("No added time "+ e.getMessage());
        }
    }
    public void showTime()
    {
        System.out.println("Horario del empleado "+this.name);
        System.out.println(this.time);
    }

    @Override
    public String toString() {
        return ("Horario del empleado "+this.name +"->"+this.time+"\n");
    }
    
    
}
