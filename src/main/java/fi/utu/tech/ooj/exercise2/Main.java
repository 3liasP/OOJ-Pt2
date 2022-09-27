package fi.utu.tech.ooj.exercise2;

import fi.utu.tech.ooj.exercise2.tehtava4.Pora;
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
        Pora op = new Pora();

        // avataan piirturi
        // käynnistä: mvn javafx:run
        Application.launch(Piirturi.class);
    }
}

