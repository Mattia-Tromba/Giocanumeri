import java.util.ArrayList;

public class Gamemanager {
    private int[] numerivincenti;
    private ArrayList<Giocatore> giocatori;

    public Gamemanager(){
        giocatori =  new ArrayList<Giocatore>();
        numerivincenti = new int[3];
        numerivincenti[0] = 7;
        numerivincenti[1] = 85;
        numerivincenti[2] = 44;
    }

    public void setGiocatore(Giocatore g){
        giocatori.add(g);
    }

    public ArrayList<Giocatore> getsizeGiocatori(){
        return giocatori;
    }

    public void controllovincita(){
        for (Giocatore giocatore : giocatori) {
            for (int j=0; j<numerivincenti.length; j++) {
                for (int y=0; y<numerivincenti.length; y++) {
                    if (giocatore.getNumero(y) == numerivincenti[j]) {
                        giocatore.setPunteggio(10);
                    }
                }
            }
        }
    }
}