import java.util.Arrays;

public class RemoveDuplicatas {
    public static void main(String[] args) {
        int[] numeros = {4, 3, 6, 3, 9, 6, 2, 2, 8};
        int[] resultado = new int[numeros.length];
        int tamanho = 0;

        for (int i = 0; i < numeros.length; i++) {
            boolean duplicado = false;
            for (int j = 0; j < tamanho; j++) {
                if (resultado[j] == numeros[i]) {
                    duplicado = true;
                    break;
                }
            }
            if (!duplicado) {
                resultado[tamanho] = numeros[i];
                tamanho++;
            }
        }

        // Exibindo o resultado
        System.out.println("Array sem duplicatas: " + Arrays.toString(resultado));
    }
}
