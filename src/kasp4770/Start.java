package kasp4770;

import java.util.Scanner;

public class Start {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Type number.\nIf the number is a multiple of 5 = HiFive!\nIf the number is divisible of 2 = HiEven!");
        System.out.print("\nType your number here: ");

        int number = input.nextInt();

        if(number % 5 == 0 )
            System.out.print("HiFive!");

        if(number % 2 ==0)
            System.out.print("HiEven!");
        else
            System.out.print("HiNothing!");
    }
}