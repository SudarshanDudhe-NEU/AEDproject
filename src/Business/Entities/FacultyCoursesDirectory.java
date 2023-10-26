/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Entities;

import Business.Profiles.*;
import Business.Business;
import Business.Person.Person;

import java.util.ArrayList;

/**
 *
 * @author Tanuja
 */
public class FacultyCoursesDirectory {

    Business business;
    ArrayList<FacultyCourses> facultyCoursesList;

    public FacultyCoursesDirectory(Business business) {
        this.business = business;
        facultyCoursesList = new ArrayList<>();
    }

    public FacultyCourses newFacultyCourses(FacultyProfile facultyProfile) {
        FacultyCourses facultyCourses = new FacultyCourses(facultyProfile);
        facultyCoursesList.add(facultyCourses);
        return facultyCourses;
    }

    public FacultyCourses findFacultyCourses(String id) {
        for (FacultyCourses facultyCourses : facultyCoursesList) {
            if (facultyCourses.isMatch(id)) {
                return facultyCourses;
            }
        }
        return null; // not found after going through the whole list
    }
    
}
