import java.util.Scanner;

class input {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int input = sc.nextInt();
            System.out.println("You entered a number: " + input);
        }
    }
}