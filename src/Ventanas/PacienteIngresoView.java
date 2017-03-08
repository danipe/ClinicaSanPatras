package Ventanas;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class PacienteIngresoView {

	public JFrame frame;
	private JTextField txtHola;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;


	/**
	 * Create the application.
	 */
	public PacienteIngresoView() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setResizable(false);
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblIngresarPaciente = new JLabel("INGRESAR PACIENTE");
		lblIngresarPaciente.setHorizontalAlignment(SwingConstants.CENTER);
		lblIngresarPaciente.setBounds(132, 6, 159, 29);
		frame.getContentPane().add(lblIngresarPaciente);
		
		JLabel lblNombre = new JLabel("Nombre:");
		lblNombre.setBounds(6, 43, 61, 16);
		frame.getContentPane().add(lblNombre);
		
		JLabel lblApellidos = new JLabel("Apellidos:");
		lblApellidos.setBounds(6, 71, 92, 16);
		frame.getContentPane().add(lblApellidos);
		
		JLabel lblDni = new JLabel("DNI:");
		lblDni.setBounds(6, 99, 61, 16);
		frame.getContentPane().add(lblDni);
		
		JLabel lblDireccin = new JLabel("Dirección:");
		lblDireccin.setBounds(6, 127, 92, 16);
		frame.getContentPane().add(lblDireccin);
		
		JLabel lblCp = new JLabel("CP:");
		lblCp.setBounds(6, 155, 92, 16);
		frame.getContentPane().add(lblCp);
		
		JLabel lblTelefono = new JLabel("Telefono:");
		lblTelefono.setBounds(6, 183, 92, 16);
		frame.getContentPane().add(lblTelefono);
		
		JLabel lblCorreo = new JLabel("Provincia:");
		lblCorreo.setBounds(6, 211, 92, 16);
		frame.getContentPane().add(lblCorreo);
		
		JLabel lblFechaNacimiento = new JLabel("Fecha nacimiento:");
		lblFechaNacimiento.setBounds(6, 239, 92, 16);
		frame.getContentPane().add(lblFechaNacimiento);
		
		txtHola = new JTextField();
		txtHola.setToolTipText("Hola");
		txtHola.setBounds(110, 33, 130, 26);
		frame.getContentPane().add(txtHola);
		txtHola.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(110, 66, 130, 26);
		frame.getContentPane().add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(110, 122, 130, 26);
		frame.getContentPane().add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(110, 94, 130, 26);
		frame.getContentPane().add(textField_3);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(110, 150, 130, 26);
		frame.getContentPane().add(textField_4);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(110, 178, 130, 26);
		frame.getContentPane().add(textField_5);
		
		textField_6 = new JTextField();
		textField_6.setColumns(10);
		textField_6.setBounds(110, 206, 130, 26);
		frame.getContentPane().add(textField_6);
		
		textField_7 = new JTextField();
		textField_7.setColumns(10);
		textField_7.setBounds(110, 234, 130, 26);
		frame.getContentPane().add(textField_7);
		
		JButton btnIngresar = new JButton("Ingresar");
		btnIngresar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		btnIngresar.setBounds(304, 234, 117, 29);
		frame.getContentPane().add(btnIngresar);
		
		JButton btnAtrs = new JButton("Atrás");
		btnAtrs.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
			}
		});
		btnAtrs.setBounds(304, 206, 117, 29);
		frame.getContentPane().add(btnAtrs);
	}

}
