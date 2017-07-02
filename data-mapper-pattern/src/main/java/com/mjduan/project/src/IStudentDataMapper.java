package com.mjduan.project.src;

import java.util.Optional;

import com.mjduan.project.src.domain.Student;

/**
 * Hans 2017-07-02 21:51
 */
public interface IStudentDataMapper {

    Optional<Student> find(int studentId);

    void insert(Student student);

    void update(Student student);

    void delete(Student student);

}
