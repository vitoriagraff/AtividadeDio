public class Heroi {

    private String nome;
    private int idade;
    private String tipo;

    public Heroi(String nome, int idade, String tipo) {
        this.nome = nome;
        this.idade = idade;
        this.tipo = tipo;
    }

    public void atacar() {
        String ataque = "";

        switch (tipo) {
            case "mago":
                ataque = "magia";
                break;
            case "guerreiro":
                ataque = "espada";
                break;
            case "monge":
                ataque = "artes marciais";
                break;
            case "ninja":
                ataque = "shuriken";
                break;
            default:
                ataque = "ataque desconhecido";
                break;
        }

        System.out.println("O " + tipo + " atacou usando " + ataque);
    }

    public static void main(String[] args) {
        Heroi mago = new Heroi("Merlin", 100, "mago");
        mago.atacar();

        Heroi guerreiro = new Heroi("Arthur", 25, "guerreiro");
        guerreiro.atacar();
    }
}

