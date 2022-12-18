package br.com.estudonovo.service;

import br.com.estudonovo.mapper.PersonMapper;
import br.com.estudonovo.mapper.PersonMapperStruct;
import br.com.estudonovo.model.dto.PersonDto;
import br.com.estudonovo.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonServiceImpl implements PersonService {

    @Autowired
    private PersonRepository personRepository;

    @Autowired
    private PersonMapper personMapper;

    @Autowired
    private PersonMapperStruct personMapperStruct;

    @Override
    public List<PersonDto> findAllPerson() {
        return personMapper.toPersonDto(personRepository.findAll());
    }

    @Override
    public PersonDto savePerson(PersonDto personDto) {
        return personMapperStruct.toPersonDto(personRepository.save(personMapperStruct.toPerson(personDto)));
    }
}
