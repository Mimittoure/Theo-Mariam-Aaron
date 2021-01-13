public class Frey {
    String name;
    String haarfarbe;
    int alter;
    boolean weiblich;
    double groesse;
    String Sportart;

 public Frey (String vorname, String farbehaare,int Alter, boolean geschlecht, double grösse,String sport){
    this.name= vorname;
    this.haarfarbe = farbehaare;
    this.alter = Alter;
    this.weiblich= geschlecht;
    this.groesse= grösse;
    this.Sportart= sport;
 }
 public static void main (String []args){

     Frey f1= new Frey("Aaron","schwarz",26,false,1.88,"Boxen");

     System.out.println( f1.name+" hat " +f1.haarfarbe+ "e Haare und ist " +f1.alter+ " Jahre alt");
 }
}