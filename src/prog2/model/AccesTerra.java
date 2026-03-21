package prog2.model;

public class AccesTerra extends Acces{
    private float longitud;

    public AccesTerra(String nom, boolean accessibilitat, float longitud) {
        super(nom, accessibilitat);
        this.longitud = longitud;
    }
}
