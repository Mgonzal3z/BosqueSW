package co.edu.unbosque.view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.border.TitledBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableCellRenderer;

/**
 * Clase PanelResultados2 que extiende de JPanel y corresponde al 
 * panel de resultados
 * 
 * @author Jinetes del apocalipsis
 * @version 5.0
 * @serial 2021
 *
 */
public class PanelResultados2 extends JPanel {

	private JTextArea area_resultados;//// JTextArea que contiene el area donde los empleados van a estar
	private JTable tabla;// JTable que permite generar una tabla en el panel
	private String[] columnas = { "Cédula", "Nombres", "Apellidos", "Genero", "Fecha de nacimiento", "Telefono", "Correo electronico", "Dirección", "Año de ingreso", "Antiguedad", "Categoria","Salario"};
	private DefaultTableModel tableModel;//Arreglo de tipo String con los valores que presenta cada empleado

	
	/**
	 * Clase que corresponde al constructor del panel PanelResultados e
	 * inicializa todos sus componentes, establece los datos del arreglo 
	 * para implementarlos en el JTable y los agrega a PanelResultados
	 */
	
	public PanelResultados2() {
		
		setBorder(new TitledBorder("Registro del personal"));
		tableModel = new DefaultTableModel(columnas, 0);
        
		JTable tabla = new JTable(tableModel){
			public boolean isCellEditable(int datos, int columnas) {
				return false;
			}

			public Component prepareRenderer(TableCellRenderer r, int datos, int columnas) {
				Component c = super.prepareRenderer(r, datos, columnas);
				if (datos % 2 == 0)
					c.setBackground(Color.white);
				else
					c.setBackground(Color.LIGHT_GRAY);

				if (isCellSelected(datos, columnas))
					c.setBackground(new Color(159,213,209));
				return c;
			}
		};
				
		add(tabla.getTableHeader(), BorderLayout.PAGE_START);
		add(tabla, BorderLayout.CENTER);
		
		tabla.setPreferredScrollableViewportSize(new Dimension(1500, 340));
		tabla.setFillsViewportHeight(true);
		tabla.getColumnModel().getColumn(0).setPreferredWidth(80);
		tabla.getColumnModel().getColumn(1).setPreferredWidth(120);
		tabla.getColumnModel().getColumn(2).setPreferredWidth(120);
		tabla.getColumnModel().getColumn(3).setPreferredWidth(30);
		tabla.getColumnModel().getColumn(4).setPreferredWidth(100);
		tabla.getColumnModel().getColumn(5).setPreferredWidth(80);
		tabla.getColumnModel().getColumn(6).setPreferredWidth(130);
		tabla.getColumnModel().getColumn(7).setPreferredWidth(140);
		tabla.getColumnModel().getColumn(8).setPreferredWidth(70);
		tabla.getColumnModel().getColumn(9).setPreferredWidth(70);
		tabla.getColumnModel().getColumn(10).setPreferredWidth(80);
		tabla.getColumnModel().getColumn(11).setPreferredWidth(80);
		
		add(tabla);
		JScrollPane jsp = new JScrollPane(tabla);
		add(jsp);

	}



	
	/**
	 * Metodo que permite acceder a los vectores de la tabla
	 * 
	 * @return Tablemodel
	 */

	public DefaultTableModel getTableModel() {
		return tableModel;
	}

	/**
	 * Setter del tablemodel
	 * 
	 * @param tableModel the tableModel to set
	 */

	public void setTableModel(DefaultTableModel tableModel) {
		this.tableModel = tableModel;
	}

	/**
	 * Metodo que permite acceder al area de texto
	 * 
	 * @return Area_resultados
	 */

	public JTextArea getArea_resultados() {
		return area_resultados;
	}

	/**
	 * setter del area_resultados
	 * @param area_resultados the area_resultados to set
	 */
	public void setArea_resultados(JTextArea area_resultados) {
		this.area_resultados = area_resultados;
	}

	/**
	 * Metodo que permite acceder a la tabla
	 * 
	 * @return Tabla
	 */
	public JTable getTabla() {
		return tabla;
	}

	/**
	 * setter de tabla
	 * @param tabla the tabla to set
	 */
	public void setTabla(JTable tabla) {
		this.tabla = tabla;
	}
}