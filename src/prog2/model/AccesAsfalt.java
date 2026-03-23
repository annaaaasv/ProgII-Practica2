package prog2.model;

public class AccesAsfalt extends Acces{
    private float metres;

    public AccesAsfalt(String nom, boolean accessibilitat, float metres) {
        super(nom, accessibilitat);
        this.metres = metres;
    }

    /**
     * Retorna si l'accés permet accessibilitat amb cotxe o no.
     *
     * @return
     */
    @Override
    public boolean isAccessibilitat() {
        return false;
    }
}
