package inheritance.ghosts;

public class Skeleton extends Ghost{

    @Override
    public void attack() {
        super.attack();
        System.out.println("This is attack from the class Skeleton. ");
    }

    @Override
    public void description() {

    }

    String typeOfGun;
    public Skeleton(){
        System.out.println("Default constructor from the class Skeleton.");
    }

    public Skeleton(double speed, double hp) {
        super(speed, hp);
        System.out.println("Non default constructor from class Skeleton.");
    }

    public Skeleton(double speed, double hp, String typeOfGun) {
        super(speed, hp);
        this.typeOfGun = typeOfGun;
        System.out.println("Non default constructor from the class Skeleton. A type of gun: " + typeOfGun);
    }
}
