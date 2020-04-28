package bot;

import java.util.Scanner;

public class SimpleBot {

    public static void main(String[] args) {

        Bot bot = new Bot();

        bot.printGreetings();

        bot.introduceUser();

        bot.countToEnteredNumber();

        bot.testTheUser();
    }
}

class Bot {
    String name = "Alice";
    int birthYear = 2020;

    public void printGreetings() {
        System.out.println("Hello! My name is " + name + ".\nI was created in " + birthYear + ".");
    }

    public void introduceUser() {
        System.out.println("Please, remind me your name.");
        Scanner scan = new Scanner(System.in);
        String userName = scan.nextLine();
        System.out.println("What a great name you have, " + userName + "!\nLet me guess your age.\nEnter remainders of dividing your age by 3, 5 and 7.");
        int remainder3 = Integer.parseInt(scan.next());
        int remainder5 = Integer.parseInt(scan.next());
        int remainder7 = Integer.parseInt(scan.next());
        int age = (remainder3 * 70 + remainder5 * 21 + remainder7 * 15) % 105;
        System.out.println("Your age is " + age + "; that's a good time to start programming!");
    }

    public void countToEnteredNumber(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Now I will prove to you that I can count to any number you want.");
        int enteredNumber = scan.nextInt();
        if (enteredNumber >= 0) {
            for (int i = 0; i <= enteredNumber; i++) {
                System.out.println(i + "!");
            }
            System.out.println("Completed, have a nice day!");
        } else {
            System.out.println("Please, enter the number, that is bigger that 0");
        }
    }

    public void testTheUser() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Let's test your programming knowledge.\nWhy do we use methods?\n" +
                "1. To repeat a statement multiple times.\n" +
                "2. To decompose a program into several small subroutines.\n" +
                "3. To determine the execution time of a program.\n" +
                "4. To interrupt the execution of a program.\n");

        while (true) {
            int answer = scan.nextInt();
            if (answer == 2) {
                break;
            } else {
                System.out.println("Please, try again.");
            }
        }

        System.out.println("Congratulations, have a nice day!");
    }
}