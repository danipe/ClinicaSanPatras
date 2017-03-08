package Ventanas;
import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.FlowLayout;
import javax.swing.JLabel;
import javax.swing.BoxLayout;
import javax.swing.JMenu;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import javax.swing.JSeparator;
import javax.swing.JSplitPane;
import javax.swing.JList;
import javax.swing.JTextField;
import java.awt.GridLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class IngresoNuevo extends JFrame {

	private JPanel contentPane;
	private JTextField num_Paciente;
	private JTextField fecha_Ingreso;
	private JTextField medico;
	private JTextField numCama;
	private JTextField numHabitacion;

	/**
	 * Create the frame.
	 */
	public IngresoNuevo(IngresoMenu im) {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		
		JPanel Cabezera = new JPanel();
		contentPane.add(Cabezera, BorderLayout.NORTH);
		
		JLabel titulo = new JLabel("Nuevo ingreso");
		Cabezera.add(titulo);
		
		JPanel izquierda = new JPanel();
		contentPane.add(izquierda, BorderLayout.WEST);
		
		JSeparator espaciadorIZQ = new JSeparator();
		espaciadorIZQ.setOrientation(SwingConstants.VERTICAL);
		izquierda.add(espaciadorIZQ);
		
		JPanel Cuerpo = new JPanel();
		contentPane.add(Cuerpo, BorderLayout.CENTER);
		Cuerpo.setLayout(new GridLayout(0, 1, 0, 0));
		
		JLabel label_NumPaciente = new JLabel("Numero paciente");
		Cuerpo.add(label_NumPaciente);
		
		num_Paciente = new JTextField();
		Cuerpo.add(num_Paciente);
		num_Paciente.setColumns(10);
		
		JLabel label_Fecha = new JLabel("Fecha ingreso");
		Cuerpo.add(label_Fecha);
		
		fecha_Ingreso = new JTextField();
		Cuerpo.add(fecha_Ingreso);
		fecha_Ingreso.setColumns(10);
		
		JLabel labelMedico = new JLabel("Médico asignado");
		Cuerpo.add(labelMedico);
		
		medico = new JTextField();
		Cuerpo.add(medico);
		medico.setColumns(10);
		
		JLabel labelHabitacion = new JLabel("Habitación");
		Cuerpo.add(labelHabitacion);
		
		numHabitacion = new JTextField();
		numHabitacion.setColumns(10);
		Cuerpo.add(numHabitacion);
		
		JLabel lblCama = new JLabel("Cama");
		Cuerpo.add(lblCama);
		
		numCama = new JTextField();
		numCama.setColumns(10);
		Cuerpo.add(numCama);
		
		JPanel derecha = new JPanel();
		contentPane.add(derecha, BorderLayout.EAST);
		
		JSeparator separator = new JSeparator();
		separator.setOrientation(SwingConstants.VERTICAL);
		derecha.add(separator);
		
		JPanel Pie = new JPanel();
		contentPane.add(Pie, BorderLayout.SOUTH);
		
		JButton atras = new JButton("Cancelar");
		atras.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//Volvemos a menu de ingresos
				dispose();
				im.setVisible(true);
			}
		});
		atras.setHorizontalAlignment(SwingConstants.LEFT);
		Pie.add(atras);
		
		JButton botonIng = new JButton("Ingresar");
		botonIng.setHorizontalAlignment(SwingConstants.LEFT);
		Pie.add(botonIng);
	}

}
