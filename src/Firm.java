public class Firm {
    private String nameFirma;

    public String getNameFirma() {
        return nameFirma;
    }

    public void setNameFirma(String nameFirma) {
        this.nameFirma = nameFirma;

    }
    public Firm() {
    }

    public Firm(String nameFirma) {
        this.nameFirma = nameFirma;
    }
    public void Vivod (){

        System.out.println("Nazvanoye " + nameFirma);
    }
}

