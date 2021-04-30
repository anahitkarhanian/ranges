import java.util.Scanner;

public class ranges {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        number = (number + 100) / 100;
        switch (number){
            case 1: {
                System.out.println("The number is in range of [0,100)");
                break;
            }
            case 2: {
                System.out.println("The number is in range of [100,199)");
                break;
            }
            case 3: {
                System.out.println("The number is in range of [200,299)");
                break;
            }
            default: {
                System.out.println("The number is in other range");
                break;
            }

        }
    }
}
