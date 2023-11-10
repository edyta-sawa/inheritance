package inheritance.ghosts;

public abstract class Ghost {
    protected double getSpeed() {
        return speed;
    }

    protected double getHp() {
        return hp;
    }

    private double speed = 10;
    private double hp;

    public void attack() {
        System.out.println("This is attack from the class Ghost.");
    }

    protected abstract void description();

    public Ghost() {
        System.out.println("Default constructor from the class Ghost.");
    }

    public Ghost(double speed, double hp) {
        this.speed = speed;
        this.hp = hp;
        System.out.println("Non default constructor from the class Ghost.");
    }
}
