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
import javax.swing.table.DefaultTableModel;
import javax.swing.border.BevelBorder;
import javax.swing.JList;
import javax.swing.AbstractListModel;
import java.awt.GridBagConstraints;
import javax.swing.BoxLayout;
import java.awt.Component;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import java.awt.FlowLayout;

public class IngresoMenu extends JFrame {

	private JPanel contentPane;
	
	private IngresoMenu im;
	
	/**
	 * Create the frame.
	 */
	public IngresoMenu(Menu mn) {
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
		
		JList list = new JList();
		list.setVisibleRowCount(10);
		list.setModel(new AbstractListModel() {
			String[] values = new String[] {""};
			public int getSize() {
				return values.length;
			}
			public Object getElementAt(int index) {
				return values[index];
			}
		});
		
		JButton button = new JButton("Mostrar");
		
		JTextPane textPane = new JTextPane();
		Central.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		Central.add(list);
		Central.add(button);
		Central.add(textPane);
		
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
				mn.setVisible(true);
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
