public class Prueba {

    private int atributo1;
    private int atributo2;
    private int atributo3;

    private String atributo4;
    private String atributo5;
    private String atributo6;

    public Prueba(int atributo1, int atributo2, int atributo3, String atributo4, String atributo5, String atributo6) {
        this.atributo1 = atributo1;
        this.atributo2 = atributo2;
        this.atributo3 = atributo3;
        this.atributo4 = atributo4;
        this.atributo5 = atributo5;
        this.atributo6 = atributo6;
    }

    public int sumar() {
        return atributo1 + atributo2 + atributo3;
    }

    public String concatenar() {
        return atributo4 + atributo5 + atributo6;
    }

    public int restar() {
        return  atributo2 - atributo1;
    }

    public int multiplicar() {
        return atributo1 * atributo2;
    }
}
