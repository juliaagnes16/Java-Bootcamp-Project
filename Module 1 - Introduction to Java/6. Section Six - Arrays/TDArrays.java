import java.util.Arrays;

public class TDArrays {
    public static void main(String[] args) {
        //step 1 using new int[][]
        // int[][] grades = new int[3][4];
        
        // grades[0][0] = 72;
        // grades[0][1] = 74;
        // grades[0][2] = 78;
        // grades[0][3] = 76;

        // grades[1][0] = 76;
        // grades[1][1] = 65;
        // grades[1][2] = 64;
        // grades[1][3] = 61;

        // grades[2][0] = 95;
        // grades[2][1] = 98;
        // grades[2][2] = 99;
        // grades[2][3] = 100;

        //step 2 using bracket {{}}
        int[][] grades = {
            {72, 72, 78, 76},
            {76, 65, 64, 61},
            {95, 98, 99, 100}
        };
        // System.out.println("\tHarry: " + Arrays.toString(grades[0]));
        // System.out.println("\tRon: " + Arrays.toString(grades[1]));
        // System.out.println("\tHermione: " + Arrays.toString(grades[2]));

        //using single for loop
        // for(int j = 0; j < grades[0].length; j++) {
        //     System.out.print(grades[0][j] + " ");
        // }
        // System.out.println("\n");

        // for(int j = 0; j < grades[1].length; j++) {
        //     System.out.print(grades[1][j] + " ");
        // }
        // System.out.println("\n");

        // for(int j = 0; j < grades[2].length; j++) {
        //     System.out.print(grades[2][j] + " ");
        // }
        // System.out.println("\n");

        //using nested loop
        for(int i = 0; i < grades.length; i++) {
            switch (i) {
                case 0: System.out.print("\tHarry : "); break;
                case 1: System.out.print("\tRon : "); break;
                case 2: System.out.print("\tHermione : "); break;
            
                default:
                    break;
            }
            for(int j = 0; j < grades[i].length; j++) {
                System.out.print(grades[i][j] + " ");
            }
            System.out.println("\n");
        }
    }
}
