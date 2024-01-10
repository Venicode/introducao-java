
public class Pessoa extends Ser{
    String sobrenome;
    void criarMain() {
        Main meuMain = new Main();
        System.out.println(meuMain.getSalary());
        this.idade = 20;

    }
    public Pessoa(String nome, int idade, String sobrenome){
        super(nome,idade);
        this.sobrenome = sobrenome;
    }
    @Override
    public String saudacao(){
        return "Ola, meu nome e " + this.nome;
    }
}