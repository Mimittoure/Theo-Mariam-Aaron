import java.sql.SQLOutput;

public class Lehrer {
    //Attribute - am besten nicht initialisieren,sondern nur deklarieren. Die Atrribute hat ein Lehrer
    String vorname;
    String fach;
    double raumnummer;
    int jahrgang;
    boolean weiblich;

    //wenn wir keinen konstruktor definieren,macht das Objekt einen leeren Konstruktor : public Klassenname(){}

    /*
    Konstruktor: (nicht in der main erstellen, sondern vor der main)
    public Lehrer (String ersterName, String lehrfach, DT Parameter, DT Parameter){
    this.vorname = ersterName;
    this.fach = lehrfach;
    } */

    //Konstruktor: wenn ein Hund erstellt, wird soll er diese Attribute haben
    public Lehrer (String ersterName, String lehrfach, double nummerdesraums, int jahrgangschule, boolean geschlecht){
        this.vorname= ersterName;
        this.fach= lehrfach;
        this.raumnummer= nummerdesraums;
        this.jahrgang= jahrgangschule;
        this.weiblich= geschlecht;
    }

    public static void main(String[] args) {
        //Konstruktor von oben initialisieren: Lehrer l1 =new Lehrer("Hanna","mathe","argument","argument");
        Lehrer l1 = new Lehrer ("Anna","Mathe & Deutsch",2.16,13,true);
        Lehrer l2 = new Lehrer ("Alia","Kunst",2.18,10,true);
        Lehrer l3 = new Lehrer ("Peter","Englisch",2.15,8,false);

       /*
        //Attribute in der main initialisieren
        Lehrer l1= new Lehrer(); //erzeugen eines neuen Objekts Lehrer vom Typ Lehrer
        l1.vorname="Anna";      //muss nicht alles initialisieren
        l1.fach="Mathe";
        l1.raumnummer= 1.45;
        l1.jahrgang= 12;
        l1.weiblich= true;
        */

       System.out.println("Die Lehrerin "+l1.vorname+" unterrichtet " +l1.fach);
       System.out.println("Die Lehrerin "+l2.vorname+" unterrichtet " +l2.fach+ " im " +l2.jahrgang + " Jahrgang");
      //  System.out.println(l1);     Die Speicheradresse von l1 ausgeben: Console:Lehrer@b4c966a
    }

}
