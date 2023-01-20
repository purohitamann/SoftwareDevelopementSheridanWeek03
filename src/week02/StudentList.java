/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week02;

/**
 *
 * @author purohiam
 */
public class StudentList {
    public static void main(String[] args){
        Week02 student1= new Week02(12,"Aman");
        
        Week02[] StudentList =new Week02[3];
        StudentList[0] = new Week02(13,"Sid");
        StudentList[1] = new Week02(14,"Amber");
        StudentList[2] = new Week02(15,"Karen");
        
        for(int i=0; i<StudentList.length;i++){
           System.out.println(StudentList[i].getStudentName());
        }
        
    }
}
