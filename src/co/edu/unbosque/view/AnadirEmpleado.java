package co.edu.unbosque.view;

import java.awt.List;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;

/**
 * Clase A�adirEmpleado que extiende JFrame y correspone a la ventana de a�adir
 * un empleado
 * 
 * @author Jinetes del apocalipsis
 * @version 5.0
 * @serial 2021
 *
 */
public class AnadirEmpleado extends JFrame {

	private JLabel opciones;// JLabel que contiene las opciones para a�adir al empleado
	private JComboBox<String> genero, tsalario, categoria, nivel, dia, mes, año, aingreso, numero_ventas,
			clientes_captados; // Jcombobox que corresponde a las caracteristicas de los empleados

	private int ancho;// Atributo tipo int que contiene el ancho de la pantalla del usuario
	private int alto;// Atributo tipo int que contiene lo alto de la pantalla del usuario
	private String antiguedad;// Atributo tipo String que contiene los a�os que lleva el usuario en la empresa
	private double salario;// Atributo tipo string que contiene el salario que se le asignara al empleado
							// dependiendo de su categoria
	private String scategoria;// Atributo tipo String que contiene las categorias de los empleados dentro de
								// la empresa
	private int count_validaciones;
	private JTextField cedula, nombre, apellido, telefono, correoe, direccion;// Campos de texto para introducir los
																				// atributos de cada empleado
	private JLabel lb_cedula, lb_nombres, lb_apellidos, lb_genero, lb_fecha_naci, lb_tipo_salario, lb_categoria,
			lb_telefono, lb_correoe, lb_direccion, lb_año_ingreso, lb_antiguedad, et_ex, lb_dia, lb_mes, lb_año,
			lb_numero_ventas, lb_clientes_captados, lb_monto_por_cliente;// Texto que indica los atributos que se deben
																			// llenar para a�adir un
	// empleado

	private JButton bt_Regresar; // Boton para regresar a la Ventana principal o VentanaBienvenido
	private JButton bt_añadir;// Boton que envia la informacion a la base de datos y a�ade un empleado
	private JButton bt_monto_por_cliente;// Boton que envia la la informacion del monto por cada cliente del empleado

