/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stream;

/**
 *
 * @author Mohamed
 */
public enum Couleur {
    MARRON("marron"),
    BLEU("bleu"),
    VERT("vert"),
    VERRON("verron"),
    INCONNU("non déterminé"),
    ROUGE("rouge mais j'avais piscine...");

    private String name = "";

    Couleur(String n) {
        name = n;
    }

    public String toString() {
        return name;
    }

}
