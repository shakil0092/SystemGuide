import java.awt.EventQueue;
import java.sql.*;
import javax.swing.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.awt.Font;


public class Front_END {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void admin_login() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Front_END window = new Front_END();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	Connection connection=null;
	private JTextField username;
	private JPasswordField password;
//	private JPanel contentPane;
	/**
	 * Create the application.
	 */
	public Front_END() {
		initialize();
		connection=projectDB.dbConnector();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 377, 304);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblUsername = new JLabel("Username");
		lblUsername.setFont(new Font("Palatino Linotype", Font.BOLD, 13));
		lblUsername.setForeground(Color.WHITE);
		lblUsername.setHorizontalAlignment(SwingConstants.CENTER);
		lblUsername.setBounds(51, 69, 76, 14);
		frame.getContentPane().add(lblUsername);
		
		JLabel lblPassword = new JLabel("Password");
		lblPassword.setFont(new Font("Palatino Linotype", Font.BOLD, 13));
		lblPassword.setForeground(Color.WHITE);
		lblPassword.setHorizontalAlignment(SwingConstants.CENTER);
		lblPassword.setBounds(51, 112, 76, 14);
		frame.getContentPane().add(lblPassword);
		
		username = new JTextField();
		username.setFont(new Font("Consolas", Font.BOLD, 11));
		username.setToolTipText("username");
		username.setBounds(148, 65, 148, 23);
		frame.getContentPane().add(username);
		username.setColumns(10);
		
		password = new JPasswordField();
		password.setFont(new Font("Consolas", Font.BOLD, 11));
		password.setEchoChar('*');
		password.setBounds(148, 107, 148, 25);
		frame.getContentPane().add(password);
		
		JButton login = new JButton("Login");
		login.setFont(new Font("Microsoft YaHei UI Light", Font.BOLD, 11));
		login.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try{
					String query = "Select * From Admin Where username=? and password=?";
					PreparedStatement pst = connection.prepareStatement(query);
					pst.setString(1, username.getText());
					pst.setString(2, password.getText());
					
					ResultSet rs = pst.executeQuery();
					int count = 0;
					while(rs.next()){
						count = count+1;
					}
					if(count == 1)
					{
						JOptionPane.showMessageDialog(null, "Login Successful");
						frame.dispose();
						admin_page manage = new admin_page();
						manage.setVisible(true);
					}
					else
					{
						JOptionPane.showMessageDialog(null, "Invalid Username and Password");
						
					}
					rs.close();
					pst.close();
				}catch(Exception m)
				{
					JOptionPane.showMessageDialog(null, m);
				}
				
			}
		});
		login.setBounds(148, 161, 148, 23);
		frame.getContentPane().add(login);
		
		JButton btnHome = new JButton("HOME");
		btnHome.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				frame.dispose();
				Selector select = new Selector();
				select.setVisible(true);
			}
		});
		btnHome.setIcon(new ImageIcon(Front_END.class.getResource("/img/hmbtn.png")));
		btnHome.setBounds(148, 195, 148, 23);
		frame.getContentPane().add(btnHome);
		
		JLabel label = new JLabel("");
		label.setFont(new Font("Tahoma", Font.PLAIN, 14));
		label.setIcon(new ImageIcon(Front_END.class.getResource("/img/adminback.jpg")));
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setBounds(0, 0, 361, 265);
		frame.getContentPane().add(label);
	}
}
