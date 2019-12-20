import java.util.Arrays;
import java.util.Date;

public class Person {

    String navn; // Test Testesen
    int alder; // 18
    String by; // Næstved
    int postNummer; // 4700
    String vej; // Femøvej
    String husnummer; // 3B
    String nationalitet; // Dansk
    String fritidsinteresser; // Snitning, LOL, strikke
    String smarthomeDevices; // Xbox, 3 Smartlamper, Køleskab m.m.
    double hojde; // 1.56 m
    int vaegt;  // 76 kg
    double karaktergennemsnit; // 5.33
    int[] eksamensKarakterer; // 7, 12, -3, 4, 2, 10
    Date opdateretDato; // Sun Jan 08 00:00:00 CET 1978

    // TODO Vis eksempler på typecasting
    @Override
    public String toString() {
        return "Navn: " + navn + " Alder: " + alder + " By: " + by + " Postnummer: " + postNummer + " Vej: " +  vej +
                " Husnummer: " + husnummer + " Nationalitet: " + nationalitet + " Fritids interesser: " + fritidsinteresser +
                " Smart Home Devices: " + smarthomeDevices + " Højde: " + hojde + " m " + " Vægt: " + vaegt + " kg " + " Karaktergennemsnit: " + karaktergennemsnit +
                " EksamensKarakterer: " + Arrays.toString(eksamensKarakterer) + " Opdateret Dato: " + opdateretDato;
    }

    public static void main(String[] args) {

        Person person = new Person();
        person.navn = "Test Testesen";
        person.alder = 18;
        person.by = "Næstved";
        person.postNummer = 4700;
        person.vej = "Femøvej";
        person.husnummer = "3B";
        person.nationalitet = "Dansk";
        person.fritidsinteresser = "Snitning, LoL, Strikning";
        person.smarthomeDevices = "Xbox, 3 Smartlamper, køleskab m.m.";
        person.hojde = 1.56;
        person.vaegt = 76;
        person.karaktergennemsnit = 5.33;
        person.eksamensKarakterer = new int[] {7, 12, -3, 4, 2, 10}; // 7, 12, -3, 4, 2, 10
        person.opdateretDato = new Date(253062000000L);
        System.out.println(person.toString());
    }

}
