package Level_2.Lesson1;

public class Treadmill implements RunAndJump {

    private int distance;

    public Treadmill(int distance){

        this.distance = distance;
    }

    @Override
    public boolean jump(Wall wall) {
        return true;

    }

    @Override
    public boolean run(Treadmill treadmill) {
        return true;


    }

    public int getDistance() {
        return distance;
    }
}
