import java.beans.BeanProperty;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ConfiguracaoPessoa {

    @Value("${pessoa.nome}")
    private String nome;

    @Value("${pessoa.idade}")
    private int idade;

    @Value("${pessoa.sexo}")
    private String sexo;
    
    @value("${pessoa.estadoCivil}")
    private String EstadoCivil;

    @value("${pessoa.profissao}")
    private String profissao;

    @Bean
    public Pessoa pessoa(){
        return new Pessoa(nome, idade,sexo,estadoCivil,profissao);
    }
}