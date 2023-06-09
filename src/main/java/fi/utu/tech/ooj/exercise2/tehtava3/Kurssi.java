package fi.utu.tech.ooj.exercise2.tehtava3;

import java.util.ArrayList;
import java.util.HashMap;


public class Kurssi {
    //@.classInvariant          getNimi().length() > 0 && getOpintopisteet() >= 0 getOpintopisteet() <= 100 && getLuennoitsija().length() > 0
    //Nimi, opintopisteet ja luennoitsija ovat luokan perustietoja. Täten ne tulee olla määritettynä oikein heti, kun luokasta luodaan uusi instanssi.

    //@.classInvariantPrivate   nimi.length() > 0 && opintopisteet >= 0 && opintopisteet <= 100 && luennoitsija.length() > 0
    //Luokan perustiedot on suojattu private-määreellä. Täten määritetään yksityisessä luokkainvariantissa näiden muuttujien vaatimukset.

    private String nimi;
    private Integer opintopisteet;
    private String luennoitsija;

    private ArrayList<Opiskelija> osallistujat = new ArrayList<Opiskelija>();
    private HashMap<Opiskelija, Integer> arvosanat = new HashMap<Opiskelija, Integer>();

    public Kurssi(String nimi, Integer opintopisteet, String luennoitsija) {}

    /**
     * Asettaa kurssille nimen tai muuttaa sitä, jos kurssilla on jo nimi.
     * @.pre nimi != null && nimi.length() > 0
     * @.post RESULT == nimi
     */
    public void setNimi(String nimi){}

    /**
     * Palauttaa kurssin nimen.
     * @.pre true
     * @.post RESULT == nimi
     */
    public String getNimi(){
        return this.nimi;
    }

    public void setOpintopisteet(Integer opintopisteet){}

    public Integer getOpintopisteet(){
        return this.opintopisteet;
    }

    public void setLuennoitsija(String luennoitsija){}

    public String getLuennoitsija(){
        return this.luennoitsija;
    }

    public class OpiskelijaJoKurssillaException extends Exception {}

    /**
     * Liittää opiskelijan kurssille, mikäli opiskelija ei vielä ole kurssilla.
     * @.pre opiskelija != null && opiskelija.getStudentName().length() > 0 && opiskelija.getStudentNumber().length() > 0
     * @.post RESULT != null && RESULT.size() > OLD.size() && RESULT.size() == OLD.size() -> throw OpiskelijaJoKurssillaException
     */
    public void liitaOpiskelijaKurssille(ArrayList<Opiskelija> osallistujat, Opiskelija opiskelija) throws OpiskelijaJoKurssillaException {}


    public void listaaOpiskelijat(ArrayList<Opiskelija> osallistujat){}

    /**
     * Kirjaa opiskelijoiden arvosanat avain-arvo-pari-listaan.
     * @.pre arvosanat != null
     * @.post RESULT.size() > 0 && FORALL(i: arvosanat.keySet(); EXISTS(j: osallistujat; i == j))
     */
    public void arvostelu(HashMap<Opiskelija, Integer> arvosanat){}

    public String raportti(String nimi, ArrayList<Opiskelija> osallistujat, HashMap<Opiskelija, Integer> arvosanat){return null;}
}
