package model;

import java.util.Date;

public class funcionario {

    private Integer id;
    private String nome;
    private String documento;
    private Double salario;

    public funcionario() {
    }


    public funcionario(Integer id, String nome, String documento, Double salario) {
        this.id = id;
        this.nome = nome;
        this.documento = documento;
        this.salario = salario;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDocumento() {
        return documento;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }

    public Double getSalario() {
        return salario;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }
}



