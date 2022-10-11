# **Tehtävä 2**

## A.
**Literaaliluokka eli enum-luokka.** Luokan oliot ovat muuttumattomia, eikä niitä voi lisätä muuttamatta kyseisen luokan koodia. Tämän luokkakonstruktion avulla on helppo luoda ennalta määrätty määrä eri puulajeja. Jos käytettäisiin enum-luokan sijasta normaalia luokkaa, tulisi koodia kirjoittaa myös huomattavasti enemmän.

## B.
**Esiintymäkohtainen sisäluokka.** Tämä luokkakonsturkito sopii parhaiten kyseiseen tarkoitukseen, sillä se vaatii ulkoluokasta luodun instanssin toimiakseen. Tässä tapauksessa esimerkiksi Ajoneuvo-olion, johon voidaan yhdistää sisäluokan määrittämän ajoneuvotyypin mukaiset ominaisuudet.

## C.
**Funktioliteralit ja rajapinnat.** Tässä tapauksessa kyseisellä luokkakonstruktiolla on helppo toteuttaa metodi, jolle annetaan syötteeksi jokin arvo. Tässä tapauksessa pallon säde.

## D.
**Staattinen sisäluokka.** Tämä luokkakonstruktio kokoaa tässä tapauksessa toisiinsa liittyvät ajoneuvoluokat yhden luokan alle. Tällöin ulkoisella luokalla, eli Kuormalaskin-luokalla on pääsy mainittuihin sisäluokkiin.

## E.
**Staattinen sisäluokka.** Tätä luokkakonstruktiota käyttämällä on mahdollista luoda helposti avain-arvopareja pitäen samalla kirjaa niiden määrästä, jotta niiden ennalta määritettyä määrää ei ylitetä. 

## F.
**Tietueluokka eli record-luokka.** Tällä luokkakonstruktiolla voidaan mallintaa ei-polymorfista, eli muuttumatonta dataa. Tämä sopii luokkakonstruktioista tähän parhaiten, koska tietueiden ei haluta muuttuvan.

## G.
**Rajapintaluokka eli interface.** Käyttämällä rajapintaa voimme määritellä kahden toiminnalisen osan vuorovaikutusta, ja samalla asettaa toiminnalliset luokat toteuttamaan rajapintaa. Täten varmasti molemmat luokat toteuttavat keskinäisen vuorovaikutuksen eli rajapinnan.

## H
**Nimetön luokka.** Tämä sopii hyvin tarkoitukseen, koska kyseessä on yksinkertainen tapahtumankäsittelijä, jota tarvitaan kerran. Tällöin metodi voidaan määrittää tarvittaessa esimeriksi uudelleen. Lisäksi kyseinen luokka on kompakti kirjoittaa.