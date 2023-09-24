package co.edu.unbosque.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JOptionPane;

import co.edu.unbosque.model.Empleado;
import co.edu.unbosque.model.EmpleadoComision;
import co.edu.unbosque.model.Empresa;
import co.edu.unbosque.model.IngJunior;
import co.edu.unbosque.model.IngSenior;
import co.edu.unbosque.model.Tecnico;
import co.edu.unbosque.view.AnadirEmpleado;
import co.edu.unbosque.view.BaseDeDatos;
import co.edu.unbosque.view.PanelResultados;
import co.edu.unbosque.view.VentanaBienvenido;

/**
 * Clase controller que controla el funcionamiento de cada ventana y ciclo del
 * programa
 * 
 * @author Casa de software Jinetes del apocalipsis
 * @version 5.0
 * @serial 2021
 * 
 */

public class Controller implements ActionListener {

	private VentanaBienvenido ventana_bienvenido;// Objeto de la ventana Bienvenido o principal
	private BaseDeDatos base_de_datos;// Objeto de la ventana Base de datos
	private AnadirEmpleado añadir_empleado;// objeto de la ventana a�adir empleado
	private EmpleadoComision empleadocomision;// Objeto de la clase empleado a comision que trae los diferentes
												// atributos
	private IngJunior ingjunior;// Objeto de la clase ingeniero junior que trae los diferentes atributos
	private IngSenior ingsenior;// Objeto de la clase ingeniero Senior que trae los diferentes atributos
	private Tecnico tecnico;// Objeto de la clase Tecnico que trae los diferentes atributos
	private Empresa empresa;// Objeto de la clase empresa que contiene el arreglo donde esta la base de
							// datos de los empleados
	private int acum_monto;// entero que se refiere al monto acumulado de los empleados por cliente

	/**
	 * Clase que corresponde al constructor de la clase Controller e inicializa sus atributos 
	 * <b>pre:</b> haber creado las distintas clases y objetos.<br>
	 * <b>post:</b> Inicializar el programa junto con sus metodos y atributos.<br>
	 */
	public Controller() {
		ventana_bienvenido = new VentanaBienvenido();
		base_de_datos = new BaseDeDatos();
		añadir_empleado = new AnadirEmpleado();
		empresa = new Empresa();
		asignarOyentes();
		acum_monto = 0;
			
		}
		

	/**
	 * Metodo que asigna los oyentes 
	 * <b>Pre:</b>Haber generado los getter y setters de los atributos corespondientes Las librerias estan correctamente incluidas en el proyecto.<br>
	 * <b>Post:</b> se implementan los oyentes de los atributos.<br>
	 * 
	 */
	public void asignarOyentes() {
		ventana_bienvenido.getBt_BaseDeDatos().addActionListener(this);
		ventana_bienvenido.getBt_AñadirEmpleado().addActionListener(this);
		ventana_bienvenido.getBt_salir().addActionListener(this);
		
		base_de_datos.getBt_Regresar().addActionListener(this);
		base_de_datos.getPseleccion().getMenu_personal().addActionListener(this);
		
		añadir_empleado.getBt_Regresar().addActionListener(this);
		añadir_empleado.getgenero().addActionListener(this);
		añadir_empleado.gettsalario().addActionListener(this);
		añadir_empleado.getcategoria().addActionListener(this);
		añadir_empleado.getBt_añadir().addActionListener(this);
		añadir_empleado.getBt_monto_por_cliente().addActionListener(this);
	}

	/**
	 * Metodo que envia los datos al arreglo Empleado
	 * <b>pre:</b> Inicializado el arreglo con la matriz y los datos son menores o iguales 12.<br>
	 * <b>post:</b> Se llena los campos de la matriz con los respectivos datos.<br> 
	 * @param info informacion de los espacios en la matriz
	 * @return datos
	 */
	public String[][] llenarMatriz(ArrayList<Empleado> info) {
		String[][] datos = new String[info.size()][12];
		info = new ArrayList<>();
		for (int i = 0; i < info.size(); i++) {
			for (int j = 0; j < 1; j++) {
				datos[i][j] = info.get(i).getCedula();
			}
		}
		return datos;
	}

	/**
	 * Metodo que permite acceder a el atributo Acum_monto
	 * 
	 * @return acum_monto
	 */
	public int getAcum_monto() {
		return acum_monto;
	}

	/**
	 * Metodo que permite modificar el atributo Acum_monto
	 * 
	 * @param acum_monto the acum_monto to set
	 */
	public void setAcum_monto(int acum_monto) {
		this.acum_monto = acum_monto;
	}

