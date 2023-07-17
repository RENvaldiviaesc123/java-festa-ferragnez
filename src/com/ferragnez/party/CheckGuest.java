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


    import java.util.Scanner;

public class CheckGuest {
    public static void main(String[] args) {
        Scanner scanGuest = new Scanner(System.in);
        // METODO 1 con ciclo for
        //Dichiariamo il nostro array guest
        String[] arrayGuest = {"Dua Lipa", "Paris Hilton", "Manuel Agnelli", "J-Ax", "Francesco Totti",
        "Ilary Blasi", "Bebe Vio", "Luis", "Pardis Zarei", "Martina Maccherone", "Rachel Zeilic"};

        //Chiediamo il nome al nostro utente

        System.out.println("Inserisca il suo nome: ");
        String userName = scanGuest.nextLine();


        //Usiamo un ciclo for per verificare se il nome è dentro il nostro array
        boolean found = false;
        for (int i = 0; i < arrayGuest.length; i++) {
            //AD OGNI ITERZIONE DEL CICLO CONFRONTO IL USERNAME CON L'ARRAY
                if(arrayGuest[i].equalsIgnoreCase(userName)){ //questo equalsignorecase tiene conto delle parole senza l'uso delle maiuscole
                    found=true;
                }//Non mettiamo un else perche abbiamo inizializzato il nostro boolean con false ovvero col fatto che è falso
        }
        //Testiamo la varibile booleana
        if(found) {
            System.out.println("Welcome!");
        } else {
            System.out.println("Sorry, you're not in the list");
        }



        /*
        //METODO 2 con variabile booleana

        String[] arrayGuest = {"Dua Lipa", "Paris Hilton", "Manuel Agnelli", "J-Ax", "Francesco Totti",
                "Ilary Blasi", "Bebe Vio", "Luis", "Pardis Zarei", "Martina Maccherone", "Rachel Zeilic"};

        //dichiariamo variabile booleana
        boolean stop = false;
        System.out.println("Inserisca il suo nome: ");
        String userName = scanGuest.nextLine();
        int i=0;
        //Usiamo il nostro ciclo while
        while (i<arrayGuest.length) {
            userName.equals(arrayGuest);
            stop=true;
        }
        /*
        //Ciclo FOR
        for (int i = 0; i < arrayGuest.length; i++) {
            userName.equals(arrayGuest[i]);
            stop = true;
        }*/



        //Chiudiamo il nostro scanner
        scanGuest.close();
    }
    }
