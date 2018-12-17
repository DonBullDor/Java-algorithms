/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lambda;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

/**
 *
 * @author Mohamed
 */
public class TestPredicate {

    public static void main(String[] args) {

        List<Personne> lPersonne = Arrays.asList(
                new Personne(10, "toto"),
                new Personne(20, "titi"),
                new Personne(30, "tata"),
                new Personne(40, "tutu")
        );

        Predicate<Personne> predicate = (Personne p) -> p.getAge() > 20;
        for (Personne p : lPersonne) {
            if (predicate.test(p)) {
                System.out.println(p.getNom() + " a l'âge requis !");
            }
        }
    }
}
