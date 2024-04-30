package homework_week3;

public class Prog4_NumberOfDays {
    //1st method
    public static boolean isLeapYear(int year) {
        if (year >= 1 && year <= 9999) {
            // A year is a leap year if it is divisible by 4 but not by 100,
            // or it is divisible by 400.
            return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
        } else {
            return false; // Year is out of valid range
        }
    }
    //2nd method
    public static int getDaysInMonth(int month, int year) {
        if (month < 1 || month > 12 || year < 1 || year > 9999) {
            return -1; // Invalid input
        }

        switch (month) {
            case 1: // January
            case 3: // March
            case 5: // May
            case 7: // July
            case 8: // August
            case 10: // October
            case 12: // December
                return 31;
            case 4: // April
            case 6: // June
            case 9: // September
            case 11: // November
                return 30;
            case 2: // February
                if (isLeapYear(year)) {
                    return 29; // Leap year (February has 29 days)
                } else {
                    return 28; // Non-leap year (February has 28 days)
                }
            default:
                return -1; // Invalid month

        }
    }
    public static void main(String[] args) {
        System.out.println(isLeapYear(-1600));
        System.out.println(isLeapYear(1600));
        System.out.println(isLeapYear(2017));
        System.out.println(isLeapYear(2000));

        System.out.println(getDaysInMonth(1, 2020));
        System.out.println(getDaysInMonth(2,2020));
        System.out.println(getDaysInMonth(2, 2018));
        System.out.println(getDaysInMonth(-1, 2020));
        System.out.println(getDaysInMonth(1, -2020));
    }

    public static class Prog3_G {
        public static void display(String s1, int rollNo, int marks, int sMarks, int eMarks) {
            int total = marks + sMarks + eMarks;
            double percent = total / 3;
            System.out.println("----------------------------");
            System.out.println("|                          |");
            System.out.println("        Mark Sheet          ");
            System.out.println("|--------------------------|");
            System.out.println("|        Name:     " + s1 + "      |");
            System.out.println("|       rollno: " + rollNo + "          |");
            System.out.println("|--------------------------|");
            System.out.println("|        subject: +  marks|   ");
            System.out.println("|--------------------------|");
            System.out.println("|        maths:  " + marks + "        |");
            System.out.println("|       science: " + sMarks + "        |");
            System.out.println("|       English: " + eMarks + "        |");
            System.out.println("|--------------------------|");
            System.out.println("|        Total:" + total + "         |");
            System.out.println("|--------------------------|");
            System.out.println("|     percent " + percent + "         |");
            if (percent >= 35) {
                System.out.println("|        Result           :Pass  |");
            } else {
                System.out.println("|        Result            :Fail  |");
            }
            if (percent >= 80) {
                System.out.println("A+");
            } else if (percent >= 60) {
                System.out.println("A");
            } else if (percent >= 50) {
                System.out.println("B");
            } else if (percent >= 35) {
                System.out.println("C");
            } else {
                System.out.println("invalid input");
            }
        }
    }
}







