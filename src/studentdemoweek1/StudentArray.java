/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package studentdemoweek1;

/**
 * This class will create an array of students
 * and iterate over it to print each student's
 * name.
 * @author dancye, 2019
 */
public class StudentArray 
{
    public static void main(String [] args)
    {
        //1. create an array of Students of length 5
        Student[] classList = new Student[5];
        //2. populate the array with 4 friends plus yourself
        //only add name and program
        Student liz = new Student();
        liz.setName("Liz");
        liz.setProgram("Systems Analyst");
        
        //add the Student to the array
        classList[0] = liz;
        
        Student miranda = new Student();
        miranda.setName("Miranda");
        miranda.setProgram("Systems Analyst");
        classList[1] = miranda;
        
        Student gordo = new Student();
        gordo.setName("Gordo");
        gordo.setProgram("SDNE");
        classList[2] = gordo;
        
        Student kate = new Student();
        kate.setName("kate");
        kate.setProgram("Software Engineering");
        classList[3] = kate;
        
        Student lenny = new Student();
        lenny.setName("lenny");
        lenny.setProgram("Criminology");
        classList[4] = lenny;
        
        //iterate over the array and print each Student's name
        for(int i=0; i<classList.length; i++)
        {
            System.out.println(classList[i].getName());
        }
        
    }
}
