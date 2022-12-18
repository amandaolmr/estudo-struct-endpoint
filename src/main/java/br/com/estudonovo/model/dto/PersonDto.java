package br.com.estudonovo.model.dto;

import lombok.Getter;
import lombok.Setter;
import org.hibernate.validator.constraints.br.CPF;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

@Getter
@Setter
public class PersonDto {

    @NotEmpty(message = "O campo não pode ser vazio")
    private String name;
    @NotNull(message = "O campo não pode ser vazio")
    private Integer age;
    @CPF(message = "CPF precisa ser informado corretamento")
    private String cpf;
}
