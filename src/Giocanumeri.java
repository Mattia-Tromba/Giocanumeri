import java.util.Scanner;

public class Giocanumeri {
    public static void main(String[] args){
        System.out.println("Inizio gioco");
        Gamemanager manager = new Gamemanager();
        Scanner sc = new Scanner(System.in);
        int scelta = 1;
        while(scelta != 0) {
            /* "pulizia" della console */
            if (scelta != 2){
                for (int i = 0; i < 50; i++) {
                    System.out.println();
                }
            }

            System.out.println("Menu:            1: inserisci giocatore             2: calcola punteggio             0: esci\n");
            scelta = sc.nextInt();

            switch (scelta) {
                case 1:
                    System.out.println("Inserisci il nome del giocatore\n");
                    Giocatore g = new Giocatore(sc.next());
                    manager.setGiocatore(g);
                    for (int i = 1; i < 4; i++) {
                        System.out.println("Inserisci il " + i + "° numero del giocatore\n");
                        g.addNumero(sc.nextInt());
                    }
                    break;
                case 2:
                    System.out.println("Calcolo del punteggio\n");
                    manager.controllovincita();
                    for (Giocatore giocatore : manager.getsizeGiocatori()) {
                        System.out.println("Il giocatore " + giocatore.getNome() + " ha totalizzato " + giocatore.getPunteggio() + " punti.\n");
                    }
                    break;
                case 0:
                    break;

            }
        }
    }
}