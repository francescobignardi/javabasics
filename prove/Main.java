package javabasics.prove;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main (String [] args) {

       // fahrenheitToCelsius(30.0);
       // exerciseTwo();
       // exercise3();
       // biggerNumber(12, 20, 6);
       // averageNumber(12.8, 44.5, 990.45);

       // numeroVocali("Ciaone");
        // numeroParole("The lazy dog and the crazy fog");
        sommaCifre(349);


    }

    static void fahrenheitToCelsius(Double celsius){

        Double fahrenheit = ((celsius * 9) / 5) + 32;
        System.out.println(celsius + " celsius degrees are equal to " + fahrenheit + " fahrenheit degrees.");

    }

    private static void exerciseTwo(){

        List<String> names = Arrays.asList("Alan   ", "Alice   ", "Ant0nio  ", "  Aziz");

        for(String name : names){
            System.out.println(formatter(name));
        }

    }

    static String formatter(String x){
        if(x.contains("0")){
            x = "Invalid";
        } else {
            x.toUpperCase().trim();
        }
        return x;
    }

    private static void exercise3() {

        double myLunchPrice = 5.99;
        String lunchType = "sandwich";
        String description = "Nice big sandwich";
        int weightInGrams = 500;

        printer(myLunchPrice, lunchType, description, weightInGrams);
    }

    static void printer (Double x, String y, String z, Integer p){
        String printer = x + ", " + y + ", " + z + ", " + p + ", ";
        System.out.println(printer);
    }

    static void biggerNumber(Integer x, Integer y, Integer z){
        if(x > y && x > z){
            System.out.println("Il numero maggiore tra i tre inseriti è: " + x);
        } else if (y > x && y > z){
            System.out.println("Il numero maggiore tra i tre inseriti è: " + y);
        } else {
            System.out.println("Il numero maggiore tra i tre inseriti è: " + z);
        }
    }

    static void averageNumber(Double x, Double y, Double z){
        Double a = (x+y+z)/3;
        System.out.println(a);
    }


    public static String middleChar (String prova){

        List<String> pippo = new ArrayList<>();
        pippo.add(prova);


        int posizione = 0;

        if(pippo.size() % 2 == 0){
            posizione = (pippo.size()/2)-1;
        } else {
            posizione = pippo.size()/2;
        }

        return prova;

    }

    public static int numeroVocali (String parola1){

        int counter = 0;
        for (int i = 0; i < parola1.length(); i++) {
            char c = parola1.charAt(i);
            if(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u'){
                counter++;
            }
        }

        System.out.println(counter);
        return counter;

    }

    public static int numeroParole (String prova1){   // Metodo con ingresso String e uscita int

        int counter = 0;                              // Dichiaro contatore
        String [] parole = prova1.split(" ");   // Inserisco l'input splittato all'interno di una String
        List<String> parole1 = new ArrayList<>();     // Dichiaro un ArrayList che userò come contenitore

        for(String x : parole){                       // Con un ciclo for scorro la Stringa e ad ogni ciclo aggiungo
            parole1.add(x);                           // la parola all'Array
        }

        for (int i = 0; i < parole1.size(); i++) {    // Con un ciclo for i scorro l'Array e ad ogni ciclo aumento
            counter++;                                // il counter
        }

        System.out.println(counter);
        return counter;

    }

    public static int sommaCifre (Integer numero){

       int somma = 0;

       String numeroStringa = Integer.toString(numero);
       String [] cifre = numeroStringa.split(" ");

        System.out.println(Integer.parseInt(cifre[0]));

        return somma;
    }

}
