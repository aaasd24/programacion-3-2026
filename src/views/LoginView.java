package views;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Image;

import javax.imageio.ImageIO;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.border.Border;

public class LoginView extends JPanel{
	public Color maronLeve = new Color(158, 118 , 79);
	public Color blancoIvory = new Color(244, 249 , 233);
	public Color grisGunmetal = new Color(53, 57 , 60);
	public Color rosaNeon = new Color(244, 0 , 118);
	public Color azulGlaous = new Color(119, 133, 172);
	 
	
	public LoginView() {
		

		Border emptyBorder = BorderFactory.createEmptyBorder(20,10,20,10);
		setBorder(emptyBorder);
		setLayout(new GridBagLayout());
		GridBagConstraints c = new GridBagConstraints();
		setBackground(azulGlaous);
		
		
		
		//crearLogo();
		//crearTexto();
		//crearTexto();
		//crearTexto("Ingrese su contraseña: ", 200, 350, 20);
		//crearTexto("Error, credenciales incorectas, ingrese su INE", 200, 275, 15);
		//crearTexto("Ingrese contraseña", 200, 430, 15);
		//crearEntradaDeDatos();
		//crearEntradaContrasenia();
		//Boton();
		
		JLabel label = new JLabel("Hola");
		label.setForeground(Color.black);
		label.setFont(new Font("Arial", Font.PLAIN, 20));
		this.add(label);
		
		JButton boton = new JButton("Button 1");
		c.fill = GridBagConstraints.HORIZONTAL;
		c.weightx = 0.5;
		c.gridx = 0;
		c.gridy = 0;
		this.add(boton, c);
		
	}
	
	
	
	
	
	
	public void crearTexto() {
		
		//add(label);
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
