public class Formatting {
    public static String endingRuble (double numb) {
        int number = (int) numb;
        if (number % 100 >= 11 && number % 100 <= 19 ) {
            return "рублей";
        }

        return switch (number % 10) {
            case 1 -> "рубль";
            case 2, 3, 4 -> "рубля";
            default -> "рублей";
        };
    }
    public static String endingPeoples (int numb) {
        if (numb % 100 >= 5 && numb % 100 <= 19 ) {
            return "человек";
        }

        return switch (numb % 10) {
            case 1, 2, 3, 4 -> "человека";
            default -> "человек";
        };
    }
}
