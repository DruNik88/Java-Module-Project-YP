
public class Main {
    public static void main(String[] args) {
        instructionCount();
        int number = NumberOfPeoples.numberOfPeoples();
        if (number == 1) {
            System.out.println("Плати");
        } else {
            Calculate.productArray(number);
        }
    }

    public static void instructionCount() {
        System.out.println("Добро пожаловать в калькулятор \"По-братски.\"\n");
        System.out.println("""
                   Данный калькулятор предназначен для деления суммы мероприятия "без обмана"
                на равные части между друзьями/товарищами/людьми, участвовавщими в оплате.
                """);
        System.out.println("Вам будет предложено ввести количество друзей/товарищей/людей.\n");
        System.out.println("Вам будет предложено ввести наименование товара, а так же его стоимость.\n");
        System.out.println("После чего останется получить и озвучить результат.\n");
    }

}

