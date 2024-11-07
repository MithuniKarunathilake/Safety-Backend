//package edu.icet.service.auth;
//
//import edu.icet.dto.Student;
//import edu.icet.entity.StudentEntity;
//import edu.icet.enums.UserRole;
//import edu.icet.repository.StudentRepository;
//import jakarta.annotation.PostConstruct;
//import lombok.RequiredArgsConstructor;
//import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
//import org.springframework.stereotype.Service;
//
//import java.util.Optional;
//
//@Service
//@RequiredArgsConstructor
//public class AuthServiceImpl {
//    private final StudentRepository studentRepository;
//
//    @PostConstruct
//    private void createAdminAccount(){
//        Optional<Student> adminAccount = studentRepository.findUserRole(UserRole.STUDENT);
//        if(adminAccount.isEmpty()){
//            Student student = new Student();
//            student.setEmail("admin@gmail.com");
//            student.setName("Admin");
//            //student.setUserRole(UserRole.STUDENT);
//            student.setPassword(new BCryptPasswordEncoder().encode("admin"));
//            System.out.println("Account added successfully!");
//        }else {
//            System.out.println("Admin account already exsists!");
//        }
//    }
//}
