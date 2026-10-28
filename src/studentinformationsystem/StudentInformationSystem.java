/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package studentinformationsystem;

/**
 *
 * @author Acer
 */
public class StudentInformationSystem {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Student Information System");
        System.out.println("Name: Siti Nor Raihanah Binti Muhamad Rozihan");
        System.out.println("Student ID: S84800");
        int mark1 = 40;
        int mark2 = 45;
        int total = mark1 + mark2;
        System.out.println("Total marks: " + total );
        
        if(total>=80){
            System.out.println("Result: Excellent");}
        else if(total>=60){
            System.out.println("Result: Good"); }
        else {
            System.out.println("Result: Need Improvement"); }  
    }
    
}
