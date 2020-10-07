package ch.rusi.spring.database.h2demo.serv;

import java.util.ArrayList;
import java.util.List;

import ch.rusi.spring.database.h2demo.model.Student;
import ch.rusi.spring.database.h2demo.repo.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentService {

    // @Autowired annotation provides the automatic dependency injection.
    @Autowired
    StudentRepository repository;

    // Save student entity in the h2 database.
    public void save(final Student student) {
        repository.save(student);
    }

    // Get all students from the h2 database.
    public List<Student> getAll() {
        final List<Student> students = new ArrayList<>();
        repository.findAll().forEach(student -> students.add(student));
        return students;
    }
}