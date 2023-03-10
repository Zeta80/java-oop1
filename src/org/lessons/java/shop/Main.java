package org.lessons.java.shop;

import org.lessons.java.shop.Prodotto;

public class Main {
    public static void main(String[] args) {

       Prodotto prodotto = new Prodotto("audi", "veloce come il vento",1573.56, 23);
        System.out.println("Codice prodotto: " + prodotto.getCodice());
        System.out.println("Nome prodotto: " + prodotto.getNome());
        System.out.println("Descrizione prodotto: " + prodotto.getDescrizione());
        System.out.println("Prezzo prodotto: " + prodotto.getPrezzo());
        System.out.println("Prezzo ivato prodotto: " + prodotto.getPrezzoIvato());


        prodotto.setNome("Audi v7-stonedition");
        prodotto.setDescrizione("leggermente piu veloce del vento");
        prodotto.setPrezzo(2220.55);
        prodotto.setIva(25);

        System.out.println("Nome prodotto aggiornato: " + prodotto.getNome());
        System.out.println("Descrizione prodotto aggiornata: " + prodotto.getDescrizione());
        System.out.println("Prezzo prodotto aggiornato: " + prodotto.getPrezzo());
        System.out.println("Prezzo ivato prodotto aggiornato: " + prodotto.getPrezzoIvato());
    }
    //nice CARSSONE 🗿🚗
}