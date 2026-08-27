class ComparacaoStrings {
    public static void main(String[] args) {
        String nome1 = "JAVA";
        String nome2 = "JAVA";
        System.out.println(nome1 == nome2); // true  -> ambos vêm do pool de Strings

        String nome3 = new String("JAVA");
        System.out.println(nome1 == nome3); // false -> nome3 é um objeto novo, fora do pool

        String nome4 = nome3;
        System.out.println(nome3 == nome4); // true  -> nome4 aponta para o mesmo objeto que nome3
    }
}