import java.util.Random;

public class randomGenerate {
    public static int generate(){
        int number;

        Random generator = new Random();
        number = generator.nextInt(3) + 1;

        return number;
    }
}
