package Ventanas;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JList;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class MedicosViewBorrar extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */

	/**
	 * Create the frame.
	 */
	public MedicosViewBorrar(MedicosView mv) {
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblBorrarMedico = new JLabel("Borrar medico");
		lblBorrarMedico.setFont(new Font("Tahoma", Font.PLAIN, 33));
		lblBorrarMedico.setBounds(112, 0, 204, 56);
		contentPane.add(lblBorrarMedico);
		
		JList list = new JList();
		list.setBounds(26, 61, 145, 154);
		contentPane.add(list);
		
		JButton btnAtrs = new JButton("Atr\u00E1s");
		btnAtrs.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				mv.setVisible(true);
				
			}
		});
		btnAtrs.setBounds(26, 237, 89, 23);
		contentPane.add(btnAtrs);
		
		JButton btnBorrar = new JButton("Borrar");
		btnBorrar.setBounds(197, 93, 89, 23);
		contentPane.add(btnBorrar);
	}

}
