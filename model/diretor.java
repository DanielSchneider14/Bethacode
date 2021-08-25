package model;

import java.util.Date;

public class diretor {

    private Integer id;
    private String nome;
    private String documento;
    private Double salario;
    private Double bonus;



    public diretor(Integer id, String nome, String documento, Double salario, Double bonus) {
        this.id = id;
        this.nome = nome;
        this.documento = documento;
        this.salario = salario;
        this.bonus = bonus;
    }

    public  Integer getId() { return id; }

    public void setId(Integer id) {
        this.id = id;
    }

    public  String getNome() {
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

    public  Double getBonus() {
        return bonus;
    }

    public void setBonus(Double bonus) {
        this.bonus = bonus;
    }
}