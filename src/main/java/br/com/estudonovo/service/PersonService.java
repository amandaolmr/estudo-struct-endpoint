package br.com.estudonovo.service;

import br.com.estudonovo.model.dto.PersonDto;

import java.util.List;

public interface PersonService {

    List<PersonDto> findAllPerson();

    PersonDto savePerson(PersonDto personDto);
}
