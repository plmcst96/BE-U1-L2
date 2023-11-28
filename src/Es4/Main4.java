package Es4;

import java.util.Scanner;

public class Main4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n;
        System.out.println("Scrivi un numero per creare il tuo countdown");
        n = Integer.parseInt(input.nextLine());

        for (int i = n; i >= 0; i-- ){
            System.out.println(i);
        }
        input.close();
    }
}
