package com.ferragnez.party;
/*
Consegna: creare un progetto java-festa-ferragnez con il package com.ferragnez.party,
a cui aggiungere la classe CheckGuest
Nel programma bisogna:
creare e inizializzare l’array contenente i nomi degli invitati
chiedere all’utente come si chiama
verificare che il nome sia presente nella lista (:esclamazione:ATTENZIONE: in Java per
confrontare due stringhe non posso usare ==, ma devo usare il metodo equals(): esempio qui)
lasciarlo entrare o rispedirlo cortesemente da dove è venuto .
 */
//Importiamo il nostro array

    import java.util.Arrays;
    import java.util.Scanner;

public class CheckGuest {
    public static void main(String[] args) {
        Scanner scanGuest = new Scanner(System.in);

        //Dichiariamo il nostro array guest
        String[] arrayGuest = {"Dua Lipa", "Paris Hilton", "Manuel Agnelli", "J-Ax", "Francesco Totti",
        "Ilary Blasi", "Bebe Vio", "Luis", "Pardis Zarei", "Martina Maccherone", "Rachel Zeilic"};

        //Chiediamo il nome al nostro utente

        System.out.println("Inserisca il suo nome: ");
        String userName = scanGuest.nextLine();

        //Usiamo un ciclo for per verificare se il nome è dentro il nostro array
        boolean stop = false;
        for (int i = 0; i < arrayGuest.length; i++) {
                if (userName.equals(arrayGuest[i])) {

                    stop=true;
                    System.out.println("Congratulazioni lei è invitato alla festa");
                } else {
                    System.out.println("Lei non è invitato");
                }
        }

        /*
        boolean stop = false;
        System.out.println("Inserisca il suo nome: ");
        String userName = scanGuest.nextLine();
        while (!stop){
            if (userName.equals(arrayGuest[])) {
                stop = true;
                System.out.println("Congratulazioni lei è invitato alla festa");
            } else {
                System.out.println("Lei non è invitato");
            }
        }
        */
        scanGuest.close();


    }
}