class Exercicio4 {
    public static void main(String[] args) {
        int fatorial = 1;
        IO.println("O Fatorial de 0 é " + fatorial);
        for (int n = 1; n <= 10; n++) {
            fatorial = fatorial*n;
            IO.println("O fatorial de " + n + " é (" + (n-1) + "!) * " + n + " = " + fatorial);
        }
    }
}