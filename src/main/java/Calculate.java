import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Scanner;

public class Calculate {
    public static void productArray (int number) {
        ArrayList <Product> productList = new ArrayList<>();
        Scanner scanner =new Scanner(System.in);
        boolean circle = true;

        while (circle) {
            String nameProduct = ProductAndPrice.nameProduct();
            double priceProduct = ProductAndPrice.priceProduct();
            Product product = new Product(nameProduct, priceProduct);
            productList.add(product);
            System.out.println("Вы добавили: " + product.name + " , стоимостью " + product.price);
//        Iterator<Product> listIterator = productList.iterator();
            double summ = 0;
            for (Product productUnit : productList) {
                summ += productUnit.price;
                System.out.println("Добавлено: ");
                System.out.println(productUnit.name);
                System.out.println(String.format("Общей стоимостью: %.2f", summ));
            }
            System.out.println("Хотите ли добавить ещё товар? Или стоит завершить?");
            System.out.println("Для добавления нажмите любую кнопку.");
            System.out.println("Для завершения введите \"Завершить\"");
            String endProgram = scanner.nextLine();
            if (endProgram.equalsIgnoreCase("Завершить")) {
                System.out.println("!!!!!Ща чё нить выведу!!!!");
                break;
            }
        }



    }
}
