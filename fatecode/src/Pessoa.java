public class Pessoa {
    private String nome;
    private String cpf;
    private String rg;
    private String tituloEleitor;
    private double peso;
    private double altura;
    private int numeroSapato;
    private int tamanhoCalca;
    private int tamanhaCamisa;

    private Pessoa nomePai;
    private Pessoa nomeMae;

    public Pessoa(){
        nomePai = new Pessoa();
        nomeMae = new Pessoa();

    }
    public String getNomePai() {
        return nomePai.getNome();
    }

    public void setNomePai(String nome) {
        this.nomePai.setNome(nome);
    }

    public Pessoa getNomeMae() {
        return nomeMae;
    }

    public void setNomeMae(Pessoa nomeMae) {
        this.nomeMae = nomeMae;
    }

   public static void main(String[] args) {
	   Pessoa p = new Pessoa();
	   p.setNomePai("joão");
   }



    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public int getNumeroSapato() {
        return numeroSapato;
    }

    public void setNumeroSapato(int numeroSapato) {
        this.numeroSapato = numeroSapato;
    }

    public int getTamanhoCalca() {
        return tamanhoCalca;
    }

    public void setTamanhoCalca(int tamanhoCalca) {
        this.tamanhoCalca = tamanhoCalca;
    }

    public int getTamanhaCamisa() {
        return tamanhaCamisa;
    }

    public void setTamanhaCamisa(int tamanhaCamisa) {
        this.tamanhaCamisa = tamanhaCamisa;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public String getTituloEleitor() {
        return tituloEleitor;
    }

    public void setTituloEleitor(String tituloEleitor) {
        this.tituloEleitor = tituloEleitor;
    }
    
}
