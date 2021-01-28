package labs_examples.enumerations.labs;

/**
 * Enumerations Exercise 1:
 *
 *      1) Create an enumeration. Use a controller class to demonstrate the use of the enum from a seperate class.
 *      2) Create a parameterized enumeration that passes one or more values to it's constructor. Demonstrate the use
 *      of this enum from a seperate class.
 */

enum Season {
    AUTUMN, WINTER, SPRING, SUMMER
}

enum MonthOfYear {
    APRIL(30), AUGUST(31), DECEMBER(31), FEBRUARY(28),
    JANUARY(31), JULY(31), JUNE(30), MARCH(31),
    MAY(31), NOVEMBER(30), OCTOBER(31), SEPTEMBER(30);

    MonthOfYear(int daysInMonth) {
        this.daysInMonth = daysInMonth;
    }

    private final int daysInMonth;

    public int getDaysInMonth() {
        return daysInMonth;
    }
}

public class Exercise_01 {
    public static void main(String[] args) {
        for (Season mySeason : Season.values()) {
            switch (mySeason) {
                case AUTUMN:
                    System.out.println("In " + mySeason.toString().toLowerCase() + " the weather " +
                            "turns colder and often rains. The leaves start to change colour " +
                            "and fall off the trees.");
                    break;
                case WINTER:
                    System.out.println("In " + mySeason.toString().toLowerCase() + " the weather " +
                            "is cold and we sometimes get snow and frost." +
                            " The trees have no leaves.");
                    break;
                case SPRING:
                    System.out.println("In " + mySeason.toString().toLowerCase() + " the weather " +
                            "usually turns warmer, trees begin to grow their leaves, plants start to " +
                            "flower and young animals such as chicks and lambs are born.");
                    break;
                case SUMMER:
                    System.out.println("In " + mySeason.toString().toLowerCase() + " the weather " +
                            "is usually hot and trees have full green leaves.");
                    break;
            }
        }

        MonthOfYear aMonth = MonthOfYear.APRIL;
        System.out.println(aMonth + " has " + aMonth.getDaysInMonth() + " days.");

        for (MonthOfYear month : MonthOfYear.values()) {
            System.out.println(month + " has " + month.getDaysInMonth() + "days.");
        }
    }
}













