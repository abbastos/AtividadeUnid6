/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AtividadeUnid6;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;

/**
 *
 * @author AdrianoBenelliBastos
 */
public class AtividadeUnid6Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        JFrame janelaPrincipal = new JFrame("RadioButtons");
        janelaPrincipal.setDefaultCloseOperation(3);
        janelaPrincipal.setLayout(null);
        janelaPrincipal.setVisible(true);
        janelaPrincipal.setBounds(750, 300, 400, 200);

        JLabel lblNotificacao = new JLabel("Você está na aula de programação:");
        lblNotificacao.setBounds(10, 20, 250, 20);
        janelaPrincipal.add(lblNotificacao);

        JLabel lblJavaSwing = new JLabel("Java Swing");
        lblJavaSwing.setBounds(30, 50, 100, 20);
        janelaPrincipal.add(lblJavaSwing);

        JLabel lblOtherLanguage = new JLabel("Outra Linguagem");
        lblOtherLanguage.setBounds(150, 50, 100, 20);
        janelaPrincipal.add(lblOtherLanguage);

        JRadioButton rdbJavaSwing = new JRadioButton();
        rdbJavaSwing.setBounds(10, 50, 20, 20);
        janelaPrincipal.add(rdbJavaSwing);

        JRadioButton rdbOtherLanguage = new JRadioButton();
        rdbOtherLanguage.setBounds(125, 50, 20, 20);
        janelaPrincipal.add(rdbOtherLanguage);

        JButton btnClick = new JButton("Click");
        btnClick.setBounds(150, 110, 100, 30);
        janelaPrincipal.add(btnClick);

        ButtonGroup grupoRdb = new ButtonGroup();
        grupoRdb.add(rdbJavaSwing);
        grupoRdb.add(rdbOtherLanguage);

        btnClick.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                if (rdbJavaSwing.isSelected()) {
                    JOptionPane.showMessageDialog(null, "Java Swing");
                } else if (rdbOtherLanguage.isSelected()) {
                    JOptionPane.showMessageDialog(null, "Outra Linguagem...Tem certeza?");
                } else {
                    JOptionPane.showMessageDialog(null, "Você não selecionou nada");
                }

            }
        });

    }

}
