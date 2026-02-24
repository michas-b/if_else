import java.util.random.RandomGenerator;

public class Main {
    public static void main(String[] args) {
        RandomGenerator randomInt = RandomGenerator.getDefault();

        //Задача 1
        int age = randomInt.nextInt(1, 100);
        if (age >= 18) {
            System.out.println("Если возраст человека равен " + age + ", то он совершеннолетний");
        } else {
            System.out.println("Если возраст человека равен " + age + ", он не достиг совершеннолетия, нужно немного подождать");
        }

        //Задача 2
        int tempirature = randomInt.nextInt(-45, 45);
        if (tempirature < 5) {
            System.out.println("На улице " + tempirature + " градусов, нужно надеть шапку");
        } else if (tempirature >= 5) {
            System.out.println("На улице " + tempirature + " градусов, можно идти без шапки");
        }

        //Задача 3
        int speed = randomInt.nextInt(1, 320);
        if (speed > 60) {
            System.out.println("Если скорость " + speed + " км/ч, то придется заплатить штраф");
        } else if (speed <= 60) {
            System.out.println("Если скорость " + speed + " км/ч, можно ездить спокойно");
        }

        //Задача 4
        int humanAge = randomInt.nextInt(1, 100);
        if (humanAge >= 2 && humanAge <= 6) {
            System.out.println("Если возраст человека равен " + humanAge + ", то ему нужно ходить в детский сад");
        } else if (humanAge >= 7 && humanAge <= 17) {
            System.out.println("Если возраст человека равен " + humanAge + ", то ему нужно ходить в школу");
        } else if (humanAge >= 18 && humanAge <= 24) {
            System.out.println("Если возраст человека равен " + humanAge + ", то ему нужно ходить в университет");
        } else if (humanAge > 24 && humanAge <= 64) {
            System.out.println("Если возраст человека равен " + humanAge + ", то ему нужно ходить на работу");
        } else {
            System.out.println("Если возраст человека равен " + humanAge + ", то ему нужно оставаться дома");
        }

        //Задача 5
        int ageChild = randomInt.nextInt(1, 18);
        if (ageChild < 5) {
            System.out.println("Если возраст ребенка равен " + ageChild + ", то ему нельзя кататься на аттракционе");
        } else if (ageChild > 5 && ageChild <= 14) {
            System.out.println("Если возраст ребенка равен " + ageChild + ", то ему можно кататься на аттракционе в сопровождении взрослого");
        } else {
            System.out.println("Если возраст ребенка равен " + ageChild + ", то ему можно кататься на аттракционе без сопровождения взрослого");
        }

        //Задача 6
        int capacityCarriage = 102;
        int seatCarriage = 60;
        int TicketNumber = randomInt.nextInt(1, 202);
        if (TicketNumber <= 102) {
            System.out.print("Для билета № " + TicketNumber);
            if (TicketNumber <= 60) {
                System.out.println(" есть сидячие места");
            } else {
                System.out.println(" остались только стоячие места");
            }
        } else {
            System.out.println("Для билета № " + TicketNumber + " места в вагоне нет");
        }

        //Задача 7
        int one = randomInt.nextInt(0, 99);
        int two = randomInt.nextInt(0, 99);
        int three = randomInt.nextInt(0, 99);
        if (one > two && one > three) {
            System.out.println("Число one: " + one + " больше числа two: " + two + " и числа three: " + three);
        } else if (two > one && two > three) {
            System.out.println("Число two: " + two + " больше числа one: " + one + " и числа three: " + three);
        } else {
            System.out.println("Число three: " + three + " больше числа one: " + one + " и числа two: " + two);
        }
    }
}