package com.studentmanagement.dto;

import com.studentmanagement.model.Course;
import jakarta.validation.constraints.*;

public class CourseRequest {
    @NotBlank(message = "Course code is required")
    @Size(min = 2, max = 20, message = "Course code must be between 2 and 20 characters")
    private String courseCode;
    
    @NotBlank(message = "Course name is required")
    @Size(min = 2, max = 100, message = "Course name must be between 2 and 100 characters")
    private String courseName;
    
    private String description;
    
    @NotNull(message = "Credits are required")
    @Min(value = 1, message = "Credits must be at least 1")
    @Max(value = 10, message = "Credits cannot exceed 10")
    private Integer credits;
    
    @NotBlank(message = "Department is required")
    private String department;
    
    @NotBlank(message = "Instructor is required")
    private String instructor;
    
    @NotNull(message = "Maximum capacity is required")
    @Min(value = 1, message = "Maximum capacity must be at least 1")
    private Integer maxCapacity;
    
    @NotNull(message = "Semester is required")
    private Course.Semester semester;
    
    @NotNull(message = "Academic year is required")
    private Integer academicYear;
    
    // Constructors
    public CourseRequest() {}
    
    public CourseRequest(String courseCode, String courseName, String description, Integer credits,
                        String department, String instructor, Integer maxCapacity, 
                        Course.Semester semester, Integer academicYear) {
        this.courseCode = courseCode;
        this.courseName = courseName;
        this.description = description;
        this.credits = credits;
        this.department = department;
        this.instructor = instructor;
        this.maxCapacity = maxCapacity;
        this.semester = semester;
        this.academicYear = academicYear;
    }
    
    // Getters and Setters
    public String getCourseCode() { return courseCode; }
    public void setCourseCode(String courseCode) { this.courseCode = courseCode; }
    
    public String getCourseName() { return courseName; }
    public void setCourseName(String courseName) { this.courseName = courseName; }
    
    public String getDescription() { return description; }
    public void setDescription(String description) { this.description = description; }
    
    public Integer getCredits() { return credits; }
    public void setCredits(Integer credits) { this.credits = credits; }
    
    public String getDepartment() { return department; }
    public void setDepartment(String department) { this.department = department; }
    
    public String getInstructor() { return instructor; }
    public void setInstructor(String instructor) { this.instructor = instructor; }
    
    public Integer getMaxCapacity() { return maxCapacity; }
    public void setMaxCapacity(Integer maxCapacity) { this.maxCapacity = maxCapacity; }
    
    public Course.Semester getSemester() { return semester; }
    public void setSemester(Course.Semester semester) { this.semester = semester; }
    
    public Integer getAcademicYear() { return academicYear; }
    public void setAcademicYear(Integer academicYear) { this.academicYear = academicYear; }
}
