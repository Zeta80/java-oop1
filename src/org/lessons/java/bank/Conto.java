package org.lessons.java.bank;

import java.util.Random;

public class Conto {
    //- numero di conto
    //- nome del proprietario
    //- saldo

    private int numeroDiConto;
     private String nome;
     private String cognome;
     private double saldo;

     //COSTRUTTORE
     public Conto(String nome, String cognome) {
         this.numeroDiConto = new Random().nextInt(1000) + 1;
         this.nome = nome;
         this.cognome = cognome;
         this.saldo = 0.0;
     }

     //GETTER E SETTER

    //NUMERO CONTO
    public int getNumeroDiConto() {
        return numeroDiConto;
    }
    //NOME
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    //COGNOME
    public String getCognome() {
        return cognome;
    }

    public void setCognome(String cognome) {
        this.cognome = cognome;
    }
    //SALDO
    public double getSaldo() {
        return saldo;
    }

    //METODI
    public String toString() {
        return "conto: " + numeroDiConto + ", nome: " + nome + ", cognome: " + cognome + ", saldo: " + saldo;
    }

}
