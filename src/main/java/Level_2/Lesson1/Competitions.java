package Level_2.Lesson1;

public class Competitions {

    public static void main(String[] args) {

        Cat mursik = new Cat("Mursik", 15, 3);
        Cat barsik = new Cat("Barsik", 12, 2);
        Human boris = new Human("Boris", 30, 10);
        Human john = new Human("John", 25, 12);
        Robot r2d2 = new Robot("R2D2", 10, 1);

        Treadmill dis1 = new Treadmill(10);
        Wall wall1 = new Wall(2);
        Wall wall2 = new Wall(5);
        Treadmill dis2 = new Treadmill(30);
        Treadmill dis3 = new Treadmill(5);
        Wall wall3 = new Wall(10);

        RunAndJump[] runAndJumps = {mursik, barsik, boris, john, r2d2};

        RunAndJump[] wallAndTreadmill = {dis1, wall1, wall2, dis2, dis3, wall3};

        for (RunAndJump runJump : runAndJumps) {
            for (RunAndJump wallTreadmill : wallAndTreadmill) {
                if (wallTreadmill instanceof Wall) {
                    if (runJump.jump((Wall) wallTreadmill)  == false){
                        break;
                    }


                    } else if (wallTreadmill instanceof Treadmill) {
                        if(runJump.run((Treadmill) wallTreadmill) == false){
                            break;
                        }

                    }
                }


                }


            }



    }
