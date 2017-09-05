package se.chartnil;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Scanner;       //importerat scanner från java biblotek

public class Main {     //klassen som syns.

    public static void main(String[] args) {        //direktöversatt: publik statisk noll huvudsaklig ????

        System.out.println("Välkommen till detta underbara tärningsspel!\n\nSpelets regler är:\n" +     //Random pladder
        "Du ska vinna\nDet vill säga, inte förlora!\n\n\nTryck på enter för att starta spelet! =)");

        System.out.println("Fyll i ditt namn här:");        //pladder, funktion för att fylla i namn är längre ner


        Scanner sc = new Scanner(System.in);        //scanner för att läsa av hittils oklart
        String name = sc.nextLine();            //namnet du fyller i kommer att skrivas på nästa rad
        startGame(name);        //ditt namn fylls i
    }

    public static void startGame(String name){      //spelet startar på nästa rad (string name)
        int player1Point = 0;//ny kommentar hej gysen
        int player2Point = 0;
        int dice = 0; //initiera till 0

        int x; //Primitiv heltalstyp
        Integer y; //Boxed int

        // 1 > 0 evalueras till true
        // (1 > 0) && (3 < 4) evaluers till true



        while (player1Point < 100 && player2Point < 100 ){      //medans player1 och 2 har ett resultat som är mindre än 100 ska denna loop fortgå
            Scanner sc = new Scanner(System.in); //Instansierar en Scanner
            String e = sc.nextLine();
            dice = (int)(6.0*Math.random()) +1;      //tilldelar tärningen, får ett slumpmässigt värde mellan 1-6
            player1Point=player1Point+dice;     //player1 slår tärningen kan även skrivas player1point+=dice
            System.out.println("Du fick en "+dice+"a");     //tärningsresultatet skrivs ut
            System.out.println("Du har "+player1Point+" poäng!");       //samanlagda resultatet av alla kast skrivs ut

            Scanner s = new Scanner(System.in);
            String i = s.nextLine();
            dice =(int)(6.0*Math.random()) +1;
            player2Point+=dice;
            System.out.println("Mr.PC fick en "+dice+"a");
            System.out.println("Mr.PC har "+player2Point+" poäng!");

        }
        if (player1Point >= 100){
            System.out.println("\n\nGrattis " + name +", du vann!");    //om spelare1 får 100 el. mer skrivs detta ut

        }

        else{
            System.out.println("\n\nGrattis Mr.PC, du vann!");  //Når Mr.PC 100 el. mer innan player1 skrivs denna rad ut
        }
    }

}
