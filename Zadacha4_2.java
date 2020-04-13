package lesson4;

import java.net.SocketOption;
import java.util.Scanner;

/**
 * Написать программу, вычисляющую и отображающую все числа
 * Фибоначчи меньше введённого пользователем целого числа.
 */
public class Zadacha4_2 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input int value: ");
        int number = scanner.nextInt();

        int n0 = 1;
        int n1 = 1;
        int n2 = n0 +n1;
        System.out.print(n0+" "+n1+" ");
        while (n2<number){
            n2=n0+n1;
            System.out.print(n2+" ");
            n0=n1;
            n1=n2;
        }

    }

}