	/**
	 * Clase que corresponde al constructor de la Ventana A�adirEmpleado e
	 * inicializa todos sus componentes Establece las cordenadas de cada atributo y
	 * los agrega a la ventana A�adirEmpleado
	 */
	public AnadirEmpleado() {

		setTitle("A�adir");
		setSize(850, 550);
		ancho = java.awt.Toolkit.getDefaultToolkit().getScreenSize().width;
		alto = java.awt.Toolkit.getDefaultToolkit().getScreenSize().height;
		setLocation((int) (ancho / 5.2), (int) (alto / 6));
		setLayout(null);
		setIconImage(new ImageIcon(getClass().getResource("/Imagen/logo.png")).getImage());
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		MenuAñadir();

		setResizable(false);
		setVisible(false);

		// TITULOS
		lb_cedula = new JLabel("Cedula");
		lb_cedula.setBounds(10, 5, 200, 20);
		add(lb_cedula);

		lb_nombres = new JLabel("Nombre");
		lb_nombres.setBounds(10, 45, 200, 20);
		add(lb_nombres);

		lb_apellidos = new JLabel("Apellidos");
		lb_apellidos.setBounds(10, 85, 200, 20);
		add(lb_apellidos);

		lb_genero = new JLabel("Genero");
		lb_genero.setBounds(282, 5, 200, 20);
		add(lb_genero);

		lb_fecha_naci = new JLabel("Fecha de nacimiento");
		lb_fecha_naci.setBounds(650, 5, 200, 35);
		add(lb_fecha_naci);

		lb_tipo_salario = new JLabel("Tipo de Salario");
		lb_tipo_salario.setBounds(450, 5, 200, 20);
		add(lb_tipo_salario);

		lb_categoria = new JLabel("Categoria");
		lb_categoria.setBounds(450, 60, 200, 20);
		lb_categoria.setVisible(false);
		add(lb_categoria);

		lb_clientes_captados = new JLabel("Clientes captados");
		lb_clientes_captados.setBounds(450, 60, 200, 20);
		lb_clientes_captados.setVisible(false);
		add(lb_clientes_captados);

		lb_telefono = new JLabel("Telefono");
		lb_telefono.setBounds(10, 125, 200, 20);
		add(lb_telefono);

		lb_correoe = new JLabel("Correo electr�nico");
		lb_correoe.setBounds(10, 165, 200, 20);
		add(lb_correoe);

		lb_direccion = new JLabel("Direccion");
		lb_direccion.setBounds(10, 205, 200, 20);
		add(lb_direccion);

		lb_año_ingreso = new JLabel("A�o de Ingreso");
		lb_año_ingreso.setBounds(10, 245, 200, 20);
		add(lb_año_ingreso);

		et_ex = new JLabel("Niveles");
		et_ex.setBounds(450, 110, 200, 20);
		et_ex.setVisible(false);
		add(et_ex);

		lb_monto_por_cliente = new JLabel("A�adir monto por cliente");
		lb_monto_por_cliente.setBounds(450, 110, 200, 20);
		lb_monto_por_cliente.setVisible(false);
		add(lb_monto_por_cliente);

		lb_numero_ventas = new JLabel("Numero de ventas");
		lb_numero_ventas.setBounds(450, 110, 200, 20);
		lb_numero_ventas.setVisible(false);
		add(lb_numero_ventas);

		lb_dia = new JLabel("Dia");
		lb_dia.setBounds(670, 38, 200, 20);
		add(lb_dia);
		lb_mes = new JLabel("Mes");
		lb_mes.setBounds(670, 58, 200, 20);
		add(lb_mes);
		lb_año = new JLabel("A�o");
		lb_año.setBounds(670, 78, 200, 20);
		add(lb_año);

		// CAMPO DE TEXTO
		cedula = new JTextField("");
		cedula.setBounds(10, 25, 260, 20);
		add(cedula);

		nombre = new JTextField();
		nombre.setBorder(new TitledBorder(""));
		nombre.setBounds(10, 65, 260, 20);
		add(nombre);

		apellido = new JTextField();
		apellido.setBorder(new TitledBorder(""));
		apellido.setBounds(10, 105, 260, 20);
		add(apellido);

		// JComboBox
		genero = new JComboBox<String>();
		genero.setBounds(280, 25, 120, 20);
		genero.addItem("Seleccione");
		genero.addItem("Hombre");
		genero.addItem("Mujer");
		genero.addItem("No binario");
		genero.setActionCommand("GENEROS");
		add(genero);

		tsalario = new JComboBox<String>();
		tsalario.setBounds(450, 25, 120, 20);
		tsalario.addItem("Seleccione");
		tsalario.addItem("Fijo");
		tsalario.addItem("Comision");
		tsalario.setActionCommand("SALARIOS");
		add(tsalario);

		categoria = new JComboBox<String>();
		categoria.setBounds(450, 80, 120, 20);
		categoria.addItem("Seleccione");
		categoria.addItem("Tecnico");
		categoria.addItem("Ing. Junior");
		categoria.addItem("Ing. Senior");
		categoria.setVisible(false);
		categoria.setActionCommand("CATEGORIAS");
		add(categoria);

		clientes_captados = new JComboBox<String>();
		clientes_captados.setBounds(450, 80, 120, 20);
		clientes_captados.addItem("Seleccione");
		clientes_captados.addItem("1");
		clientes_captados.addItem("2");
		clientes_captados.addItem("3");
		clientes_captados.addItem("4");
		clientes_captados.addItem("5");
		clientes_captados.addItem("6");
		clientes_captados.addItem("7");
		clientes_captados.addItem("8");
		clientes_captados.addItem("9");
		clientes_captados.addItem("10");
		clientes_captados.setVisible(false);
		clientes_captados.setActionCommand("CAPTADOS");
		add(clientes_captados);

		numero_ventas = new JComboBox<String>();
		numero_ventas.setBounds(450, 130, 120, 20);
		numero_ventas.addItem("Seleccione");
		numero_ventas.addItem("1 a 4");
		numero_ventas.addItem("5 a 8");
		numero_ventas.addItem("9 a 12");
		numero_ventas.addItem("+12");
		numero_ventas.setVisible(false);
		add(numero_ventas);

		nivel = new JComboBox<String>();
		nivel.setBounds(450, 130, 120, 20);
		nivel.addItem("Seleccione");
		nivel.addItem("Nivel 1");
		nivel.addItem("Nivel 2");
		nivel.addItem("Nivel 3");
		nivel.setVisible(false);
		nivel.setActionCommand("NIVELES");
		add(nivel);

		bt_monto_por_cliente = new JButton("A�adir monto por cliente");
		bt_monto_por_cliente.setActionCommand("MCLIENTE");
		bt_monto_por_cliente.setBounds(450, 130, 180, 20);
		bt_monto_por_cliente.setVisible(false);
		add(bt_monto_por_cliente);

		telefono = new JTextField();
		telefono.setBorder(new TitledBorder(""));
		telefono.setBounds(10, 145, 260, 20);
		add(telefono);
		correoe = new JTextField();
		correoe.setBorder(new TitledBorder(""));
		correoe.setBounds(10, 185, 260, 20);
		add(correoe);
		direccion = new JTextField();
		direccion.setBorder(new TitledBorder(""));
		direccion.setBounds(10, 225, 260, 20);
		add(direccion);
		aingreso = new JComboBox<String>();
		aingreso.setBounds(10, 265, 200, 20);
		aingreso.setActionCommand("AINGRESO");
		add(aingreso);
		for (int i = 1980; i <= 2020; i++) {
			String aux = "" + i;
			aingreso.addItem(aux);
		}

		dia = new JComboBox<String>();
		dia.setBounds(700, 40, 100, 20);
		dia.setActionCommand("DIA");
		add(dia);
		for (int i = 1; i <= 31; i++) {
			String aux = "" + i;
			dia.addItem(aux);
		}
		mes = new JComboBox<String>(new String[] { "Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio",
				"Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre" });
		mes.setBounds(700, 60, 100, 20);
		mes.setActionCommand("MES");
		add(mes);

		año = new JComboBox<String>();
		año.setBounds(700, 80, 100, 20);
		año.setActionCommand("A�O");
		add(año);
		for (int i = 1900; i <= 2020; i++) {
			String aux = "" + i;
			año.addItem(aux);
		}
	}

