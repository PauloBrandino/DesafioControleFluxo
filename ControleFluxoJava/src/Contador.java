import java.util.Scanner;

public class Contador {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um número");
        int firstParam = scanner.nextInt();
        System.out.println("Digite outro número");
        int secondParam = scanner.nextInt();

        scanner.close();

        try{
            counter(firstParam, secondParam);
        } catch (InvalidParamsException e) {
            System.out.println("O segundo parâmetro deve ser maior que o primeiro parâmetro");
        }

    }
    static void counter(int firstParam, int secondParam) throws InvalidParamsException {
        int count = secondParam - firstParam;

        if(count <= 0) {
            throw new InvalidParamsException();
        }

        for(int i=1; i <= count; i++) {
            System.out.println("Contando: " + i);
        }
    }
}
