import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Date;
import java.util.Scanner;

class TestDate {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Please fill a day (1-31) : ");
        int day = sc.nextInt();
        System.out.println("Please fill a month (1-12) : ");
        int month = sc.nextInt();
        System.out.println("Please fill a year : ");
        int year = sc.nextInt();
        sc.close();

        // TODO : your code after this line
        String stringDate = String.valueOf(month) + "-" + String.valueOf(day) + "-" + String.valueOf(year);
        SimpleDateFormat simpleFormat = new SimpleDateFormat("dd-MM-yyyy");
        Date date = null;
        try {
            date = simpleFormat.parse(stringDate);
        } catch (ParseException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        Calendar calendar = new GregorianCalendar(day, month - 1, year);

        if (date != null) {
            System.out.println("The date is : " + simpleFormat.format(date));
            System.out.println("The day of week is :" + calendar.get(Calendar.DAY_OF_WEEK));
        }
        System.out.println("Fin !!");

    }

}
