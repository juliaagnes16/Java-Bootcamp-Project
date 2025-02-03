import java.util.Arrays;

public class UpdatingArrays {
    public static void main(String[] args) {
        String[] menu = {"Espresso", "Ice coffee", "Macchiato"};
        menu[2] = "Latte";
        System.out.println(Arrays.toString(menu));

        String[] newMenu = new String[5];

        for(int i = 0; i < menu.length; i++) {
            newMenu[i] = menu[i];
        }

        newMenu[3] = "House blend";
        newMenu[4] = "Dark roast";
        System.out.println(Arrays.toString(newMenu));
    }
}
