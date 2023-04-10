import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        try (Scanner entrada = new Scanner(System.in)) {
            
            System.out.println("Digite o valor em metros: ");
            float metros = entrada.nextFloat();
            float centimetros = metros * 100;

            System.out.printf("%.1f cm",centimetros);
        }

    }
}
