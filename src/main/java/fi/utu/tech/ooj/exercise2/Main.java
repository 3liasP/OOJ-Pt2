package fi.utu.tech.ooj.exercise2;

import java.util.ArrayList;
import fi.utu.tech.ooj.exercise2.tehtava4.Työkalu;
import fi.utu.tech.ooj.exercise2.tehtava4.Pora;
import fi.utu.tech.ooj.exercise2.tehtava4.Sähköpora;
import fi.utu.tech.ooj.exercise2.tehtava4.Saha;
import fi.utu.tech.ooj.exercise2.tehtava4.TyökaluVarasto;
import fi.utu.tech.ooj.exercise2.tehtava5.Piirturi;
import javafx.application.Application;

public class Main {
    /**
     * Main class.
     *
     * @param args Command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Harjoitustyön pohja toimii");

        // Tehtävän 5 sisältöä
        ArrayList<Työkalu> tlista = new ArrayList<>();
        Pora np = new Pora();
        Sähköpora sp = new Sähköpora();
        Saha ns = new Saha();
        tlista.add(np);
        tlista.add(sp);
        tlista.add(ns);
        System.out.println(tlista);
        TyökaluVarasto tvarasto = new TyökaluVarasto(tlista);
        System.out.println(tvarasto.getTyökaluLista());
        
        
        // avataan piirturi
        // käynnistä: mvn javafx:run
        Application.launch(Piirturi.class);
    }
}
