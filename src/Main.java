import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //VERIFICAÇÃO DE NÚMERO ÍMPAR.
        Scanner leitor = new Scanner(System.in);

        System.out.print("Digite um numero inteiro:");
        int n1 = leitor.nextInt();

        if (n1 %2 != 0){
            System.out.println(n1);
        }else{
            System.out.println("o número "+n1+" não é ímpar.");
        }
    }
}