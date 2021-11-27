public class Prueba {

    private String atributo1;
    private String atributo2;
    private String atributo3;

    public Prueba(String atributo1, String atributo2, String atributo3) {
        this.atributo1 = atributo1;
        this.atributo2 = atributo2;
        this.atributo3 = atributo3;
    }

    public String sumar() {
        return atributo1 + atributo2 + atributo3;
    }

}
