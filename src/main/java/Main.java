
public class Main {
    public static void main(String[] args) {
        instructionCount();
        int number = NumberOfPeoples.numberOfPeoples();
        if (number == 1) {
            System.out.println("Плати");
        } else {
            ProductAndPrice.nameProduct();
        }


    }

    public static void instructionCount() {
        System.out.println("Добро пожаловать в калькулятор \"По-братски\"");
        System.out.println("Данный калькулятор предназначен для деления суммы мероприятия \"без обмана\"\n" +
                "  на равные части между друзьями/товарищами/людьми участвовавщих в оплате.");
        System.out.println("Вам будет предложено ввести количество друзей/товарищей/людей.");
        System.out.println("Вам будет предложено ввести наименование товара, а так же его стоимость.");
        System.out.println("После чего останется получить результат.");
    }

}

