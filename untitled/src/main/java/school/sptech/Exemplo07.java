package school.sptech;

import java.util.concurrent.ThreadLocalRandom;

public class Exemplo07 {
    public static void main(String[] args) {
        Integer numeroAleaorio= ThreadLocalRandom.current().nextInt(0,11);
        Double doubleAleatorio = ThreadLocalRandom.current().nextDouble(0,21);


        System.out.println("Número gerado: " + numeroAleaorio);
        System.out.println("Número gerado com vírgula: %.2f".formatted(doubleAleatorio));
    }
}
