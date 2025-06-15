public class LuzesDaSala {
    String descricao;

    public LuzesDaSala(String descricao) {
        this.descricao = descricao;
    }

    public void ligar() {
        System.out.println(descricao + ": ligadas");
    }

    public void desligar() {
        System.out.println(descricao + ": desligadas");
    }

    public void regular(int nivel) {
        System.out.println(descricao + ": reduzidas para " + nivel + "% do brilho");
    }

    public String toString() {
        return descricao;
    }
}