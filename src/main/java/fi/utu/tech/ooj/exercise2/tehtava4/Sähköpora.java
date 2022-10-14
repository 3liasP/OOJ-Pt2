package fi.utu.tech.ooj.exercise2.tehtava4;

import java.util.ArrayList;

public class Sähköpora extends TyökaluBase implements Sähköinen, Poraava{

    private boolean kytketty = false;

    public Sähköpora(){
        idNumero = 2;
        merkki = "Makita";
        tyyppi = "eDrill";
        ArrayList<Metallit> soveltuvuusMetallille = new ArrayList<Metallit>();
        soveltuvuusMetallille.add(Metallit.ALUMIINI);
        soveltuvuusMetallille.add(Metallit.KUPARI);
        soveltuvuusMetallille.add(Metallit.MESSINKI);
        soveltuvuusMetallille.add(Metallit.TERÄS);
        soveltuvuusMetallille.add(Metallit.HOPEA);
        System.out.println("Luotu " + this);
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