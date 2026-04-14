package com.gustavo;

import javax.swing.JOptionPane;


public class Main {
    public static void main(String[] args) {

        String[] nomes = new String[5];
        int[] idades = new int[5];
        String[] emails = new String[5];

        int contador = 0;
        int opcao = 0;

        do{
            opcao = Integer.parseInt(JOptionPane.showInputDialog(
                    "---Menu--\n1- Cadastro pessoa\n2-Mostrar dados\n0-Sair"
            ));

            switch (opcao) {
                case 1:
                    if(contador < 5){
                        nomes[contador] = JOptionPane.showInputDialog("Digite o nome: ");

                        try{
                            idades[contador] = Integer.parseInt(JOptionPane.showInputDialog("Digite o idade: "));

                        }catch (Exception e){
                            JOptionPane.showMessageDialog(null, "Digite um valor valido");
                            break;
                        }

                        emails[contador] = JOptionPane.showInputDialog("Digite o email: ");
                        contador++;

                        JOptionPane.showMessageDialog(null, "Cadastro realizado com sucesso");
                    }else {
                        JOptionPane.showMessageDialog(null,"Limite de cadastros atingido!");
                    }
                    break;

                case 2:
                    String dados = "---Dados---";

                    if(contador == 0){
                        dados += "Nenhum cadastro realizado.";
                    }else{
                        for(int i = 0; i < contador; i++){
                            dados += "\nNome: " + nomes[i] +
                                    "\nIdade: " + idades[i] +
                                    "\nEmail: " + emails[i];
                            dados += "\n----------------------\n";

                        }
                    }
                    JOptionPane.showMessageDialog(null, dados);

                    break;
                case 0:
                    JOptionPane.showMessageDialog(null,"Saindo...");
                    break;

                default:
                    JOptionPane.showMessageDialog(null, "Opção inválida");
            }

        }while (opcao != 0);

    }
}