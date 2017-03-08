package Ventanas;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JTextPane;
import javax.swing.JTextArea;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class PacienteListadoView {

	public JFrame frame;

	/**
	 * Launch the application.
	 */

	/**
	 * Create the application.
	 */
	public PacienteListadoView() {
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
		
		JLabel lblListadoDePacientes = new JLabel("LISTADO DE PACIENTES");
		lblListadoDePacientes.setBounds(144, 6, 169, 36);
		frame.getContentPane().add(lblListadoDePacientes);
		//lblListadoDePacientes.setText(listado);
		
		
		JButton btnAtrs = new JButton("Atrás");
		btnAtrs.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
			}
		});
		btnAtrs.setBounds(6, 243, 117, 29);
		frame.getContentPane().add(btnAtrs);
		
		JButton btnMostrar = new JButton("Mostrar");
		btnMostrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		btnMostrar.setBounds(169, 102, 117, 29);
		frame.getContentPane().add(btnMostrar);
		
		JList list = new JList();
		list.setBounds(6, 41, 151, 190);
		frame.getContentPane().add(list);
		
		JTextPane textPane = new JTextPane();
		textPane.setBounds(293, 41, 151, 190);
		frame.getContentPane().add(textPane);
	}
}
