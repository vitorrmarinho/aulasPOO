class CacheDeInteger {
    public static void main(String[] args) {
        // int numero1 = 130;
        // int numero2 = 130;
        // System.out.println(numero1 == numero2); // primitivos: sempre compara valor -> true

        Integer numero1 = 130;
        Integer numero2 = 130;

        // Integer faz cache automático apenas para valores entre -128 e 127 (Integer Cache).
        // Como 130 está fora dessa faixa, cada variável aponta para um objeto diferente.
        System.out.println(numero1 == numero2);      // false -> compara referências
        System.out.println(numero1.equals(numero2)); // true  -> compara valores
    }
}