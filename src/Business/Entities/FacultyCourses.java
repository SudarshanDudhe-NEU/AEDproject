/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Entities;

import Business.Profiles.*;

/**
 *
 * @author sudarshan
 */
public class FacultyCourses {

    FacultyProfile facultyProfile;
    private String courseName;
    private Integer courseId;
    private String courseDescription;
    private String courseTotalEnrollment;     
    private String courseType;
    private String courseDuration;
    private Boolean courseStatus;

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public Integer getCourseId() {
        return courseId;
    }

    public void setCourseId(int courseId) {
        this.courseId = courseId;
    }

    public String getCourseDescription() {
        return courseDescription;
    }

    public void setCourseDescription(String courseDescription) {
        this.courseDescription = courseDescription;
    }

    public String getCourseTotalEnrollment() {
        return courseTotalEnrollment;
    }

    public void setCourseTotalEnrollment(String courseTotalEnrollment) {
        this.courseTotalEnrollment = courseTotalEnrollment;
    }

    public String getCourseType() {
        return courseType;
    }

    public void setCourseType(String courseType) {
        this.courseType = courseType;
    }

    public String getCourseDuration() {
        return courseDuration;
    }

    public void setCourseDuration(String courseDuration) {
        this.courseDuration = courseDuration;
    }

    public Boolean getCourseStatus() {
        return courseStatus;
    }

    public void setCourseStatus(Boolean courseStatus) {
        this.courseStatus = courseStatus;
    }
    
    public FacultyCourses(FacultyProfile fp) {
        facultyProfile = fp;
    }

    public FacultyProfile getFacultyProfile(){
        return facultyProfile;
    }
    public boolean isMatch(String id) {
        return courseId.equals(id);
    }
}
