package homeWork8;

import java.util.Scanner;

public class Zero {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your number: ");
        int num = scanner.nextInt();

        if(num > 0) {
            System.out.println("Number greater than zero.");
        } else if(num == 0){
            System.out.println("Number equal to zero.");
        }  else {
            System.out.println("Number less than zero.");
        }
    }
}
