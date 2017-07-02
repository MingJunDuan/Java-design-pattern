package com.mjduan.project.src.domain;

import java.io.Serializable;

/**
 * Hans 2017-07-02 21:48
 */
public class Student implements Serializable {
    private int studentId;
    private String name;
    private char grade;

    public Student(int studentId, String name, char grade) {
        this.studentId = studentId;
        this.name = name;
        this.grade = grade;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public char getGrade() {
        return grade;
    }

    public void setGrade(char grade) {
        this.grade = grade;
    }

    @Override
    public boolean equals(Object obj) {
        boolean equal = false;
        if (this == obj) {
            equal = true;
        } else if (null != obj && getClass() == obj.getClass()) {
            Student student = (Student) obj;
            if (getStudentId() == student.getStudentId()) {
                equal = true;
            }
        }
        return equal;
    }

    @Override
    public int hashCode() {
        return this.getStudentId();
    }

    @Override
    public String toString() {
        return "Student [studentId=" + studentId + ", name=" + name + ", grade=" + grade + "]";
    }
}
