package fi.utu.tech.ooj.exercise2.tehtava4;

import java.util.ArrayList;

public class Saha extends TyökaluBase implements Sahaava {
    
    public Saha() {
        idNumero = 3;
        merkki = "Bacho";
        tyyppi = "Saw";
        ArrayList<Metallit> soveltuvuusMetallille = new ArrayList<Metallit>();
        soveltuvuusMetallille.add(Metallit.ALUMIINI);
        soveltuvuusMetallille.add(Metallit.KUPARI);
        soveltuvuusMetallille.add(Metallit.MESSINKI);
        soveltuvuusMetallille.add(Metallit.TERÄS);
        soveltuvuusMetallille.add(Metallit.HOPEA);
        System.out.println("Luotu " + this);
    }

    /* @.pre true
     * @.post this.toString()
     */
    public void sahaa(int xKoordinaatti){
        System.out.println(this.toString());
    }

}