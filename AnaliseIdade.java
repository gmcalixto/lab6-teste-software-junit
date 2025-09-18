public class AnaliseIdade {

    public static String validarIdade(int idade) {
        if (idade >= 18 && idade < 120) {
            return "Idade válida";
        } else {
            return "Idade inválida";
        }
    }

    public static String obterFaixaEtaria(int idade) {
        if (idade <= 12) {
            return "criança";
        } else if (idade >= 13 && idade <= 17) {
            return "adolescente";
        } else if (idade > 18 && idade < 65) {
            return "Adulto jovem";
        } else if (idade >= 66) {
            return "Melhor idade";
        } else {
            return "Idade inválida";
        }
    }
}
