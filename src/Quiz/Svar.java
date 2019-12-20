package Quiz;

public class Svar implements Translateable{
    private String svarTekst;

    String SvarMetode(String svar) {
        return svar;
    }
    public String getSvarTekst() {
        return svarTekst;
    }

    public void setSvarTekst(String svarTekst) {
        this.svarTekst = svarTekst;
    }

    @Override
    public String translate() {
        return "To be created";
    }
}
