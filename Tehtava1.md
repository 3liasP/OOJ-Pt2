# **Tehtävä 1**

## A.
ArrayListin periytymishierarkia:

    java.lang.Object
        java.util.AbstractCollection<E>
            java.util.AbstractList<E>
                java.util.ArrayList<E> 

## B.
LinkedListin periytymishierarkia:

     java.lang.Object
        java.util.AbstractCollection<E>
            java.util.AbstractList<E>
                java.util.AbstractSequentialList<E>
                    java.util.LinkedList<E>

## C.
Jos ArrayList ja LinkedList periytyisivät suoraan Object-luokasta, tulisi molempien luokkien sisältää kaikki mahdollinen toiminnallisuus niiden toteuttamiseksi. Tämä johtaisi väistämättä siihen, että molempien luokkien määrittämiseen tarvittava koodi olisi huomattavasti pidempi. Molempien luokkien ja Object-luokan väliin jäävät luokat pitäisi myös kijroittaa, siten että ne sisältäisivät kaiken niiden toiminnallisuuteen tarvittavan koodin. Kun hyödynnyten periytyvyyttä, voidaan jo kirjoitettua koodia käyttää uudelleen, koska hierarkiassa alemmat luokat perivät ylemmän luokan metodit ja ylemmän luokan sisäiset muuttujat. Metodeja voidaan myös mahdollisesti määritellä uudelleen, jotta voidaan hyödyntää polymorfismia. Lisäksi hierarkian avulla on huomattavasti helpompi määritellä ja dokumentoida esimerkiksi kirjastojen dokumentaatioita, koska hierarkian perusteella ilmenee eri luokkien väliset suhteet selkeästi.

## D.
### ArrayList: RandomAccess
Rajapinta, jota esimerkiksi List-toteutukset käyttävät osoittaakseen, että ne tukevat nopeaa, usein vakioaikaista, satunnaiskäyttöä. Tämän rajapinnan ensisijainen tarkoitus on antaa geneeristen algoritmien muuttaa käyttäytymistään niin, että ne tarjoavat hyvän suorituskyvyn, kun niitä sovelletaan joko "sequential accessin" tai "random accessin" kanssa.

### LinkedList: Deque
Tämä rajapinta mahdollistaa jono-tyylisten tietorakenteiden muodostamisen. Jonot ovat lineaarisia kokoelmia, jotka tukevat alkioiden lisäämistä ja poistamista molemmista päistä. Rajapinta sisältää metodeja alkion lisäämistä, poistamista ja tarkastelua varten. Kukin näistä metodeista on olemassa kahdessa muodossa: toinen heittää poikkeuksen, jos operaatio epäonnistuu, ja toinen palauttaa erikoisarvon (joko nolla tai false, operaatiosta riippuen).

## E.
Rajapintojen avulla voidaan saavuttaa täydellinen abstraktio, kun voidaan kirjoittaa vain rutiinien määrittelyt, mutta niiden toiminnallisuutta ei tarvitse kirjoitta vielä. Esimerkiksi ArrayListin ja LinkedListin tapauksessa tarkoituksena on käyttää perintämekanismia siten, että rajapinnan toteuttamien luokkien taataan osaavan määrittelyn mukaisen operaation ja luokan kirjoittajalta voidaan varmistaa, että näitä operaatioita halutaan todellakin käytettävän.

## F.
Kokeillaan konstruktorin toimintaa käytännössä:

    LinkedList<String> ll = new LinkedList<String>();

    // Adding elements to the linked list
    ll.add("A");
    ll.add("B");
    ll.addLast("C");
    ll.addFirst("D");
    ll.add(2, "E");

    ArrayList<String> al = new ArrayList<String>(ll);

    System.out.println(al);
Ohjelma tulostaa:

    [D, A, E, B, C]

Täten voidaan huomata, että konstruktori toimii myös, vaikka sille antaa LinkedList-olion. Tämä onnistuu, koska kyseiselle konstruktorille tulee antaa Collection-tyyppinen parametri. Koska LinkedListin määrittely toteuttaa Collection-rajapinnan, se voidaan tulkita myös Collection-olioksi tässä tapauksessa ja ohjelma voidaan suorittaa.

## G.
Tämä ei toimi, sillä konstruktorille ei kelpaa parametriksi Array-tyyppinen olio:

    // declares an Array of integers.
    int[] arr;
    // allocating memory for 5 integers.
    arr = new int[5];
    // initialize the first elements of the array
    arr[0] = 10;
    // initialize the second elements of the array
    arr[1] = 20;
    // so on...
    arr[2] = 30;
    arr[3] = 40;
    arr[4] = 50;
    ArrayList<Integer> al = new ArrayList<Integer>(arr); // saadaan virheilmoitus

Array-olio tulee muuttaa ArrayList-tyyppiseksi olioksi:

    // declares an Array of integers.
    int[] arr;
    // allocating memory for 5 integers.
    arr = new int[5];
    // initialize the first elements of the array
    arr[0] = 10;
    // initialize the second elements of the array
    arr[1] = 20;
    arr[2] = 30;
    arr[3] = 40;
    arr[4] = 50;
    List<Integer> al = new ArrayList<Integer>();
    // adding elements of array to arrayList.
    for (int i : arr) {
        al.add(i);
    }
    System.out.println(al);

Tässä tapauksessa ohjelma voidaan ajaa ja tulosteeksi saadaan:

    [10, 20, 30, 40, 50]


## H.
Jono voidaan toteuttaa esimerkiksi seuraavasti:

    Queue<Integer> q = new LinkedList<>();


## I.
Stack on luokka eikä rajapinta, kuten useimmat tietorakenteet. Koska Stack-luokka perii luokan Vector, eli se on Vector-luokan aliluokka, sillä on kyky käyttää Vector-luokan toimintoja. Stack luokka voi esimerkiksi käyttää, lisätä ja poistaa alkioita niiden indeksien perusteella Stack-luokalle tyypillisten metodien lisäksi.

## J.
Suoritetaan seuraava ohjelma:

    StringBuilder sb = new StringBuilder("Java");
    String s = "Java";

    s.concat(" 17");
    sb.append(" 17");

    System.out.println("String: " + s);
    System.out.println("StringBuilder: " + sb);

Tulosteeksi saadaan:

    String: Java
    StringBuilder: Java 17

String-olio ei muutu, koska Javassa merkkijonotyyppiset oliot ovat mutatoimattomia, toisin kuin Stringbuilder-oliot. Jos haluamme kuitenkin käyttää kuitenkin concat()-metodia, tulee muuttuja "s" määrittään uudelleen:

    s = s.concat(" 17");

