import java.awt.Component;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import com.mysql.jdbc.Statement;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTabbedPane;
import javax.swing.JTextField;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.sql.*;
import java.awt.Font;
import java.awt.Window;

public class admin_page extends JFrame {

	private JPanel contentPane;
	private JTextField lserial;
	private JTextField lcode;
	private JTextField lmodel;
	private JTextField lprocessor;
	private JTextField lram;
	private JTextField lhdd;
	private JTextField display;
	private JTextField warranty;
	private JTextField battery;
	private JTextField lprice;
	Statement st;
	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					admin_page frame = new admin_page();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	Connection connection=null;
	private JTextField gserial;
	private JTextField gmodel;
	private JTextField gmemory;
	private JTextField gprice;
	private JTextField gcatid;
	private JTextField hserial;
	private JTextField hbrand;
	private JTextField hmemory;
	private JTextField htype;
	private JTextField hprice;
	private JTextField hcatid;
	private JTextField mserial;
	private JTextField mbrand;
	private JTextField mmodel;
	private JTextField mprice;
	private JTextField mcatid;
	private JTextField dserial;
	private JTextField dbrand;
	private JTextField dtype;
	private JTextField dprice;
	private JTextField dcatid;
	private JTextField pserial;
	private JTextField pmodel;
	private JTextField pgen;
	private JTextField pclk;
	private JTextField pprice;
	private JTextField pcatid;
	private JTextField poserial;
	private JTextField pobrand;
	private JTextField power;
	private JTextField poprice;
	private JTextField pocatid;
	private JTextField rserial;
	private JTextField rbrand;
	private JTextField rmemory;
	private JTextField rmemoryt;
	private JTextField rspeed;
	private JTextField rprice;
	private JTextField rcatid;
	private JButton btnHome;
	/**
	 * Create the frame.
	 */
	public admin_page() {
		initialize();
		connection=projectDB.dbConnector();
		System.out.println("Successful");
	}
	
	private void initialize() {
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 651, 450);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(10, 11, 615, 354);
		contentPane.add(tabbedPane);
		
		JPanel panel = new JPanel();
		tabbedPane.addTab("GPU", null, panel, null);
		panel.setLayout(null);
		
		JLabel lblGserial = new JLabel("GPU Serial");
		lblGserial.setBounds(38, 31, 76, 14);
		panel.add(lblGserial);
		
		gserial = new JTextField();
		gserial.setBounds(134, 28, 86, 20);
		panel.add(gserial);
		gserial.setColumns(10);
		
		JLabel lblBrandModel = new JLabel("Brand Model");
		lblBrandModel.setBounds(38, 83, 73, 14);
		panel.add(lblBrandModel);
		
		gmodel = new JTextField();
		gmodel.setBounds(134, 80, 86, 20);
		panel.add(gmodel);
		gmodel.setColumns(10);
		
		JLabel lblDdrMemory = new JLabel("DDR5 Memory");
		lblDdrMemory.setBounds(38, 136, 86, 14);
		panel.add(lblDdrMemory);
		
		gmemory = new JTextField();
		gmemory.setBounds(134, 133, 86, 20);
		panel.add(gmemory);
		gmemory.setColumns(10);
		
		JLabel lblPrice_1 = new JLabel("Price");
		lblPrice_1.setBounds(38, 193, 46, 14);
		panel.add(lblPrice_1);
		
		gprice = new JTextField();
		gprice.setBounds(134, 190, 86, 20);
		panel.add(gprice);
		gprice.setColumns(10);
		
		JLabel lblG = new JLabel("Category ID");
		lblG.setBounds(38, 246, 76, 14);
		panel.add(lblG);
		
		gcatid = new JTextField();
		gcatid.setBounds(134, 243, 86, 20);
		panel.add(gcatid);
		gcatid.setColumns(10);
		
