package org.lessons.java.shop;

import java.util.Random;

public class Prodotto {
  // Un prodotto è caratterizzato da:
  //- codice (numero intero)
  //- nome
  //- descrizione
  //- prezzo
  //- iva
    private int codice;
    private String nome;
    private String descrizione;
    private double prezzo;
    private final static int iva = 23;

    // COSTRUTTORI
    public Prodotto(String nome, String descrizione, double prezzo) {
        this.codice = generateRandomCode();
        this.nome = nome;
        this.descrizione = descrizione;
        this.prezzo = prezzo;
    }

    // METODI
    public int generateRandomCode() {
        Random rand = new Random();
        return rand.nextInt(100000000); // generiamo un numero a 8 cifre
    }

    // GETTER e SETTER

    //NOME
    public String getNome() {
        return nome;
    }

    public void setNome() {
        this.nome = nome;
    }
    //DESCRIZIONE
    public String getDescrizione() {
        return descrizione;
    }

    public void setDescrizione() {
        this.descrizione = descrizione;
    }

    //PREZZO
    public double getPrezzo() {
        return prezzo;
    }

    public void setPrezzo() {
        this.prezzo = prezzo;
    }

    public String toString() {
        return "Modello: " + nome + ", descrizione: " + descrizione + ", prezzo: " + prezzo + ", iva: " + iva;
    }
}


