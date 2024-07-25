public class Uczen {
    private String imieNazwisko;
    private String przedmiot;
    private int ocena;

    public Uczen(String imieNazwisko, String przedmiot, int ocena) {
        this.imieNazwisko = imieNazwisko;
        this.przedmiot = przedmiot;
        this.ocena = ocena;
    }

    public String getImieNazwisko() {
        return imieNazwisko;
    }

    public void setImieNazwisko(String imieNazwisko) {
        this.imieNazwisko = imieNazwisko;
    }

    public String getPrzedmiot() {
        return przedmiot;
    }

    public void setPrzedmiot(String przedmiot) {
        this.przedmiot = przedmiot;
    }

    public int getOcena() {
        return ocena;
    }

    public void setOcena(int ocena) {
        this.ocena = ocena;
    }

    public void wypisz(){
        System.out.println(imieNazwisko + przedmiot + ocena);
    }
}
