import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Calculate {
    public static void productArray (int number) {
        ArrayList <Product> productList = new ArrayList<>();
        Scanner scanner =new Scanner(System.in);
        double summ = 0;

        while (true) {
            String nameProduct = NameAndPrice.nameProduct();
            double priceProduct = NameAndPrice.priceProduct();
            Product product = new Product(nameProduct, priceProduct);
            productList.add(product);
            System.out.println("Вы добавили: " + product.name + " , стоимостью " + product.price);
//            double summ = 0;
            Iterator <Product> iteratorList = productList.iterator();
            System.out.println("Добавлено товаров: ");
            while (iteratorList.hasNext()){
                Product element = iteratorList.next();
                System.out.println(element.name);
                summ += element.price;
             }
            System.out.printf("Общей стоимостью: %.2f", summ);

            System.out.println("Хотите ли добавить ещё товар? Или стоит завершить?");
            System.out.println("Для добавления нажмите любую кнопку.");
            System.out.println("Для завершения введите \"Завершить\"");
            String endProgram = scanner.nextLine();
            if (endProgram.equalsIgnoreCase("Завершить")) {
                double payEach = summ / (double) number;
                System.out.printf("Каждый должен заплатить по: %.2f", payEach);
                 break;
            }
        }



    }
}
