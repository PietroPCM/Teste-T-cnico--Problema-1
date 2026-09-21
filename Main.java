import java.util.Arrays;
public class Main {
    public static void main(String[] args) {
        int[] numeros = {5,3,8,6,2,7,4,1,9,0,19,12,5,10,3,22};
        int soma = 0;
        int maior = numeros[0];
        int menor = numeros[0];
        for (int i = 0; i < numeros.length; i++) {
            System.out.print(numeros[i] + "\n");
            soma += numeros[i];
            if (numeros[i] > maior) {
                maior = numeros[i];
            }
            if (numeros[i] < menor) {
                menor = numeros[i];
            }
        }
        int[] numerosSemDuplicados = Arrays.stream(numeros).distinct().toArray();
        System.out.println("Soma de todos elementos da lista:"+soma);
        System.out.println("Maior elemento:"+maior);
        System.out.println("Menor elemento:"+menor);
        System.out.println("Lista sem elementos repetidos:");
        System.out.println(Arrays.toString(numerosSemDuplicados));
    }
}
