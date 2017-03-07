package Ventanas;
import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ComprobacionSalir extends JFrame {

	private JPanel contentPane;
	private Menu mn;
	/**
	 * Launch the application.
	 */
	

	/**
	 * Create the frame.
	 */
	
	public ComprobacionSalir(Menu mn) {
		this.mn=mn;
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblestasSeguroDe = new JLabel("                    \u00BFEstas seguro de que quieres salir?");
		lblestasSeguroDe.setBounds(53, 11, 309, 14);
		contentPane.add(lblestasSeguroDe);
		
		JButton btnNewButton = new JButton("Si");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				
				mn.dispose();
			}
		});
		btnNewButton.setBounds(41, 101, 119, 49);
		contentPane.add(btnNewButton);
		
		JButton btnNo = new JButton("No");
		btnNo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		btnNo.setBounds(243, 101, 119, 49);
		contentPane.add(btnNo);
	}

}
