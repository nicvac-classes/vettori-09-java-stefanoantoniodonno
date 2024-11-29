//LEGGERE LE ISTRUZIONI NEL FILE README.md

//Import di Classi Java necessarie al funzionamento del programma
import java.util.Scanner;

// Classe principale, con metodo main
class Esercizio {
    // Il programma parte con una chiamata a main().
    public static void main(String args[])
    {
        //Variabili del programma
        String nome;

        //Creo l'oggetto in per l'input da tastiera
        Scanner in = new Scanner(System.in);

        int n;

        System.out.print("Inserire il numero dei giri: ");
        n = in.nextInt();

        float[] hamilton = new float[n];
        float[] verstappen = new float[n];

        for(int i = 0; i < n; i++){
            System.out.print("Inserisci il tempo del " + (i+1)+ "° giro di Hamilton: ");
            hamilton[i] = in.nextFloat();
            System.out.print("Inserisci il tempo del " + (i+1)+ "° giro di Verstappen: ");
            verstappen[i] = in.nextFloat();
        }

        float tempoGaraH, tempoGaraV;

        tempoGaraH = 0;
        tempoGaraV = 0;

        for(int i = 0; i < n; i++){
            tempoGaraH += hamilton[i];
            tempoGaraV += verstappen[i];
        }

        String vincitore;

        if(tempoGaraH < tempoGaraV){
            vincitore = "Hamilton";
        }else{
            vincitore = "Verstappen";
        }

        System.out.println("Tempo Hamilton: " + tempoGaraH + "; tempo gara Verstappen: " + tempoGaraV);
        System.out.println("Vincitore della gara: " + vincitore);

        float tMinV , tMinH;

        tMinV = verstappen[0];
        tMinH = hamilton[0];

        for(int i = 0; i < n; i++){
            if(hamilton[i] < tMinH){
                tMinH = hamilton[i];
            }
            if(verstappen[i] < tMinV){
                tMinV = verstappen[i];
            }
        }

        if(tMinH < tMinV){
            vincitore = "Hamilton";
        }else{
            vincitore = "Verstappen";
        }

        System.out.println("Giro veloce Hamilton: " + tMinH + ", giro veloce Verstappen: " + tMinV);
        System.out.println("Il giro più veloce è di: " + vincitore);
    }
}

//LEGGERE LE ISTRUZIONI NEL FILE README.md