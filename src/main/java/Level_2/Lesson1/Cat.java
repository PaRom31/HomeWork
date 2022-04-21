package Level_2.Lesson1;

public class Cat implements RunAndJump {

    private String name;
    private int maxRunDistance;
    private int maxJumpHeight;

    public Cat(String name, int maxRunDistance, int maxJumpHeight) {

        this.name = name;
        this.maxRunDistance = maxRunDistance;
        this.maxJumpHeight = maxJumpHeight;

    }

    @Override
    public boolean jump(Wall wall) {
        if (maxJumpHeight >= wall.getHeight()) {
            System.out.printf("%s jumped the wall\n", name);
            return true;
        }else{
            System.out.printf("%s too high, dropped out\n", name);
            return false;

        }
    }


    @Override
    public boolean run(Treadmill treadmill) {
        if (maxRunDistance >= treadmill.getDistance()) {
            System.out.printf("%s run distance\n", name);
            return true;
        }else{
            System.out.printf("%s too long distance,dropped out \n", name);
            return false;
        }


    }

    public int getMaxJumpHeight() {
        return maxJumpHeight;
    }

    public int getMaxRunDistance() {
        return maxRunDistance;
    }
}
