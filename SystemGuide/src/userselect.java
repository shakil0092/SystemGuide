import java.awt.Container;
import java.awt.EventQueue;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JTabbedPane;
import javax.swing.UIManager;
import javax.swing.table.DefaultTableModel;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JPanel;
import javax.swing.JComboBox;
import java.sql.*;
import javax.swing.JTable;
import javax.swing.JScrollPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import java.awt.Color;
import java.awt.Font;

public class userselect {

	private JFrame frame;
	private JComboBox dropmenu;
	private JTable table;
	ResultSet rs;
	String data[][]= new String[100][5];
	JTextArea textArea;
	private JTextField r1;
	private JTextField r2;
	

	/**
	 * Launch the application.
	 */
	public static void userface() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					userselect window = new userselect();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	Connection connection=null;
	private JTable show;
	private void fillComboBox()
	{
		try{
			String query = "select * from category";
			PreparedStatement pst = connection.prepareStatement(query);
			ResultSet rs = pst.executeQuery();
			
			while(rs.next())
			{
				String collect = rs.getString("Cat_name");
				dropmenu.addItem(collect);
			}
		}catch(Exception u)
		{
			
		}
		
	}
	
	
	/**
	 * Create the application.
	 */
	public userselect() {
		initialize();
		connection=projectDB.dbConnector();
		//System.out.println("Connection Successful");
		fillComboBox();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 662, 459);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		UIManager.put("TabbedPane.contentOpaque", false);
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(10, 35, 626, 374);
		frame.getContentPane().add(tabbedPane);
		
		JPanel panel = new JPanel();
		panel.setOpaque(false);
		tabbedPane.addTab("DESKTOP", null, panel, null);
		panel.setLayout(null);
		
