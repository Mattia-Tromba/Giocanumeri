public class Giocatore extends Thread{
    //attributi
    private String nome;
    private int punteggio;
    private int[] numeriInseriti;
    private int contnumeri;
    //metodi
    public Giocatore(String nome){
        this.nome = nome;
        punteggio = 0;
        numeriInseriti = new int[3];
        contnumeri = 0;
    }

    public String getNome(){
        return nome;
    }

    public void addNumero(int n){
            this.numeriInseriti[contnumeri] = n;
            contnumeri +=1;
    }

    public int getNumero(int n){
        return numeriInseriti[n];
    }

    public void setPunteggio(int n){
        this.punteggio += n;
    }

    public int getPunteggio() {
        return this.punteggio;
    }

    public void comunica(){
        System.out.println("Sono il giocatore " + nome + " e ho iniziato il gioco");
        System.out.println(this);
    }

    @Override
    public void run(){
        comunica();
        try {
            sleep(5000);
        } catch (InterruptedException e){
            System.err.println("errore nella fase di sleeping");
        }
    }
}