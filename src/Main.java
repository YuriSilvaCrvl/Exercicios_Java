import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.print("Digite a sua idade:");
        int idade = leitor.nextInt();

        if (idade >= 18) {
            System.out.printf("já pode ser preso, cidadão. Você possui %d anos!%n", idade);
        } else {
            int diferenca = (18 - idade);
            System.out.printf("Faltam %d anos para você poder ser preso.", idade);
        }
    }
}