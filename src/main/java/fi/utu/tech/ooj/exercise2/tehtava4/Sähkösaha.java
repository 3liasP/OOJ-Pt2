package fi.utu.tech.ooj.exercise2.tehtava4;

import java.util.ArrayList;

public class Sähkösaha extends TyökaluBase implements Sähköinen, Sahaava{

    private boolean kytketty = false;

    public Sähkösaha() {
        idNumero = 4;
        merkki = "Bacho";
        tyyppi = "eSaw";
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

    /* @.pre kytketty == false
     * @.post kytketty == true && RESULT == this.toString()
     */
    public void kytkeVirta(){
        kytketty = true;
        System.out.println(this.toString());
    }

    /* @.pre true
     * @.post RESULT == kytketty
     */
    public boolean onkoKytketty(){
        return kytketty;
    }

    /* @.pre kytketty == true
     * @.post kytketty == false && RESULT == this.toString()
     */
    public void sammuta(){
        kytketty = false;
        System.out.println(this.toString());
    }

    /* @.pre true
     * @.post RESULT == this.toString()
     */
    public void säädäTeho(long tehoAsetus){
        System.out.println(this.toString());
    }

}