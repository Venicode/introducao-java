public class Gatinho extends Ser{
    String nomeDono;
    public Gatinho(String nome, int idade, String nomeDono) {
        super(nome, idade);
        this.nomeDono = nomeDono;
    }

    @Override
    public String saudacao(){
        return "Miau miau";
    }
}
