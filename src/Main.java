import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //VERIFICAR SE A PALAVRA TEM MAIS DE 5 LETRAS OU NÃO.
        Scanner leitor = new Scanner(System.in);

        System.out.print("Digite algo:");
        String a = leitor.nextLine();

        if(a.length() >=5){
            System.out.println("A palavra "+a+" contém "+a.length()+ " letras");
        }else{
            System.out.println("A palavra "+a+" possui menos de 5 letras.");
        }
    }
}