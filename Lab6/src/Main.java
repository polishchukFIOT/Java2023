import java.util.Random;
import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        /*
            Визначити ієрархію квітів. Створити кілька об'єктів-квітів.
            Зібрати букет (використовуючи аксесуари) з визначенням його вартості.
            Провести сортування квітів у букеті за рівнем свіжості.
            Знайти квітку в букеті, що відповідає заданому діапазону довжин.
        */

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.print("Enter how many accessories you want: ");
        int accessories = scanner.nextInt();
        System.out.print("Enter a number of flowers: ");
        int numberOfFlowers = scanner.nextInt();
        System.out.println();

        // composing a bouquet
        Flowers[] flowers = new Flowers[numberOfFlowers];
        for (int i = 0; i < numberOfFlowers; i++) {
            switch (random.nextInt(5)) {
                case 1: flowers[i] = new Tulip("Tulip", random.nextBoolean(), random.nextInt(400 - 150) + 150, random.nextInt(500 - 100) + 100, random.nextInt(300-50));
                case 2: flowers[i] = new Cornflower("Cornflower", random.nextBoolean(), random.nextInt(150 - 100) + 100, random.nextInt(200 - 100) + 100, random.nextInt(300-50));
                case 3: flowers[i] = new Periwinkle("Periwinkle", random.nextBoolean(), random.nextInt(1000 - 500) + 500, random.nextInt(700 - 300) + 300, random.nextInt(300-50));
                case 4: flowers[i] = new Rose("Rose", random.nextBoolean(), random.nextInt(250 - 100) + 100, random.nextInt(200 - 100) + 100, random.nextInt(300-50));

            }
        }

        // Sorting by freshness
        Arrays.sort(flowers, new SortByFreshness());
        System.out.println("\\/ Sorted list of flowers by freshness \\/");
        for (Flowers flower : flowers) {
            System.out.println(flower);
        }

        // Consumption calculation
        int Consumption = 20 * accessories;
        for (Flowers flower : flowers) {
            if (flower.getIsPlugged()) {
                Consumption += accessories * flower.getPrice();
            }
        }
        System.out.println("\nConsumption per " + accessories + " hours is " + Consumption + " Watt." + "\n");

        // Choosing a range of length
        System.out.println("\\/ Choose a range of length \\/");
        int min, max;
        do {
            System.out.print("Enter minimum: ");
            min = scanner.nextInt();
            System.out.print("Enter maximum: ");
            max = scanner.nextInt();
        } while (min > max);
        System.out.println("\\/ Flowers that satisfy the condition are showed below \\/");
        for (Flowers flower : flowers) {
            if (flower.getLengthFlower() > min && flower.getLengthFlower() < max) {
                System.out.println(flower);
            }
        }
    }
}