package Es3;

import java.util.Scanner;

public class Main3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean what = false;

        while (!what){
            String str;
            System.out.println("Inserisci una stringa, per uscire dal ciclo usare ':q'");
            str = input.nextLine();
            if (str.equals(":q")){
                System.out.println("Sei uscito!");
                what = true;
        } else {
                str = str.replaceAll(" ", "");
                str = str.replaceAll("", ",");
                str = str.substring(1, str.length()-1);
                System.out.println(str);
            }
        }
        input.close();
    }
}
