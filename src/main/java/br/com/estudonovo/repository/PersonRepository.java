package br.com.estudonovo.repository;

import br.com.estudonovo.model.entity.Person;
import org.springframework.data.jpa.repository.JpaRepository;


public interface PersonRepository extends JpaRepository<Person, Long> {
}