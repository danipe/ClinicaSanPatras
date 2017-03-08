package Ventanas;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JTextArea;
import javax.swing.JTextPane;
import java.awt.SystemColor;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class PacienteDelView {

	public JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;


	/**
	 * Initialize the contents of the frame.
	 */
	public PacienteDelView() {
		frame = new JFrame();
		frame.setResizable(false);
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblBorrarPaciente = new JLabel("BORRAR PACIENTE");
		lblBorrarPaciente.setHorizontalAlignment(SwingConstants.CENTER);
		lblBorrarPaciente.setBounds(142, 6, 151, 27);
		frame.getContentPane().add(lblBorrarPaciente);
		
		JLabel lblNombrePaciente = new JLabel("Nombre paciente:");
		lblNombrePaciente.setBounds(6, 55, 130, 27);
		frame.getContentPane().add(lblNombrePaciente);
		
		textField = new JTextField();
		textField.setBounds(131, 55, 130, 26);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(131, 94, 130, 26);
		frame.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblDni = new JLabel("DNI:");
		lblDni.setBounds(6, 99, 61, 16);
		frame.getContentPane().add(lblDni);
		
		JLabel lblIdPaciente = new JLabel("Id paciente:");
		lblIdPaciente.setBounds(6, 138, 95, 16);
		frame.getContentPane().add(lblIdPaciente);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(131, 133, 130, 26);
		frame.getContentPane().add(textField_2);
		
		JButton btnBorrarPaciente = new JButton("Borrar paciente");
		btnBorrarPaciente.setBounds(268, 226, 138, 29);
		frame.getContentPane().add(btnBorrarPaciente);
		
		JTextPane txtpnHola = new JTextPane();
		txtpnHola.setBackground(SystemColor.window);
		txtpnHola.setText("Puedes eliminar pacientes a través de cualquier de estos campos");
		txtpnHola.setBounds(6, 211, 171, 61);
		frame.getContentPane().add(txtpnHola);
		
		JButton btnAtrs = new JButton("Atrás");
		btnAtrs.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
			}
		});
		btnAtrs.setBounds(268, 195, 117, 29);
		frame.getContentPane().add(btnAtrs);
	}
}
