import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int hora;

        System.out.println("Que horas são?");
        hora = scanner.nextInt();

        if(hora >= 0 && hora < 12){
            System.out.println("Bom dia");
        } else if(hora >= 12 && hora <= 15){
            System.out.println("Boa tarde");
        } else if(hora >= 18 && hora <= 23){
            System.out.println("Boa noite");
        }
    }
}