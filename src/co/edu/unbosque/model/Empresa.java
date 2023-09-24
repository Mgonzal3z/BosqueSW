package co.edu.unbosque.model;

import java.util.ArrayList;
/**
 * Clase empresa donde se encuentra los arreglos de las bases de datos
 * @author jinetes del apocalipsis
 *@version 5.0
 *@serial 2021
 */
public class Empresa {
	
	private ArrayList <Empleado> empleados;// Atributo tipo ArrayList que corresponde al arreglo donde se guardan los datos de los empleados
	/**
	 * clase que corresponde al constructor de la clase Empresa
	 */
	public Empresa() {
		empleados= new ArrayList <Empleado>();
	}

	/**
	 * Metodo que permite acceder al atributo empleados
	 * @return the empleados
	 */
	public ArrayList<Empleado> getEmpleados() {
		return empleados;
	}

	/**
	 * Metodo que permite modificar el atributo empleados
	 * @param empleados the empleados to set
	 */
	public void setEmpleados(ArrayList<Empleado> empleados) {
		this.empleados = empleados;
	}

}
