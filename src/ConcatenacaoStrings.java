class ConcatenacaoStrings {
    public static void main(String[] args) {
        String nomeCompleto = "LINGUAGEM " + "JAVA";
        System.out.println(nomeCompleto);

        int numero = 1;

        String concatenacao = numero + numero + numero + "1";
        System.out.println(concatenacao); // 31 -> soma os números primeiro, depois concatena

        concatenacao = numero + "1" + numero + numero;
        System.out.println(concatenacao); // 1111 -> concatena a partir do primeiro String

        concatenacao = numero + "1" + numero + "1";
        System.out.println(concatenacao); // 1111

        concatenacao = "1" + numero + numero + numero;
        System.out.println(concatenacao); // 1111

        concatenacao = "1" + (numero + numero + numero);
        System.out.println(concatenacao); // 13 -> parênteses forçam a soma antes
    }
}
