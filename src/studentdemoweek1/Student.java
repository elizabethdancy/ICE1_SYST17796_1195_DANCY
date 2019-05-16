/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package studentdemoweek1;

/**
 * This class models students.
 * Student have a name and a studentID and a program
 * @author dancye, 2019
 */
public class Student 
{
    private String name;
    private String studentID;
    private String program;
    
    public Student()
    {
        //intetionally left blank
    }
    /**
     * The setter for name
     */
    public void setName(String givenName)
    {
        name = givenName;
    }
    
    /**
     * The getter for name
     */
    
    public String getName()
    {
        return name;
    }

    /**
     * @return the studentID
     */
    public String getStudentID() {
        return studentID;
    }

    /**
     * @param studentID the studentID to set
     */
    public void setStudentID(String studentID) {
        this.studentID = studentID;
    }

    /**
     * @return the program
     */
    public String getProgram() {
        return program;
    }

    /**
     * @param program the program to set
     */
    public void setProgram(String program) {
        this.program = program;
    }
}
