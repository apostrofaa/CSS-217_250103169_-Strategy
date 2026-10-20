interface MoveStrategy {
    void move();
}
class Walking implements MoveStrategy {
    @Override
    public void move() {
        System.out.println("Moving: Walking at 5 km/h");
    }
}
class Skateboarding implements MoveStrategy {
    @Override
    public void move() {
        System.out.println("Moving: Skateboarding at 15 km/h");
    }
}
class Jetpack implements MoveStrategy {
    @Override
    public void move() {
        System.out.println("Moving: Flying with Jetpack at 60 km/h");
    }
}
class Player {
    private MoveStrategy strategy;
    public Player(MoveStrategy strategy) {
        this.strategy = strategy;
    }
    public void setStrategy(MoveStrategy strategy) {
        this.strategy = strategy;
    }
    public void move() {
        strategy.move();
    }
}
public class Main {
    public static void main(String[] args) {
        Player player = new Player(new Walking());
        player.move();

        player.setStrategy(new Skateboarding());
        player.move();

        player.setStrategy(new Jetpack());
        player.move();
    }
}