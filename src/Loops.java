import java.util.Scanner;

public class Loops {

    private String brugere[] = {"Anders", "Birgit", "Carsten", "Dennis", "Esben"};

    public String[] getBrugere() {
        return brugere;
    }

    public static void main(String[] args) {
        Loops l = new Loops();
        l.printBrugereArr();
        System.out.println("*******");
        l.printBrugereReverseArr();
        System.out.println("*******");
        l.waitingFor0();
    }

    public void printBrugereArr() {
        for (int personList = 0; personList < brugere.length; personList++) {
            System.out.println(brugere[personList]);
        }
    }

    public void printBrugereReverseArr() {
        for (int personList = brugere.length - 1; personList >= 0; personList--) {
            System.out.println(brugere[personList]);
        }
    }

    public void waitingFor0() {
        int i;
        Scanner intScanner = new Scanner(System.in);
        System.out.println("Waiting for the number 0! Write a number... ");
        i = intScanner.nextInt();

        while (i != 0)
        {
            if (i >= 0)
                System.out.println("Waiting for the number 0! Write a number... " + i);
            i = intScanner.nextInt();
            if (i == 0) ;
            System.out.println("You typed 0. It's over!");
        }
    }
}