package edu.icet.repository;

import edu.icet.dto.Student;
import edu.icet.entity.StudentEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface StudentRepository extends JpaRepository<StudentEntity,Integer> {
//    Optional<Student> findFirstByEmail(String email);
//    Optional<Student> findUserRole(UserRole userRole);
}
