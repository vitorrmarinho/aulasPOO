class PerdaDePrecisao {
    public static void main(String[] args) {
        double idade = 1.2;
        short numeroCurto = (short) idade; // narrowing double -> short, perde a parte decimal
        System.out.println("numeroCurto: " + numeroCurto);

        int numeroNormal = numeroCurto; // widening automático (short -> int)
        System.out.println("numeroNormal: " + numeroNormal);

        short numeroCurto2 = (short) numeroNormal; // narrowing, precisa de cast
        System.out.println("numeroCurto2: " + numeroCurto2);
    }
}