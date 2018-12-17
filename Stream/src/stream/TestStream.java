/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stream;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 *
 * @author Mohamed
 */
public class TestStream {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        List<Personne> listP = Arrays.asList(
                new Personne(1.80, 70, "A", "Nicolas", Couleur.BLEU),
                new Personne(1.56, 50, "B", "Nicole", Couleur.VERRON),
                new Personne(1.75, 65, "C", "Germain", Couleur.VERT),
                new Personne(1.68, 50, "D", "Michel", Couleur.ROUGE),
                new Personne(1.96, 65, "E", "Cyrille", Couleur.BLEU),
                new Personne(2.10, 120, "F", "Denis", Couleur.ROUGE),
                new Personne(1.90, 90, "G", "Olivier", Couleur.VERRON)
        );

        Stream<Personne> sp = listP.stream();
        /*Optional<Double> sum = sp.filter(x -> x.getPoids() > 50)
                .map(x -> x.getPoids())
                .reduce((x, y) -> x + y);
        System.out.println(sum.get());
         */
        /*
        long count = sp
                .filter(x -> x.getPoids() > 50)
                .map(x -> x.getPoids())
                .count();

        System.out.println("Nombre d'éléments : " + count);
        */
        List<Double> ld = sp.filter(x -> x.getPoids() > 50)
                .map(x -> x.getPoids())
                .collect(Collectors.toList());
        System.out.println(ld);
    }

}
