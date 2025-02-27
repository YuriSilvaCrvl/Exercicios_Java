import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Verificar se o número é menor que 5 ou maior que 10
        Scanner leitor = new Scanner(System.in);

        System.out.print("Digite algo:");
        float a = leitor.nextFloat();

        if(a < 5 || a > 10){
            System.out.println("O número "+a+" se encaixa nas especificações de ser menor que 5 ou maior que 10");
        }else{
            System.out.println(a+"  <-- este número não é menor que 5 e nem maior que 10.");
        }
    }
}