class TiposPrimitivos {
    public static void main(String[] args) {
        byte idade = 123;
        short ano = 2021;
        int cep = 21070333; // sem zero à esquerda: com zero, Java interpretaria como octal
        long cpf = 98765432109L;
        float pi = 3.14F;
        double salario = 1275.33;

        System.out.println("idade: " + idade);
        System.out.println("ano: " + ano);
        System.out.println("cep: " + cep);
        System.out.println("cpf: " + cpf);
        System.out.println("pi: " + pi);
        System.out.println("salario: " + salario);
    }
}
