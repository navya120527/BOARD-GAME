import java.util.*;

public class SnakeException {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random r = new Random();

        int position = 0;
        System.out.println("Snake & Ladders (Exception Handling Version)");

        while (position < 100) {
            System.out.print("Press ENTER to roll: ");

            try {
                sc.nextLine();  // user input
            } catch (Exception e) {
                System.out.println("Invalid input! Try again.");
                continue;
            }

            int dice = r.nextInt(6) + 1;
            System.out.println("Dice: " + dice);

            try {
                if (position + dice > 100)
                    throw new Exception("Move exceeds board limit!");

                position += dice;
            } catch (Exception ex) {
                System.out.println(ex.getMessage());
                continue;
            }

            // Ladders
            if (position == 3) position = 22;
            if (position == 5) position = 8;
            if (position == 11) position = 26;

            // Snakes
            if (position == 17) position = 4;
            if (position == 19) position = 7;
            if (position == 20) position = 6;

            System.out.println("Position: " + position);
        }

        System.out.println("🎉 You Win!");
    }
}

