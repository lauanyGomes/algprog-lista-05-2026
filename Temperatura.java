import java.util.Scanner;

public class Temperatura {

    public static void main(String[] args) {

        Scanner usuario = new Scanner(System.in);

        double temperatura;
        double soma = 0;
        int contador = 0;

        while (contador < 12) {

            System.out.println("Digite a temperatura da água:");
            temperatura = usuario.nextDouble();

            if (temperatura < 4 || temperatura > 10) {
                System.out.println("Temperatura inválida! Digite uma temperatura entre 4 e 10 ºC.");
            } else {
                soma = soma + temperatura;
                contador = contador + 1;
            }
        }

        double media = soma / 12;

        System.out.println("A média de hoje das temperaturas é: " + media + " ºC");

        usuario.close();
    }
}