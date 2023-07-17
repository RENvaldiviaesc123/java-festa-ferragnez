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

        /*
        //Usiamo un ciclo for per verificare se il nome è dentro il nostro array
        boolean found = false;
        for (int i = 0; i < arrayGuest.length; i++) {
            //AD OGNI ITERZIONE DEL CICLO CONFRONTO IL USERNAME CON L'ARRAY
                if(arrayGuest[i].equalsIgnoreCase(userName)){ //questo equalsignorecase tiene conto delle parole senza l'uso delle maiuscole
                    found=true;
                    break; //per fermare  il processo quando abbiamo trovato ciò che cercavamo
                }//Non mettiamo un else perche abbiamo inizializzato il nostro boolean con false ovvero col fatto che è falso
        }
        //Testiamo la varibile booleana
        if(found) {
            System.out.println("Welcome!");
        } else {
            System.out.println("Sorry, you're not in the list");
        }*/
        /*
        //Altro modo per risolvere più elegante
        boolean found = false;
        for (int i = 0; i < arrayGuest.length && !found; i++) { //cerco finchè trovo
            //AD OGNI ITERZIONE DEL CICLO CONFRONTO IL USERNAME CON L'ARRAY
            if(arrayGuest[i].equalsIgnoreCase(userName)){ //questo equalsignorecase tiene conto delle parole senza l'uso delle maiuscole
                found=true;
                //break; così non è più necessario usare il break
            }//Non mettiamo un else perche abbiamo inizializzato il nostro boolean con false ovvero col fatto che è falso
        }
        //Testiamo la varibile booleana
        if(found) {
            System.out.println("Welcome!");
        } else {
            System.out.println("Sorry, you're not in the list");
        }*/




        //METODO 2 con ciclo while

        //dichiariamo variabile booleana
        boolean found= false;


        int counter = 0; //questo fa un po quello che fa i nel ciclo for
        //Usiamo il nostro ciclo while
        while (!found && counter < arrayGuest.length) {//iteriamo finchè found è true e per tutta la lunghezza di arrayguest
            if (arrayGuest[counter].equalsIgnoreCase(userName)) {
            //ti ho trovato
            found = true;}
            counter++; //ad ogni iterazione aumento il contatore
        }
        if(found) {
            System.out.println("Welcome!");
        } else {
            System.out.println("Sorry, you're not in the list");
        }

        //Chiudiamo il nostro scanner
        scanGuest.close();
    }
    }
