package Practice.help;


public class SwitchDay {
    public static void main(String[] args) {
        int day = 9;
        String num;

        switch (day) {
            case 1:
                num = "January";
                break;

            case 2:
                num = "February";
                break;

            case 3:
                num = "March";
                break;

            case 4:
                num = "April";
                break;

            case 5:
                num = "May";
                break;

            case 6:
                num = "June";
                break;

            case 7:
                num = "July";
                break;

            case 8:
                num = "August";
                break;

            case 9:
                num = "September";
                break;

            case 10:
                num = "October";
                break;

            case 11:
                num = "Novmeber";
                break;

            case 12:
                num = "December";
                break;


            default:
                num = "Please provide number in range`";

        }

        System.out.println(num);

    }
}
