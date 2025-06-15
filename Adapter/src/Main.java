public class Main {
    public static void main(String[] args) {
        PatoSelvagem pato = new PatoSelvagem(); //Crio o Pato Selvagem
        PeruSelvagem peru = new PeruSelvagem(); //Crio o Peru Selvagem
        Pato adaptarPeru = new PeruAdaptado(peru); //Adapto o Peru Selvagem para agir semelhante ao Pato
        
        System.out.println("\nO Pato diz...");
        pato.grasnar();
        System.out.println("E depois...");
        pato.voar();

        System.out.println("\nO Peru diz...");
        peru.gorgolejar();
        System.out.println("E depois...");
        peru.voar();
        
        System.out.println("\nO Peru Selvagem também diz...");
        adaptarPeru.grasnar();
        System.out.println("Mas depois...");
        adaptarPeru.voar();
    }
}