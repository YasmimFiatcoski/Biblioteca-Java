package biblioteca;
import javax.swing.JOptionPane;
public class Livro {        //encapsulamento
    private String titulo;
    private String autor;
    private boolean emprestado;
    //método construtor
    public Livro(String titulo, String autor){
        this.titulo = titulo;
        this.autor = autor;
        this.emprestado = false;
    }
    //metodos get e comandos
    public String getTitulo(){        
        return titulo;
    }
    public boolean isEmprestado(){
        return emprestado;
    }
    public void emprestar(){
        emprestado = true;
    }
    public void devolver(){
        emprestado = false;
    }
    @Override
    public String toString(){
        return titulo + " - " + autor;
    }
    public void Status(){
        //criando comando status com os dados do livro procurado
        String status = emprestado ? "Emprestado" : "Disponível";
        JOptionPane.showMessageDialog(null, "Livro: " + titulo + "\nAutor: " + autor + "\nStatus: " + status);
    }
}
