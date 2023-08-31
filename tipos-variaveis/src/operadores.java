public class operadores {
    public static void main(String[] args){
        int num1 = 2;
        int num2 = 2;

        boolean simnao = num1 == num2;
        System.out.println("Número 1 é igual a Número 2 : " + simnao);


        simnao = num1 != num2;
        System.out.println("Número 1 é diferente de Número 2: " + simnao);


        // comparamdo obejetos, usamos equals

        String nome1 = "Thauan";
        String nome2 = new String("Thauan");
        System.out.println(nome1.equals(nome2));
    }
}
