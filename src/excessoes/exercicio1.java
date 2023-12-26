package excessoes;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class exercicio1 {
    public static void main(String[] args) {


    }

    public static void metodoDois(){
            Scanner sc = new Scanner(System.in);

            try {
                String[] vect = sc.nextLine().split(" ");
                int position = sc.nextInt();
                System.out.println(vect[position]);

            }
            catch (ArrayIndexOutOfBoundsException e){
                System.out.println("Invalid position!");
            }
            catch (InputMismatchException e){
                System.out.println("Input error!");
            }

            sc.close();
    }
}
