package views;
import java.awt.Color;
import java.awt.Font;
import java.awt.Image;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class LoginView extends JPanel{
	public LoginView() {
		setLayout(null); // sin esto nuestras coordenadas seran ignoradas we
		crearLogo();
		crearTexto();
		crearEntradaDeDatos();
		crearEntradaContrasenia();
		Boton();

		
	}
	public void crearTexto() {
		JLabel label = new JLabel("Bienvenido a Steak!");
		label.setForeground(Color.WHITE);
		label.setFont(new Font("Arial", Font.PLAIN, 30));
		label.setBounds(240, 150, 400, 50);
		add(label);
	}
	
	public void crearEntradaDeDatos() {
		JTextField textoInicioCuenta = new JTextField();
		textoInicioCuenta.setForeground(Color.BLACK);
		textoInicioCuenta.setFont(new Font("Arial", Font.PLAIN, 30));
		textoInicioCuenta.setBounds(270, 250, 200, 40);
		add(textoInicioCuenta);
	}
	
	public void crearEntradaContrasenia() {
		JPasswordField contra = new JPasswordField();
		contra.setFont(new Font("Arial", Font.PLAIN, 30));
		contra.setBounds(270, 350, 200, 40);
		add(contra);
	}
	public void Boton() {
			setBackground(Color.BLUE);
			JButton boton = new JButton("mi boton"); // Se crea el objeto boton de la librerias swim
			boton.setBackground(Color.green);
			boton.setForeground(Color.BLACK);
			boton.setBounds(300, 500, 120, 50); //Ubica y establce tamaño de boton
			
			try {
				Image icono = ImageIO.read(getClass().getResource("../img/icono.png"));
				icono = icono.getScaledInstance(100, 100, Image.SCALE_SMOOTH);
				boton.setIcon(new ImageIcon(icono));
			}catch(Exception ex) {
				System.out.println("NO se encuentra imagen");
			}
			
			add(boton); //Agrega el boton
		
	}
	
	public void crearLogo() {
	    try {
	        Image img = ImageIO.read(getClass().getResource("src/img/SteakGames.png"));
	        Image imgEscalada = img.getScaledInstance(150, 150, Image.SCALE_SMOOTH);
	        JLabel labelLogo = new JLabel(new ImageIcon(imgEscalada));
	        labelLogo.setBounds(325, 30, 150, 150); 
	        add(labelLogo);
	        
	    } catch (Exception ex) {
	        System.out.println("No se encuentra la imagen");
	    }
	}
}
