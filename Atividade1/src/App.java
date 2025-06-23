public class App {
    public static void main(String[] args) throws Exception {
        Peru peru = new Peru();
        Pato peruAdaptado = new PeruAdapter(peru);

        System.out.println("Usando um Peru como se fosse um Pato:");
        peruAdaptado.voar();
        peruAdaptado.grasnar();
    }
}