class Carta {
    private String nome;
    private int ataque;
    private int defesa;
    private int velocidade;

    public Carta(String nome, int ataque, int defesa, int velocidade) {
        this.nome = nome;
        this.ataque = ataque;
        this.defesa = defesa;
        this.velocidade = velocidade;
    }

    public String getNome() {
        return nome;
    }

    public int getAtaque() {
        return ataque;
    }

    public int getDefesa() {
        return defesa;
    }

    public int getVelocidade() {
        return velocidade;
    }
}
