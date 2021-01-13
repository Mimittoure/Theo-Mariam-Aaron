public class Hase {

    private String fellfarbe;
    private int alter;
    private String rasse;
    private boolean weiblich;

    public Hase() {
    }

    public Hase(String fellfarbe, int alter, String rasse, boolean weiblich) {
        this.fellfarbe = fellfarbe;
        this.alter = alter;
        this.rasse = rasse;
        this.weiblich = weiblich;
    }

    public String getFellfarbe() {
        return fellfarbe;
    }
    // set: um etwas festzulegen oder zu ändern
    public void setFellfarbe(String fellfarbe) {
        this.fellfarbe = fellfarbe;
    }

    //get: hol etwas, man erwartet etwas zurück
    public int getAlter() {
        return alter;
    }

    public void setAlter(int alter) {
        this.alter = alter;
    }

    public String getRasse() {
        return rasse;
    }

    public void setRasse(String rasse) {
        this.rasse = rasse;
    }

    public boolean isWeiblich() {
        return weiblich;
    }

    public void setWeiblich(boolean weiblich) {
        this.weiblich = weiblich;
    }

    public void hüpfen(){
        System.out.println("boing boing");
    }

    public void veralten(){
        this.alter = alter + 1;
    }

    public void jahreSpäter(int jahre){
        this.alter = alter + jahre;
    }

    public static void main(String[] args) {
        Hase hase1 = new Hase("Grün", 27, "kanninchen", true);
        Hase hase2 = new Hase("Pink", 27, "kanninchen", false);

        System.out.println("hase 2 ist " + hase2.getAlter() + " jahre alt");
        hase2.jahreSpäter(4);
        System.out.println("hase 2 ist " + hase2.getAlter() + " jahre alt");

    }
}
