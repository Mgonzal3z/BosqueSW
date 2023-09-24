package co.edu.unbosque.view;

import java.awt.Color;
import java.awt.FlowLayout;

import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 * Clase PanelSeleccion que extiende Jpanel y corresponde al panel 
 * de seleccion
 * 
 * @author Jinetes del apocalipsis
 * @version 5.0
 * @serial 2021
 *
 */
public class PanelSeleccion extends JPanel {
	
	private JLabel opciones;// JLabel que muestra un pequeño texto el cual es opciones
	private JComboBox<String> menu_personal;//// JComboBox que corresponde a las caracteristicas del tipo de personal 
	
	/**
	 * Clase que corresponde al constructor del PanelSeleccion e
	 * inicializa todos sus componentes, establece las coordenadas del panel
	 * y las agrega a PanelSeleccion
	 */
	public PanelSeleccion() {
		setLayout(new FlowLayout());
		funcionar();
		setBackground(new Color(159,213,209));
	}
	
	/**
	 *Metodo funcionar de tipo void que establece el JLable y el JComboBox
	 *y los agrega a PanelSeleccion	 
	 */
	
	public void funcionar() {
		
		opciones = new JLabel("Personal");
		add(opciones);
		
		menu_personal =  new JComboBox<String>();
		menu_personal.addItem("Comision");
		menu_personal.addItem("Salario Fijo");
		menu_personal.setActionCommand("OPCIONES");
		add(menu_personal);
		
	}
	
	/**
	 * Metodo que permite acceder al texto Opciones
	 * 
	 * @return opciones
	 */

	public JLabel getOpciones() {
		return opciones;
	}

	/**
	 * setter del texto Opciones
	 * 
	 * @param opciones the opciones to set
	 */
	public void setOpciones(JLabel opciones) {
		this.opciones = opciones;
	}
	
	/**
	 * Metodo que permite acceder al atributo menu_personal dentro de un
	 * cuadro de lista 
	 * 
	 * @return Menu_personal
	 */

	public JComboBox<String> getMenu_personal() {
		return menu_personal;
	}

	/**
	 *Meotod que permite modificar el atributo menu_personal dentro de un
	 *cuadro de lista
	 *
	 * 
	 * @param menu_personal the menu_personal to set
	 */
	public void setMenu_personal(JComboBox<String> menu_personal) {
		this.menu_personal = menu_personal;
	}

}