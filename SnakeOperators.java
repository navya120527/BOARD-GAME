import java.util.*;

public class SnakeOperators {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();

        int position = 0;

        System.out.println("Snake & Ladders (Operators Version)");
        System.out.println("Press ENTER to roll the dice...");

        while (position < 100) {

            sc.nextLine();
            int dice = rand.nextInt(6) + 1;
            System.out.println("Dice: " + dice);

            position = position + dice;

            if (position > 100)
                position = position - dice;

            // Ladders
            if (position == 3) position = 22;
            if (position == 5) position = 8;
            if (position == 11) position = 26;

            // Snakes
            if (position == 17) position = 4;
            if (position == 19) position = 7;
            if (position == 20) position = 6;

            System.out.println("Current Position: " + position);
        }

        System.out.println("🎉 You Reached 100 — You Win!");
    }
}
