import javax.swing.*;
import java.util.Scanner;

public class Autoatendimento {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Scanner scanner = new Scanner(System.in);
        //mensagem de boas vindas
        JOptionPane.showMessageDialog(null, "Seja bem vindo ao sistema " +
                "de autoatendimento da unip");

        Aluno aluno = new Aluno();
        //salvando o nome
        aluno.setNome(JOptionPane.showInputDialog(null, " Qual seu nome?"));
        //salvando ra
        aluno.setRa(Integer.valueOf(JOptionPane.showInputDialog(null, aluno.getNome() + " Digite os dois ultimos numeros do seu RA:")));
        int escolha = 0;
        if (aluno.getRa() >= 100) {
            JOptionPane.showMessageDialog(null, "Voce nao esta matriculado  na Unip.");
            //public static void guiarUsuario
        } else {
            // Array de opções de autoatendimento
            String[] opcoes = {
                    "- Consular seu andar.",
                    "- Consultar sua sala.",
                    "- Consultar sua aula de hoje",
                    "- Encerrar autoatendimento."
            };
            boolean opcaoValida = false;
            while (!opcaoValida) {
                // Exibindo opções de autoatendimento
                String mensagem = "Escolha uma opção:\n";
                for (int i = 0; i < opcoes.length; i++) {
                    mensagem += (i + 1) + ". " + opcoes[i] + "\n";
                }

                // Solicitando ao usuário que selecione uma opção
                String escolhaStr = JOptionPane.showInputDialog(null, mensagem + "\nDigite o número correspondente à sua escolha:");

                try {
                    escolha = Integer.parseInt(escolhaStr);
                    // Verificando se a escolha do usuário é válida
                    if (escolha >= 1 && escolha <= opcoes.length) {
                        JOptionPane.showMessageDialog(null, aluno.getNome() + " Pelo seu RA voce e estudante de Ciencia da Computacao " + " 2 Semestre, noturno  " +  opcoes[escolha - 1] );
                        //guiarUsuario(escolha); // Guia o usuário para uma mensagem correspondente à opção escolhida
                        opcaoValida = true; // Indica que a opção selecionada é válida e sai do loop
                    } else {
                        JOptionPane.showMessageDialog(null, aluno.getNome() + "Opção inválida. Por favor, escolha um número entre 1 e " + opcoes.length + ".");
                    }
                } catch (NumberFormatException e) {
                    JOptionPane.showMessageDialog(null, aluno.getNome() +  "Opção inválida. Por favor, digite um número válido.");
                }
            }
            // public static void guiarUsuario
        }

        //(int escolha) {
        switch (escolha) {
            case 1:
                if (aluno.getRa() <= 25) {
                    JOptionPane.showMessageDialog(null, aluno.getNome() + " Seu andar e o 1");
                } else if (aluno.getRa() <= 50) {
                    JOptionPane.showMessageDialog(null, aluno.getNome() + " Seu andar e o 2");
                } else if (aluno.getRa() <= 75) {
                    JOptionPane.showMessageDialog(null, aluno.getNome() + " Seu andar e o 3");
                } else if (aluno.getRa() <= 99) {
                    JOptionPane.showMessageDialog(null, aluno.getNome() + " Seu andar e o 4");
                } else {
                    JOptionPane.showMessageDialog(null, aluno.getNome() + " Voce nao esta matriculado nesta unidade da unip.");
                }
                
                break;
            case 2:
                if (aluno.getRa() <= 25) {
                    int sala = (int) (Math.random() * 100) + 10;
                    JOptionPane.showMessageDialog(null, aluno.getNome()  + " Sua sala é a " + sala);

                } else if (aluno.getRa() <= 50) {
                    int sala = (int) (Math.random() * 200) + 10;
                    JOptionPane.showMessageDialog(null, aluno.getNome()  + " Sua sala é a " + sala);
                } else if (aluno.getRa() <= 75) {
                    int sala = (int) (Math.random() * 300) + 10;
                    JOptionPane.showMessageDialog(null, aluno.getNome()  + " Sua sala é a " + sala);
                } else if (aluno.getRa() <= 99) {
                    int sala = (int) (Math.random() * 400) + 10;
                    JOptionPane.showMessageDialog(null, aluno.getNome()  + " Sua sala é a " + sala);
                } else {
                    break;
                }

                break;
            case 3:
                if (aluno.getRa() <= 25) {
                    JOptionPane.showMessageDialog(null, aluno.getNome() +  " Segunda-feira: Java teoria. "
                            + " Terca-feira: Banco de dados " +
                            " Quarta- feira: Java Pratica " + " Quinta-feira: Orientacao a objeto. "
                            + "Sexta-feira: AVA" );
                } else if (aluno.getRa() <= 50) {
                    JOptionPane.showMessageDialog(null, aluno.getNome() + " Segunda-feira: Java teoria. " +
                            " Terca-feira: Banco de dados" + " Quarta- feira: Java Pratica " +
                            " Quinta-feira: Orientacao a objeto. " + " Sexta-feira: AVA");
                } else if (aluno.getRa() <= 75) {
                    JOptionPane.showMessageDialog(null, aluno.getNome() + " Segunda-feira: Java teoria." +
                            " Terca-feira: Banco de dados" + " Quarta- feira: Java Pratica " + " Quinta-feira:" +
                            " Orientacao a objeto. " + " Sexta-feira: AVA");
                } else if (aluno.getRa() <= 99) {
                    JOptionPane.showMessageDialog(null, aluno.getNome() + " Segunda-feira: Java teoria. " +
                            " Terca-feira: Banco de dados " + " Quarta- feira: Java Pratica " +
                            " Quinta-feira: Orientacao a objeto. " + " Sexta-feira: AVA");
                } else {
                    JOptionPane.showMessageDialog(null, aluno.getNome() + " Voce nao esta matriculado " +
                            "nesta unidade da unip.");
                    break;
                }



        }
    }
}










