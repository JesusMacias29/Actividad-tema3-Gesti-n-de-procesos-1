package actividad_java_ej1_slim;

import java.util.*;

public class OrdenarNumeros {
  
    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<>();

        if (args.length > 0) {
            for (String s : args) {
                try {
                    nums.add(Integer.parseInt(s));
                } catch (NumberFormatException e) {
                    System.err.println("Ignorado token no numérico: " + s);
                }
            }
        } else {
            Scanner scanner = new Scanner(System.in);
            while (scanner.hasNext()) {
                String token = scanner.next();
                try {
                    nums.add(Integer.parseInt(token));
                } catch (NumberFormatException e) {
                    System.err.println("Ignorado token no numérico: " + token);
                }
            }
            scanner.close();
        }

        Collections.sort(nums);
        for (int n : nums) {
            System.out.println(n);
        }
    }
}