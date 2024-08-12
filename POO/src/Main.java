
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o modelo do PlayStation: ");
        String modelo = sc.nextLine();

        System.out.println("Digite a cor do PlayStation: ");
        String cor = sc.nextLine();

        System.out.println("Digite o armazenamento (em GB): ");
        int armazenamento = sc.nextInt();

        Playstation ps1 = new Playstation(modelo, cor, armazenamento);
        ps1.ligar();
        ps1.jogar();
        ps1.aumentarVolume();
        ps1.desligar();
        System.out.println("Playstation " + ps1.modelo + " COR: " + ps1.cor + " COM " + ps1.armazenamento + "GB de ARMAZENAMENTO.");

        Playstation ps2 = new Playstation("PlayStation 5", "Branco");
        System.out.println(" ");
        System.out.println(ps2.modelo + " " + ps2.cor);
        ps2.ligar();
        ps2.diminuirVolume();
        ps2.diminuirVolume();
        ps2.diminuirVolume();
        ps2.diminuirVolume();
        ps2.desligar();
    }
}
