public class Playstation {
    public String modelo;
    public String cor;
    public int armazenamento;
    public boolean ligado = false;
    public int volume = 5;

    public Playstation() {
        modelo = null;
        cor = null;
        armazenamento = 0;
    }

    public Playstation(String modelo, String cor) {
        this.modelo = modelo;
        this.cor = cor;
        this.armazenamento = 0;
    }

    public Playstation(String modelo, String cor, int armazenamento) {
        this.modelo = modelo;
        this.cor = cor;
        this.armazenamento = armazenamento;
    }

    public void ligar() {
        ligado = true;
        System.out.println("Bem-vindo ao PlayStation!");
    }

    public void desligar() {
        ligado = false;
        System.out.println("Até logo, jogador!");
    }

    public void aumentarVolume() {
        if(ligado) {
            volume++;
            System.out.println("Volume: " + volume);
        }
    }

    public void diminuirVolume() {
        if(ligado) {
            volume--;
            System.out.println("Volume: " + volume);
        }
    }

    public void jogar() {
        if(ligado) {
            System.out.println("Iniciando o jogo...");
        } else {
            System.out.println("O PlayStation está desligado. Ligue-o primeiro.");
        }
    }
}
