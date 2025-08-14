package school.sptech;

public class Exemplo06 {
    public static void main(String[] args) {
    Integer idade = 20;
    String nome = "Manoel";
    Double peso = 60.0;
    Float altura = 1.8f;
//%s = String , %d = Interger , %f = Double/Float , %b = Boolean
    //String mensagem = String.format("Meu nome é: %s, tenho %d anos, " +
//            "Peso %fkg e tenho %f de altura", nome, idade, peso, altura);

    String mensagem = ("Meu nome é: %s, tenho %d anos, " +
            "Peso %.2fkg e tenho %.2f de altura").formatted(nome, idade, peso, altura);


    System.out.println(mensagem);

    Boolean temCarro = true;
        System.out.println("Tenho carro: %b".formatted(temCarro));
        System.out.println("Eu me chamo %s e meu celular está tem 19%%".formatted(nome));
        //StringBloc
    String text = """
            Meu nome é João
            Eu gosto de Java
            Java é legal
            """;
        System.out.println(text);
    }
}
