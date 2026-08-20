public class Main {
    public static void main(String[] args) {
       /*byte idade = 123;
       short ano = 2021;
       int cep = 021070333;
       long cpf = 98765432109L;
       float pi = 3.14F;
       double salario = 1275.33;
    */

    /*shot numeroCurto = 1;
    int numeroNormal = numeroCurto;
    short numeroCurto2 = numeroNormal;
    */

    //   System.out.println(pi);

        /*
        double idade = 1.2;
        short numeroCurto = 1;
        System.out.println(numeroCurto);
        int numeroNormal = numeroCurto;
        System.out.println(numeroCurto);
        short numeroCurto2 = numeroNormal;
         */


        /*final double VALOR_DE_PI = 3.14;
        VALOR_DE_PI = 3.15;

        System.out.println(VALOR_DE_PI);
         */

        /*String nomeCompleto  = "LINGUAGEM " + "JAVA";
        System.out.println(nomeCompleto);
        String concatenacao = "?";
        int numero = 1;
        concatenacao = numero+numero+numero + "1";
        System.out.println(concatenacao);
        concatenacao = numero+"1"+numero+numero;
        System.out.println(concatenacao);
        concatenacao = numero + "1" + numero + "1";
        System.out.println(concatenacao);
        concatenacao = "1"+numero+numero+numero;
        System.out.println(concatenacao);
        concatenacao = "1" + (numero+numero+numero);
        System.out.println(concatenacao);
         */

        int a, b;

        a = 5;
        b =  6;

        /*if(a == b){
            String resultado = "verdadeiro";
        }
        else{
            String resultado = "falso";
        }
        */


       /* String resultado  = (a == b )? "verdadeiro" :"falso";
        System.out.println(resultado);
        */

        /*String nome1 = "JAVA";
        String nome2 = "JAVA";
        System.out.println( nome1 == nome2); // true

        String nome3 = new String ("JAVA");

        System.out.println( nome1 == nome3);// false

        String nome4 = nome3;

        System.out.println(nome3 == nome4);//true
         */

        //int numero1 = 130;
        //int numero2 = 130;

        //System.out.println(numero1 == numero2);

        Integer numero1 = 130;
        Integer numero2 = 130;

        System.out.println(numero1 == numero2);

        System.out.println(numero1.equals(numero2));

    }
}
