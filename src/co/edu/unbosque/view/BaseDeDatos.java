package co.edu.unbosque.view;

import java.awt.Color;
import java.awt.List;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;

/**
 * Clase BaseDeDatos que extiende de JFrame y corresponde a la ventana donde se
 * muestra la base de datos de los empleados
 * 
 * @author Jinetes del apocalipsis
 * @version 5.0
 * @serial 2021
 */
public class BaseDeDatos extends JFrame {

	private PanelSeleccion pseleccion;// Panel que contendra la seleccion de dicha base de datos
	private PanelResultados2 pdatosblanco2;// Panel que contiene los datos de una tabla Salario fijo de empleados
	private PanelResultados pdatosblanco;// Panel que contiene los datos de la tabla comision de empleados

	private int ancho;// Atributo que contiene el ancho de la pantalla
	private int alto;// Atributo que contiene el alto de la pantalla

	// private List mensaje;

	private JButton bt_Regresar; // Boton para regresar a la Ventana principal o VentanaBienvenido

	/**
	 * Clase que corresponde al constructor de la Ventana BaseDeDatos e inicializa
	 * todos sus componentes
	 */
	public BaseDeDatos() {

		setTitle("Base De Datos");
		setSize(1560, 550);
		getContentPane().setLayout(null);
		setIconImage(new ImageIcon(getClass().getResource("/Imagen/logo.png")).getImage());
		ancho = java.awt.Toolkit.getDefaultToolkit().getScreenSize().width;
		alto = java.awt.Toolkit.getDefaultToolkit().getScreenSize().height;
		setLocation((int) (ancho / 500), (int) (alto / 6));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		MenuInformacion();

		setResizable(false);
		setVisible(false);

	}

	/**
	 * Metodo MenuInformacion de tipo void que establece las coordenadas de cada
	 * panel y los agrega a la ventana BaseDeDatos
	 */
	public void MenuInformacion() {

		pseleccion = new PanelSeleccion();
		pseleccion.setBounds(0, 0, 1544, 40);
		getContentPane().add(pseleccion);

		pdatosblanco = new PanelResultados();
		pdatosblanco.setBounds(0, 40, 1544, 430);
		getContentPane().add(pdatosblanco);

		pdatosblanco2 = new PanelResultados2();
		pdatosblanco2.setBounds(0, 40, 1544, 400);
		getContentPane().add(pdatosblanco2);

		bt_Regresar = new JButton("Regresar");
		bt_Regresar.setActionCommand("REGRESAR");
		bt_Regresar.setBounds(20, 475, 100, 30);
		bt_Regresar.setVisible(true);
		add(bt_Regresar);

	}

	/**
	 * Metodo que permite acceder al atributo Bt_Regresar, se usa para agregarle
	 * su respectivo ActionListener
	 * 
	 * @return bt_Regresar
	 */
	public JButton getBt_Regresar() {
		return bt_Regresar;
	}
	/**
	 * setter del boton bt_Regresar
	 * @param bt_Regresar
	 */
	public void setBt_Regresar(JButton bt_Regresar) {
		this.bt_Regresar = bt_Regresar;
	}
/**
 * Metodo que permite acceder al panel Pseleccion
 * @return pseleccion
 */
	public PanelSeleccion getPseleccion() {
		return pseleccion;
	}
/**
 * Metodo que permite modificar el panel Pseleccion
 * @param pseleccion
 */
	public void setPseleccion(PanelSeleccion pseleccion) {
		this.pseleccion = pseleccion;
	}
	/**
	 * Metodo que permite acceder al panel Pdatosblanco2
	 * @return pdatosblanco2
	 */
	public PanelResultados2 getPdatosblanco2() {
		return pdatosblanco2;
	}
/**
 * Metodo que permite modificar el panel padatosblanco2
 * @param pdatosblanco2 the pdatosblanco2 to set
 */
	public void setPdatosblanco2(PanelResultados2 pdatosblanco2) {
		this.pdatosblanco2 = pdatosblanco2;
	}
	/**
	 * Metodo que permite acceder al panel Pdatosblanco
	 * @return pdatosblanco
	 */
	public PanelResultados getPdatosblanco() {
		return pdatosblanco;
	}
	/**
	 * Metodo que permite modificar el panel padatosblanco
	 * @param pdatosblanco the pdatosblanco to set
	 */
	public void setPdatosblanco(PanelResultados pdatosblanco) {
		this.pdatosblanco = pdatosblanco;
	}

}
