class Exercicio5 {
    public static void main(String[] args) {
        double fatorial = 1;
        IO.println("O Fatorial de 0 é " + fatorial);
        for (int n = 1; n <= 40; n++) {
            fatorial = fatorial*n;
            IO.println("O fatorial de " + n + " é (" + (n-1) + "!) * " + n + " = " + fatorial);
        }
    }
}