public class Prueba {

    private int atributo1;
    private int atributo2;
    private int atributo3;
    private String atributo7;

    public Prueba(int atributo1, int atributo2, int atributo3, String atributo7) {
        this.atributo1 = atributo1;
        this.atributo2 = atributo2;
        this.atributo3 = atributo3;
        this.atributo7 = atributo7;
    }

    public int sumar() {
        return atributo1 + atributo2 + atributo3;
    }

    public String concatenar2() {
        return "-" + atributo7;
    }

    public int restar() {
        return  atributo2 - atributo1;
    }

    public int multiplicar() {
        return atributo1 * atributo2;
    }
}
