/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Profiles;

import Business.Business;
import Business.Person.Person;

import java.util.ArrayList;

/**
 *
 * @author kal bugrara
 */
public class FacultyDirectory {

    Business business;
    ArrayList<FacultyProfile> facultyList;

    public FacultyDirectory(Business business) {
        this.business = business;
        facultyList = new ArrayList<>();
    }

    public FacultyProfile newFacultyProfile(Person person) {
        FacultyProfile facultyProfile = new FacultyProfile(person);
        facultyList.add(facultyProfile);
        return facultyProfile;
    }

    public FacultyProfile findFaculty(String id) {
        for (FacultyProfile facultyProfile : facultyList) {
            if (facultyProfile.isMatch(id)) {
                return facultyProfile;
            }
        }
        return null; // not found after going through the whole list
    }
    
}
