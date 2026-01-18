package biblioteca;

import javax.swing.JOptionPane;

public class Biblioteca {
    public static void main(String[] args) {

        Livro l1 = new Livro("it a coisa", "Stephen King");
        Livro l2 = new Livro("48 leis do poder", "Robert Greene");
        Livro l3 = new Livro("o principe", "Nicolau Maquiavel");

        int continuar;

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

            if (livro.equalsIgnoreCase("it a coisa")) {
                livroSelecionado = l1;
            }
            else if (livro.equalsIgnoreCase("48 leis do poder")) {
                livroSelecionado = l2;
            }
            else if (livro.equalsIgnoreCase("o principe")) {
                livroSelecionado = l3;
            }

            if (livroSelecionado != null) {

                livroSelecionado.Status();

                if (!livroSelecionado.isEmprestado()) {
                    int opcao = JOptionPane.showConfirmDialog(
                        null,
                        "O livro está disponível.\nDeseja emprestar?",
                        "Empréstimo",
                        JOptionPane.YES_NO_OPTION
                    );

                    if (opcao == JOptionPane.YES_OPTION) {
                        livroSelecionado.emprestar();
                    }

                } else {
                    JOptionPane.showMessageDialog(
                        null,
                        "Este livro já está emprestado."
                    );
                }

                livroSelecionado.Status();

            } else {
                JOptionPane.showMessageDialog(null, "Livro não encontrado.");
            }

            continuar = JOptionPane.showConfirmDialog(
                null,
                "Deseja consultar outro livro?",
                "Continuar",
                JOptionPane.YES_NO_OPTION
            );

        } while (continuar == JOptionPane.YES_OPTION);
    }
}
