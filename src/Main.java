import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Verificar se o número está entre 5 e 20.
        Scanner leitor = new Scanner(System.in);

        System.out.print("Digite algo:");
        int a = leitor.nextInt();

        if(a >= 5 && a <=20){
            System.out.println("O número "+a+" se encaixa nas especificações de estar entre 5 e 20.");
        }else{
            System.out.println(a+"  <-- este número não está entre 5 e 20.");
        }
    }
}