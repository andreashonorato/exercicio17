

package com.mycompany.exercicio17;

import javax.swing.JOptionPane;
public class Exercicio17 {

    public static void main(String[] args) {
        String[] opcoes = {"Engenheiro", "Medico", "Programador", "Advogado", "Designer"};
    
    int escolha = JOptionPane.showOptionDialog(null,
            "escolha a profissão de Pedro:", "profissão de Pedro",
            JOptionPane.DEFAULT_OPTION,
            JOptionPane.INFORMATION_MESSAGE,
            null, opcoes, opcoes[0]
    );
    
    String profissao;
    
    profissao = switch (escolha) {
            case 0 -> "engenheiro";
            case 1 -> "medico";
            case 2 -> "programador";
            case 3 -> "designer";
            default -> "Desempregado";
        };
    JOptionPane.showMessageDialog(null, "Pedro é " + profissao + ".");
    
}
}