		JButton gpuinsert = new JButton("Insert");
		gpuinsert.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String g1 = gserial.getText();
		    	String g2 = gmodel.getText();
		    	String g3= gmemory.getText();
		    	int g4= Integer.parseInt(gprice.getText());
		    	int g5= Integer.parseInt(gcatid.getText());
				try{

			    	String g = "Insert into gpu(GSerial,Brand_Model,DDR5_Memory,Price,gid) "
			    			+ "values('" +g1+ "','" +g2+ "','"+g3+"','"+g4+"','"+g5+"' );";
			    	
			    	Statement st = (Statement) connection.createStatement();
			    	st.execute(g);
			    	JOptionPane.showMessageDialog(null, "Insertion Succesful");
			    	
				}catch(Exception g)
				{
					JOptionPane.showMessageDialog(null, "Duplicate Insertion");
				}
			}
		});
		gpuinsert.setBounds(131, 292, 89, 23);
		panel.add(gpuinsert);
		
		JLabel lblGraphicsProcessingUnit = new JLabel("Graphics Processing Unit");
		lblGraphicsProcessingUnit.setFont(new Font("Lucida Console", Font.BOLD, 16));
		lblGraphicsProcessingUnit.setBounds(294, 14, 286, 46);
		panel.add(lblGraphicsProcessingUnit);
		
		JPanel panel_1 = new JPanel();
		tabbedPane.addTab("HDD", null, panel_1, null);
		panel_1.setLayout(null);
		
		hserial = new JTextField();
		hserial.setBounds(123, 29, 86, 20);
		panel_1.add(hserial);
		hserial.setColumns(10);
		
		hbrand = new JTextField();
		hbrand.setBounds(123, 72, 86, 20);
		panel_1.add(hbrand);
		hbrand.setColumns(10);
		
		hmemory = new JTextField();
		hmemory.setBounds(123, 115, 86, 20);
		panel_1.add(hmemory);
		hmemory.setColumns(10);
		
		htype = new JTextField();
		htype.setBounds(123, 159, 86, 20);
		panel_1.add(htype);
		htype.setColumns(10);
		
		hprice = new JTextField();
		hprice.setBounds(123, 201, 86, 20);
		panel_1.add(hprice);
		hprice.setColumns(10);
		
		hcatid = new JTextField();
		hcatid.setBounds(123, 243, 86, 20);
		panel_1.add(hcatid);
		hcatid.setColumns(10);
		
		JButton hddinsert = new JButton("Insert");
		hddinsert.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String h1 = hserial.getText();
		    	String h2 = hbrand.getText();
		    	String h3 = hmemory.getText();
		    	String h4 = htype.getText();
		    	int h5= Integer.parseInt(hprice.getText());
		    	int h6= Integer.parseInt(hcatid.getText());
				
				try{

			    	String h = "Insert into hdd(HDSerial,Brand,Memory,HType,Price,hid) "
			    			+ "values('" +h1+ "','" +h2+ "','"+h3+"','"+h4+"','"+h5+"','"+h6+"');";
			    	
			    	Statement st = (Statement) connection.createStatement();
			    	st.execute(h);
			    	JOptionPane.showMessageDialog(null, "Insertion Succesful");
			    	
				}catch(Exception h)
				{
					JOptionPane.showMessageDialog(null, "Duplicate Insertion");
				}
			}
		});
		hddinsert.setBounds(123, 292, 89, 23);
		panel_1.add(hddinsert);
		
		JLabel lblHdserial = new JLabel("HDD Serial");
		lblHdserial.setBounds(42, 32, 71, 14);
		panel_1.add(lblHdserial);
		
		JLabel lblBrand = new JLabel("Brand");
		lblBrand.setBounds(42, 75, 71, 14);
		panel_1.add(lblBrand);
		
		JLabel lblMemory = new JLabel("Memory");
		lblMemory.setBounds(42, 118, 71, 14);
		panel_1.add(lblMemory);
		
		JLabel lblHtype = new JLabel("HDD Type");
		lblHtype.setBounds(42, 162, 71, 14);
		panel_1.add(lblHtype);
		
		JLabel lblPrice_2 = new JLabel("Price");
		lblPrice_2.setBounds(42, 204, 71, 14);
		panel_1.add(lblPrice_2);
		
		JLabel lblHi = new JLabel("Category ID");
		lblHi.setBounds(42, 246, 71, 14);
		panel_1.add(lblHi);
		
		JLabel lblHardDisk = new JLabel("Hard Disk");
		lblHardDisk.setFont(new Font("Lucida Console", Font.BOLD, 16));
		lblHardDisk.setBounds(342, 19, 135, 38);
		panel_1.add(lblHardDisk);
		
		JPanel panel_2 = new JPanel();
		tabbedPane.addTab("MOBO", null, panel_2, null);
		panel_2.setLayout(null);
		
		JLabel lblNewLabel_2 = new JLabel("Mobo Serial");
		lblNewLabel_2.setBounds(41, 31, 81, 14);
		panel_2.add(lblNewLabel_2);
		
		JLabel lblBrand_1 = new JLabel("Brand");
		lblBrand_1.setBounds(41, 84, 46, 14);
		panel_2.add(lblBrand_1);
		
		JLabel lblModel_1 = new JLabel("Model");
		lblModel_1.setBounds(41, 138, 46, 14);
		panel_2.add(lblModel_1);
		
		JLabel lblPrice_3 = new JLabel("Price");
		lblPrice_3.setBounds(41, 190, 46, 14);
		panel_2.add(lblPrice_3);
		
		JLabel lblCategoryId = new JLabel("Category ID");
		lblCategoryId.setBounds(41, 237, 81, 14);
		panel_2.add(lblCategoryId);
		
		mserial = new JTextField();
		mserial.setBounds(133, 28, 86, 20);
		panel_2.add(mserial);
		mserial.setColumns(10);
		
		mbrand = new JTextField();
		mbrand.setText("");
		mbrand.setBounds(133, 81, 86, 20);
		panel_2.add(mbrand);
		mbrand.setColumns(10);
		
		mmodel = new JTextField();
		mmodel.setText("");
		mmodel.setBounds(133, 135, 86, 20);
		panel_2.add(mmodel);
		mmodel.setColumns(10);
		
		mprice = new JTextField();
		mprice.setText("");
		mprice.setBounds(133, 187, 86, 20);
		panel_2.add(mprice);
		mprice.setColumns(10);
		
		mcatid = new JTextField();
		mcatid.setBounds(133, 234, 86, 20);
		panel_2.add(mcatid);
		mcatid.setColumns(10);
		
		JButton minsert = new JButton("Insert");
		minsert.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String m1 = mserial.getText();
		    	String m2 = mbrand.getText();
		    	String m3= mmodel.getText();
		    	int m4= Integer.parseInt(mprice.getText());
		    	int m5= Integer.parseInt(mcatid.getText());
				try{

			    	String m = "Insert into mobo(MSerial,Brand,Model,Price,mid) "
			    			+ "values('" +m1+ "','" +m2+ "','"+m3+"','"+m4+"','"+m5+"');";
			    	
			    	Statement st = (Statement) connection.createStatement();
			    	st.execute(m);
			    	JOptionPane.showMessageDialog(null, "Insertion Succesful");
			    	
				}catch(Exception m)
				{
					JOptionPane.showMessageDialog(null, "Duplicate Insertion");
				}
			}
		});
		minsert.setBounds(133, 278, 89, 23);
		panel_2.add(minsert);
		
		JLabel lblMotherboard = new JLabel("Motherboard");
		lblMotherboard.setFont(new Font("Lucida Console", Font.BOLD, 16));
		lblMotherboard.setBounds(335, 15, 193, 45);
		panel_2.add(lblMotherboard);
		
		JPanel panel_3 = new JPanel();
		tabbedPane.addTab("LAPTOP", null, panel_3, null);
		panel_3.setLayout(null);
		
		lserial = new JTextField();
		lserial.setBounds(95, 11, 86, 20);
		panel_3.add(lserial);
		lserial.setColumns(10);
		
		lcode = new JTextField();
		lcode.setBounds(95, 57, 86, 20);
		panel_3.add(lcode);
		lcode.setColumns(10);
		
		lmodel = new JTextField();
		lmodel.setBounds(95, 108, 86, 20);
		panel_3.add(lmodel);
		lmodel.setColumns(10);
		
		lprocessor = new JTextField();
		lprocessor.setBounds(95, 160, 86, 20);
		panel_3.add(lprocessor);
		lprocessor.setColumns(10);
		
		lram = new JTextField();
		lram.setBounds(95, 208, 86, 20);
		panel_3.add(lram);
		lram.setColumns(10);
		
		lhdd = new JTextField();
		lhdd.setBounds(437, 11, 86, 20);
		panel_3.add(lhdd);
		lhdd.setColumns(10);
		
		display = new JTextField();
		display.setBounds(437, 57, 86, 20);
		panel_3.add(display);
		display.setColumns(10);
		
		warranty = new JTextField();
		warranty.setBounds(437, 108, 86, 20);
		panel_3.add(warranty);
		warranty.setColumns(10);
		
		battery = new JTextField();
		battery.setBounds(437, 160, 86, 20);
		panel_3.add(battery);
		battery.setColumns(10);
		
		lprice = new JTextField();
		lprice.setBounds(437, 208, 86, 20);
		panel_3.add(lprice);
		lprice.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("PSerial");
		lblNewLabel.setBounds(10, 14, 61, 14);
		panel_3.add(lblNewLabel);
		
		JLabel lblBcode = new JLabel("Brand Code");
		lblBcode.setBounds(10, 60, 75, 14);
		panel_3.add(lblBcode);
		
		JLabel lblModel = new JLabel("Model");
		lblModel.setBounds(10, 111, 61, 14);
		panel_3.add(lblModel);
		
		JLabel lblProcessor = new JLabel("Processor");
		lblProcessor.setBounds(10, 163, 61, 14);
		panel_3.add(lblProcessor);
		
		JLabel lblRam = new JLabel("Ram");
		lblRam.setBounds(10, 211, 46, 14);
		panel_3.add(lblRam);
		
		JLabel lblHdd = new JLabel("HDD");
		lblHdd.setBounds(357, 14, 46, 14);
		panel_3.add(lblHdd);
		
		JLabel lblDisplay = new JLabel("Display");
		lblDisplay.setBounds(357, 60, 46, 14);
		panel_3.add(lblDisplay);
		
		JLabel lblWarranty = new JLabel("Warranty");
		lblWarranty.setBounds(357, 111, 46, 14);
		panel_3.add(lblWarranty);
		
		JLabel lblNewLabel_1 = new JLabel("Battery");
		lblNewLabel_1.setBounds(357, 163, 46, 14);
		panel_3.add(lblNewLabel_1);
		
		JLabel lblPrice = new JLabel("Price");
		lblPrice.setBounds(357, 211, 46, 14);
		panel_3.add(lblPrice);
		
		JButton btnSave = new JButton("Insert");
		btnSave.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				int a1= Integer.parseInt(lserial.getText());
				int a2= Integer.parseInt(lcode.getText());
		    	String a3= lmodel.getText();
		    	String a4= lprocessor.getText();
		    	String a5= lram.getText();
		    	String a6= lhdd.getText();
		    	String a7= display.getText();
		    	int a8= Integer.parseInt(warranty.getText());
		    	String a9= battery.getText();
		    	int a10= Integer.parseInt(lprice.getText());
				try{				
						String s  = "Insert Into product(Pserial,Bcode,Model,Processor,Ram,Hdd,Display,Warranty_year,battery,Price_BDT)"
								+ "  values('"+a1+"','"+a2+"','"+a3+"','"+a4+"','"+a5+"','"+a6+"','"+a7+"','"+a8+"','"+a9+"','"+a10+"');";
		    	
						Statement st = (Statement) connection.createStatement();
				    	st.execute(s);
				    	JOptionPane.showMessageDialog(null, "Insertion Succesful");
				}catch(Exception e1)
				{
					JOptionPane.showMessageDialog(null, "Duplicate Insertion");
				}
			}
		});
		btnSave.setBounds(216, 260, 138, 23);
		panel_3.add(btnSave);
		
		JPanel panel_4 = new JPanel();
		tabbedPane.addTab("OPD", null, panel_4, null);
		panel_4.setLayout(null);
		
		JLabel lblDriveSerial = new JLabel("Drive Serial");
		lblDriveSerial.setBounds(51, 36, 89, 14);
		panel_4.add(lblDriveSerial);
		
		JLabel lblOpticalDiskDrive = new JLabel("Optical Disk Drive");
		lblOpticalDiskDrive.setFont(new Font("Lucida Console", Font.BOLD, 16));
		lblOpticalDiskDrive.setBounds(332, 16, 214, 53);
		panel_4.add(lblOpticalDiskDrive);
		
		JLabel lblBrand_2 = new JLabel("Brand");
		lblBrand_2.setBounds(51, 78, 46, 14);
		panel_4.add(lblBrand_2);
		
		JLabel lblType = new JLabel("Type");
		lblType.setBounds(51, 125, 46, 14);
		panel_4.add(lblType);
		
		JLabel lblPrice_4 = new JLabel("Price");
		lblPrice_4.setBounds(51, 172, 46, 14);
		panel_4.add(lblPrice_4);
		
		JLabel lblNewLabel_3 = new JLabel("Category ID");
		lblNewLabel_3.setBounds(51, 225, 76, 14);
		panel_4.add(lblNewLabel_3);
		
		dserial = new JTextField();
		dserial.setBounds(168, 33, 86, 20);
		panel_4.add(dserial);
		dserial.setColumns(10);
		
		dbrand = new JTextField();
		dbrand.setBounds(168, 75, 86, 20);
		panel_4.add(dbrand);
		dbrand.setColumns(10);
		
		dtype = new JTextField();
		dtype.setBounds(168, 122, 86, 20);
		panel_4.add(dtype);
		dtype.setColumns(10);
		
		dprice = new JTextField();
		dprice.setBounds(168, 169, 86, 20);
		panel_4.add(dprice);
		dprice.setColumns(10);
		
		dcatid = new JTextField();
		dcatid.setBounds(168, 222, 86, 20);
		panel_4.add(dcatid);
		dcatid.setColumns(10);
		
		JButton dinsert = new JButton("Insert");
		dinsert.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String d1 = dserial.getText();
		    	String d2 = dbrand.getText();
		    	String d3= dtype.getText();
		    	int d4= Integer.parseInt(dprice.getText());
		    	int d5= Integer.parseInt(dcatid.getText());
				try{

			    	String d = "Insert into opd(DSerial,Brand,Type,Price,ID) "
			    			+ "values('" +d1+ "','" +d2+ "','"+d3+"','"+d4+"','"+d5+"');";
			    	
			    	Statement st = (Statement) connection.createStatement();
			    	st.execute(d);
			    	JOptionPane.showMessageDialog(null, "Insertion Succesful");
			    	
				}catch(Exception d)
				{
					JOptionPane.showMessageDialog(null, "Duplicate Insertion");
				}
			}
		});
		dinsert.setBounds(165, 275, 89, 23);
		panel_4.add(dinsert);
		
		JPanel panel_5 = new JPanel();
		tabbedPane.addTab("PROCESSOR", null, panel_5, null);
		panel_5.setLayout(null);
		
		JLabel lblPserial = new JLabel("Processor Serial");
		lblPserial.setBounds(39, 25, 108, 14);
		panel_5.add(lblPserial);
		
		JLabel lblModel_2 = new JLabel("Model");
		lblModel_2.setBounds(39, 69, 46, 14);
		panel_5.add(lblModel_2);
		
		JLabel lblGeneration = new JLabel("Generation");
		lblGeneration.setBounds(39, 110, 85, 14);
		panel_5.add(lblGeneration);
		
		JLabel lblClockspeeds = new JLabel("ClocKSpeed");
		lblClockspeeds.setBounds(39, 155, 85, 14);
		panel_5.add(lblClockspeeds);
		
		JLabel lblPrice_5 = new JLabel("Price");
		lblPrice_5.setBounds(39, 201, 46, 14);
		panel_5.add(lblPrice_5);
		
		JLabel lblCategoryId_1 = new JLabel("Category ID");
		lblCategoryId_1.setBounds(39, 246, 85, 14);
		panel_5.add(lblCategoryId_1);
		
		pserial = new JTextField();
		pserial.setBounds(171, 22, 86, 20);
		panel_5.add(pserial);
		pserial.setColumns(10);
		
		pmodel = new JTextField();
		pmodel.setBounds(171, 66, 86, 20);
		panel_5.add(pmodel);
		pmodel.setColumns(10);
		
		pgen = new JTextField();
		pgen.setBounds(171, 107, 86, 20);
		panel_5.add(pgen);
		pgen.setColumns(10);
		
		pclk = new JTextField();
		pclk.setBounds(171, 152, 86, 20);
		panel_5.add(pclk);
		pclk.setColumns(10);
		
		pprice = new JTextField();
		pprice.setText("");
		pprice.setBounds(171, 198, 86, 20);
		panel_5.add(pprice);
		pprice.setColumns(10);
		
		pcatid = new JTextField();
		pcatid.setBounds(171, 243, 86, 20);
		panel_5.add(pcatid);
		pcatid.setColumns(10);
		
		JButton pinsert = new JButton("Insert");
		pinsert.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String p1 = pserial.getText();
		    	String p2 = pmodel.getText();
		    	String p3 = pgen.getText();
		    	String p4 = pclk.getText();
		    	int p5= Integer.parseInt(pprice.getText());
		    	int p6= Integer.parseInt(pcatid.getText());
				
				try{

			    	String prs = "Insert into processor(PSerial,Model,Generation,ClockSpeed,Price,pid) "
			    			+ "values('" +p1+ "','" +p2+ "','"+p3+"','"+p4+"','"+p5+"','"+p6+"');";
			    	
			    	Statement st = (Statement) connection.createStatement();
			    	st.execute(prs);
			    	JOptionPane.showMessageDialog(null, "Insertion Succesful");
			    	
				}catch(Exception p)
				{
					JOptionPane.showMessageDialog(null, "Duplicate Insertion");
				}
				
			}
		});
		pinsert.setBounds(171, 292, 89, 23);
		panel_5.add(pinsert);
		
		JLabel lblProcessor_1 = new JLabel("Processor");
		lblProcessor_1.setFont(new Font("Lucida Console", Font.BOLD, 16));
		lblProcessor_1.setBounds(343, 12, 211, 39);
		panel_5.add(lblProcessor_1);
		
		JPanel panel_6 = new JPanel();
		tabbedPane.addTab("PSU", null, panel_6, null);
		panel_6.setLayout(null);
		
		poserial = new JTextField();
		poserial.setBounds(130, 29, 86, 20);
		panel_6.add(poserial);
		poserial.setColumns(10);
		
		pobrand = new JTextField();
		pobrand.setBounds(130, 78, 86, 20);
		panel_6.add(pobrand);
		pobrand.setColumns(10);
		
		power = new JTextField();
		power.setBounds(130, 127, 86, 20);
		panel_6.add(power);
		power.setColumns(10);
		
		poprice = new JTextField();
		poprice.setBounds(130, 176, 86, 20);
		panel_6.add(poprice);
		poprice.setColumns(10);
		
		pocatid = new JTextField();
		pocatid.setBounds(130, 222, 86, 20);
		panel_6.add(pocatid);
		pocatid.setColumns(10);
		
		JLabel lblPsuSerial = new JLabel("PSU Serial");
		lblPsuSerial.setBounds(23, 32, 97, 14);
		panel_6.add(lblPsuSerial);
		
		JLabel lblBrand_3 = new JLabel("Brand");
		lblBrand_3.setBounds(23, 81, 97, 14);
		panel_6.add(lblBrand_3);
		
		JLabel lblPowerwatt = new JLabel("Power (WATT)");
		lblPowerwatt.setBounds(23, 130, 97, 14);
		panel_6.add(lblPowerwatt);
		
		JLabel lblPrice_6 = new JLabel("Price");
		lblPrice_6.setBounds(23, 179, 97, 14);
		panel_6.add(lblPrice_6);
		
		JLabel lblCategoryId_2 = new JLabel("Category ID");
		lblCategoryId_2.setBounds(23, 225, 97, 14);
		panel_6.add(lblCategoryId_2);
		
		JButton btnInsert = new JButton("Insert");
		btnInsert.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				String ps1 = poserial.getText();
		    	String ps2 = pobrand.getText();
		    	String ps3 = power.getText();
		    	int ps4= Integer.parseInt(poprice.getText());
		    	int ps5= Integer.parseInt(pocatid.getText());
				
				try{

			    	String prs = "Insert into psu(PSerial,Brand,Power_WATT,Price,sid) "
			    			+ "values('" +ps1+ "','" +ps2+ "','"+ps3+"','"+ps4+"','"+ps5+"');";
			    	
			    	Statement st = (Statement) connection.createStatement();
			    	st.execute(prs);
			    	JOptionPane.showMessageDialog(null, "Insertion Succesful");
			    	
				}catch(Exception p)
				{
					JOptionPane.showMessageDialog(null, "Duplicate Insertion");
				}
			}
		});
		btnInsert.setBounds(130, 269, 89, 23);
		panel_6.add(btnInsert);
		
		JLabel lblPowerSupply = new JLabel("Power Supply");
		lblPowerSupply.setFont(new Font("Lucida Console", Font.BOLD, 16));
		lblPowerSupply.setBounds(319, 23, 162, 31);
		panel_6.add(lblPowerSupply);
		
		JPanel panel_7 = new JPanel();
		tabbedPane.addTab("RAM", null, panel_7, null);
		panel_7.setLayout(null);
		
		rserial = new JTextField();
		rserial.setBounds(118, 22, 86, 20);
		panel_7.add(rserial);
		rserial.setColumns(10);
		
		rbrand = new JTextField();
		rbrand.setBounds(118, 64, 86, 20);
		panel_7.add(rbrand);
		rbrand.setColumns(10);
		
		rmemory = new JTextField();
		rmemory.setBounds(118, 107, 86, 20);
		panel_7.add(rmemory);
		rmemory.setColumns(10);
		
		rmemoryt = new JTextField();
		rmemoryt.setBounds(118, 154, 86, 20);
		panel_7.add(rmemoryt);
		rmemoryt.setColumns(10);
		
		rspeed = new JTextField();
		rspeed.setBounds(118, 196, 86, 20);
		panel_7.add(rspeed);
		rspeed.setColumns(10);
		
		rprice = new JTextField();
		rprice.setBounds(118, 238, 86, 20);
		panel_7.add(rprice);
		rprice.setColumns(10);
		
		rcatid = new JTextField();
		rcatid.setBounds(118, 283, 86, 20);
		panel_7.add(rcatid);
		rcatid.setColumns(10);
		
		JButton btnInsert_1 = new JButton("Insert");
		btnInsert_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String r1 = rserial.getText();
		    	String r2 = rbrand.getText();
		    	String r3 = rmemory.getText();
		    	String r4 = rmemoryt.getText();
		    	String r5 = rspeed.getText();
		    	int r6= Integer.parseInt(rprice.getText());
		    	int r7= Integer.parseInt(rcatid.getText());
				
				try{

			    	String prs = "Insert into ram(RSerial,Brand,Memory,MemoryType,Speed,Price,rid) "
			    			+ "values('" +r1+ "','" +r2+ "','"+r3+"','"+r4+"','"+r5+"','"+r6+"','"+r7+"');";
			    	
			    	Statement st = (Statement) connection.createStatement();
			    	st.execute(prs);
			    	JOptionPane.showMessageDialog(null, "Insertion Succesful");
			    	
				}catch(Exception p)
				{
					JOptionPane.showMessageDialog(null, "Duplicate Insertion");
				}
			}
		});
		btnInsert_1.setBounds(283, 282, 89, 23);
		panel_7.add(btnInsert_1);
		
		JLabel lblRamSerial = new JLabel("RAM Serial");
		lblRamSerial.setBounds(28, 25, 80, 14);
		panel_7.add(lblRamSerial);
		
		JLabel lblBrand_4 = new JLabel("Brand");
		lblBrand_4.setBounds(28, 67, 80, 14);
		panel_7.add(lblBrand_4);
		
		JLabel lblMemory_1 = new JLabel("Memory");
		lblMemory_1.setBounds(28, 110, 80, 14);
		panel_7.add(lblMemory_1);
		
		JLabel lblMemoryType = new JLabel("Memory Type");
		lblMemoryType.setBounds(28, 157, 80, 14);
		panel_7.add(lblMemoryType);
		
		JLabel lblRamSpeed = new JLabel("RAM Speed");
		lblRamSpeed.setBounds(28, 199, 80, 14);
		panel_7.add(lblRamSpeed);
		
		JLabel lblPrice_7 = new JLabel("Price");
		lblPrice_7.setBounds(28, 241, 46, 14);
		panel_7.add(lblPrice_7);
		
		JLabel lblCategoryId_3 = new JLabel("Category ID");
		lblCategoryId_3.setBounds(28, 286, 80, 14);
		panel_7.add(lblCategoryId_3);
		
		JLabel lblRam_1 = new JLabel("RAM");
		lblRam_1.setFont(new Font("Lucida Console", Font.BOLD, 16));
		lblRam_1.setBounds(366, 16, 101, 31);
		panel_7.add(lblRam_1);
		
		JButton btnHome_1 = new JButton("Logout");
		btnHome_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				Selector select = new Selector();
				select.setVisible(true);
			}
		});
		btnHome_1.setIcon(new ImageIcon(admin_page.class.getResource("/img/hmbtn.png")));
		btnHome_1.setBounds(41, 377, 88, 23);
		contentPane.add(btnHome_1);
		

		
		
	}
}

//