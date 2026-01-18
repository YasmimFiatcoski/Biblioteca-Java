package biblioteca;
import javax.swing.JOptionPane;
public class Livro {
    private String titulo;
    private String autor;
    private boolean emprestado;
    
    public Livro(String titulo, String autor){
        this.titulo = titulo;
        this.autor = autor;
        this.emprestado = false;
    }
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
        String status = emprestado ? "Emprestado" : "Disponível";
        JOptionPane.showMessageDialog(null, "Livro: " + titulo + "\nAutor: " + autor + "\nStatus: " + status);
    }
}
