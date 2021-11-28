public class Main {

    public static void main(String[] args) {

        Prueba prueba = new Prueba(1, 2, 3, "Hola", " ", "Mundo", ":)");

        System.out.println("Sumar:");
        System.out.println(prueba.sumar());

        System.out.println("Restar:");
        System.out.println(prueba.restar());

        System.out.println("Multiplicar:");
        System.out.println(prueba.multiplicar());

        System.out.println("Concatenar:");
        System.out.println(prueba.concatenar());

        System.out.println("Concatenar2:");
        System.out.println(prueba.concatenar2());
    }
}
