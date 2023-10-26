/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import Business.Entities.FacultyCoursesDirectory;
import Business.Person.PersonDirectory;
import Business.Profiles.EmployeeDirectory;
import Business.Profiles.FacultyDirectory;

import Business.UserAccounts.UserAccountDirectory;

/**
 *
 * @author kal bugrara
 */
public class Business {

    String name;
    PersonDirectory persondirectory; //all people profiles regardless of the role

    EmployeeDirectory employeedirectory;
    UserAccountDirectory useraccountdirectory;
    FacultyDirectory facultyDirectory;
    FacultyCoursesDirectory facultyCoursesDirectory;


    public Business(String n) {
        name = n;

        persondirectory = new PersonDirectory();
        employeedirectory = new EmployeeDirectory(this);
        useraccountdirectory = new UserAccountDirectory();
        facultyDirectory = new FacultyDirectory(this);
        facultyCoursesDirectory = new FacultyCoursesDirectory(this);

    }

    public PersonDirectory getPersonDirectory() {
        return persondirectory;
    }

    public UserAccountDirectory getUserAccountDirectory() {
        return useraccountdirectory;
    }


    public EmployeeDirectory getEmployeeDirectory() {
        return employeedirectory;
    }
    
    public FacultyDirectory getFacultyDirectory() {
        return facultyDirectory;
    }
    
    public FacultyCoursesDirectory getFacultyCoursesDirectory() {
        return facultyCoursesDirectory;
    }


}
