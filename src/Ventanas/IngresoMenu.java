package Ventanas;
import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JSeparator;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import javax.swing.JTable;
import javax.swing.JTabbedPane;
import java.awt.GridBagLayout;
import java.awt.CardLayout;
import java.awt.GridLayout;
import javax.swing.JTextPane;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class IngresoMenu extends JFrame {

	private JPanel contentPane;
	
	private IngresoMenu im;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
			//Muestra ventana menu ingresos
			IngresoMenu frame = new IngresoMenu();
			frame.setVisible(true);
	}

	/**
	 * Create the frame.
	 */
	public IngresoMenu() {
		 im = this;
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		
		JPanel Cabezera = new JPanel();
		contentPane.add(Cabezera, BorderLayout.NORTH);
		
		JLabel titulo = new JLabel("Menu Ingresos");
		Cabezera.add(titulo);
		
		JPanel Izquierda = new JPanel();
		contentPane.add(Izquierda, BorderLayout.WEST);
		
		JSeparator separadorIzq = new JSeparator();
		Izquierda.add(separadorIzq);
		
		JPanel Central = new JPanel();
		contentPane.add(Central, BorderLayout.CENTER);
		
		JTextPane IngresosConsulta = new JTextPane();
		Central.add(IngresosConsulta);
		
		JPanel Derecha = new JPanel();
		contentPane.add(Derecha, BorderLayout.EAST);
		
		JSeparator separadorDer = new JSeparator();
		Derecha.add(separadorDer);
		
		JPanel Pie = new JPanel();
		contentPane.add(Pie, BorderLayout.SOUTH);
		
		JButton botonVolver = new JButton("Volver");
		botonVolver.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//Salimos de los ingresos
				dispose();
			}
		});
		Pie.add(botonVolver);
		
		JButton botonReg = new JButton("Registrar");
		botonReg.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//Abrimos panel para registrar nuevo ingreso
				IngresoNuevo in = new IngresoNuevo(im);
				in.setVisible(true);
				im.setVisible(false);
			}
		});
		Pie.add(botonReg);
		
		JButton botonElim = new JButton("Eliminar");
		botonElim.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//Abrimos panel para eliminar ingreso
				IngresoEliminar ie = new IngresoEliminar(im);
				ie.setVisible(true);
				im.setVisible(false);
			}
		});
		Pie.add(botonElim);
	}

}
