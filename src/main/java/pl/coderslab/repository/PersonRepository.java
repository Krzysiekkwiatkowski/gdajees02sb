package pl.coderslab.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pl.coderslab.entity.Person;
import pl.coderslab.entity.StudentGroup;

@Repository
public interface PersonRepository extends JpaRepository<Person, Long> {
}
