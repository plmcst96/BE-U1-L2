package Es1;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        System.out.println(pariDispari("miriam"));
        System.out.println(annoBisestile(2028));
    }

    public  static String pariDispari(String str1) {
        if (str1.length() % 2 == 0) System.out.println("Il numero di caratteri è pari");
        else System.out.println("Il numero di caratteri è dispari");
        return str1;
    }

        public static boolean annoBisestile(int year) {
            if (year % 4 == 0) {
                if (year % 100 == 0) {
                    return year % 400 == 0;
                }
                return true;
            }

            return false;
        }
}