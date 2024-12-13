import com.formdev.flatlaf.FlatDarculaLaf;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LoginForm extends JFrame {
    private JPanel panelPrincipal;
    private JTextField usuarioTexto;
    private JPasswordField passwordTexto;
    private JButton enviarBoton;

    public LoginForm() {
        inicializarForma();

        enviarBoton.addActionListener(e -> validar());
    }

    private void inicializarForma() {
        setContentPane(panelPrincipal);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(600, 400);
        setLocationRelativeTo(null); // centar ventana
    }

    private void validar() {
        // Leer los valores
        var usuario = this.usuarioTexto.getText();
        var password = new String(this.passwordTexto.getPassword()); // Convertir a String por que devuelve caracteres

        if ("root".equals(usuario) && "admin".equals(password))
            mostarMensaje("Datos correctos, biemvenido!");
        else if (!"root".equals(usuario) && !"admin".equals(password))
            mostarMensaje("Datos incorrectos, corregirlos!");
        else if ("root".equals(usuario))
            mostarMensaje("Password incorrecto, corregirlo!");
        else
            mostarMensaje("Usuario incorrecto, corregirlo!");
    }

    private void mostarMensaje(String mensaje) {
        JOptionPane.showMessageDialog(this, mensaje); // mostar mensaje
    }

    public static void main(String[] args) {
        FlatDarculaLaf.setup();
        LoginForm loginForm = new LoginForm();
        loginForm.setVisible(true);
    }
}
