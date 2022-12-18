package br.com.estudonovo.mapper;

import br.com.estudonovo.model.dto.PersonDto;
import br.com.estudonovo.model.entity.Person;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface PersonMapperStruct {

    Person toPerson(PersonDto personDto);

    PersonDto toPersonDto(Person person);

}
