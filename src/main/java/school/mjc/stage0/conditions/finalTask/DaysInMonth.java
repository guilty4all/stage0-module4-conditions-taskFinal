package school.mjc.stage0.conditions.finalTask;

public class DaysInMonth {
    public void printDays(int year, int month) {
        boolean isLeapYear;

        if (year > 0 && month > 0 && month <= 12){
            if (year % 4 == 0) {
                if (year % 100 != 0){
                    isLeapYear = true;
                } else if (year % 100 == 0 && year % 400 == 0) {
                    isLeapYear = true;
                }else {
                    isLeapYear = false;
                }
            }else {
                isLeapYear = false;
            }

            switch (month){
                case (1):
                case (3):
                case (5):
                case (7):
                case (8):
                case (10):
                case (12):
                    System.out.println("31");
                    break;
                case (4):
                case (6):
                case (9):
                case (11):
                    System.out.println("30");
                    break;
                default:
                    System.out.println(isLeapYear ? 29:28);
            }
        }else {
            System.out.println("invalid date");
        }


    }
}
