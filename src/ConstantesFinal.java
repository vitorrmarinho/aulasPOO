class ConstantesFinal {
    public static void main(String[] args) {
        final double VALOR_DE_PI = 3.14;
        System.out.println("VALOR_DE_PI: " + VALOR_DE_PI);

        // A linha abaixo NÃO compila, pois VALOR_DE_PI é final (constante):
        // VALOR_DE_PI = 3.15; // erro: cannot assign a value to final variable
    }
}