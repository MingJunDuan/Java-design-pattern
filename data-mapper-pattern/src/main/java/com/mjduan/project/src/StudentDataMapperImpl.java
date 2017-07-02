package com.mjduan.project.src;

import java.util.LinkedList;
import java.util.List;
import java.util.Optional;

import com.mjduan.project.src.domain.Student;

/**
 * Hans 2017-07-02 21:52
 */
public class StudentDataMapperImpl implements IStudentDataMapper {
    private List<Student> students = new LinkedList<>();

    @Override
    public Optional<Student> find(int studentId) {
        return students.stream()
                .filter(student -> studentId == student.getStudentId())
                .findFirst();
    }

    @Override
    public void insert(Student student) {
        if (!getStudents().contains(student)) {
            getStudents().add(student);
        } else {
            System.err.println("Warning, try to insert duplicate record");
        }
    }

    @Override
    public void update(Student student) {
        if (getStudents().contains(student)) {
            final int index = getStudents().indexOf(student);
            this.getStudents().set(index, student);
        } else {
            System.err.println("Warning, try to update not exist record");
        }
    }

    @Override
    public void delete(Student student) {
        if (getStudents().contains(student)) {
            getStudents().remove(student);
        } else {
            System.err.println("Warning, try to delete not exist record");
        }
    }

    public List<Student> getStudents() {
        return students;
    }
}
