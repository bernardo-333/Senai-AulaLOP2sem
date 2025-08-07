package rpg;

public class PersonagemRPG {
    private String nome;
    private String classe;
    private int nivel;
    private int vida;

    public int getNivel() {
        return nivel;
    }

    public void setNome(String nome) {
        this.nome = nome;
        System.out.println("Nome adicionado com sucesso!");
    }

    public void setClasse(String classe) {
        this.classe = classe;
        System.out.println("Classe adicionado com sucesso!");
    }

    public void setNivel(int nivel) {
        if (nivel < 1) {
            System.err.println("Invalido, o nivel não pode ser menor que 1");
        } else {
            System.out.println("Nivel adicionado com sucesso!");
        }
    }

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        if (vida < 1 && vida > 100) {
            System.err.println("Invalido, a vida não pode ser menor que 1");
        } else {
            System.out.println("Vida adicionado com sucesso!");
        }
    }





}
