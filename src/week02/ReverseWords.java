/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week02;

import java.util.Scanner;

/**
 * hello there whateva
 * 
 * added another stupid comment
 * @author purohiam
 */
public class ReverseWords {
   public static void main(String[]args){
    String input;
    Scanner scan = new Scanner(System.in);
    System.out.println("Enter a word: ");
        input=scan.nextLine();
     char[] reverse= new char[input.length()];
     
         for(int j=0;j<input.length();j++) {
             
                 reverse[j]=input.charAt(j);
      }
     for(int i = reverse.length-1;i>=0;i--){
         System.out.print(reverse[i]);
     }
   
}
}