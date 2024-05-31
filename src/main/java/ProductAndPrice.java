import java.util.Scanner;

public class ProductAndPrice {
    public static String nameProduct() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("   Введите наименование товара\n" +
                "(минимум 2 символа): ");
        String nameProduct;
        while (true) {
            nameProduct = scanner.nextLine();
            if (nameProduct.isEmpty()) {
                System.out.println("Значение не может быть пустым. Введите ещё раз.");
            } else if (nameProduct.length() < 2) {
                System.out.println("Слишком короткое название (меньше 2 символов). Введите ещё раз.");
            } else {
                System.out.println("Наименование товара: " + nameProduct);
                break;
            }
        }
        return nameProduct;
    }
    public static double priceProduct(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите цену товара\n" +
                "  (формат рубли.копейки): ");
        double priceProduct;
        while (true) {
            if (scanner.hasNextDouble()){
                priceProduct = scanner.nextDouble();
                System.out.println("Цена: " + priceProduct);
                break;
            } else {
                System.out.println("Неверный формат ввода. Попробуйте заново.");
                scanner.next();
            }
        }
        return priceProduct;
    }
}
