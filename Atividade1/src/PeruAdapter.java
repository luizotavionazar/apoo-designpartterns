public class PeruAdapter implements Pato {
    private Peru peru;

    public PeruAdapter(Peru peru) {
        this.peru = peru;
    }

    @Override
    public void voar() {
        for (int i = 0; i < 3; i++) {
            peru.voar();
        }
    }

    @Override
    public void grasnar() {
        peru.gorgolejar();
    }
}