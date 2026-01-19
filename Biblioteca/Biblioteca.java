package biblioteca;

import javax.swing.JOptionPane;

public class Biblioteca {
    public static void main(String[] args) {
        //instanciando os objetos 
        Livro l1 = new Livro("it a coisa", "Stephen King");
        Livro l2 = new Livro("48 leis do poder", "Robert Greene");
        Livro l3 = new Livro("Moby Dick", "Herman Melville");
        Livro l4 = new Livro("Dom Quixote", "Miguel de Cervantes");
        Livro l5 = new Livro("Romeu e Julieta", "William Shakespear");
        Livro l6 = new Livro("A arte da Guerra", "Sun Tzu");
        Livro l7 = new Livro("Orgulho e preconceito", "Jane Austen");
        Livro l8 = new Livro("Guerra e paz", "Leon Tolstói");
    

        int continuar;
            //Prompt pra armazenar o livro desejado na variável "livro"
        do {
            String livro = JOptionPane.showInputDialog(
                null,
                "Qual livro você deseja consultar?"
            );

            // se clicar em cancelar
            if (livro == null) {
                break;
            }

            Livro livroSelecionado = null;
            //atribuindo valores através de condição
            if (livro.equalsIgnoreCase("it a coisa")) {
                livroSelecionado = l1;
            }
            else if (livro.equalsIgnoreCase("48 leis do poder")) {
                livroSelecionado = l2;
            }
            else if (livro.equalsIgnoreCase("Moby Dick")) {
                livroSelecionado = l3;
            }
            else if(livro.equalsIgnoreCase("Dom Quixote")){
                livroSelecionado = l4;
            }
            else if(livro.equalsIgnoreCase("Romeu e Julieta")){
                livroSelecionado = l5;
            }
            else if(livro.equalsIgnoreCase("A arte da Guerra")){
                livroSelecionado = l6;
            }
            else if(livro.equalsIgnoreCase("Orgulho e preconceito")){
                livroSelecionado = l7;
            }
            else if(livro.equalsIgnoreCase("Guerra e paz")){
                livroSelecionado = l8;
            }

            if (livroSelecionado != null) {
            //Mostra status do livro escolhido
                livroSelecionado.Status();
            //promp pra emprestar o livro se estiver disponível
                if (!livroSelecionado.isEmprestado()) {
                    int opcao = JOptionPane.showConfirmDialog(
                        null,
                        "O livro está disponível.\nDeseja emprestar?",
                        "Empréstimo",
                        JOptionPane.YES_NO_OPTION
                    );
                    //condição que muda o status do livro selecionado pra emprestado se a opção foi "sim"
                    if (opcao == JOptionPane.YES_OPTION) {
                        livroSelecionado.emprestar();
                    }
                    //Final da condição se o livro estiver indisponível
                } else {
                    JOptionPane.showMessageDialog(
                        null,
                        "Este livro já está emprestado."
                    );
                }
                //Mostra o status do livro
                livroSelecionado.Status();
                //Condição pra se o livro procurado não for encontrado ou não existe 
            } else {
                JOptionPane.showMessageDialog(null, "Livro não encontrado.");
            }
             //Prompt pra dar a opção de manter o código rodando ou não   
            continuar = JOptionPane.showConfirmDialog(
                null,
                "Deseja consultar outro livro?",
                "Continuar",
                JOptionPane.YES_NO_OPTION
            );
            //Mantém o código rodando pra ter um "banco de dados" temporário. Termina quando o código para de rodar
        } while (continuar == JOptionPane.YES_OPTION);
    }
}
