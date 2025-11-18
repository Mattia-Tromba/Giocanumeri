import java.util.ArrayList;

public class Gamemanager {
    private int[] numerivincenti;
    private ArrayList<Giocatore> giocatori;

    public Gamemanager(){
        giocatori =  new ArrayList<Giocatore>();
        numerivincenti = new int[3];
        numerivincenti[0] = (int)(Math.random() * 100);
        numerivincenti[1] = (int)(Math.random() * 100);
        numerivincenti[2] = (int)(Math.random() * 100);
    }

    public String getNumeri(){ return "" + numerivincenti[0] + " " + numerivincenti[1] + " " + numerivincenti[2];}

    public void setGiocatore(Giocatore g){
        giocatori.add(g);
    }

    public ArrayList<Giocatore> getsizeGiocatori(){
        return giocatori;
    }

    public void controllovincita(){
        for (Giocatore giocatore : giocatori) {
            for (int j=0; j<numerivincenti.length; j++) {
                if(giocatore.getNumero(j) == numerivincenti[0] || giocatore.getNumero(j) == numerivincenti[1] || giocatore.getNumero(j) == numerivincenti[2]){
                    giocatore.setPunteggio(10);
                }
            }
        }
    }
}