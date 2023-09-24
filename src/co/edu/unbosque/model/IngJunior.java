package co.edu.unbosque.model;

/**
 * Clase IngJunior que hereda de la clase Empleado y corresponde a la categoria
 * Ingeniero Junior dentro de la empresa
 * 
 * @author jinetes del apocalipsis
 * @version 5.0
 * @serial 2021
 */
public class IngJunior extends Empleado {
	/**
	 * Clase que corresponde al constructor de la clase IngJunior
	 * 
	 * <b>pre:</b> se inicializan correctamente los objetos.<br>.
	 * <b>post:</b> se agregan los parametros dentro de la clase IngJunior.<br>
	 * 
	 * @param cedula              parametro tipo String que corresponde al id de
	 *                            cada ingeniero junior
	 * @param nombre              parametro tipo String que corresponde al nombre de
	 *                            cada ingeniero junior
	 * @param apellido            parametro tipo String que corresponde al apellido
	 *                            de cada ingeniero junior
	 * @param genero              parametro tipo String que corresponde al genero de
	 *                            cada ingeniero junior
	 * @param fecha_de_nacimiento parametro tipo String que corresponde a la fecha
	 *                            de nacimiento de cada ingeniero junior
	 * @param telefono            parametro tipo String que corresponde al numero de
	 *                            telefono de cada ingeniero junior
	 * @param correo_electronico  parametro tipo String que corresponde al correo
	 *                            electronico de cada ingeniero junior
	 * @param direccion           parametro tipo String que corresponde a la
	 *                            direccion de residencia de cada ingeniero junior
	 * @param a�o_ingreso         parametro tipo String que corresponde al a�o en
	 *                            que ingreso cada ingeniero junior
	 * @param antiguedad          parametro tipo String que corresponde a los a�os
	 *                            que lleva cada ingeniero junior
	 * @param categoria           parametro tipo String que corresponde a el puesto
	 *                            que tiene el ingeniero junior
	 * @param Salario             parametro tipo double que corresponde a el salario
	 *                            correspondiente cada ingeniero junior
	 */
	public IngJunior(String cedula, String nombre, String apellido, String genero, String fecha_de_nacimiento,
			String telefono, String correo_electronico, String direccion, String año_ingreso, String antiguedad,
			String categoria, double Salario) {
		super(cedula, nombre, apellido, genero, fecha_de_nacimiento, telefono, correo_electronico, direccion,
				año_ingreso, antiguedad, categoria, Salario);

	}

	/**
	 * Metodo que permite acceder al atributo Cedula
	 * 
	 * @return cedula
	 */
	@Override
	public String getCedula() {
		// TODO Auto-generated method stub
		return cedula;
	}

	/**
	 * Metodo que permite modificar el atributo Cedula
	 * 
	 * @param cedula the cedula to set
	 */
	@Override
	public void setCedula(String cedula) {
		// TODO Auto-generated method stub

	}

	/**
	 * Metodo que permite acceder al atributo Nombre
	 * 
	 * @return nombre
	 */
	@Override
	public String getNombre() {
		// TODO Auto-generated method stub
		return nombre;
	}

	/**
	 * Metodo que permite modificar el atributo Nombre
	 * 
	 * @param nombre the nombre to set
	 */
	@Override
	public void setNombre(String nombre) {
		// TODO Auto-generated method stub

	}

	/**
	 * Metodo que permite acceder al atributo Apellido
	 * 
	 * @return apellido
	 */
	@Override
	public String getApellido() {
		// TODO Auto-generated method stub
		return apellido;
	}

	/**
	 * Metodo que permite modificar el atributo Apellido
	 * 
	 * @param apellido the apellido to set
	 */
	@Override
	public void setApellido(String apellido) {
		// TODO Auto-generated method stub

	}

	/**
	 * Metodo que permite acceder al atributo Genero
	 * 
	 * @return genero
	 */
	@Override
	public String getGenero() {
		// TODO Auto-generated method stub
		return genero;
	}

	/**
	 * Metodo que permite modificar el atributo Genero
	 * 
	 * @param genero the genero to set
	 */
	@Override
	public void setGenero(String genero) {
		// TODO Auto-generated method stub

	}

	/**
	 * Metodo que permite acceder al atributo fecha_de_nacimiento
	 * 
	 * @return fecha_de_nacimiento
	 */
	@Override
	public String getfecha_de_nacimiento() {
		// TODO Auto-generated method stub
		return fecha_de_nacimiento;
	}

	/**
	 * Metodo que permite modificar el atributo fecha_de_nacimiento
	 * 
	 * @param fecha_de_nacimiento the fecha_de_nacimiento to set
	 */
	@Override
	public void setfecha_de_nacimiento(String fecha_de_nacimiento) {
		// TODO Auto-generated method stub

	}

