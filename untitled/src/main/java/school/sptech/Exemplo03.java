package school.sptech;

public class Exemplo03 {
    public static void main(String[] args) {
        Double valor01 = 10.0;
        Double valor02 = 10.0;

        if(valor01.equals(valor02)){
            System.out.println("Valores iguais");
        }else{
            System.out.println("Valores diferentes");
        }

        String valor1 = "Guilherme";
        String valor2 = "guilherme";

        if(valor1.equalsIgnoreCase(valor2)){
            System.out.println("Valores iguais");
        }else{
            System.out.println("Valores diferentes");
        }
    }
}