		dropmenu = new JComboBox();
		dropmenu.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try{
					if(dropmenu.getSelectedItem().equals("GPU")){
						try{
							String query = "select * from vgpu";
							PreparedStatement psr = connection.prepareStatement(query);
							ResultSet rst = psr.executeQuery(); 
							
							int i = 0;
							String data[][] = new String[40][3];
							while(rst.next())
							{
								data[i][0] = rst.getString(1);
								data[i][1] = rst.getString(2);
								data[i][2] = rst.getString(3);
								
								i++;
							}
							String colname[] = {"Brand_Model","DDR5_Memory","Price"};
							show.setModel(new DefaultTableModel(data,colname));
							
						}catch(Exception g)
						{
							
						}
						
					}else if(dropmenu.getSelectedItem().equals("HDD")){
						try{
							String query = "select * from vhdd";
							PreparedStatement psa = connection.prepareStatement(query);
							ResultSet rsa = psa.executeQuery(); 
							
							int i = 0;
							String data[][] = new String[30][4];
							while(rsa.next())
							{
								data[i][0] = rsa.getString(1);
								data[i][1] = rsa.getString(2);
								data[i][2] = rsa.getString(3);
								data[i][3] = rsa.getString(4);
								
								i++;
							}
							String colname[] = {"Brand","Memory","HType","Price"};
							show.setModel(new DefaultTableModel(data,colname));
							
						}catch(Exception a)
						{
							
						}
						
					}else if(dropmenu.getSelectedItem().equals("MOBO")){
						try{
							String query = "select * from vmobo";
							PreparedStatement psa = connection.prepareStatement(query);
							ResultSet rsa = psa.executeQuery(); 
							
							int i = 0;
							String data[][] = new String[65][3];
							while(rsa.next())
							{
								data[i][0] = rsa.getString(1);
								data[i][1] = rsa.getString(2);
								data[i][2] = rsa.getString(3);
								
								i++;
							}
							String colname[] = {"Brand","Model","Price"};
							show.setModel(new DefaultTableModel(data,colname));
							
						}catch(Exception b)
						{
							
						}
						
					}else if(dropmenu.getSelectedItem().equals("OPD")){
						try{
							String query = "select * from vopd";
							PreparedStatement psc = connection.prepareStatement(query);
							ResultSet rsc = psc.executeQuery(); 
							
							int i = 0;
							String data[][] = new String[10][3];
							while(rsc.next())
							{
								data[i][0] = rsc.getString(1);
								data[i][1] = rsc.getString(2);
								data[i][2] = rsc.getString(3);
								
								i++;
							}
							String colname[] = {"Brand","Type","Price"};
							show.setModel(new DefaultTableModel(data,colname));
							
						}catch(Exception c)
						{
							
						}
						
					}else if(dropmenu.getSelectedItem().equals("Processor")){
						try{
							String query = "select * from vpro";
							PreparedStatement psp = connection.prepareStatement(query);
							ResultSet rsp = psp.executeQuery(); 
							
							int i = 0;
							String data[][] = new String[25][4];
							while(rsp.next())
							{
								data[i][0] = rsp.getString(1);
								data[i][1] = rsp.getString(2);
								data[i][2] = rsp.getString(3);
								data[i][3] = rsp.getString(4);
								
								i++;
							}
							String colname[] = {"Model","Generation","ClockSpeed","Price"};
							show.setModel(new DefaultTableModel(data,colname));
							
						}catch(Exception p)
						{
							
						}
						
					}else if(dropmenu.getSelectedItem().equals("PSU")){
						try{
							String query = "select * from vpow";
							PreparedStatement psw = connection.prepareStatement(query);
							ResultSet rsw = psw.executeQuery(); 
							
							int i = 0;
							String data[][] = new String[25][3];
							while(rsw.next())
							{
								data[i][0] = rsw.getString(1);
								data[i][1] = rsw.getString(2);
								data[i][2] = rsw.getString(3);								
								i++;
							}
							String colname[] = {"Brand","Power_WATT","Price"};
							show.setModel(new DefaultTableModel(data,colname));
							
						}catch(Exception w)
						{
							
						}
						
					}else if(dropmenu.getSelectedItem().equals("RAM")){
						try{
							String query = "select * from vram";
							PreparedStatement psr = connection.prepareStatement(query);
							ResultSet rsr = psr.executeQuery(); 
							
							int i = 0;
							String data[][] = new String[35][5];
							while(rsr.next())
							{
								data[i][0] = rsr.getString(1);
								data[i][1] = rsr.getString(2);
								data[i][2] = rsr.getString(3);
								data[i][3] = rsr.getString(4);
								data[i][4] = rsr.getString(5);
								i++;
							}
							String colname[] = {"Brand","Memory","MemoryType","Speed","Price"};
							show.setModel(new DefaultTableModel(data,colname));
							
						}catch(Exception w)
						{
							
						}
						
					}
					
				}catch(Exception elf)
				{
					
				}
				
			}
		});
		dropmenu.setBounds(10, 11, 127, 20);
		panel.add(dropmenu);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 83, 601, 194);
		panel.add(scrollPane);
		
		show = new JTable();
		scrollPane.setViewportView(show);
		
		JLabel lblGraphicsProcessingUnit = new JLabel("Graphics Processing Unit (GPU)");
		lblGraphicsProcessingUnit.setFont(new Font("Consolas", Font.BOLD, 11));
		lblGraphicsProcessingUnit.setForeground(Color.WHITE);
		lblGraphicsProcessingUnit.setBounds(209, 15, 187, 14);
		panel.add(lblGraphicsProcessingUnit);
		
		JLabel lblHardDisk = new JLabel("Hard Disk (HDD)");
		lblHardDisk.setForeground(Color.WHITE);
		lblHardDisk.setFont(new Font("Consolas", Font.BOLD, 11));
		lblHardDisk.setBounds(209, 34, 97, 14);
		panel.add(lblHardDisk);
		
		JLabel lblMotherboardmobo = new JLabel("Motherboard (MOBO)");
		lblMotherboardmobo.setForeground(Color.WHITE);
		lblMotherboardmobo.setFont(new Font("Consolas", Font.BOLD, 11));
		lblMotherboardmobo.setBounds(406, 14, 113, 14);
		panel.add(lblMotherboardmobo);
		
		JLabel lblOpticalDiskDrive = new JLabel("Optical Disk Drive (OPD)");
		lblOpticalDiskDrive.setForeground(Color.WHITE);
		lblOpticalDiskDrive.setFont(new Font("Consolas", Font.BOLD, 11));
		lblOpticalDiskDrive.setBounds(209, 58, 153, 14);
		panel.add(lblOpticalDiskDrive);
		
		JLabel lblPowerSupplyUnit = new JLabel("Power Supply Unit (PSU)");
		lblPowerSupplyUnit.setForeground(Color.WHITE);
		lblPowerSupplyUnit.setFont(new Font("Consolas", Font.BOLD, 11));
		lblPowerSupplyUnit.setBounds(406, 33, 144, 14);
		panel.add(lblPowerSupplyUnit);
				
				
		JPanel panel_1 = new JPanel();
		panel_1.setForeground(Color.BLACK);
		panel_1.setOpaque(false);
		tabbedPane.addTab("LAPTOP", null, panel_1, null);
		panel_1.setLayout(null);
		
		r1 = new JTextField();
		r1.setBounds(44, 24, 86, 20);
		panel_1.add(r1);
		r1.setColumns(10);
		
		r2 = new JTextField();
		r2.setBounds(186, 24, 86, 20);
		panel_1.add(r2);
		r2.setColumns(10);
		
		JButton search = new JButton("Search");
		search.setFont(new Font("Lucida Console", Font.BOLD, 11));
		search.setBounds(293, 23, 89, 23);
		search.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
						
				try { Class.forName("com.mysql.jdbc.Driver");
		    	 connection= DriverManager.getConnection( 
		    			"jdbc:mysql://localhost:3306/sgdb",
		    			"root","ice301");
		    	Statement st = connection.createStatement();
		    	String p1 = r1.getText();
		    	String p2 = r2.getText();
		    	String s1="SELECT * FROM SGDB.v_user where price_BDT>="+p1+" and Price_BDT<="+p2+" Order By Pserial;";
				    		rs = st.executeQuery(s1);
				    		
					    	int i=0;
					    	
					    	 while(rs.next()){
					    		 data[i][0]= rs.getString(1);
					    		 data[i][1]= rs.getString(2);
					    		 data[i][2]= rs.getString(3);
					    		 data[i][3]= rs.getString(4);
					    		 data[i][4]= rs.getString(5);
					    		
					    	
					    		 i++;
					    	 }
					    	
					    	 String colname[] = {"Pserial","Bname","Model","Processor","Price_BDT"};
					    	table.setModel(new DefaultTableModel(data,colname));
			    	

			    		
		    	
		    	}catch (Exception f){
		    		System.out.println(f);
		    	}
			}
		});
		panel_1.add(search);
		
		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(44, 55, 540, 143);
		panel_1.add(scrollPane_1);
		
		table = new JTable();
		scrollPane_1.setViewportView(table);
		
		JScrollPane scrollPane_2 = new JScrollPane();
		scrollPane_2.setBounds(92, 222, 495, 87);
		panel_1.add(scrollPane_2);
		
		JTextArea textArea_2 = new JTextArea();
		scrollPane_2.setViewportView(textArea_2);
		
		JTextArea textArea_1 = new JTextArea();
		textArea_1.setBounds(92, 235, 495, 73);
		panel_1.add(textArea_1);
		
		JButton btnDetails = new JButton("Details");
		btnDetails.setFont(new Font("Lucida Console", Font.BOLD, 11));
		btnDetails.setBounds(462, 320, 125, 23);
		btnDetails.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int k = table.getSelectedRow();
				String search_key = (data[k][0]);
				try{
				Statement pst = connection.createStatement();
		    	String s3="SELECT * FROM product where pserial =" + search_key+ ";";
				//System.out.println(s3);
		    	ResultSet st = pst.executeQuery(s3);
		    	st.next();
		    	//System.out.println(st.getString(3)+" "+st.getString(4));
		    	textArea_2.setText(st.getString(5)+"\n"+st.getString(6)+"\n"+st.getString(7)+"\n"+st.getString(8)+"\n"+st.getString(9));
				
				}catch(Exception h){
					
				}
			}
		});
		panel_1.add(btnDetails);
		
		JLabel lblRam = new JLabel("RAM");
		lblRam.setBounds(36, 224, 46, 14);
		lblRam.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblRam.setForeground(Color.WHITE);
		panel_1.add(lblRam);
		
		JLabel lblHdd = new JLabel("HDD");
		lblHdd.setBounds(36, 240, 46, 14);
		lblHdd.setForeground(Color.WHITE);
		lblHdd.setFont(new Font("Tahoma", Font.BOLD, 11));
		panel_1.add(lblHdd);
		
		JLabel lblDisplay = new JLabel("Display");
		lblDisplay.setBounds(36, 252, 46, 14);
		lblDisplay.setForeground(Color.WHITE);
		lblDisplay.setFont(new Font("Tahoma", Font.BOLD, 11));
		panel_1.add(lblDisplay);
		
		JLabel lblWarranty = new JLabel("Warranty");
		lblWarranty.setBounds(36, 270, 54, 14);
		lblWarranty.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblWarranty.setForeground(Color.WHITE);
		panel_1.add(lblWarranty);
		
		JLabel lblTo = new JLabel("TO");
		lblTo.setBounds(143, 27, 46, 14);
		lblTo.setFont(new Font("Lucida Console", Font.BOLD, 16));
		lblTo.setForeground(Color.WHITE);
		panel_1.add(lblTo);
		
		JLabel lblBattery = new JLabel("Battery");
		lblBattery.setForeground(Color.WHITE);
		lblBattery.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblBattery.setBounds(36, 289, 46, 14);
		panel_1.add(lblBattery);
		
		JLabel lblInsertYoutBudget = new JLabel("Insert yout budget range");
		lblInsertYoutBudget.setForeground(Color.WHITE);
		lblInsertYoutBudget.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblInsertYoutBudget.setBounds(402, 27, 182, 14);
		panel_1.add(lblInsertYoutBudget);
		
		JButton btnNewButton = new JButton("HOME");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				frame.dispose();
				Selector select = new Selector();
				select.setVisible(true);
			}
		});
		btnNewButton.setIcon(new ImageIcon(Front_END.class.getResource("/img/hmbtn.png")));
		btnNewButton.setBounds(547, 11, 89, 23);
		frame.getContentPane().add(btnNewButton);
		
		JLabel label = new JLabel("");
		label.setBounds(0, 0, 646, 420);
		frame.getContentPane().add(label);
		label.setIcon(new ImageIcon(userselect.class.getResource("/img/2ndback.jpg")));
	
	
	
		
	}	
}
