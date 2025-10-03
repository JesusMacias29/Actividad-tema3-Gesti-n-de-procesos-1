package actividad_java_ej1_slim;

import java.util.Random;

public class Aleatorios {
	
    public static void main(String[] args) {
    	
        int count = 40; 
        
        if (args.length > 0) {
            try {
                count = Math.max(1, Integer.parseInt(args[0]));
            } catch (NumberFormatException e) {
              
            }
        }
        Random rnd = new Random();
        for (int i = 0; i < count; i++) {
            System.out.println(rnd.nextInt(101)); 
        }
    }
}