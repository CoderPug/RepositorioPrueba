public class Prueba {

    private int atributo1;
    private int atributo2;

    public Prueba(int atributo1, int atributo2) {
        this.atributo1 = atributo1;
        this.atributo2 = atributo2;
    }

    public int sumar() {
        return atributo1 + atributo2;
    }

    public int restar() {
        return  atributo2 - atributo1;
    }

    public int multiplicar() {
        return atributo1 * atributo2;
    }
}
