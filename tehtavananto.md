# Tehtävänanto - Harjoitus 2

Pisteytys: 12 + 8 + 12 + 14 + 14 = 60



### Tehtävä 1

Tässä tehtävässä tutustutaan joihinkin Javan standardikirjaston luokkiin ja luokkakokonaisuuksiin. Tehtävässä tarvitaan pohjatietoa seuraavista: luokka, abstrakti luokka, rajapinta (interface), periytyminen, polymorfismi, mutatoituva (mutable) ja mutatoitumaton (immutable) eli muuttumaton olio.

Tutustu aluksi luokkien [ArrayList](https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/util/ArrayList.html) ja [LinkedList](https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/util/LinkedList.html) dokumentaatioon sekä vastaa kysymyksiin A-H.

***A.*** Selvitä dokumentaatiosta ArrayListin periytymishierarkia: mikä on ArrayListin yliluokka, ko. luokan yliluokka jne. aina Object-luokkaan asti. Rajapintoja (interface) ei tarvitse ottaa huomioon.

***B.*** Selvitä myös LinkedListin periytymishierarkia.

***C.*** Mitä mahdollista hyötyä on siitä, että ArrayList ja LinkedList eivät periydy suoraan Object-luokasta vaan ovat osa laajempaa luokkahierarkiaa? Vinkki: asiaa voi olla hyvä ajatella luokkakirjaston toteuttajien näkökulmasta.

***D.*** ArrayList- ja LinkedList-luokkien toteuttamat rajapinnat (interface) poikkeavat jonkin verran toisistaan. Etsi kummastakin luokasta yksi rajapinta, joita toinen luokista ei toteuta sekä kuvaile lyhyesti ko. rajapintojen merkitys.

***E.*** Mitä mahdollista hyötyä on siitä, että ArrayList ja LinkedList toteuttavat useita rajapintoja (mm. [List](https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/util/List.html)) verrattuna siihen, että näitä rajapintoja ei käytettäisi? Vinkki: asiaa voi olla hyvä ajatella luokkien käyttäjien näkökulmasta.

***F.*** ArrayList-luokassa on konstruktori, jonka signatuuri on *public ArrayList(Collection<? extends E> c)*. Sen avulla voi luoda uuden ArrayListin, jossa on samat alkiot kuin parametrina annetussa oliossa. Voiko parametriksi antaa LinkedList-olion? Perustele vastauksesi.

***G.*** Kohdassa F mainitulle konstruktorille ei kelpaa parametriksi taulukko. Esitä jokin tapa luoda uusi lista, joka sisältää annetussa taulukossa olevat alkiot. Listan tulee olla luonnin jälkeen vapaasti muokattavissa, eivätkä alkuperäiseen taulukkoon listan muodostamisen jälkeen tehdyt muutokset saa vaikuttaa listan sisältöön. Vinkki: [Arrays](https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/util/Arrays.html)-luokasta voi olla apua, mutta sen dokumentaatio kannattaa lukea tarkasti.

***H.*** Kuvitellaan, että tiedämme jotakin kokoelmaa käsiteltävän aina ns. jonon tavoin (lisäys tehdään aina jonon loppuun, poisto taas jonon alusta). Kirjoita ohjelmakoodirivi, jolla voit määritellä muuttujan ja luoda olion niin, että ko. muuttujan kautta olioon voi kohdistaa vain jono-operaatioita (katso [Queue](https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/util/Queue.html)). Jonon konkreettinen esitystapa voi olla esim. linkitetty lista, ja välittömästi luonnin jälkeen jonon tulee olla tyhjä.

Vastaa vielä kysymyksiin I ja J, joiden maksimipistemäärä on 2 pistettä / kysymys.

***I.*** Luokkakirjastosta löytyy pino-tietorakenteen esittämiseen tarkoitettu luokka [Stack](https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/util/Stack.html), jonka käyttämistä ei enää suositella. Jos sitä kuitenkin käytettäisiin, niin toimisiko Stack-luokan olio siinä mielessä "pinomaisesti", että lisäykset ja poistot Stack-olioon voivat kohdistua vain pinon yhteen päähän (ns. pinon huippuun), vai olisiko Stack-olion sisältämiä alkioita mahdollista käsitellä muullakin tavalla? Perustele vastauksesi.

