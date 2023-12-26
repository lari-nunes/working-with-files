import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int n;

        System.out.println("Quantos números você vai digitar?");
        n = sc.nextInt();

        int[] vect = new int[n];

        for(int x=0; x<n;x++){
            System.out.println("Digite um número: ");
            vect[x] = sc.nextInt();
        }
        System.out.println("----Números Negativos-----");

        for(int x=0; x<n;x++){
            if(vect[x] < 0) {
                System.out.printf("%d\n", vect[x]);
            }
        }

        sc.close();
    }
}