package com.studentmanagement.dto;

import jakarta.validation.constraints.*;
import java.time.LocalDate;

public class EnrollmentRequest {
    @NotNull(message = "Student ID is required")
    private Long studentId;
    
    @NotNull(message = "Course ID is required")
    private Long courseId;
    
    private LocalDate enrollmentDate;
    
    @DecimalMin(value = "0.0", message = "Grade cannot be negative")
    @DecimalMax(value = "100.0", message = "Grade cannot exceed 100")
    private Double grade;
    
    // Constructors
    public EnrollmentRequest() {}
    
    public EnrollmentRequest(Long studentId, Long courseId, LocalDate enrollmentDate) {
        this.studentId = studentId;
        this.courseId = courseId;
        this.enrollmentDate = enrollmentDate;
    }
    
    // Getters and Setters
    public Long getStudentId() { return studentId; }
    public void setStudentId(Long studentId) { this.studentId = studentId; }
    
    public Long getCourseId() { return courseId; }
    public void setCourseId(Long courseId) { this.courseId = courseId; }
    
    public LocalDate getEnrollmentDate() { return enrollmentDate; }
    public void setEnrollmentDate(LocalDate enrollmentDate) { this.enrollmentDate = enrollmentDate; }
    
    public Double getGrade() { return grade; }
    public void setGrade(Double grade) { this.grade = grade; }
}
