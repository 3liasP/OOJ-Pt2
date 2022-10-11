package fi.utu.tech.ooj.exercise2.tehtava4;

import java.util.ArrayList;

public class Pora extends TyökaluBase implements Poraava {

    public Pora() {
        idNumero = 1;
        merkki = "Makita";
        tyyppi = "Drill";
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
    public void poraa(int xKoordinaatti, int yKoordinaatti){
        System.out.println(this.toString());
    }

    /* @.pre true
     * @.post RESULT == this.toString()
     */
    public void vaihdaTerä(int koko){
        System.out.println(this.toString());
    }
}