***J.*** Oletetaan, että sekä [String](https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/lang/String.html)-olion s että [StringBuilder](https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/lang/StringBuilder.html)-olion sb sisältönä on merkkijono "Java". Jos suoritetaan *s.concat(" 17");* ja *sb.append(" 17");*, niin mitkä ovat nyt muuttujien s ja sb viittaamien merkkijonojen sisällöt? Perustele vastauksesi.


### Pisteytys

* Kysymyksistä A-H 1 piste, I-J 2 pistettä. Kysymyksiin riittää antaa yksi vastaus, vaikka johonkin kysymykseen olisikin olemassa useita oikeita vastauksia.
* Yhteensä: 12 pistettä

---

## Tehtävä 2

Mikä on sopivin luokkakonstruktio (luento Luokkakonstruktiot) seuraaville asioille? Perustele vastauksesi. 

***A.*** Erilaisia puulajeja edustava luokka, joka luettelee ennalta määritellyn joukon 
puulajeja, lomakkeen kenttää varten. 

***B.*** Ajoneuvotyyppejä kuvaava luokka, joka sisältää kaikille tyypeille yhteisiä ominaisuuksia ja 
toiminnallisuuksia, mutta ei voi toimia itsenäisesti. 

***C.*** Pallon tilavuuden lasku (4 *3.14 * säde^3) / 3, kun säde vaihtelee.

***D.*** Simulaattoripelissä ajoneuvoa esittävä luokka, jolla on aliluokkina vain henkilöautoja, moottoripyöriä ja yhdistelmärekkoja
esittävät luokat 
(luokat Henkilöauto, Moottoripyorä, YhdistelmäRekka). Halutaan taata, että ulkopuolinen Kuormalaskin-luokka pystyy kaikissa 
tilanteissa havainnoimaan ajoneuvojen kuorman.

***E.*** Avain-arvo-pareja tallettava luokka, joka lisäämisen yhteydessä pitää huolen, että avain-arvo-parien määrä 
ei ylitä ennalta määrättyä rajaa (esim. poistamalla ensimmäisenä lisättyjä pareja).

***F.*** Tietokannasta haetut tietueet, joiden ei haluta muuttuvan.

***G.*** Ohjelman kahden toiminnallisen osan välisen vuorovaikutuksen määrittely.

***H.*** Käyttöliittymän graafisen komponentin yksinkertainen tapahtumankäsittelijä, jota tarvitaan vain yhden kerran. 



### Pisteytys

* Piste per kohta
* Yhteensä: 8 pistettä

---

## Tehtävä 3

Opinnot koostuvat kursseista. Halutaan määritellä luokka Kurssi, josta luodut instanssit kuvaavat yhtä kurssitoteutusta.

Kurssin halutaan tallentavan seuraavat perustiedot:
- nimi
- opintopistemäärä, joka vaihtelee välillä 0-100
- luennoitsija

Lisäksi halutaan tallentaan:
- osallistujalista, jossa osallistujaa kuvaa Opiskelija-luokan instanssi
- arvosana, jossa Opiskelija-luokan instanssiin liittyy kokonaislukutyyppinen arvosana

***A.*** Määrittele Kurssi-luokkaan toiminnallisuudet uuden instanssin luomiselle
sekä rutiinit seuraavien tehtävien hoitamiseen.

- kurssin perustietojen havainnointi ja muokkaus
- opiskelijan liittäminen kurssille. Sama opiskelija voi liittyä vain kerran. 
Jos opiskelija on jo liittynyt, nostetaan poikkeus.

- osallistujien listaaminen
- opiskelijan arvostelu
- raportti, joka palauttaa kurssin nimen, osallistujien lukumäärän 
ja arvosanojen keskiarvon

***B.*** Suojaa luokan jäsenet sopivilla suojausmääreillä.

***C.*** Määritä neljälle rutiinille signaatuurit ja alku- ja loppuehdot.

***D.*** Määritä julkinen ja yksityinen luokkainvariantti. Perustele vastauksesi

***Rutiineita ei tarvitse toteuttaa.***


### Pisteytys

* luokan rakenne tehty oikein ja perusteltu 5 piste
* alku- ja loppuehdot oikein 4 pistettä
* luokkainvariantti on järkevä 2 piste
* suojausmääreet oikein 1 piste
* Yhteensä: 12 pistettä

---

## Tehtävä 4

Vaativiin koneistuksiin erikoistunut metallialan yritys käyttää simulaatiosovellusta
osana valmistusprosessien suunnitelua. Valmistettavat tuotteet ovat tuotantokustannuksiltaan 
kalliita ja simuloinnilla halutaan vähentää valmistuksen aikaisia virhetilanteita.

