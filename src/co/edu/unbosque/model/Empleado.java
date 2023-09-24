package co.edu.unbosque.model;

/**
 * Clase abstracta Empleado que contiene todos los datos del empleado
 * 
 * @author jinetes del apocalipsis
 * @version 5.0
 * @serial 2021
 *
 */
public abstract class Empleado {

	protected String cedula;// Atributo de tipo String que corresponde al ID del empleado
	protected String nombre;// Atributo de tipo String que corresponde al nombre del empleado
	protected String apellido;// Atributo de tipo String que corresponde al apellido del empleado
	protected String genero;// Atributo de tipo String que corresponde al genero del empleado
	protected String fecha_de_nacimiento;// Atributo de tipo String que corresponde a la fecha de nacimiento del
											// empleado
	protected String telefono;// Atributo de tipo String que corresponde al numero de telefono del empleado
	protected String correo_electronico;// Atributo de tipo String que corresponde al correo electronico del empleado
	protected String direccion;// Atributo de tipo String que corresponde a la direccion de residencia del
								// empleado
	protected String año_ingreso;// Atributo de tipo String que corresponde a la fecha en que ingreso a la
									// empresa
	protected String antiguedad;// Atributo de tipo String que corresponde a los a�os que lleva en la empresa
	protected String categoria;// Atributo de tipo String que corresponde a su puesto dentro de la empresa
	protected double salario;// Atributo de tipo double que corresponde al salario estipulado para cada
								// empleado

	/**
	 * Clase que corresponde al constructor de la clase Empleado
	 * 
	 * @param cedula              parametro tipo String que corresponde al id del
	 *                            empleado
	 * @param nombre              parametro tipo String que corresponde al nombre
	 *                            del empleado
	 * @param apellido            parametro tipo String que corresponde al apellido
	 *                            del emleado
	 * @param genero              parametro tipo String que corresponde al genero de
	 *                            cada empleado
	 * @param fecha_de_nacimiento parametro tipo String que corresponde a la fecha
	 *                            de nacimiento de cada empleado
	 * @param telefono            parametro tipo String que corresponde al numero de
	 *                            telefono de cada empleado
	 * @param correo_electronico  parametro tipo String que corresponde al correo
	 *                            electronico de cada empleado
	 * @param direccion           parametro tipo String que corresponde a la
	 *                            direccion de residencia de cada empleado
	 * @param a�o_ingreso         parametro tipo String que corresponde al a�o en
	 *                            que ingreso el empleado a la empresa
	 * @param antiguedad          parametro tipo String que corresponde a los a�os
	 *                            que lleva un empleado en la empresa
	 * @param categoria           parametro tipo String que corresponde a el puesto
	 *                            que tiene un empleado en la empresa
	 * @param Salario             parametro tipo double que corresponde a el salario
	 *                            correspondiente para cada empleado
	 */
	public Empleado(String cedula, String nombre, String apellido, String genero, String fecha_de_nacimiento,
			String telefono, String correo_electronico, String direccion, String año_ingreso, String antiguedad,
			String categoria, double Salario) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.cedula = cedula;
		this.genero = genero;
		this.fecha_de_nacimiento = fecha_de_nacimiento;
		this.telefono = telefono;
		this.correo_electronico = correo_electronico;
		this.direccion = direccion;
		this.año_ingreso = año_ingreso;
		this.antiguedad = antiguedad;
		this.categoria = categoria;
		this.salario = salario;

	}

	/**
	 * Metodo abstracto que permite acceder al atributo Cedula de cada empleado
	 */
	public abstract String getCedula();

	/**
	 * Metodo abstracto que permite modificar el atributo Cedula
	 * 
	 * @param cedula the cedula to set
	 */
	public abstract void setCedula(String cedula);

	/**
	 * Metodo abstracto que permite acceder al atributo Nombre de cada empleado
	 */
	public abstract String getNombre();

	/**
	 * Metodo abstracto que permite modificar el atributo Nombre de cada empleado
	 * 
	 * @param nombre the nombre to set
	 */
	public abstract void setNombre(String nombre);

	/**
	 * Metodo abstracto que permite acceder al atributo Apellido de cada empleado
	 */
	public abstract String getApellido();

	/**
	 * Metodo abstracto que permite modificar el atributo Apellido de cada empleado
	 * 
	 * @param apellido the apellido to set
	 */
	public abstract void setApellido(String apellido);

	/**
	 * Metodo abstracto que permite acceder al atributo Genero de cada empleado
	 */
	public abstract String getGenero();

	/**
	 * Metodo abstracto que permite modificar el atributo Genero de cada empleado
	 * 
	 * @param genero the genero to set
	 */
	public abstract void setGenero(String genero);

	/**
	 * Metodo abstracto que permite acceder al atributo fecha_de_nacimiento de cada
	 * empleado
	 */
	public abstract String getfecha_de_nacimiento();

	/**
	 * Metodo abstracto que permite modificar el atributo fecha_de_nacimiento de
	 * cada empleado
	 * 
	 * @param fecha_de_nacimiento the fecha_de_nacimiento to set
	 */
	public abstract void setfecha_de_nacimiento(String fecha_de_nacimiento);

	/**
	 * Metodo abstracto que permite acceder al atributo Telefono de cada empleado
	 */
	public abstract String getTelefono();

	/**
	 * Metodo abstracto que permite modificar el atributo telefono de cada empleado
	 * 
	 * @param telefono the telefono to set
	 */
	public abstract void setTelefono(String telefono);

	/**
	 * Metodo abstracto que permite acceder al atributo Correo_electronico de cada
	 * empleado
	 */
	public abstract String getCorreo_electronico();

	/**
	 * Metodo abstracto qeu permite modificar el atributo Correo_electronico de cada
	 * empleado
	 * 
	 * @param correo_electronico the correo_electronico to set
	 */
	public abstract void setCorreo_electronico(String correo_electronico);

	/**
	 * Metodo abstracto que permite acceder al atributo Direccion de cada empleado
	 */
	public abstract String getDireccion();

	/**
	 * Metodo abstracto que permite modificar el atributo Direccion de cada empleado
	 * 
	 * @param direccion the Direccion to set
	 */
	public abstract void setDireccion(String direccion);

	/**
	 * Metodo abstracto que permite acceder al atributo A�o_ingreso de cada empleado
	 */
	public abstract String getAño_ingreso();

	/**
	 * Metodo abstracto que permite modificar el atributo A�o_ingreso de cada
	 * empleado
	 * 
	 * @param a�o_ingreso the a�o_ingreso to set
	 */
	public abstract void setAño_ingreso(String año_ingreso);

	/**
	 * Metodo abstracto que permite acceder al atributo Antiguedad de cada empleado
	 */
	public abstract String getAntiguedad();

	/**
	 * Metodo abstracto que permite modificar el atributo Antiguedad de cada
	 * empleado
	 * 
	 * @param antiguedad the antiguedad to set
	 */
	public abstract void setAntiguedad(String antiguedad);

	/**
	 * Metodo abstracto que permite acceder al atributo Categoria de cada empleado
	 */
	public abstract String getCategoria();

	/**
	 * Metodo abstracto que permite modificar el atributo Categoria de cada empleado
	 * 
	 * @param categoria the categoria to set
	 */
	public abstract void setCategoria(String categoria);

	/**
	 * Metodo abstracto que permite acceder al atributo Salario de cada empleado
	 */
	public abstract double getSalario();

	/**
	 * Metodo abstracto que permite modificar el atributo Salario de cada empleado
	 * 
	 * @param salario the salario to set
	 */
	public abstract void setSalario(double salario);

}
