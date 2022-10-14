# **Tehtävä 5**

## A.
`piirrä`-metodi määritellään julkisessa rajapintaluokassa `Piirros`. Koska piirrä metodi kuuluu rajapintaluokkaan, sillä ei ole toiminnallisuutta itsessään, vaan jokainen luokka joka rajapintaa käyttää, voi itse määritellä toteutuksen. `piirrä`-metodi on myös määritelty abstraktissa luokassa `Kuvio`. Abstraktissa luokassa määritelty `piirä`-metodi on myös määrittelemätön ja se voidaan määritellä perijäluokan toimesta `@Override`-avainsanalla. Täten tässä tapauksessa ilmenee **polymorfismia**. Tällöin asiakas voi käsitellä perijäluokan metodia edes havaitsematta sitä.

## B.
Molemmat toteutukset `Piirros1` ja `Piirros2` toteuttavat rajapintaluokan `Piirros`, mutta luokka `Piirros2` perii myös luokan `Siksak`. `Siksak`-luokka toteuttaa rajapinnan `Asettelu`. `Piirros1`-luokassa luodaan uusi instanssi `Siksak`-oliosta ilman että `Piirros1`-luokka varsinaisesti perii kyseistä luokkaa.

Luokan `Piiros2` kanssa on kyse **periytymisestä**, koska kyseinen luokka perii kaikki `Siksak`-luokan ominaisuudet. `Piirros1`-luokan tapauksessa on kyse vain uuden `Siksak`-olion luomisesta, eli **kompositiosta**, kun `rakenna`-metodissa luodaan uudet `Siksak`- ja `Neliöt`-instanssit. `Piirros1`-luokassa myös `piirrä`-metodi toimiii eritavalla, sillä esimeriksi piste kutsutaan eritavalla.

Etuna `Piirros1`-luokassa on se, että sen tapauksessa rajapintasitoumukset ovat helpommin valittavissa. Kompositio on kuitenkin usein pidempi kirjoittaa perityminen ja sitä  käytettäessä tulee olla täysi ymmärrys luotujen olioiden toimminnasta. `Piirros2`:en tapauksessa perimällä `Siksak`-luokka, voidaan asettelu ulkoistaa toiselle luokalle ja käyttää jo kirjoitettua koodia uudelleen. Periytymisen tapauksessa metodeja voidaan myös korvata, kuten luokan `Piirros2` tapauksessa.

## C.
Luokilla `Piirros2` ja `Piirros3` on molemmilla sama singatuuri lukuunottamatta itse niiden nimeä, mutta niiden toiminnallisuudet ovat erilaiset. Molempien `piirrä`-metodit ovat kuitenkin samanlaiset.

Piirros3 on määritelty `extends Siksak implements Piirros` eikä `extends Siksak, Neliö`, koska `Piirros3`-luokka hyödyntää myös **kompositiota** rivillä 70 `Kuviointi kuviointi = new Neliöt()`, jossa luodaan uusi `Kuviointi`-olio, uuden `Neliöt`-olion avulla, vaikka `Piirros3`-luokka ei peri `Neliöt`-luokkaa. Tämä on mahdollista, koska `Neliöt`-luokka toteuttaa rajapinnan `Kuviointi`. Täten `Neliöt` oliota voidaan kuvata myös `Kuviot` oliona. Luokka `Piirros3` hyödyntää siis **Dynaamista sidontaa**.

Kun dynaamisen sidonta yhdistetään polymorfismin ja rajapintamäärittelyn kanssa, voidaan olioita käsitellä abstraktimmin eri konteksteissa tietämättä kuitenkaan niiden konkreettisia piirteitä.

`Piirros2`-luokka on myös lyhyempi kirjoittaa, kuin luokka `Piirros3`. 