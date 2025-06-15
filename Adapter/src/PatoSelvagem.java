public class PatoSelvagem implements Pato {
    @Override
    public void grasnar() {
        System.out.println("Quack quack quack");
    }

    @Override
    public void voar() {
        System.out.println("Voa para longe em migração...");
    }
}