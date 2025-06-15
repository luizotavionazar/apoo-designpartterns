public class PeruAdaptado implements Pato {
    public Peru peru;
    
    public PeruAdaptado(Peru peru) {
        this.peru = peru;
    }
    
    @Override
    public void grasnar() {
        this.peru.gorgolejar();
    }

    @Override
    public void voar() {
        for (int i = 0; i < 5; i++) {
            this.peru.voar();
        }
    }
}