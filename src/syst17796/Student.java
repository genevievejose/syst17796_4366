/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package syst17796;

/**
 *
 * @author Owner
 */
import java.util.Scanner;
public class Student {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    
        // TODO code application logic here
      
      
        
        //Student[] s = new Student[5];
        Scanner in = new Scanner(System.in);
        
        for (int x = 1; x < 6 ; x++ ){
        System.out.println("Enter your name: ");
        String name = in.nextLine();
        
        System.out.println("Enter your Student Number: ");
        int id = in.nextInt();
        
        System.out.println("Welcome " + name + " : Student ID: " + id );
        }
    }
        
}
