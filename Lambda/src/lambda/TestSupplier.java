/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lambda;

import java.util.function.Supplier;

/**
 *
 * @author Mohamed
 */
public class TestSupplier {

    public static void main(String[] args) {
        Supplier<String> s1 = () -> new String("hello !");
        System.out.println(s1.get());
        Supplier<Personne> s2 = () -> new Personne(50, "Dédé");
        System.out.println(s2.get());
    }

}
