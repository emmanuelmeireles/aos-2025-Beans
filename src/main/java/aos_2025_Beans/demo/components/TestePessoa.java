package com.seuprojeto.components;

import com.seuprojeto.modelo.Pessoa;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
public class TestePessoa {

    @Autowired
    private Pessoa pessoa;

    @PostConstruct
    public void imprimirPessoa() {
        System.out.println("Nome: " + pessoa.getNome());
        System.out.println("Idade: " + pessoa.getIdade());
        System.out.println("Sexo: " + pessoa.getSexo());
        System.out.println("Estado Civil: " + pessoa.getEstadoCivil());
        System.out.println("Profissão: " + pessoa.getProfissao());
    }
}
