package com.springmvc.studentmngmnt.repositpory;

import com.springmvc.studentmngmnt.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

public interface StudentRepository extends JpaRepository<Student, Long> {
}
