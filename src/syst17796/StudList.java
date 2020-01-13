/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package syst17796;

import java.util.Scanner;

/**
 *
 * @author Owner
 */
public class StudList {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //throw an exception for id: must be 5digits, and only integers 
        //throw an exception fot name: must be full string 
        //print all 5 student infos 
        //this is your object
        StudentClass[] s = new StudentClass[5];
        Scanner scan = new Scanner(System.in);
        
        for(int i=0; i<s.length;i++)
        {
            //id and name of student
            s[i] = new StudentClass();
            System.out.println("Enter ID: ");
            //value with the object 
            s[i].setId(scan.nextInt());       
            System.out.println("Enter Name:");
            s[i].setName(scan.next());
        }
    }
    
}
