package Quiz;

public class Sporgsmaal implements Translateable{
    private String svar1 = "svar";
    private int point1;
    private String svar2 = "svar";
    private int point2;
    private String svar3 = "svar";
    private int point3;
    private String svar4 = "svar";
    private int point4;
    private String sporgsmaalsTekst;
    private int rigtigeSvarIndex;

    public String getSvar1() {
        return svar1;
    }

    public void setSvar1(String svar1) {
        this.svar1 = svar1;
    }

    public int getPoint1() {
        return point1;
    }

    public void setPoint1(int point1) {
        this.point1 = point1;
    }

    public String getSporgsmaalsTekst() {
        return sporgsmaalsTekst;
    }

    public void setSporgsmaalsTekst(String sporgsmaalsTekst) {
        this.sporgsmaalsTekst = sporgsmaalsTekst;
    }

    public int getRigtigeSvarIndex() {
        return rigtigeSvarIndex;
    }

    public void setRigtigeSvarIndex(int rigtigeSvarIndex) {
        this.rigtigeSvarIndex = rigtigeSvarIndex;
    }

    public String getSvar2() {
        return svar2;
    }

    public void setSvar2(String svar2) {
        this.svar2 = svar2;
    }

    public int getPoint2() {
        return point2;
    }

    public void setPoint2(int point2) {
        this.point2 = point2;
    }

    public String getSvar3() {
        return svar3;
    }

    public void setSvar3(String svar3) {
        this.svar3 = svar3;
    }

    public int getPoint3() {
        return point3;
    }

    public void setPoint3(int point3) {
        this.point3 = point3;
    }

    public String getSvar4() {
        return svar4;
    }

    public void setSvar4(String svar4) {
        this.svar4 = svar4;
    }

    public int getPoint4() {
        return point4;
    }

    public void setPoint4(int point4) {
        this.point4 = point4;
    }

    @Override
    public String translate() {
        return "To be created";
    }
}