	/**
	 * Metodo MenuA�adir de tipo void que establece las coordenadas de cada boton y
	 * los agrega a la ventana A�adirEmpleado
	 */
	public void MenuAñadir() {

		bt_Regresar = new JButton("Regresar");
		bt_Regresar.setActionCommand("REGRESAR");
		bt_Regresar.setBounds(50, 450, 100, 30);
		bt_Regresar.setVisible(true);
		add(bt_Regresar);

		bt_añadir = new JButton("A�adir Empleado");
		bt_añadir.setActionCommand("AGREGAR");
		bt_añadir.setBounds(350, 290, 200, 30);
		bt_añadir.setVisible(true);
		add(bt_añadir);

	}

	/**
	 * Metodo que permite acceder al atributo antiguedad y lo establece por a�o
	 * 
	 * @return antiguedad
	 */
	public String getantiguedad() {
		int aux;
		aux = 2021 - Integer.parseInt(getAingreso().getSelectedItem().toString());
		antiguedad = aux + "";
		return antiguedad;
	}

	/**
	 * Metodo que permite acceder al atributo Bt_Regresar
	 * 
	 * @return bt_Regresar
	 */
	public JButton getBt_Regresar() {
		return bt_Regresar;
	}

	/**
	 * setter del boton bt_Regresar
	 * 
	 * @param bt_Regresar
	 */
	public void setBt_Regresar(JButton bt_Regresar) {
		this.bt_Regresar = bt_Regresar;
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
	 * Metodo que permite acceder al atributo genero dentro de un cuadro de lista
	 * 
	 * @return genero
	 */
	public JComboBox<String> getgenero() {
		if(!genero.getSelectedItem().toString().equals("Seleccione")) {
			setCount_validaciones(count_validaciones+1);
		}
		return genero;
	
	}

	/**
	 * Metodo que permite modificar el atributo genero dentro de un cuadro de lista
	 * 
	 * @param genero the genero to set
	 */
	public void setgenero(JComboBox<String> genero) {
		this.genero = genero;
	}

	/**
	 * Metodo que permite acceder al atributo tsalario dentro de un cuadro de lista
	 * 
	 * @return tsalario
	 */
	public JComboBox<String> gettsalario() {
		if(!tsalario.getSelectedItem().toString().equals("Seleccione")) {
			setCount_validaciones(count_validaciones+1);
		}
		return tsalario;
	}

	/**
	 * Metodo que permite acceder al atributo Numero_ventas dentro de un cuadro de
	 * lista
	 * 
	 * @return numero_ventas
	 */
	public JComboBox<String> getNumero_ventas() {
		return numero_ventas;
	}

	/**
	 * Metodo que permite modificar el atributo Numero_ventas dentro de un cuadro de
	 * lista
	 * 
	 * @param numero_ventas the numero_ventas to set
	 */
	public void setNumero_ventas(JComboBox<String> numero_ventas) {
		this.numero_ventas = numero_ventas;
	}

	/**
	 * Metodo que permite modificar el atributo tsalario dentro de un cuadro de
	 * lista
	 * 
	 * @param tsalario the tsalario to set
	 */
	public void settsalario(JComboBox<String> tsalario) {
		this.tsalario = tsalario;
	}

	/**
	 * Metodo que permite acceder al campo de texto Cedula
	 * 
	 * @return cedula
	 */
	public JTextField getCedula() {
		if(!cedula.getText().isEmpty()&&(isNumeric(cedula.getText())==true)){
			setCount_validaciones(count_validaciones+1);
		}
		return cedula;
	}

	/**
	 * Metodo que permite modificar el campo de texto Cedula
	 * 
	 * @param ccedula the ccedula to set
	 */
	public void setCedula(JTextField ccedula) {
		this.cedula = ccedula;
	}

	/**
	 * Metodo que permite acceder al campo de texto nombre
	 * 
	 * @return nombre
	 */
	public JTextField getnombre() {
		if(!nombre.getText().isEmpty()&&(isText(nombre.getText())==true)){
			setCount_validaciones(count_validaciones+1);
		}
		return nombre;
	}

	/**
	 * Metodo que permite modificar el campo de texto de nombre
	 * 
	 * @param nombre the nombre to set
	 */
	public void setnombre(JTextField nombre) {
		this.nombre = nombre;
	}

	/**
	 * Metodo que permite acceder al campo de texto apellido
	 * 
	 * @return apellido
	 */
	public JTextField getapellido() {
		if(!apellido.getText().isEmpty()&&(isText(apellido.getText())==true)){
			setCount_validaciones(count_validaciones+1);
		}
		return apellido;
	}

	/**
	 * Metodo que permite acceder al campo de texto apellido
	 * 
	 * @param apellido the apellido to set
	 */
	public void setapellido(JTextField apellido) {
		this.apellido = apellido;
	}

	/**
	 * Metodo que permite acceder al atributo categoria dentro de un cuadro de lista
	 * 
	 * @return categoria
	 */
	public JComboBox<String> getcategoria() {
		return categoria;
	}

	/**
	 * Metodo que permite acceder al Atributo Scategoria y brinda las sub categorias
	 * de Ing. Junior
	 * 
	 * @return st_categoria
	 */
	public String getScategoria() {
		String st_categoria = categoria.getSelectedItem().toString();
		if (st_categoria.equals("Ing. Junior")) {
			st_categoria = st_categoria + " " + getNivel().getSelectedItem().toString();
		} else if (gettsalario().getSelectedItem().toString().equals("Comision")) {
			st_categoria = "No Aplica";
		}

		return st_categoria;
	}

	/**
	 * Metodo que permite modificar el atributo Categoria dentro de un cuadro de
	 * lista
	 * 
	 * @param categoria the categoria to set
	 */
	public void setcategoria(JComboBox<String> categoria) {
		this.categoria = categoria;
	}

	/**
	 * Metodo que permite acceder al campo de texto telefono
	 * 
	 * @return telefono
	 */
	public JTextField gettelefono() {
		if(!telefono.getText().isEmpty()&&(isNumeric(telefono.getText())==true)){
			setCount_validaciones(count_validaciones+1);
		}
		return telefono;
	}

	/**
	 * Metodo que permite modificar el campo de texto en telefono
	 * 
	 * @param telefono the telefono to set
	 */
	public void settelefono(JTextField telefono) {
		this.telefono = telefono;
	}

	/**
	 * Metodo que permite acceder al campo de texto correoe
	 * 
	 * @return correoe
	 */
	public JTextField getcorreoe() {
		if(!correoe.getText().isEmpty()&& correoe.getText().contains("@unbosque.edu.co")) {
			setCount_validaciones(count_validaciones+1);
		}
		return correoe;
	}

	/**
	 * Metodo que permite modificar el campo de texto de correoe
	 * 
	 * @param correoe the correoe to set
	 */
	public void setcorreoe(JTextField correoe) {
		this.correoe = correoe;
	}

	/**
	 * Metodo que permite acceder al campo de texto de direccion
	 * 
	 * @return direccion
	 */
	public JTextField getdireccion() {
		if(!direccion.getText().isEmpty()) {
			setCount_validaciones(count_validaciones+1);
		}
		return direccion;
	}

	/**
	 * Metodo que permite modificar el campo de texto de direccion
	 * 
	 * @param direccion the direccion to set
	 */
	public void setdireccion(JTextField direccion) {
		this.direccion = direccion;
	}

	/**
	 * Metodo que permite acceder al atributo Aingreso dentro de un cuadro de lista
	 * 
	 * @return aingreso
	 */
	public JComboBox<String> getAingreso() {
		return aingreso;
	}

	/**
	 * Metodo que permite modificar el atributo Aingreso dentro de un cuadro de
	 * lista
	 * 
	 * @param aingreso the aingreso to set
	 */
	public void setAingreso(JComboBox<String> aingreso) {
		this.aingreso = aingreso;
	}

	/**
	 * Metodo que permite acceder al texto lb_nombres
	 * 
	 * @return lb_nombres
	 */
	public JLabel getlb_nombres() {
		return lb_nombres;
	}

	/**
	 * Metodo que permite modificar el texto lb_nombres
	 * 
	 * @param lb_nombres the lb_nombres to set
	 */
	public void setlb_nombres(JLabel lb_nombres) {
		this.lb_nombres = lb_nombres;
	}

	/**
	 * Metodo que permite acceder al texto lb_apellidos
	 * 
	 * @return lb_apellidos
	 */
	public JLabel getlb_apellidos() {
		return lb_apellidos;
	}

	/**
	 * Metodo que permite modificar el texto lb_apellidos
	 * 
	 * @param lb_apellidos the lb_apellidos to set
	 */
	public void setlb_apellidos(JLabel lb_apellidos) {
		this.lb_apellidos = lb_apellidos;
	}

	/**
	 * Metodo que permite acceder al texto lb_genero
	 * 
	 * @return lb_genero
	 */
	public JLabel getlb_genero() {
		return lb_genero;
	}

	/**
	 * Metodo que permite modificar el texto lb_genero
	 * 
	 * @param lb_genero the lb_genero to set
	 */
	public void setlb_genero(JLabel lb_genero) {
		this.lb_genero = lb_genero;
	}

	/**
	 * Metodo que permite acceder al texto lb_fecha_naci
	 * 
	 * @return lb_fecha_naci
	 */
	public JLabel getlb_fecha_naci() {
		return lb_fecha_naci;
	}

	/**
	 * Metodo que permite modificar el texto lb_fecha_naci
	 * 
	 * @param lb_fecha_naci the lb_fecha_naci to set
	 */
	public void setlb_fecha_naci(JLabel lb_fecha_naci) {
		this.lb_fecha_naci = lb_fecha_naci;
	}

	/**
	 * Metodo que permite acceder al texto lb_tipo_salario
	 * 
	 * @return lb_tipo_salario
	 */
	public JLabel getlb_tipo_salario() {
		return lb_tipo_salario;
	}

	/**
	 * Metodo que permite modificar el texto lb_tipo_salario
	 * 
	 * @param lb_tipo_salario the lb_tipo_salario to set
	 */
	public void setlb_tipo_salario(JLabel lb_tipo_salario) {
		this.lb_tipo_salario = lb_tipo_salario;
	}

	/**
	 * Metodo que permite acceder el texto lb_categoria
	 * 
	 * @return lb_categoria
	 */
	public JLabel getlb_categoria() {
		return lb_categoria;
	}

	/**
	 * Metodo que permite modificar el texto lb_categoria
	 * 
	 * @param lb_categoria the lb_categoria to set
	 */
	public void setlb_categoria(JLabel lb_categoria) {
		this.lb_categoria = lb_categoria;
	}

	/**
	 * Metodo que permite acceder el texto lb_telefono
	 * 
	 * @return lb_telefono
	 */
	public JLabel getlb_telefono() {
		return lb_telefono;
	}

	/**
	 * Metodo que permite modificar el texto de lb_telefono
	 * 
	 * @param lb_telefono the lb_telefono to set
	 */
	public void setlb_telefono(JLabel lb_telefono) {
		this.lb_telefono = lb_telefono;
	}

	/**
	 * Metodo que permite acceder el texto lb_correoe
	 * 
	 * @return lb_correoe
	 */
	public JLabel getlb_correoe() {
		return lb_correoe;
	}

	/**
	 * Metodo que permite modificar el texto lb_correoe
	 * 
	 * @param lb_correoe the correoe to set
	 */
	public void setlb_correoe(JLabel lb_correoe) {
		this.lb_correoe = lb_correoe;
	}

	/**
	 * Metodo que permite acceder el texto lb_direccion
	 * 
	 * @return lb_direccion
	 */
	public JLabel getlb_direccion() {
		return lb_direccion;
	}

	/**
	 * Metodo que permite modificar el texto lb_direccion
	 * 
	 * @param lb_direccion the lb_direccion to set
	 */
	public void setlb_direccion(JLabel lb_direccion) {
		this.lb_direccion = lb_direccion;
	}

	/**
	 * Metodo que permite acceder el texto lb_a�o_ingreso
	 * 
	 * @return lb_a�o_ingreso
	 */
	public JLabel getlb_año_ingreso() {
		return lb_año_ingreso;
	}

	/**
	 * Metodo que permite modificar el texto lb_a�o_ingreso
	 * 
	 * @param lb_a�o_ingreso the lb_a�o_ingreso
	 */
	public void setlb_año_ingreso(JLabel lb_año_ingreso) {
		this.lb_año_ingreso = lb_año_ingreso;
	}

	/**
	 * Metodo que permite acceder el texto lb_antiguedad
	 * 
	 * @return lb_antiguedad
	 */
	public JLabel getlb_antiguedad() {
		return lb_antiguedad;
	}

	/**
	 * Metodo que permite modificar el texto lb_antiguedad
	 * 
	 * @param lb_antiguedad the lb_antiguedad to set
	 */
	public void setlb_antiguedad(JLabel lb_antiguedad) {
		this.lb_antiguedad = lb_antiguedad;
	}

	/**
	 * Metodo que permite acceder el texto lb_dia
	 * 
	 * @return lb_dia
	 */
	public JLabel getlb_dia() {
		return lb_dia;
	}

	/**
	 * Metodo que permite modificar el texto lb_dia
	 * 
	 * @param lb_dia the lb_dia to set
	 */
	public void setlb_dia(JLabel lb_dia) {
		this.lb_dia = lb_dia;
	}

	/**
	 * Metodo que permite acceder el texto lb_mes
	 * 
	 * @return lb_mes
	 */
	public JLabel getlb_mes() {
		return lb_mes;
	}

	/**
	 * Metodo que permite modificar el texto lb_mes
	 * 
	 * @param lb_mes the lb_mes to set
	 */
	public void setlb_mes(JLabel lb_mes) {
		this.lb_mes = lb_mes;
	}

	/**
	 * Metodo que permite acceder el texto lb_a�o
	 * 
	 * @return lb_a�o
	 */
	public JLabel getlb_año() {
		return lb_año;
	}

	/**
	 * Metodo que permite acceder al texto lb_a�o
	 * 
	 * @param lb_a�o the lb_a�o to set
	 */
	public void setlb_año(JLabel lb_año) {
		this.lb_año = lb_año;
	}

	/**
	 * Metodo que permite acceder al atributo Nivel dentro de un cuadro de lista
	 * 
	 * @return nivel
	 */
	public JComboBox<String> getNivel() {
		return nivel;
	}

	/**
	 * Metodo que permite modificar el atributo nivel dentro de un cuadro de lista
	 * 
	 * @param nivel the nivel to set
	 */
	public void setNivel(JComboBox<String> nivel) {
		this.nivel = nivel;
	}

	/**
	 * Metodo que permite acceder el texto Et_ex
	 * 
	 * @return et_ex
	 */
	public JLabel getEt_ex() {
		return et_ex;
	}

	/**
	 * Metodo que permite modificar el texto Et_ex
	 * 
	 * @param et_ex the et_ex to set
	 */
	public void setEt_ex(JLabel et_ex) {
		this.et_ex = et_ex;
	}

	/**
	 * Metodo que permite acceder al atributo Dia dentro de un cuadro de lista
	 * 
	 * @return dia
	 */
	public JComboBox<String> getDia() {
		return dia;
	}

	/**
	 * Metodo que permite modificar el atributo dia dentro de un cuadro de lista
	 * 
	 * @param dia the dia to set
	 */
	public void setDia(JComboBox<String> dia) {
		this.dia = dia;
	}

	/**
	 * Metodo que permite acceder al atributo Mes dentro de un cuadro de lista
	 * 
	 * @return mes
	 */
	public JComboBox<String> getMes() {
		return mes;
	}

	/**
	 * Metodo que permite modificar al atributo mes dentro de un cuadro de lista
	 * 
	 * @param mes
	 */
	public void setMes(JComboBox<String> mes) {
		this.mes = mes;
	}

	/**
	 * Metodo que permite acceder al atributo A�o dentro de un cuadro de lista
	 * 
	 * @return A�o
	 */
	public JComboBox<String> getAño() {
		return año;
	}

	/**
	 * Metodo que permite modificar el atributo A�o dentro de un cuadro de lista
	 * 
	 * @param a�o the a�o to set
	 */
	public void setAño(JComboBox<String> año) {
		this.año = año;
	}

	/**
	 * Metodo que permite acceder el texto Et
	 * 
	 * @return lb_cedula
	 */
	public JLabel getEt() {
		return lb_cedula;
	}

	/**
	 * Metodo que permite modificar el texto Et
	 * 
	 * @param lb_cedula the lb_cedula to set
	 */
	public void setEt(JLabel lb_cedula) {
		this.lb_cedula = lb_cedula;
	}

	/**
	 * Getter del boton de Bt_a�adir, se usa para agregarle su respectivo
	 * ActionListener
	 * 
	 * @return bt_a�adir
	 */
	public JButton getBt_añadir() {
		return bt_añadir;
	}

	/**
	 * setter delboton Bt_a�adir
	 * 
	 * @param bt_a�adir the bt_a�adir to set
	 */
	public void setBt_añadir(JButton bt_añadir) {
		this.bt_añadir = bt_añadir;
	}

	/**
	 * Metodo que permite modificar el atributo antiguedad
	 * 
	 * @param antiguedad the antiguedad to set
	 */
	public void setantiguedad(String antiguedad) {
		this.antiguedad = antiguedad;
	}

	/**
	 * Metodo que permite acceder al Salario
	 * 
	 * @return salario
	 */
	public double getSalario() {
		return salario;
	}

	/**
	 * Metodo que permite modificar el Atributo Salarioalario
	 * 
	 * @param salario the salario to set
	 */
	public void setSalario(double salario) {
		this.salario = salario;
	}

	/**
	 * Metodo que permite acceceder al texto Lb_numero_ventas
	 * 
	 * @return lb_numero_ventas
	 */
	public JLabel getLb_numero_ventas() {
		return lb_numero_ventas;
	}

	/**
	 * Metodo que permite modificar el texto lb_numero_ventas
	 * 
	 * @param lb_numero_ventas the lb_numero_ventas to set
	 */
	public void setLb_numero_ventas(JLabel lb_numero_ventas) {
		this.lb_numero_ventas = lb_numero_ventas;
	}

	/**
	 * Metodo que permite acceder al atributo Clientes_captados dentro de un cuadro
	 * de lista
	 * 
	 * @return clientes_captados
	 */
	public JComboBox<String> getClientes_captados() {
		return clientes_captados;
	}

	/**
	 * Metodo que permite modificar el atributo Clientes Captados dentro de un
	 * cuadro de lista
	 * 
	 * @param clientes_captados the clientes_captados to set
	 */
	public void setClientes_captados(JComboBox<String> clientes_captados) {
		this.clientes_captados = clientes_captados;
	}

	/**
	 * Metodo que permite acceder al texto Lb_clientes_captados
	 * 
	 * @return lb_clientes_captados
	 */
	public JLabel getLb_clientes_captados() {
		return lb_clientes_captados;
	}

	/**
	 * Metodo que permite modificar el texto Lb_clientes_captados
	 * 
	 * @param lb_clientes_captados the lb_clientes_captados to set
	 */
	public void setLb_clientes_captados(JLabel lb_clientes_captados) {
		this.lb_clientes_captados = lb_clientes_captados;
	}

	/**
	 * Metodo que permite acceder al texto Lb_monto_por_cliente
	 * 
	 * @return lb_monto_por_cliente
	 */
	public JLabel getLb_monto_por_cliente() {
		return lb_monto_por_cliente;
	}

	/**
	 * Metodo que permite modificar el texto de Lb_monto_por_cliente
	 * 
	 * @param lb_monto_por_cliente the lb_monto_por_cliente to set
	 */
	public void setLb_monto_por_cliente(JLabel lb_monto_por_cliente) {
		this.lb_monto_por_cliente = lb_monto_por_cliente;
	}

	/**
	 * Getter del boton monto por cliente, se usa para agregarle su respectivo
	 * ActionListener
	 * 
	 * @return bt_monto_por_cliente
	 */
	public JButton getBt_monto_por_cliente() {
		return bt_monto_por_cliente;
	}

	/**
	 * setter del boton monto por cliente
	 * 
	 * @param bt_monto_por_cliente the bt_monto_por_cliente to set
	 */
	public void setBt_monto_por_cliente(JButton bt_monto_por_cliente) {
		this.bt_monto_por_cliente = bt_monto_por_cliente;
	}
/**
 * Metodo que permite acceder al atributo Count_validaciones
 * @return count_validaciones
 */
	public int getCount_validaciones() {
		return count_validaciones;
	}
/**
 * Metodo que permite modificar el atributo Count_validaciones
 * @param count_validaciones the count_validaciones to set
 */
	public void setCount_validaciones(int count_validaciones) {
		this.count_validaciones = count_validaciones;
	}
/**
 * Metodo que verifica si la cadena es numerica
 * @param cadena atributo que especifica o toma el valor de cada atributo
 * @return true or false
 */
	public boolean isNumeric(String cadena){
		try {
			Integer.parseInt(cadena);
			return true;
		} catch (NumberFormatException nfe){
			return false;
		}
	}
/**
 * Metodo que verifica si la cadena es texto
 * @param cadena atributo que especifica o toma el valor de cada atributo
 * @return  rta
 */
	public boolean isText(String cadena) {
		boolean rta=true;
		if(cadena.contains("0")||cadena.contains("1")||cadena.contains("2")||cadena.contains("3")||cadena.contains("4")
				||cadena.contains("5")||cadena.contains("6")||cadena.contains("7")||cadena.contains("8")||cadena.contains("9")) {
			rta=false;
		}
		return rta;
	}
	
	/**
	 * Metodo que reinicia los campos de texto dentro de la ventana A�adir empleado
	 */
	public void reiniciarTodo() {
		cedula.setText(null);
		apellido.setText(null);
		nombre.setText(null);
		telefono.setText(null);
		correoe.setText(null);
		direccion.setText(null);
		genero.setSelectedItem("Seleccione");
		tsalario.setSelectedItem("Seleccione");
		categoria.setSelectedItem("Seleccione");
		nivel.setSelectedItem("Seleccione");
		numero_ventas.setSelectedItem("Seleccione");
		clientes_captados.setSelectedItem("Seleccione");
		getClientes_captados().setVisible(false);
		getLb_clientes_captados().setVisible(false);
		getcategoria().setVisible(false);
		getlb_categoria().setVisible(false);
		getNivel().setVisible(false);
		getEt_ex().setVisible(false);
		getNivel().setVisible(false);
		getBt_monto_por_cliente().setVisible(false);
		getLb_monto_por_cliente().setVisible(false);
		
	}
	
	
}


