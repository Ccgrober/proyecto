package for1;

import java.util.Scanner;
//holaa XD

public class EjercicioAuxiliatura {
    public static void main(String[] args) {
        int n = new Scanner(System.in).nextInt();
        int num = 0;
        int d;
        for (int i = n ; i > 0 ; i= n) {
            d = n%10;
            n=n/10;
            num = (num *10)+d;
        }
        System.out.println(num);
    }
}
