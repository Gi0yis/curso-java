import com.formdev.flatlaf.FlatDarculaLaf;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class Forma extends JFrame {
    private JPanel panelPrincipal;
    private JTextField compoTexto;
    private JLabel replicadorLabel;

    public Forma() {
        inizializarForma();
//        compoTexto.addActionListener(e -> {
//            replicarTexto();
//        });
        compoTexto.addKeyListener(new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent e) {
                super.keyTyped(e);
                replicarTexto();
            }
        });
    }

    private void inizializarForma() {
        setContentPane(panelPrincipal);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(600, 400);
        setLocationRelativeTo(null); // Centrar la ventana
    }

    private void replicarTexto() {
        this.replicadorLabel.setText(this.compoTexto.getText());
    }

    public static void main(String[] args) {
        FlatDarculaLaf.setup(); // Cambiar look and feel a modo oscuro
        Forma forma = new Forma();
        forma.setVisible(true);
    }
}
