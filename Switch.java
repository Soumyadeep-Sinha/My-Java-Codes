package deep;

import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String fruit = in.next();
        switch (fruit) {
            case "Mango" -> System.out.println("king of fruits");
            case "Apple" -> System.out.println("A sweet red fruit");
            case "Orange" -> System.out.println("A round fruit");
            case "Grapes" -> System.out.println("A small fruit");
            default -> System.out.println("Please enter a valid fruit");
        }
    }
}