Alla olevan UML-kaavion luokkakokonaisuus mallintaa sovelluksen osaa sovelluksen 
tuntemista työkaluista ja työkaluvarastoa. Lisäksi  lueteltu tyyppi Metallit edustaa erilaisia 
käytössä olevia raaka-aineita. 

Jotta prosessia voidaan simuloida, työkalujen ominaisuudet pitää tuntua. Samanaikaisesti 
käynnissä olevia prosesseja rajoittaa työkalujen määrä.

Seuraavassa kuvassa on avattu UML-kaavion luokan osien merkitys. Jäsenmuuttujat esitellään ensin ja 
niiden merkkinä on väliviiva. Niiden jälkeen luetellaan rutiinit. Ne merkitään plusmerkillä. Kannattaa huomata,
että muuttujat tai rutiinit saattavat myös puuttua. 

![UML esimerkki](/luokan_uml_selitys.jpg "UML esimerkki")

Kaavion yhtenäiset viivat kuvaavat perintää ja katkoviivat rajapinnan toteuttamista. Rajapintaluokat on merkitty sanalla 
interfase. Abstrakti luokan nimi on kirjoitettu kursiivilla. Kaaviossa on vain yksi abstraktri luokka, TyökaluBase.


![Luokkakaavio](/Tehtävä_3.jpg "Luokkakaavio")
-
***A.*** Tutustu luokkakaavioon. Tehtävässä pohditaan rakennetta peilaten sitä kurssilla opittua vasten. 
Mitä hyvää ja huonoa rakenteessa on? Mitä kurssilla opetettuja periaatteita on käytetty?
Perustele vastauksesi.

***B.*** Toteuta alla listattuhin luokkiin vaaditut rutiinit. Vaatimukset tulevat periytymis- ja 
toteutussuhteiden kautta. Suunnittele rutiinien alku- ja loppuehdot. Tehtävä tehdään tehtava4 
hakemistoon. 
- Pora
- Sähköpora
- Saha
- Sähkösaha

Käytä rutiinien toiminnallisuutena alla olevaa koodia. Tutustu myös luokassa TyökaluBase valmiina olevaan
toString-rutiiniin, joka ylikirjoittaa toString-metodin muuttaen sen toimintaa.

```java
System.out.println(this.toString());
```

***C.*** Tee edellä mainittuihin luokkiin konstruktorit, jotka alustavat kaikki luokkien attribuutit.

***D.*** Toteuta luokkaan TyökaluVarasto konstruktori, joka vastaanottaa parametrina listan työkaluja ja asettaa
sen luokan jäsenmuuttujaan.

***E.*** Luo Main-luokan main-rutiinissa uusi TyökaluVarasto instanssi ja täytä se erilaisilla 
työkaluilla. Työkalut voit valita itse. 


### Pisteytys

* A-kohta 4 pistettä
* B-kohta 4 pistettä
* C-kohta 3 pistettä
* D-kohta 1 piste
* E-kohta 2 piste
* Yhteensä: 14 pistettä
 
---

## Tehtävä 5

Paketin `fi.utu.tech.ooj.exercise2.tehtava5` alla olevat luokat määrittävät
eräänlaisen järjestelmän `Kuvioiden` (`Kolmio`, `Neliö`, `Ympyrä`)
piirtämiseen `PiirtoAlueen` perusväreillä (`Sininen`, `Punainen`,
`Vihreä`, `Oranssi`). Koska yksittäisten kuvioiden piirto on melko
primitiivistä, on määritelty lisäksi luokka `Kuviointi`, joka määrittää
sekvenssin piirrettäviä kuvioita ja luokka `Asettelu`, joka määrittää
vastaavasti sekvenssin `Pisteitä` kuvioiden piirron asemointia varten.

Kahta sekvenssiä käyttäen voidaan esimerkiksi poimia yksi kerrallaan
piste ja kuvio ja käyttää näitä kyseisen kuvion piirtämiseksi paikkaan
piste annetulle piirtoalueelle:

```java
while (true) {
  var kuvio = kuviointi.seuraavaKuvio();
  var piste = asettelu.seuraavaPiste();
  if (kuvio == null || paikka == null) return;
  kuvio.piirrä(piste, piirtoAlue);
}
```

