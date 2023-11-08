package inheritance;

import inheritance.ghosts.Ghost;
import inheritance.ghosts.Skeleton;
import inheritance.ghosts.Zombie;

public class Inheritance {
    public static void main(String[] args) {

        Ghost ghost = new Ghost(10, 100);
        ghost.attack();
        System.out.println(ghost.getSpeed());

        Skeleton skeleton = new Skeleton(5, 50, "Bow");
        Zombie zombie = new Zombie();
        skeleton.attack();
        System.out.println(skeleton.getSpeed());
        zombie.attack();
    }
}
