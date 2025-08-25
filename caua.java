/*Primeiro exercicio */
public class caua {
    public static void main(String[] args) {
        int[] idades = {12, 20, 17, 58, 18, 19, 16, 27, 5, 11};
        System.out.println("Aqui vc sabera quais das idades apresentadas são maiores que 18 anos!");
        System.out.println("Idades maiores que 18 anos:");
        for (int i = 0; i < idades.length; i++) {
            if (idades[i] > 18) {
                System.out.println(idades[i]);
            }
        }
/*Questão 2 dos exercicios */
        System.out.println("Logo abaixo você ira saber qual a sua média em relação as suas notas!!");
        double[] notas = {6.5, 7.0, 8.0, 7.5};
        double soma = 0;

        for (int i = 0; i < notas.length; i++) {
            soma += notas[i];
        }

        double media = soma / notas.length;
        System.out.println("A Média das suas notas são: " + media);
    }
}