	/**
	 * Metodo que compara la accion realizada del oyente con su respectivo metodo y 
	 * lo inicializa
	 * <b>pre:</b>Asignar los respectivos oyentes y los atributos. <br>
	 * <b>post:</b>realiza las acciones de los diferentes botones y cuadros de lista.<br>
	 * 
	 */
	public void actionPerformed(ActionEvent e) {

		if((e.getActionCommand().equals("BASEDEDATOS"))) {

			ventana_bienvenido.setVisible(false);
			base_de_datos.setVisible(true);


		}else if ((e.getActionCommand().equals("OPCIONES"))){
			String opcion = base_de_datos.getPseleccion().getMenu_personal().getSelectedItem().toString();
			if(opcion.equals("Comision")) {
				base_de_datos.remove(base_de_datos.getPdatosblanco2());
				base_de_datos.add(base_de_datos.getPdatosblanco());
				base_de_datos.getPdatosblanco().setVisible(true);

			}else if(opcion.equals("Salario Fijo")) {
				base_de_datos.remove(base_de_datos.getPdatosblanco());
				base_de_datos.add(base_de_datos.getPdatosblanco2());
				base_de_datos.getPdatosblanco2().setVisible(true);
			}
			base_de_datos.repaint();
		}


		if((e.getActionCommand().equals("AÑADIREMPLEADO"))){

			ventana_bienvenido.setVisible(false);
			añadir_empleado.setVisible(true);

		}if ((e.getActionCommand().equals("SALARIOS"))) {
			String opcion = añadir_empleado.gettsalario().getSelectedItem().toString();

			if(opcion.equals("Fijo")){
				añadir_empleado.getcategoria().setVisible(true);
				añadir_empleado.getlb_categoria().setVisible(true);
				añadir_empleado.getClientes_captados().setVisible(false);
				añadir_empleado.getLb_clientes_captados().setVisible(false);
				añadir_empleado.getBt_monto_por_cliente().setVisible(false);
				añadir_empleado.getLb_monto_por_cliente().setVisible(false);

			}else if(opcion.equals("Comision")){
				añadir_empleado.getClientes_captados().setVisible(true);
				añadir_empleado.getLb_clientes_captados().setVisible(true);
				añadir_empleado.getcategoria().setVisible(false);
				añadir_empleado.getlb_categoria().setVisible(false);
				añadir_empleado.getNivel().setVisible(false);
				añadir_empleado.getEt_ex().setVisible(false);
				añadir_empleado.getNivel().setVisible(false);
				añadir_empleado.getBt_monto_por_cliente().setVisible(true);
				añadir_empleado.getLb_monto_por_cliente().setVisible(true);


			}


		}else if ((e.getActionCommand().equals("CATEGORIAS"))) {
			String opcion = añadir_empleado.getcategoria().getSelectedItem().toString();

			if(opcion.equals("Tecnico")){
				añadir_empleado.getNivel().setVisible(false);
				añadir_empleado.getEt_ex().setVisible(false);

			}else if(opcion.equals("Ing. Junior")){
				añadir_empleado.getNivel().setVisible(true);
				añadir_empleado.getEt_ex().setVisible(true);
				añadir_empleado.getLb_numero_ventas().setVisible(false);
				añadir_empleado.getNumero_ventas().setVisible(false);

			}else if(opcion.equals("Ing. Senior")) {
				añadir_empleado.getNivel().setVisible(false);
				añadir_empleado.getEt_ex().setVisible(false);
				añadir_empleado.getLb_numero_ventas().setVisible(true);
				añadir_empleado.getNumero_ventas().setVisible(true);
			}
		}
		if((e.getActionCommand().equals("SALIR"))){
			ventana_bienvenido.setVisible(false);
		}
		if((e.getActionCommand().equals("REGRESAR"))){

			ventana_bienvenido.setVisible(true);
			base_de_datos.setVisible(false);
			añadir_empleado.setVisible(false);

		}


		if(e.getActionCommand().equals("MCLIENTE")) {
			int aux =0;
			if(!añadir_empleado.getClientes_captados().getSelectedItem().toString().equals("Seleccione")) {
				int captados=Integer.parseInt(añadir_empleado.getClientes_captados().getSelectedItem().toString());

				while(aux< captados ){
					String aux_monto = JOptionPane.showInputDialog("Ingrese el monto del cliente "+(aux+1)+" :");
					if(Integer.parseInt(aux_monto)>=500000 && Integer.parseInt(aux_monto)<=2000000) {
						setAcum_monto(getAcum_monto() + Integer.parseInt(aux_monto));
						aux ++;

					}else {
						JOptionPane.showMessageDialog(null, "", "Error", JOptionPane.WARNING_MESSAGE);
					}

				}

			}else {
				JOptionPane.showMessageDialog(null, "Seleccione la catidad de clientes captados", "Error", JOptionPane.WARNING_MESSAGE);

			}
		}


		if(e.getActionCommand().equals("AGREGAR")) {
			
			if(añadir_empleado.gettsalario().getSelectedItem().toString().equals("Comision")) {
				
				empleadocomision = new EmpleadoComision(añadir_empleado.getCedula().getText(),
						añadir_empleado.getnombre().getText(),
						añadir_empleado.getapellido().getText(),
						añadir_empleado.getgenero().getSelectedItem().toString(),
						añadir_empleado.getDia().getSelectedItem()+"/"+
								añadir_empleado.getMes().getSelectedItem()+"/"+
								añadir_empleado.getAño().getSelectedItem(),
								añadir_empleado.gettelefono().getText(),
								añadir_empleado.getcorreoe().getText(),
								añadir_empleado.getdireccion().getText(),
								añadir_empleado.getAingreso().getSelectedItem().toString(),
								añadir_empleado.getantiguedad(),
								añadir_empleado.getScategoria(),
								añadir_empleado.getSalario()
						);

				añadir_empleado.setSalario(empleadocomision.salario_final(getAcum_monto()));
				setAcum_monto(0);

			}else if(añadir_empleado.gettsalario().getSelectedItem().toString().equals("Fijo")) {
				switch (añadir_empleado.getcategoria().getSelectedItem().toString()) {
				case ("Tecnico"):
					tecnico = new Tecnico(añadir_empleado.getCedula().getText(),
							añadir_empleado.getnombre().getText(),
							añadir_empleado.getapellido().getText(),
							añadir_empleado.getgenero().getSelectedItem().toString(),
							añadir_empleado.getDia().getSelectedItem()+"/"+
									añadir_empleado.getMes().getSelectedItem()+"/"+
									añadir_empleado.getAño().getSelectedItem(),
									añadir_empleado.gettelefono().getText(),
									añadir_empleado.getcorreoe().getText(),
									añadir_empleado.getdireccion().getText(),
									añadir_empleado.getAingreso().getSelectedItem().toString(),
									añadir_empleado.getantiguedad(),
									añadir_empleado.getScategoria(),
									añadir_empleado.getSalario()
							);
				añadir_empleado.setSalario(tecnico.salario_final(añadir_empleado.getAño().getSelectedItem().toString()));

				break;
				case ("Ing. Junior"):
					ingjunior = new IngJunior(añadir_empleado.getCedula().getText(),
							añadir_empleado.getnombre().getText(),
							añadir_empleado.getapellido().getText(),
							añadir_empleado.getgenero().getSelectedItem().toString(),
							añadir_empleado.getDia().getSelectedItem()+"/"+
									añadir_empleado.getMes().getSelectedItem()+"/"+
									añadir_empleado.getAño().getSelectedItem(),
									añadir_empleado.gettelefono().getText(),
									añadir_empleado.getcorreoe().getText(),
									añadir_empleado.getdireccion().getText(),
									añadir_empleado.getAingreso().getSelectedItem().toString(),
									añadir_empleado.getantiguedad(),
									añadir_empleado.getScategoria(),
									añadir_empleado.getSalario()
							);
				añadir_empleado.setSalario(ingjunior.salario_final(añadir_empleado.getNivel().getSelectedItem().toString()));

				break;
				case ("Ing. Senior"):
					ingsenior = new IngSenior(añadir_empleado.getCedula().getText(),
							añadir_empleado.getnombre().getText(),
							añadir_empleado.getapellido().getText(),
							añadir_empleado.getgenero().getSelectedItem().toString(),
							añadir_empleado.getDia().getSelectedItem()+"/"+
									añadir_empleado.getMes().getSelectedItem()+"/"+
									añadir_empleado.getAño().getSelectedItem(),
									añadir_empleado.gettelefono().getText(),
									añadir_empleado.getcorreoe().getText(),
									añadir_empleado.getdireccion().getText(),
									añadir_empleado.getAingreso().getSelectedItem().toString(),
									añadir_empleado.getantiguedad(),
									añadir_empleado.getScategoria(),
									añadir_empleado.getSalario()
							);
				añadir_empleado.setSalario(ingsenior.salarioFinal(añadir_empleado.getNumero_ventas().getSelectedItem().toString()));


				break;
				}
			}

			añadir_empleado.setCount_validaciones(0);
			Object[] objs = {añadir_empleado.getCedula().getText(),
					añadir_empleado.getnombre().getText(),
					añadir_empleado.getapellido().getText(),
					añadir_empleado.getgenero().getSelectedItem(),
					añadir_empleado.getDia().getSelectedItem()+"/"+
							añadir_empleado.getMes().getSelectedItem()+"/"+
							añadir_empleado.getAño().getSelectedItem(),
							añadir_empleado.gettelefono().getText(),
							añadir_empleado.getcorreoe().getText(),
							añadir_empleado.getdireccion().getText(),
							añadir_empleado.getAingreso().getSelectedItem(),
							añadir_empleado.getantiguedad(),
							añadir_empleado.getScategoria(),
							añadir_empleado.getSalario()
			};
			if(añadir_empleado.getCount_validaciones()>=8) {
			if(añadir_empleado.gettsalario().getSelectedItem().toString().equals("Comision")) {
				base_de_datos.getPdatosblanco().getTableModel().addRow(objs);
			}else {
				base_de_datos.getPdatosblanco2().getTableModel().addRow(objs);	
			}
			añadir_empleado.reiniciarTodo();
			JOptionPane.showMessageDialog(null, "Se ha agregado el empleado correctamente.","Mensaje",JOptionPane.INFORMATION_MESSAGE);
			}else {
				JOptionPane.showMessageDialog(null, "Verifique la informaci�n ingresada","VALIDAR",JOptionPane.ERROR_MESSAGE);
				System.out.println(añadir_empleado.getCount_validaciones());
			}
		}
	}
}