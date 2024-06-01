import java.util.Scanner;

public class NumberOfPeoples {
    public static int numberOfPeoples() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите количество друзей/товарищей/людей\n" +
                "  (число должно быть больше 0): ");
        int numberOfFriends;
        while (true) {
            if (scanner.hasNextInt()) {
                numberOfFriends = scanner.nextInt();
                if (numberOfFriends == 1) {
                    System.out.println("Вы платите за всё один, делить счёт смысла нет.");
                    break;
                } else if (numberOfFriends > 1) {
                    System.out.printf("Счёт будет поделен на: %d %s%n", numberOfFriends, Formatting.endingPeoples(numberOfFriends));
                    break;
                } else {
                    System.out.println("Введено некорректное значение. Попробуйте ещё раз.");
                }
            } else {
                System.out.println("Введите число.");
                scanner.next();
            }
        }
//        scanner.close();
        return numberOfFriends;
    }
}
