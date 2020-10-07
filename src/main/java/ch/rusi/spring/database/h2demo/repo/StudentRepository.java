package ch.rusi.spring.database.h2demo.repo;

import ch.rusi.spring.database.h2demo.model.Student;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends CrudRepository<Student, Integer>{

}