package at.ac.fhcampuswien;

import java.util.Scanner;

public class App {

    //todo Task 1
    public void largestNumber(){
        // input your solution here
        Scanner sc = new Scanner(System.in);
        double number;
        double max = Double.MIN_VALUE;
        int i = 1;
        while (true) {
            System.out.print("Number " + i + ": ");
            number = sc.nextDouble();

            if (number <= 0) break;

            if (number > max) max = number;

            i++;
        }

        System.out.println(i != 1 ? "The largest number is " + String.format("%.2f", max) : "No number entered.");

    }

    //todo Task 2
    public void stairs(){
        // input your solution here
        Scanner sc = new Scanner(System.in);
        System.out.print("n: ");
        int lines = sc.nextInt();

        if (lines > 0) {
            int stairNr = 1;
            StringBuilder stair = new StringBuilder();
            for (int i = 0; i <= lines; i++) {
                for (int j = 0; j < i; j++) {
                    stair.append(stairNr).append(" ");
                    stairNr++;
                }
                if (i != 0) stair.append(System.lineSeparator());
            }
            System.out.print(stair);
        } else System.out.println("Invalid number!");

    }

    //todo Task 3
    public void printPyramid(){
        // input your solution here
        final int PYRAMID_LENGTH = 6;
        System.out.println(generatePyramid(PYRAMID_LENGTH));
    }

    public String generatePyramid(int pyramidLength) {
        StringBuilder sb = new StringBuilder();
        int PYRAMID_MAX_WIDTH = (pyramidLength * 2) + 1;
        for (int i = 0; i < pyramidLength; i++) {
            sb.append(" ".repeat(((PYRAMID_MAX_WIDTH - (i * 2 + 1)) / 2) - 1)).append("*".repeat(i * 2 + 1));
            if (i != pyramidLength - 1) sb.append(System.lineSeparator());
        }
        return sb.toString();
    }

    //todo Task 4
    public void printRhombus(){
        // input your solution here
        Scanner sc = new Scanner(System.in);
        System.out.print("h: ");
        int height = sc.nextInt();
        System.out.print("c: ");
        char midChar = sc.next().charAt(0);

        if (height % 2 == 0) {
            System.out.println("Invalid number!");
            return;
        }

        StringBuilder output = new StringBuilder();
        String spaces = " ".repeat((height / 2) - 1);
        String singleCharLine = spaces + " " + midChar;


        StringBuilder output2 = new StringBuilder();
        System.out.println(singleCharLine);
        for (int i = 1; i <= height / 2; i++) {
            char charPre = (char) (midChar - i);
            output.insert(0, charPre);
            if (i == 1)
                output.append(midChar);
            output.append(charPre);
            System.out.println(spaces + output);

            if (i != height / 2) {
                output2.insert(0, spaces + output + System.lineSeparator());
                spaces = spaces.substring(1);
            }
        }
        System.out.println(" " + output2.toString().trim());
        System.out.println(singleCharLine);

    }

    //todo Task 5
    public void marks(){
        // input your solution here
    }

    //todo Task 6
    public void happyNumbers(){
        // input your solution here
    }

    public static void main(String[] args){
        App exercise2 = new App();

        System.out.println("Task 1: Largest Number");
        exercise2.largestNumber();

        System.out.println("\nTask 2: Stairs");
        exercise2.stairs();

        System.out.println("\nTask 3: Pyramide");
        exercise2.printPyramid();

        System.out.println("\nTask 4: Raute");
        exercise2.printRhombus();

        System.out.println("\nTask 5: Notendurchschnitt");
        exercise2.marks();

        System.out.println("\nTask 6: Fröhliche Zahlen");
        exercise2.happyNumbers();
    }
}