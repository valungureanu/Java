package md.tekwill.lectia14;

public class ArrayExample {
    public static void main(String[] args) {


        int[][] intArray = new int[2][3];
        System.out.println(intArray.length);
        System.out.println(intArray[0].length);
        System.out.println(intArray[1].length);
        for (int i = 0; i < intArray.length; i++) {
            for (int j = 0; j < intArray[i].length; j++) {
                intArray[i][j] = i + j;
                System.out.print(intArray[i][j]);
            }
            System.out.println();
        }

        int[][] arr1  = {{1, 2, 3}, {2}, {1, 2}};
        int[][] arr2 = new int[][]{{1, 2, 3}, {2}, {1, 2}};

        System.out.println(arr1.length);
        System.out.println(arr1[0].length);
        System.out.println(arr1[1].length);

    }

}

