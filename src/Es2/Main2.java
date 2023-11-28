package Es2;

import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n;
        System.out.println("Scrivi un numero da 0 a 3");
        n = Integer.parseInt(input.nextLine());
        switch (n){
            case 0:{
                System.out.println("zero");
                break;
            }
            case 1:{
                System.out.println("uno");
                break;
            }
            case 2:{
                System.out.println("due");
                break;
            }
            case 3:{
                System.out.println("tre");
                break;
            }
            default:
                System.out.println("Sbagliato riprova ;)");
        }
        input.close();
    }
}
