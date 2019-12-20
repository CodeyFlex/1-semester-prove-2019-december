/**
 * Developed by András Ács (acsandras@gmail.com)
 * Zealand / www.zealand.dk
 * Licensed under the MIT License
 * 13/12/2019
 */

public class Main {

    public String hello(String navn) {
        if (navn != null)
                return "Hello " + navn;
        else
            navn = "World";
            return "Hello " + navn;
            }

    public static void main(String[] args) {
        Main l = new Main();
        System.out.println(l.hello("András!"));

    }
}
