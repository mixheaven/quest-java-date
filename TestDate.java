import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Date;
import java.util.Scanner;

class TestDate {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Please fill a day (1-31) : " + c.get(Calendar.DAY_OF_MONTH));
        int day = sc.nextInt();
        System.out.println("Please fill a month (1-12) : " + c.get(Calendar.MONTH));
        int month = sc.nextInt();
        System.out.println("Please fill a year : " + c.get(Calendar.YEAR));
        int year = sc.nextInt();
        sc.close();

        // TODO : your code after this line
        Date current = new date();
        SimpleDateFormat format = new SimpleDateFormat('dd, MMM, yyyy');
        try{

        }

        Calendar c = Calendar.getInstance();
        int year = c.get(Calendar.YEAR);
        int month = c.get(Calendar.MONTH);
        int dayOfMonth = c.get(Calendar.DAY_OF_MONTH);
        int dayOfWeek = c.get(Calendar.DAY_OF_WEEK);

    }
}