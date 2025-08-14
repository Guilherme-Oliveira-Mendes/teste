package school.sptech;

public class Exemplo02 {
    public static void main(String[] args) {
        // if, else if, else, operador termario
        // > < <= >= == ===

        Integer idade = 18;

        if(idade >= 18){
            System.out.println("Pode dirigir e votar!");
        }else if(idade>=16){
            System.out.println("Pode votar!");
        }else{
            System.out.println("Não pode dirigir nem votar!");
        }

        String mensagem = idade >= 18 ? "Você é maior de idade!" : "Baby";
        System.out.println(mensagem);
    }
}
