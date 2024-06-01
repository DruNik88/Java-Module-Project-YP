public class Formatting {
    public static String endingRuble (double numb) {
        int number = (int) numb;
        if (number % 100 >= 11 && number % 100 <= 19 ) {
            return "рублей";
        }

        switch (number % 10) {
            case 1:
                return "рубль";
            case 2:
            case 3:
            case 4:
                return "рубля";
            default:
                return "рублей";
        }
    }
    public static String endingPeoples (int numb) {
        if (numb % 100 >= 5 && numb % 100 <= 19 ) {
            return "человек";
        }

        switch (numb % 10) {
            case 1:
            case 2:
            case 3:
            case 4:
                return "человека";
            default:
                return "человек";
        }
    }
}
