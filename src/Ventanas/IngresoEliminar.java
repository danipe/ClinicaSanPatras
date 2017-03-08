package Ventanas;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JTable;
import javax.swing.JTabbedPane;
import javax.swing.JSpinner;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class IngresoEliminar extends JFrame {

	private JPanel contentPane;

	/**
	 * Create the frame.
	 */
	public IngresoEliminar(IngresoMenu im) {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 250, 150);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JPanel Cabezera = new JPanel();
		contentPane.add(Cabezera, BorderLayout.NORTH);
		
		JLabel lblEliminarIngreso = new JLabel("Eliminar Ingreso");
		Cabezera.add(lblEliminarIngreso);
		
		JPanel Izquierda = new JPanel();
		contentPane.add(Izquierda, BorderLayout.WEST);
		
		JPanel Cuerpo = new JPanel();
		contentPane.add(Cuerpo, BorderLayout.CENTER);
		
		JPanel panelNumIngreso = new JPanel();
		Cuerpo.add(panelNumIngreso);
		
		JLabel labelNumIngreso = new JLabel("Numero Ingreso");
		panelNumIngreso.add(labelNumIngreso);
		
		JSpinner numIngreso = new JSpinner();
		panelNumIngreso.add(numIngreso);
		
		JPanel Derecha = new JPanel();
		contentPane.add(Derecha, BorderLayout.EAST);
		
		JPanel Pie = new JPanel();
		contentPane.add(Pie, BorderLayout.SOUTH);
		
		JButton elimCancelar = new JButton("Cancelar");
		elimCancelar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//Volvemos a menu de ingresos
				dispose();
				im.setVisible(true);
			}
		});
		Pie.add(elimCancelar);
		
		JButton elimElim = new JButton("Eliminar");
		Pie.add(elimElim);
	}

}
