import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.print("Digite um numero inteiro:");
        int n1 = leitor.nextInt();

        System.out.print("Digite outro numero inteiro:");
        int n2 = leitor.nextInt();
        int soma = n1+n2;

        if(soma > 10){
            System.out.println(soma+" foi a soma dos números e foi maior que 10" );
        }
    }
}