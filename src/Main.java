public class Main {
    public static void main(String[] args) {

        int ege = 21;
        if (ege >= 18) {
            System.out.println("совершенолетие");
        } else {
            System.out.println("он не достиг совершеннолетия, нужно немного подождать».");
        }
        System.out.println();

        int temp = 4;
        if (temp <= 5) {
            System.out.println("на улице холодно , нужно надеть шапку");
        } else {
            System.out.println("сегодня тепло , можно идти без шапки");
        }
        System.out.println();

        int speed = 50;
        if (speed > 60) {
            System.out.println("скорость превышена, если она больше 60 км/ч;");
        } else {
            System.out.println("превышения скорости нет, если она меньше 60 км/ч.");
        }
        System.out.println();

        int personAge = 15;
        if (personAge >= 2 && personAge <= 6) {
            System.out.println("ему нужно ходить в детский сад.");
        }
        if (personAge >= 7 && personAge <= 17) {
            System.out.println(" ему нужно ходить в школу");
        }
        if (personAge >= 18 && personAge <= 24) {
            System.out.println("его место в университете.");
        }
        if (personAge > 24) {
            System.out.println("нужно идти на работу");
        }
        System.out.println();

        int child = 4;
        if (child <= 5) {
            System.out.println("нельзя кататься");
        }
        if (child > 5 && child < 14) {
            System.out.println("можно,только с взрослым");
        }
        if (child > 14) {
            System.out.println("можна кататься самостоятельно");
        }
        System.out.println();

        int total = 102;
        int sead = 60;
        int place = 103;
        if (place > total) {
            System.out.println("мест нет");
        } else {
            if (place > sead) {
                System.out.println("стоим");
            } else {
                System.out.println("сидим");
            }
        }
        System.out.println();
        int one = 1;
        int two = 2;
        int three = 3;
        if (one > two && one > three) {
            System.out.println(one);
        } else {
            if (two > three) {
                System.out.println(two);
            } else {
                System.out.println(three);
            }
        }
    }
}













