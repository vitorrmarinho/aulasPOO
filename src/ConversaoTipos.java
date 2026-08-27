class ConversaoTipos {
    public static void main(String[] args) {
        short numeroCurto = 1;
        int numeroNormal = numeroCurto;            // widening automático (short -> int)
        short numeroCurto2 = (short) numeroNormal; // narrowing precisa de cast explícito

        System.out.println("numeroCurto: " + numeroCurto);
        System.out.println("numeroNormal: " + numeroNormal);
        System.out.println("numeroCurto2: " + numeroCurto2);
    }
}
