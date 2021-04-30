import java.util.Scanner;

public class ranges {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        number = (number + 45) / 45;
        switch (number){
            case 1: {
                System.out.println("The number is in range of [0,45)");
                break;
            }
            case 2: {
                System.out.println("The number is in range of [45,90)");
                break;
            }
            case 3: {
                System.out.println("The number is in range of [90,135)");
                break;
            }
            default: {
                System.out.println("The number is in other range");
                break;
            }

        }
    }
}
