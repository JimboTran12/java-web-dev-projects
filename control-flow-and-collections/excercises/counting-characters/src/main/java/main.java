import java.util.ArrayList;
import java.util.HashMap;
import java.util.ArrayList;
import java.util.Map;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        String text = "If the product of two terms is zero then common sense says at least one of the two terms has to be zero to start with. So if you move all the terms over to one side, you can put the quadratics into a form that can be factored allowing that side of the equation to equal zero. Once you’ve done that, it’s pretty straightforward from there.";
        System.out.println("Enter text: ");
        Scanner input = new Scanner(System.in);
        String userText = input.nextLine();
        char[] chars = userText.toCharArray();
        HashMap<String, Integer> map = new HashMap<String, Integer>();
        ArrayList<String> index = new ArrayList<>();
        String alpha = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
        for (char character : chars) {
            String curr = Character.toString(character).toLowerCase();
            if (!index.contains(curr) && alpha.contains(curr)) {
                index.add(curr);
            }
        }
        for (String i : index) {
            map.put(i, 0);
        }

        for (char character : chars) {
            String curr = Character.toString(character).toLowerCase();
            for (String key : map.keySet()) {
                if (curr.equals(key)) {

                    map.put(key, map.get(key) + 1);
                }
            }
        }

        for (Map.Entry<String, Integer> list : map.entrySet()) {
            System.out.println(list.getKey() + ": " + list.getValue());
        }

    }
}
