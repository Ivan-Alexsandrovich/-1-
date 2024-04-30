public class Main {
    public static void main(String[] args) {

        int ege = 19;
        if (ege >= 18) {
            System.out.println("совершенолетие");
        } else {
            System.out.println("то недостиг совершенолетия");
        }
        System.out.println();

        int temp = 6;
        if (temp <= 5) {
            System.out.println("на улице холодно ,нужно надеть шапку");
        } else {
            System.out.println("сегодня тепло , можно идти без шапки");
        }
        System.out.println();

        int speed = 60;
        if (speed > 60) {
            System.out.println("скорость превышена,придется заплотить штраф");
        } else {
            System.out.println("привышение скорости нет,можно ехать");
        }
        System.out.println();

        int personAge = 32;
        if (personAge >= 2 && personAge <= 6) {
            System.out.println("ему нужно в  дет. сад");
        }
        if (personAge >= 7 && personAge <= 17) {
            System.out.println(" ему нужно в школу");
        }
        if (personAge >= 18 && personAge <= 24) {
            System.out.println("ему нужно в университет");
        }
        if (personAge > 24) {
            System.out.println("нужно идти на работу");
        }
        System.out.println();

        int child = 18;
        if (child > 5) {
            System.out.println("нельзя кататься");
        }
        if (child < 14) {
            System.out.println("можно,только с взрослым");
        }
        if (child > 14) {
            System.out.println("можна кататься самостоятельно");
        }
        System.out.println();

        int total = 102;
        int seadTotal = 60;
        int standing = 25;
        if (standing > total) {
            System.out.println("мест нет");
        } else {
            if (standing > seadTotal) {
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













