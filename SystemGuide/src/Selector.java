//import java.awt.BorderLayout;
//import java.awt.Color;
//import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.Border;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
//import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.*;
import java.awt.Font;
import java.awt.Insets;
import java.awt.*;

import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
//import javax.swing.border.SoftBevelBorder;
//import javax.swing.border.BevelBorder;

public class Selector extends JFrame {
	
	private JPanel contentPane;
	ImageIcon icon;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Selector frame = new Selector();
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
	public Selector() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 377, 458);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton adminbtn = new JButton("ADMIN");
		adminbtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try{
					Selector slt = new Selector();
					dispose();
					Front_END fnt = new Front_END();
					Front_END.admin_login();
				}catch(Exception e){
					
				}
			}
		});
		adminbtn.setIcon(new ImageIcon(Selector.class.getResource("/img/admin2.png")));
		adminbtn.setFont(new Font("Ethnocentric Rg", Font.PLAIN, 12));
		adminbtn.setBounds(131, 266, 99, 39);
		adminbtn.setMargin(new Insets(0,0,5,5));
		adminbtn.setBorder(UIManager.getBorder("CheckBox.border"));
		contentPane.add(adminbtn);
		
		JButton userbtn = new JButton("USER");
		userbtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try{
					Selector slt = new Selector();
					dispose();
					userselect usl = new userselect();
					userselect.userface();
				}catch(Exception e){
					
				}
			}
		});
		userbtn.setIcon(new ImageIcon(Selector.class.getResource("/img/user.png")));
		userbtn.setFont(new Font("Ethnocentric Rg", Font.PLAIN, 11));
		userbtn.setBounds(131, 203, 99, 39);
		userbtn.setMargin(new Insets(0,0,5,5));
		userbtn.setBorder(UIManager.getBorder("CheckBox.border"));
		contentPane.add(userbtn);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setIcon(new ImageIcon(Selector.class.getResource("/img/front_panel.jpg")));
		lblNewLabel.setBounds(0, 0, 361, 417);
		contentPane.add(lblNewLabel);
	}

}
