/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package services;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

/**
 *
 * @author atlha
 */
public class FileRead {
    public String readFile()
    {
        try{
        File file = new File(
            "C:\\Users\\atlha\\Documents\\input.txt");
    BufferedReader br
            = new BufferedReader(new FileReader(file));
    String st;
    String ret="";
    while ((st = br.readLine()) != null)
    {
        ret=ret+st+"\n";
    }
    
    return(ret);
    }
        
    catch(Exception e)
    {
        return null;
    }
    }
    public String readFile(String path)
    {
        try{
        File file = new File(path);
    BufferedReader br
            = new BufferedReader(new FileReader(file));
    String st;
    String ret="";
    while ((st = br.readLine()) != null)
    {
        ret=ret+st+"\n";
    }
    
    return(ret);
    }
        
    catch(Exception e)
    {
        return null;
    }
    }
}
