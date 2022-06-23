package game;

public class Game {

    public Player gewinner(Player p1, Player p2) {
        // 1 = paper 2 = rock 3 = scissors
        if(p1.getSign() != 1 && p1.getSign() != 2 && p1.getSign() != 3) {
            throw new IllegalArgumentException("Illegal sign found");
        }
        if(p2.getSign() != 1 && p2.getSign() != 2 && p2.getSign() != 3) {
            throw new IllegalArgumentException("Illegal sign found");
        }

        if(p1.getSign() == 1 && p2.getSign() == 1) {
            System.out.println("Gleichstand");
            return null;
        }
        if(p1.getSign() == 2 && p2.getSign() == 2) {
            System.out.println("Gleichstand");
            return null;
        }
        if(p1.getSign() == 3 && p2.getSign() == 3) {
            System.out.println("Gleichstand");
            return null;
        }
        if(p1.getSign() == 1 && p2.getSign() == 2) {
            System.out.println("Papier schlägt Stein");
            return p1;
        }
        if(p1.getSign() == 1 && p2.getSign() == 3) {
            System.out.println("Schere schlägt Papier");
            return p2;
        }
        if(p1.getSign() == 2 && p2.getSign() == 1) {
            System.out.println("Papier schlägt Stein");
            return p2;
        }
        if(p1.getSign() == 2 && p2.getSign() == 3) {
            System.out.println("Stein schlägt Schere");
            return p1;
        }
        if(p1.getSign() == 3 && p2.getSign() == 1) {
            System.out.println("Schere schlägt Papier");
            return p1;
        }
        if(p1.getSign() == 3 && p2.getSign() == 2) {
            System.out.println("Stein schlägt Schere");
            return p2;
        }
        throw new IllegalStateException("Winner could not be evaluated!");
    }

}