Käytännössä piirtäminen halutaan lopettaa jossain vaiheessa, joten
käytännöllisempi toteutus päättää silmukan `N` iteraation jälkeen
(ks. toteutukset tiedostossa `Piirros.java`).

Järjestelmässä on kokonaisuudessaan lähes 20 luokkaa - siksi sitä on
helpompi tarkastella abstraktien ja rajapintaluokkien kautta ja
sivuuttaa ensin kokonaisuuden selkeyttämiseksi konkreetit erikoistapauksia
esittävät aliluokat. Koodi on myös rakennettu niin, että mahdollinen
JavaFX-toiminnallisuus (ei kurssin osaamistavoitteita) on eristetty
"piiloon" `Piirturi`-luokkaan siten, että se on helpompi sivuuttaa.

Tarkastele annettua toteutusta seuraavien kysymysten avulla:

**A.** `Kuvio`-luokassa määritetään metodi `piirrä`. Metodia käytetään
   `Piirros`-luokissa. Kuvaile, mitä olio-ohjelmoinnin konseptia metodin
   yhteydessä käytetään ja mikä on tällä mahdollisesti tavoiteltu hyöty.
   Vinkki: toteuttajan ja asiakkaan näkökulma + muita liittyviä luokkia?

**B.** Vertaa toteutuksia `Piirros1` ja `Piirros2`. Huomaa, että luokat
   pyrkivät käyttämään uudelleen koodia, mutta eroavat luokkatason
   signatuurista alkaen. Mistä olio-ohjelmoinnin konsepteista on
   kyse kummassakin tapauksessa? Etsi toteutusta analysoimalla vähintään
   yksi etu ja rajoite kummallekin ratkaisutavalle.

**C.** Vertaa vielä toteutuksia `Piirros2` ja `Piirros3`. Etsi
   edellisen kohdan tavoin toteutusta analysoimalla vähintään
   yksi etu ja rajoite kummallekin ratkaisutavalle. Miksi `Piirros3`
   on määritelty `extends Siksak implements Piirros` eikä
   `extends Siksak, Neliöt`?

**D.** Etsitään vielä yksi ratkaisu olio-ohjelmoinnin suunnitteluongelmaan
   etsimällä toteutukseen seuraava ratkaisua ns. laatikon ulkopuolelta.
   Tehtävän tuloksena odotetaan siis toteutusta - anna koodina toteutus ja
   kerro lyhyesti, miten sitä käytettäisiin. Oikeanlainen toteutus
   mahdollistaa piirtämisen niin kuin annettu toteutus nyt tekee
   sekä toisella, tässä kuvatulla tavalla.

Nyt `Piirturi`-luokassa metodissa `piirräAlueille` piirretään koko
piirros kokonaisuudessaan ensin ensimmäiselle listatulle piirtoalueelle,
sitten toiselle, ja niin edelleen. Kehitä olio-ohjelmoinnin konsepteja
käyttäen toteutus, joka piirtäisikin jokaisen piirtokäskyn (`PiirtoAlueen`
määrittämät) yksi kerrallaan kaikille listatuille `PiirtoAlueille`.

Esimerkiksi annetun valmiin toteutuksen tapauksessa terminaaliin ja näytölle
graafisesti tulostuvat kuviot tehtäisiin vuorotellen eikä peräjälkeen
piirtoaluekohtaisesti. Käytännössä piirto on niin nopeaa nykyisillä
tietokoneilla, että tätä eroa ei pysty näkemään lisäämättä taukoa
piirtojen väliin. Tällainen havainnointia helpottava tauko on saatavilla
`Piirros1`-luokassa metodissa `tauko()`.

Ratkaisuun liittyy toteutustavasta riippuen mahdollisesti ongelma, joka
voi sotkea kuvion piirron siten, että lopputulos näyttää erilaiselta,
kun tavoite on tuottaa eksaktisti sama graafinen lopputulos tai tuloste
terminaaliin. Selvitä kokeilemalla, vältytkö kyseiseltä ongelmalta.
Jos et kohtaa toteutuksessasi kyseistä ongelmaa, pohdi, mikä toteutuksen
luokka voisi olla herkkä piirtojärjestyksen muutoksille ja perustele miksi.

### Pisteytys

* A-kohta 2 pistettä
* B-kohta 4 pistettä
* C-kohta 4 pistettä
* D-kohta 4 pistettä
* Yhteensä: 14 pistettä

---

