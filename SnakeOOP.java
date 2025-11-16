import java.util.*;

class Board {
    private Map<Integer, Integer> snakes = new HashMap<>();
    private Map<Integer, Integer> ladders = new HashMap<>();

    public Board() {
        ladders.put(3, 22);
        ladders.put(5, 8);
        ladders.put(11, 26);

        snakes.put(17, 4);
        snakes.put(19, 7);
        snakes.put(20, 6);
    }

    public int checkPosition(int pos) {
        if (ladders.containsKey(pos)) return ladders.get(pos);
        if (snakes.containsKey(pos)) return snakes.get(pos);
        return pos;
    }
}

class Player {
    int position = 0;

    public void move(int dice) {
        if (position + dice <= 100)
            position += dice;
    }
}

public class SnakeOOP {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random r = new Random();

        Board board = new Board();
        Player player = new Player();

        System.out.println("Snake & Ladders (OOP Version)");
        System.out.println("Press ENTER to roll...");

        while (player.position < 100) {
            sc.nextLine();

            int dice = r.nextInt(6) + 1;
            System.out.println("Dice: " + dice);

            player.move(dice);
            player.position = board.checkPosition(player.position);

            System.out.println("Position: " + player.position);
        }

        System.out.println("🏆 You Win!");
    }
}

