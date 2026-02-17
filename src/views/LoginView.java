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
	public Color maronLeve = new Color(158, 118 , 79);
	public Color blancoIvory = new Color(244, 249 , 233);
	public Color grisGunmetal = new Color(53, 57 , 60);
	public Color rosaNeon = new Color(244, 0 , 118);
	public Color azulGlaous = new Color(119, 133, 172);
	 
	
	public LoginView() {
		setLayout(null); // sin esto nuestras coordenadas seran ignoradas we
		crearLogo();
		crearTexto("Bienvenido a Steak Games!", 200, 150, 30);
		crearTexto("Ingrese su correo electronico: ", 200, 210, 20);
		crearTexto("Ingrese su contraseña: ", 200, 350, 20);
		crearTexto("Error, credenciales incorectas, ingrese su INE", 200, 275, 15);
		crearTexto("Ingrese contraseña", 200, 430, 15);
		crearEntradaDeDatos();
		crearEntradaContrasenia();
		Boton();

		
	}
	public void crearTexto(String texto, int x, int y, int tamanioLetra) {
		JLabel label = new JLabel(texto);
		label.setForeground(Color.WHITE);
		label.setFont(new Font("Arial", Font.PLAIN, tamanioLetra));
		label.setBounds(x, y, 400, 50);
		add(label);
	}
	public void crearEntradaDeDatos() {
		JTextField textoInicioCuenta = new JTextField();
		textoInicioCuenta.setForeground(Color.BLACK);
		textoInicioCuenta.setFont(new Font("Arial", Font.PLAIN, 30));
		textoInicioCuenta.setBounds(200, 250, 400, 40);
		add(textoInicioCuenta);
	}
	
	public void crearEntradaContrasenia() {
		JPasswordField contra = new JPasswordField();
		contra.setFont(new Font("Arial", Font.PLAIN, 30));
		contra.setBounds(200, 400, 400, 40);
		add(contra);
	}
	public void Boton() {
			setBackground(maronLeve);
			JButton boton = new JButton("Iniciar sesion"); // Se crea el objeto boton de la librerias swim
			boton.setBackground(azulGlaous);
			boton.setForeground(Color.WHITE);
			boton.setBounds(270, 500, 250, 50); //Ubica y establce tamaño de boton
			
			/*try {
				Image icono = ImageIO.read(getClass().getResource("../img/icono.png"));
				icono = icono.getScaledInstance(100, 100, Image.SCALE_SMOOTH);
				boton.setIcon(new ImageIcon(icono));
			}catch(Exception ex) {
				System.out.println("NO se encuentra imagen");
			}*/
			
			add(boton); //Agrega el boton
		
	}
	
	public void crearLogo() {
	    try {
	        Image img = ImageIO.read(getClass().getResource("../img/SteakGames.png"));
	        Image imgEscalada = img.getScaledInstance(150, 150, Image.SCALE_SMOOTH);
	        JLabel labelLogo = new JLabel(new ImageIcon(imgEscalada));
	        labelLogo.setBounds(300, 0, 150, 150); 
	        add(labelLogo);
	        
	    } catch (Exception ex) {
	        System.out.println("No se encuentra la imagen");
	    }
	}
}
