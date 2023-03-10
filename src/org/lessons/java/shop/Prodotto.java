package org.lessons.java.shop;

import java.text.DecimalFormat;
import java.util.Random;

public class Prodotto {
  // Un prodotto è caratterizzato da:
  //- codice (numero intero)
  //- nome
  //- descrizione
  //- prezzo
  //- iva
    private final int codice;
    private String nome;
    private String descrizione;
    private double prezzo;
    private int iva;

    // COSTRUTTORI
    public Prodotto(String nome, String descrizione, double prezzo, int iva) {
        this.codice = generateRandomCode();
        this.nome = nome;
        this.descrizione = descrizione;
        this.prezzo = prezzo;
        this.iva = iva;
    }



    // GETTER e SETTER
    //CODICE
    public int getCodice() {
        return this.codice;
    }
    //NOME
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    //DESCRIZIONE
    public String getDescrizione() {
        return descrizione;
    }

    public void setDescrizione(String descrizione) {
        this.descrizione = descrizione;
    }

    //PREZZO
    public double getPrezzo() {
        return prezzo;
    }

    public void setPrezzo(double prezzo) {
        this.prezzo = prezzo;
    }
    public double getIva() {
        return this.iva;
    }

    public void setIva(int iva) {
        this.iva = iva;
    }

    // METODI
    public int generateRandomCode() {
        Random rand = new Random();
        return rand.nextInt(100000000); // generiamo un numero a 8 cifre
    }

    public String getPrezzoIvato() {
        double prezzoIvato = this.prezzo + (this.prezzo * this.iva / 100);
        DecimalFormat df = new DecimalFormat("#0.00");
        return df.format(prezzoIvato);
    }

    public String toString() {
        return "Modello: " + nome + ", descrizione: " + descrizione + ", prezzo: " + prezzo + ", iva: " + iva;
    }
}


