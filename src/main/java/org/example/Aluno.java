package org.example;

import java.util.Objects;

public class Aluno {


    private String ra;
    private String nome;

    public Aluno(String ra, String nome) {
        this.ra = ra;
        this.nome = nome;

    }
    //gets e sets
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getRa() { return ra; }

    public void setRa(String ra) { this.ra = ra; }

    //Verifica se o RA já foi cadastrado
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Aluno aluno = (Aluno) o;
        return Objects.equals(ra, aluno.ra);
    }

    @Override
    public int hashCode() {
        return Objects.hash(ra);
    }

    @Override
    public String toString() {
        return "RA: " +ra+ " Nome: " +nome;
    }
}
