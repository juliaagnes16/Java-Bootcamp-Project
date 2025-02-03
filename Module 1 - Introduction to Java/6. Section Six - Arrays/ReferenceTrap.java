import java.util.Arrays;

public class ReferenceTrap {
    public static void main(String[] args) {
        String[] staffLastYear = {"Tomy", "Joel", "Ellie"};

        //Step 1 using for loop
        // String[] staffThisYear = new String[3];

        // for(int i = 0; i < staffThisYear.length; i++) {
        //     staffThisYear[i] = staffLastYear[i];
        // }

        //Step 2 using Arrays.copyOf
        String[] staffThisYear = Arrays.copyOf(staffLastYear, staffLastYear.length);
        staffThisYear[1] = "Abby";
        
        System.out.println(Arrays.toString(staffLastYear));
        System.out.println(Arrays.toString(staffThisYear));
    }
}
