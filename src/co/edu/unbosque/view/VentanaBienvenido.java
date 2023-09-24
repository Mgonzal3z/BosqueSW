package co.edu.unbosque.view;

import java.awt.Dimension;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
/**
 * Clase VentanaBienvenido que extiende de JFrame y corresponde a la ventana del inicio del programa
 * @author Andres Felipe Carbonell Amaya, Luis Hernando Martinez Poveda
 * @serial 2021
 */
public class VentanaBienvenido extends JFrame {

	private ImageIcon ImagenBienvenida;// imagen de fondo de la ventana Bienvenido
	private JLabel bienvenida; // Atributo Jlabel que contiene la imagen de fondo
	private JButton bt_BaseDeDatos; // Boton para entrar a la ventana base de datos
	private JButton bt_AñadirEmpleado;// Boton para entrar a la ventana a�adir Empleado
	private JButton bt_salir; // Boton para salir del programa
	private int ancho; // Atributo que contiene el ancho de la pantalla
	private int alto;// Atributo que contiene el alto de la pantalla

	/**
	 * Clase que corresponde al constructor de la VentanaBienvenido y inicializa todos sus componentes
	 */
	public VentanaBienvenido() {

		setIconImage(new ImageIcon(getClass().getResource("/Imagen/logo.png")).getImage());
		setTitle("BosqueSW");
		ancho = java.awt.Toolkit.getDefaultToolkit().getScreenSize().width;
		alto = java.awt.Toolkit.getDefaultToolkit().getScreenSize().height;
		setLayout(null);
		setSize(533, 460);
		setLocation((int) (ancho / 3.2), (int) (alto / 4.5));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		Botones();

		Dimension tam = getSize();
		ImagenBienvenida = new ImageIcon(getClass().getResource("/Imagen/bienvenida2.jpeg"));
		bienvenida = new JLabel(ImagenBienvenida);
		bienvenida.setBounds(0, 0, tam.width, tam.height);

		add(bienvenida);

		setResizable(false);
		setVisible(true);
	}
/**
 * metodo botones tipo void que define y agrega los botones 
 */
	public void Botones() {

		bt_BaseDeDatos = new JButton("Base De Datos Empleados");
		bt_BaseDeDatos.setActionCommand("BASEDEDATOS");
		bt_BaseDeDatos.setBounds(80, 200, 200, 30);
		bt_BaseDeDatos.setVisible(true);
		add(bt_BaseDeDatos);

		bt_AñadirEmpleado = new JButton("Añadir Empleado");
		bt_AñadirEmpleado.setActionCommand("AÑADIREMPLEADO");
		bt_AñadirEmpleado.setBounds(80, 240, 200, 30);
		bt_AñadirEmpleado.setVisible(true);
		add(bt_AñadirEmpleado);

		bt_salir = new JButton("Salir");
		bt_salir.setActionCommand("SALIR");
		bt_salir.setBounds(80, 280, 200, 30);
		bt_salir.setVisible(true);
		add(bt_salir);

	}
/**
 * Metodo que permite acceder al atributo Bt_BaseDeDatos, se usa para agregarle su respectivo ActionListener
 * @return bt_BaseDeDatos
 */
	public JButton getBt_BaseDeDatos() {
		return bt_BaseDeDatos;
	}
/**
 * setter del boton BaseDeDatos
 * @param bt_BaseDeDatos
 */
	public void setBt_BaseDeDatos(JButton bt_BaseDeDatos) {
		this.bt_BaseDeDatos = bt_BaseDeDatos;
	}
	/**
	 * Metodo que permite acceder al atributo Bt_A�adirEmpleado, se usa para agrgarle su respectivo ActionListener
	 * @return bt_A�adirEmpleado
	 */
	public JButton getBt_AñadirEmpleado() {
		return bt_AñadirEmpleado;
	}
	/**
	 * setter del boton A�adirEmpleado
	 * @param bt_A�adirEmpleado
	 */
	public void setBt_AñadirEmpleado(JButton bt_AñadirEmpleado) {
		this.bt_AñadirEmpleado = bt_AñadirEmpleado;
	}
	/**
	 * Metodo que permite acceder al atributo Bt_salir, se usa para agrgarle su respectivo ActionListener
	 * @return bt_salir
	 */
	public JButton getBt_salir() {
		return bt_salir;
	}
	/**
	 * setter del boton Salir
	 * @param bt_salir
	 */
	public void setBt_salir(JButton bt_salir) {
		this.bt_salir = bt_salir;
	}

}
