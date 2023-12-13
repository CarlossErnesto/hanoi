import java.util.Scanner;

public class TorreDeHanoi {
    private int movimentos;

    public int resolverTorreDeHanoi(int numeroDeDiscos) {
        movimentos = 0;
        moverDiscos(numeroDeDiscos, 'A', 'C', 'B');
        return movimentos;
    }

    // n = número de discos, origem = ponto inicial do disco, destino = onde o disco irá se mover
    private void moverDiscos(int n, char origem, char destino, char auxiliar) {
        if (n > 0) {

            moverDiscos(n - 1, origem, auxiliar, destino);


            System.out.println("Mover disco " + n + " de " + origem + " para " + destino);
            movimentos++;


            moverDiscos(n - 1, auxiliar, destino, origem);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Informe o número de discos que serão utilizados: ");
        int numeroDeDiscos = scanner.nextInt();

        TorreDeHanoi torreDeHanoi = new TorreDeHanoi();
        int movimentos = torreDeHanoi.resolverTorreDeHanoi(numeroDeDiscos);
        System.out.println("Número total de movi1mentos usados: " + movimentos);
    }
}
