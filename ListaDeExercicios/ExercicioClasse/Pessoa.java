public class Pessoa {

    private  int idade; //encapsulamento é definir se é publico ou privado//
    private  String nome;
    private float altura;



    public int getIdade(){
      return idade;
  }
  public void setIdade (int idade){
        this.idade = idade;
  }


        public String getNome() {
            return nome;
        }
        public void setNome ( String nome){
        this.nome = nome;
        }

            public float getAltura() {
                return altura;
            }
            public void setAltura(float altura) {
            this.altura = altura;
            }

    //metodo construtor vazio
    public Pessoa(){

    }

    //metodo construtor cheio
    public Pessoa (String nome, int idade, float altura){
    this.idade = idade;
    this.nome = nome;
    this.altura = altura;
    }
}
