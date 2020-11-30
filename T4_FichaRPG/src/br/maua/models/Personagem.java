package br.maua.models;

public class Personagem {
    private String Nome;
    private String Race;
    private String Profissao;
    private int Mana;
    private int Ataque;
    private int Ataque_Magico;
    private int Defesa;
    private int Defesa_Magica;
    private int Velocidade;
    private int Destreza;
    private int Exp;
    private int Nivel_Atual;


    public Personagem(String nome, String race, String profissao, int mana, int ataque, int ataque_Magico, int defesa, int defesa_Magica, int velocidade, int destrteza, int exp, int nivel_Atual) {
        this.Nome = nome;
        this.Race = race;
        this.Profissao = profissao;
        this.Mana = mana;
        this.Ataque = ataque;
        this.Ataque_Magico = ataque_Magico;
        this.Defesa = defesa;
        this.Defesa_Magica = defesa_Magica;
        this.Velocidade = velocidade;
        this.Destreza = destrteza;
        this.Exp = exp;
        this.Nivel_Atual = nivel_Atual;
    }

    public void setNome(String nome) {
        Nome = nome;
    }

    public void setRace(String race) {
        Race = race;
    }

    public void setProfissao(String profissao) {
        Profissao = profissao;
    }

    public void setMana(int mana) {
        Mana = mana;
    }

    public void setAtaque(int ataque) {
        Ataque = ataque;
    }

    public void setAtaque_Magico(int ataque_Magico) {
        Ataque_Magico = ataque_Magico;
    }

    public void setDefesa(int defesa) {
        Defesa = defesa;
    }

    public void setDefesa_Magica(int defesa_Magica) {
        Defesa_Magica = defesa_Magica;
    }

    public void setVelocidade(int velocidade) {
        Velocidade = velocidade;
    }

    public void setDestreza(int destreza) {
        Destreza = destreza;
    }

    public void setExp(int exp) {
        Exp = exp;
    }

    public void setNivel_Atual(int nivel_Atual) {
        Nivel_Atual = nivel_Atual;
    }

    public String getNome() {
        return Nome;
    }

    public String getRace() {
        return Race;
    }

    public String getProfissao() {
        return Profissao;
    }

    public int getMana() {
        return Mana;
    }

    public int getAtaque() {
        return Ataque;
    }

    public int getAtaque_Magico() {
        return Ataque_Magico;
    }

    public int getDefesa() {
        return Defesa;
    }

    public int getDefesa_Magica() {
        return Defesa_Magica;
    }

    public int getVelocidade() {
        return Velocidade;
    }

    public int getDestreza() {
        return Destreza;
    }

    public int getExp() {
        return Exp;
    }

    public int getNivel_Atual() {
        return Nivel_Atual;
    }


    /**
     * Método que transforma o personagem em uma String.
     *
     * @return String - personagem
     */
    @Override
    public String toString() {
        return "Personagem{" +
                "Nome='" + Nome + '\'' +
                ", Race='" + Race + '\'' +
                ", Profissao='" + Profissao + '\'' +
                ", Mana=" + Mana +
                ", Ataque=" + Ataque +
                ", Ataque Magico='" + Ataque_Magico + '\'' +
                ", Defesa='" + Defesa + '\'' +
                ", Defesa Magica='" + Defesa_Magica + '\'' +
                ", Velocidade='" + Velocidade + '\'' +
                ", Destreza='" + Destreza + '\'' +
                ", Experiencia='" + Exp + '\'' +
                ", Nivel Atual='" + Nivel_Atual + '\'' +
                '}';
    }
}
