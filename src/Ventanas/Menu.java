package Ventanas;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Controlador.MetodosIngresos;
import Controlador.MetodosMedicos;
import Controlador.MetodosPacientes;
import javax.swing.JLabel;


public class Menu extends JFrame {

	private JPanel contentPane;
	static Menu frame;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frame = new Menu();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Menu() {
		setResizable(false);
		MedicosView mv = new MedicosView(this);
		ComprobacionSalir cs= new ComprobacionSalir(this);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		MetodosPacientes metodosPacientes = new MetodosPacientes();
		MetodosMedicos metodosMedicos = new MetodosMedicos();
		MetodosIngresos metodosIngresos = new MetodosIngresos();
		
		JButton btnNewButton = new JButton("Pacientes");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		btnNewButton.setBounds(37, 64, 113, 41);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Ingresos");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		btnNewButton_1.setBounds(37, 166, 113, 41);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Medicos");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				frame.setVisible(false);
				mv.setVisible(true);
			}
		});
		btnNewButton_2.setBounds(262, 64, 113, 41);
		contentPane.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("Salir");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				cs.setVisible(true);
				
			}
		});
		btnNewButton_3.setBounds(262, 166, 113, 41);
		contentPane.add(btnNewButton_3);
		
		JLabel lblBienvenidosALa = new JLabel("                          Bienvenidos a la clinica San Patras");
		lblBienvenidosALa.setBounds(39, 11, 308, 14);
		contentPane.add(lblBienvenidosALa);
		
		
	}

}
