package Ventanas;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class MedicosView extends JFrame {

	private JPanel contentPane;
	
	private MedicosView mv;
	/**
	 * Launch the application.
	 */
	

	/**
	 * Create the frame.
	 */
	public MedicosView(Menu mn) {
		mv = this;
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton = new JButton("A\u00F1adir");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MedicosViewIngresar mvi = new MedicosViewIngresar(mv);
				mvi.setVisible(true);
				mv.setVisible(false);
			}
		});
		btnNewButton.setBounds(36, 61, 106, 48);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Eliminar");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MedicosViewBorrar mvb = new MedicosViewBorrar(mv);
				mvb.setVisible(true);
				mv.setVisible(false);
			}
		});
		btnNewButton_1.setBounds(36, 131, 106, 48);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Mostar");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MedicosViewMostrar mvm = new MedicosViewMostrar(mv);
				mvm.setVisible(true);
				mv.setVisible(false);
			}
		});
		btnNewButton_2.setBounds(283, 61, 106, 48);
		contentPane.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("Salir");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				mn.setVisible(true);
				dispose();
			}
		});
		btnNewButton_3.setBounds(283, 131, 106, 48);
		contentPane.add(btnNewButton_3);
		
		JLabel lblNewLabel = new JLabel("Medicos");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 33));
		lblNewLabel.setBounds(158, 11, 142, 39);
		contentPane.add(lblNewLabel);
	}

}
