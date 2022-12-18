package br.com.estudonovo.controller;

import br.com.estudonovo.mapper.PersonMapper;
import br.com.estudonovo.model.dto.PersonDto;
import br.com.estudonovo.model.entity.Person;
import br.com.estudonovo.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/")
public class PersonController {

    @Autowired
    private PersonService personService;

    @GetMapping("person-all")
    public ResponseEntity<List<PersonDto>> findAllPerson() {
        return ResponseEntity.ok(personService.findAllPerson());
    }

    @PostMapping("person")
    public ResponseEntity<PersonDto> savePerson(@RequestBody @Valid PersonDto personDto) {
        return ResponseEntity.ok(personService.savePerson(personDto));
    }
}
