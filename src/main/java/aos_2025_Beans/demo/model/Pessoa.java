/*Crie uma aplicação Spring Boot em que você crie uma classe de configuração para criar um Bean de uma classe Pessoa, cujos atributos (nome, idade, sexo, estado civil e profissão) 
são preenchidos a partir de campos disponíveis no arquivo application.properties e que os valores destes campos estejam presentes em variáveis de ambiente.*/

public class Pessoa{
    private String nome;
    private int idade;
    private String sexo;
    private String  estadoCivil;
    private String profissao;

    public pessoa(String nome, int idade, String sexo, String estadoCivil, String profissao){
        this.nome = nome;
        this.idade = idade;
        this.sexo = sexo;
        this.estadoCivil = estadoCivil;
        this.profissao = profissao;

    }
    public String getNome(){
        return nome;
    }
    public int getIdade(){
        return idade;
    }
    public String getSexo(){
        return sexo;
    }
    public String getEstadoCivil(){
        return estadoCivil;
    }
}