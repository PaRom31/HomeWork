package Level_2.Lesson2;

public class ArrayException {


    public static void main(String[] args) {

        String arrSum[][] = {
                {"7", "8", "7","9"},
                {"7", "8", "7", "7"},
                {"5", "11", "5", "5"},
                {"9", "0", "7", "6"},
        };

        try {
            arrSum(arrSum);
        }catch (MyArrayDataException | MyArraySizeException e){
            System.err.println(e.getMessage());

        }



    }

    public static void arrSum(String arrSum[][]) {

        int sum = 0;
        int arrLength = 4;

        for (int y = 0; y < arrSum.length; y++) {
            for (int x = 0; x < arrSum[y].length; x++) {
                if (arrSum[x].length != arrLength || arrSum.length != arrLength) {
                    throw new MyArraySizeException("Array Size Exception. The allowed array size is 4*4");
                }
                System.out.print(arrSum[y][x] + "\t");

                try {
                    int a = Integer.parseInt(arrSum[y][x]);
                    sum += a;

                }catch (NumberFormatException e){
                    throw new MyArrayDataException(y + 1 + " line  " + (1 + x) + " number");
                }

            }
            System.out.println();

        }
        System.out.println(sum);
    }


}

