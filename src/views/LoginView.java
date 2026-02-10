package views;
import java.awt.Color;
import java.awt.Font;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class LoginView extends JPanel{
	public LoginView() {
		crearTexto();
		//crearEntradaDeDatos();
		//crearEntradaContrasenia();

		
	}
	public void crearTexto() {
		JLabel label = new JLabel("Bienvenido a Steak");
		label.setForeground(Color.WHITE);
		label.setFont(new Font("Arial", Font.PLAIN, 30));
		label.setBounds(100, 0, 100, 100);
		add(label);
	}
	
	public void crearEntradaDeDatos() {
		JTextField textoInicioCuenta = new JTextField();
		textoInicioCuenta.setForeground(Color.BLACK);
		textoInicioCuenta.setFont(new Font("Arial", Font.PLAIN, 30));
		textoInicioCuenta.setBounds(100, 100, 150, 100);
		add(textoInicioCuenta);
	}
	
	public void crearEntradaContrasenia() {
		JPasswordField contra = new JPasswordField();
		contra.setFont(new Font("Arial", Font.PLAIN, 30));
		setBounds(50, 100, 170, 100);
		add(contra);
		
	}
}
