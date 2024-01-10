import java.util.ArrayList;

public class Main {
    String nome;
    int idade;
    protected double salary; //o protected protege o acesso fora do pacote (pasta)
    static String nome2;

    public static void main(String[] args) {
       Ser meuSer = new Pessoa ("Vitoria", 20, "Aparecida");
       meuSer.setNome("Vitoria");
       System.out.println(meuSer.saudacao());

        Ser meuSerAnimal = new Gatinho ("Frederico", 5, "Silva");
        meuSerAnimal.setNome("Frederico");
        System.out.println(meuSerAnimal.saudacao());
//      TIPOS PRIMITIVOS PARA INTEIROS:
//      byte - 8 bits
//      short - 16 bits
//      int - 32 bits
//      long - 64 bits
//      byte idade = 10;
//      char letra = 'v'; //o char é apenas 1 caracter

//      OUTROS TIPOS DE VARIAVEIS:
//      String nome = "Vitoria";//não é um tipo primitivo e sim uma classe
//      double idade = 22.50;
//      float salario = 22.50f;
//      var idadeVar = 10;

//      CONDICIONAIS
//      if (idade > 22.60) {
//          System.out.println("maior");
//      } else if (idade == 22.60) {
//          System.out.println("Igual");
//      } else {
//          System.out.println("menor");
//      }

//      ARRAYS FIXOS (VETORES)
//      int[] idades = new int[10];
//      String[] nomes = new String[10];
//      boolean[] saobrasileiros = new boolean[10];
//      idades[0] = 1;

//      ARRAYS DINAMICOS (LISTAS)
//      ArrayList<Integer> idades = new ArrayList<Integer>();
//      idades.add(22);
//      idades.add(30);
//      idades.remove(0);
//      int resultado = idades.get(0);
//      int tamanho = idades.size();
//      System.out.println(resultado);
//      System.out.println(tamanho);

//     ESTRUTURAS DE REPETIÇÃO
//     for (var i = 1; i<11; i++){
//         System.out.println(i);
//     }
//     int i = 0;
//     while (i<5){
//         System.out.println(i);
//         i++;
//     }

//     CASTING
//     int idade1 = 22;
//     double idade2 = idade1;
//     idade1 = (int) idade2; //transformando double em int
//     char letra = 'a';
//     String nome = String.valueOf(letra); //transformando char em string
//     letra = nome.charAt(0); //transformando string em char
//     String nome2 = String.valueOf(idade1); //transformando int em string
//     idade1 = Integer.parseInt(nome2); //transformando string em int
//        // (nem sempre irá dar certo, pois se for um nome, é impossivel transformar em numero)
    }

    //    CONSTRUTORES
//    public Main(String nome, int idade){
//        this.nome = nome;
//        this.idade = idade;
//    }
//
////    CLASSES E OBJETOS
////    static void teste(){}
////    void declaraNome(){
////        System.out.println(nome2);
////        nome = "Fernanda";
////        Main.teste();
////
////        Main meuMain = new Main();
////        meuMain.declaraNome();
////    }
////    String getNome(){
////        return nome;
////    }
//}
    private void updateSalary() {
        this.salary = 4000;
    }

    public double getSalary() {
        this.updateSalary();
        return this.salary;
    }
}

//      class Pessoa{
//        void criaMain(){
//            Main meuMain = new Main("Vitoria",20);
//        }
