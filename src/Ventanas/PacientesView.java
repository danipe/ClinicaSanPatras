package Ventanas;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.GridBagLayout;
import javax.swing.JLabel;
import java.awt.GridBagConstraints;
import javax.swing.JTextField;
import java.awt.Insets;
import javax.swing.JButton;
import javax.swing.JEditorPane;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.awt.SystemColor;

public class PacientesView extends JFrame {

	public JFrame frame;
	private JTextField textField;


	/**
	 * Initialize the contents of the frame.
	 */
	public PacientesView(Menu mn) {
		frame = new JFrame();
		frame.setResizable(false);
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblPacientesPanel = new JLabel("PACIENTES PANEL");
		lblPacientesPanel.setForeground(SystemColor.activeCaptionText);
		lblPacientesPanel.setFont(new Font("LondonTwo", Font.PLAIN, 16));
		lblPacientesPanel.setHorizontalAlignment(SwingConstants.CENTER);
		lblPacientesPanel.setBounds(88, 6, 253, 31);
		frame.getContentPane().add(lblPacientesPanel);
		
		/*
		 *Click button ir a la venta de ingresar pacientes
		 */
		JButton btnIngresarPaciente = new JButton("Ingresar paciente");
		btnIngresarPaciente.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				PacienteIngresoView x = new PacienteIngresoView();
				x.frame.setVisible(true);
			}
		});
		btnIngresarPaciente.setBounds(25, 61, 145, 36);
		frame.getContentPane().add(btnIngresarPaciente);
		
		/*
		 *Click button ir a la venta de listar pacientes
		 */
		JButton btnListarPacientes = new JButton("Listar pacientes");
		btnListarPacientes.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				PacienteListadoView window = new PacienteListadoView();
				window.frame.setVisible(true);
			}
		});
		btnListarPacientes.setBounds(25, 122, 145, 36);
		frame.getContentPane().add(btnListarPacientes);
		
		/*
		 *Click button ir a la venta de borrar pacientes
		 */
		JButton btnBorrarPacientes = new JButton("Borrar pacientes");
		btnBorrarPacientes.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				PacienteDelView window = new PacienteDelView();
				window.frame.setVisible(true);
			}
		});
		btnBorrarPacientes.setBounds(25, 180, 145, 36);
		frame.getContentPane().add(btnBorrarPacientes);
		
		JButton btnSalir = new JButton("Atrás");
		btnSalir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
				mn.setVisible(true);
			}
		});
		btnSalir.setBounds(282, 243, 117, 29);
		frame.getContentPane().add(btnSalir);
		
		textField = new JTextField();
		textField.setBounds(250, 61, 194, 151);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
	}
}