	/**
	 * Metodo que permite acceder al atributo Telefono
	 * 
	 * @return telefono
	 */
	@Override
	public String getTelefono() {
		// TODO Auto-generated method stub
		return telefono;
	}

	/**
	 * Metodo que permite modificar el atributo Telefono
	 * 
	 * @param telefono the telefono to set
	 */
	@Override
	public void setTelefono(String telefono) {
		// TODO Auto-generated method stub

	}

	/**
	 * Metodo que permite acceder al atributo Correo_electronico
	 * 
	 * @return correo_electronico
	 */
	@Override
	public String getCorreo_electronico() {
		// TODO Auto-generated method stub
		return correo_electronico;
	}

	/**
	 * Metodo que permite modificar el atributo Correo_electronico
	 * 
	 * @param correo_electronico the correo_electronico to set
	 */
	@Override
	public void setCorreo_electronico(String correo_electronico) {
		// TODO Auto-generated method stub

	}

	/**
	 * Metodo que permite acceder al atributo Direccion
	 * 
	 * @return direccion
	 */
	@Override
	public String getDireccion() {
		// TODO Auto-generated method stub
		return direccion;
	}

	/**
	 * Metodo que permite modificar el atributo Direccion
	 * 
	 * @param direccion the direccion to set
	 */
	@Override
	public void setDireccion(String direccion) {
		// TODO Auto-generated method stub

	}

	/**
	 * Metodo que permite acceder al atributo A�o_ingreso
	 * 
	 * @return a�o_ingreso
	 */
	@Override
	public String getAño_ingreso() {
		// TODO Auto-generated method stub
		return año_ingreso;
	}

	/**
	 * Metodo que permite modificar el atributo A�o_ingreso
	 * 
	 * @param a�o_ingreso the a�o_ingreso to set
	 */
	@Override
	public void setAño_ingreso(String año_ingreso) {
		// TODO Auto-generated method stub

	}

	/**
	 * Metodo que permite acceder al atributo Antiguedad
	 * 
	 * @return antiguedad
	 */
	@Override
	public String getAntiguedad() {
		// TODO Auto-generated method stub
		return antiguedad;
	}

	/**
	 * Metodo que permite modificar el atributo Antiguedad
	 * 
	 * @param antiguedad the antiguedad to set
	 */
	@Override
	public void setAntiguedad(String antiguedad) {
		// TODO Auto-generated method stub

	}

	/**
	 * Metodo que permite acceder al atributo Categoria
	 * 
	 * @return categoria
	 */
	@Override
	public String getCategoria() {
		// TODO Auto-generated method stub
		return categoria;
	}

	/**
	 * Metodo que permite modificar el atributo Categoria
	 * 
	 * @param categoria the categoria to set
	 */
	@Override
	public void setCategoria(String categoria) {
		// TODO Auto-generated method stub

	}

	/**
	 * Metodo que permite acceder al atributo Salario y calcula el salario base del
	 * ingeniero junior dependiendo de sus a�os dentro de la empresa
	 * <b>pre:</b> el dato antiguedad != null.<br>
	 * <b>post:</b> se calcula el salario base del Ingeniero junior segun sus a�os dentro de la empresa.<br>
	 * @return salariobase
	 */
	@Override
	public double getSalario() {
		int aux = Integer.parseInt(antiguedad);
		double salariobase = 3000000;
		if (aux < 2) {
			salariobase = salariobase;
		} else if (aux >= 2 && aux <= 3) {
			salariobase = salariobase + (salariobase * 0.03);
		} else if (aux >= 4 && aux <= 7) {
			salariobase = salariobase + (salariobase * 0.06);
		} else if (aux >= 8 && aux <= 15) {
			salariobase = salariobase + (salariobase * 0.09);
		} else if (aux > 15) {
			salariobase = salariobase + (salariobase * 0.15);
		}
		return salariobase;

	}

	/**
	 * Metodo que calcula el salario final del ingeniero junior dependiendo de su
	 * nivel dentro de la empresa
	 * <b>pre:</b> el dato nivel != null y != 0.<br>
	 * <b>post:</b> se calcula el salario final sumando el salario base con la bonificacion por nivel.<br>
	 * @param nivel nivel del ingeniero junior
	 * @return salarioFinal
	 */
	public double salario_final(String nivel) {
		double salarioFinal = getSalario();
		if (nivel.equals("Nivel 2")) {
			salarioFinal = salarioFinal + (salarioFinal * 0.06);
		} else if (nivel.equals("Nivel 3")) {
			salarioFinal = salarioFinal + (salarioFinal * 0.09);
		}

		return salarioFinal;

	}

	/**
	 * Metodo que permite modificar el atributo Salario
	 * 
	 * @param salario the salario to set
	 */
	@Override
	public void setSalario(double salario) {
		// TODO Auto-generated method stub

	}
}
