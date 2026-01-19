package biblioteca;
public class Usuario {        //encapsulamento
    private String nome;
    //Método construtor
    public Usuario(String nome){
        this.nome = nome;
    }
    //Método get
    public String getNome(){
        return nome;
    }
}
