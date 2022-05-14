package Level_2.Lesson1;

public class Wall implements RunAndJump {

    private int height;

    public Wall(int height) {

        this.height = height;
    }

    @Override
    public boolean jump(Wall wall) {
        return true;


    }

    @Override
    public boolean run(Treadmill treadmill) {
        return true;
    }

    public int getHeight() {
        return height;
    }
}
