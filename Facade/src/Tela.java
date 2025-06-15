public class Tela {
    String descricao;

    public Tela(String descricao) {
        this.descricao = descricao;
    }

    public void levantar() {
        System.out.println(descricao + ": subindo...");
    }

    public void abaixar() {
        System.out.println(descricao + ": descendo...");
    }

    public String toString() {
        return descricao;
    }
}