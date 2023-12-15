package testezin.View;

import javax.swing.*;
import java.awt.*;

public class PartidaView {
    JFrame frame;
    JPanel jdv2;
    PartidaView(){
        frame = new JFrame("Jogo da Velha 2");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        jdv2 = new JPanel();
        jdv2.setLayout(new GridLayout(3, 3));
        jdv2.setBorder(BorderFactory.createEmptyBorder(6, 6, 6, 6));

        // Criando instâncias da classe pai e adicionando ao GridLayout 9x9
//        for (int i = 0; i < 3; i++) {
//            for (int j = 0; j < 3; j++) {
//                jdv2.add(jogo[i][j].getPanel());
//            }
//        }

        frame.add(jdv2, BorderLayout.CENTER);
        frame.setSize(600, 600);
        frame.setVisible(true);
    }
}
