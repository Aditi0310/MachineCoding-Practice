package util;

public class AccNumGenerator {
    private static int acc = 1;

    public static int generateAccNum(){
        return acc++;
    }

}
