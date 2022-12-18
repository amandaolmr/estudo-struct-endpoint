package br.com.estudonovo.mapper;

import br.com.estudonovo.model.dto.PersonDto;
import br.com.estudonovo.model.entity.Person;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class PersonMapper {
    public List<PersonDto> toPersonDto(List<Person> personList) {
        List<PersonDto> listPersonDto = new ArrayList<>();
        personList.forEach(person -> {
            PersonDto personDto = new PersonDto();
            personDto.setName(person.getName());
            personDto.setAge(person.getAge());
            personDto.setCpf(person.getCpf());
            listPersonDto.add(personDto);
        });
        return listPersonDto;
    }
}
