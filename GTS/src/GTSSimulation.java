import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JProgressBar;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;

public class GTSSimulation extends javax.swing.JDialog implements
		ActionListener {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private JPanel jPanel1;
	public static JLabel jLabelTS1;
	public static JLabel jLabelTS2;
	public static JLabel jLabelTS3;
	public static JLabel jLabelTS4;
	public static JLabel jLabelTS5;
	public static JLabel jLabelTS6;
	public static JLabel jLabelTS7;
	public static JLabel jLabelTS8;
	public static JLabel jLabelNote;
	public static JLabel jLabelB;
	public static JLabel jLabelD;
	public static JLabel jLabelE;
	public static JLabel jLabelF;
	public static JLabel jLabelG;
	public static JLabel jLabelH;
	public static JLabel jLabelI;
	private JLabel jLabelATranTime;
	public static JButton jButtonCControl;
	public static JButton jButtonBControl;
	public static JButton jButtonAControl;
	public static JButton jButtonDControl;
	public static JButton jButtonEControl;
	public static JButton jButtonFControl;
	public static JButton jButtonGControl;
	public static JButton jButtonHControl;
	public static JButton jButtonIControl;
	public static JTextField jTextFieldDTranTime;
	public static JTextField jTextFieldETranTime;
	public static JTextField jTextFieldFTranTime;
	public static JTextField jTextFieldGTranTime;
	public static JTextField jTextFieldHTranTime;
	public static JTextField jTextFieldITranTime;
	private JLabel jLabelDTranTime;
	
	public static JTextField jTextFieldCTranTime;

	private JLabel jLabelCTranTime;

	public static JTextField jTextFieldBTranTime;

	private JLabel jLabelBTranTime;



	public static JTextField jTextFieldATranTime;

	public static JLabel jLabelC;

	public static JLabel jLabelA;

	public static JButton jButtonC;
	public static JButton jButtonD;

	public static JButton jButtonB;

	public static JButton jButtonA;

	public static JButton jButtonE;
	public static JButton jButtonF;
	public static JButton jButtonG;
	public static JButton jButtonH;
	public static JButton jButtonI;

	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				JFrame frame = new JFrame();
				GTSSimulation inst = new GTSSimulation(frame);
				inst.setVisible(true);

			}
		});

//		Bus.busStartTime = new Double((System.nanoTime()) / Math.pow(10, 9))
//				.doubleValue();

	}

	public GTSSimulation(JFrame frame) {
		super(frame);
		initGUI();
	}

	private void initGUI() {
		try {
			{
				this.setResizable(false);
				this.setTitle("GTSSimulation");
				{
					jPanel1 = new JPanel();
					getContentPane().add(jPanel1, BorderLayout.CENTER);
					jPanel1.setLayout(null);
					{
						jButtonA = new JButton();
						jPanel1.add(jButtonA);
						jButtonA.setBounds(90, 85, 80, 63);
						jButtonA.setIcon(new ImageIcon(getClass()
								.getClassLoader().getResource("dead.jpg")));
						
					}
					
					{
						jLabelTS1 = new JLabel();
						jPanel1.add(jLabelTS1);
						jLabelTS1.setBounds(90, 207, 50, 30);
						//jLabelTS1.setText("1");
						jLabelTS1.setOpaque(true);
						jLabelTS1.setBackground(Color.gray);
						//jLabelTS1.setVisible(false);
					}
					{
						jLabelTS2 = new JLabel();
						jPanel1.add(jLabelTS2);
						jLabelTS2.setBounds(145, 207, 50, 30);
						//jLabelTS2.setText("1");
						jLabelTS2.setOpaque(true);
						jLabelTS2.setBackground(Color.gray);
						//jLabelTS1.setVisible(false);
					}
					{
						jLabelTS3 = new JLabel();
						jPanel1.add(jLabelTS3);
						jLabelTS3.setBounds(200, 207, 50, 30);
						//jLabelTS3.setText("1");
						jLabelTS3.setOpaque(true);
						jLabelTS3.setBackground(Color.gray);
						//jLabelTS1.setVisible(false);
					}
					{
						jLabelTS4 = new JLabel();
						jPanel1.add(jLabelTS4);
						jLabelTS4.setBounds(255, 207, 50, 30);
						//jLabelTS3.setText("1");
						jLabelTS4.setOpaque(true);
						jLabelTS4.setBackground(Color.gray);
						//jLabelTS1.setVisible(false);
					}
					{
						jLabelTS5 = new JLabel();
						jPanel1.add(jLabelTS5);
						jLabelTS5.setBounds(310, 207, 50, 30);
						//jLabelTS3.setText("1");
						jLabelTS5.setOpaque(true);
						jLabelTS5.setBackground(Color.gray);
						//jLabelTS1.setVisible(false);
					}
					{
						jLabelTS6 = new JLabel();
						jPanel1.add(jLabelTS6);
						jLabelTS6.setBounds(365, 207, 50, 30);
						//jLabelTS3.setText("1");
						jLabelTS6.setOpaque(true);
						jLabelTS6.setBackground(Color.gray);
						//jLabelTS1.setVisible(false);
					}
					{
						jLabelTS7 = new JLabel();
						jPanel1.add(jLabelTS7);
						jLabelTS7.setBounds(420, 207, 50, 30);
						//jLabelTS3.setText("1");
						jLabelTS7.setOpaque(true);
						jLabelTS7.setBackground(Color.gray);
						//jLabelTS1.setVisible(false);
					}
					{
						jLabelTS8 = new JLabel();
						jPanel1.add(jLabelTS8);
						jLabelTS8.setBounds(475, 207, 50, 30);
						//jLabelTS3.setText("1");
						jLabelTS8.setOpaque(true);
						jLabelTS8.setBackground(Color.gray);
						//jLabelTS1.setVisible(false);
					}
					{
						jLabelNote = new JLabel();
						jPanel1.add(jLabelNote);
						jLabelNote.setBounds(155, 249, 400, 30);
						//jLabelNote.setText("1");
						
						//jLabelTS1.setVisible(false);
					}
					
//					{
//						jProgressBar = new JProgressBar();
//						jPanel1.add(jProgressBar);
//						jProgressBar.setStringPainted(true);
//						jProgressBar.setBounds(90, 207, 461, 36);
//					}
					
					
					{
						jButtonB = new JButton();
						jPanel1.add(jButtonB);
						jButtonB.setBounds(66, 304, 80, 63);
						jButtonB.setIcon(new ImageIcon(getClass()
								.getClassLoader().getResource("dead.jpg")));
						
					}
					{
						jButtonC = new JButton();
						jPanel1.add(jButtonC);
						jButtonC.setIcon(new ImageIcon(getClass()
								.getClassLoader().getResource("dead.jpg")));
						jButtonC.setBounds(190, 302, 80, 63);
						
					}
					{
						jButtonD = new JButton();
						jPanel1.add(jButtonD);
						jButtonD.setIcon(new ImageIcon(getClass()
								.getClassLoader().getResource("dead.jpg")));
						jButtonD.setBounds(214, 85, 80, 63);
						
					}
					{
						jLabelA = new JLabel();
						jPanel1.add(jLabelA);
						jLabelA.setBounds(115, 148, 31, 59);
						jLabelA.setIcon(new ImageIcon(getClass()
								.getClassLoader().getResource("Link.jpg")));
						jLabelA.setVisible(false);
					}
					{
						jLabelB = new JLabel();
						jPanel1.add(jLabelB);
						jLabelB.setIcon(new ImageIcon(getClass()
								.getClassLoader().getResource("Link.jpg")));
						jLabelB.setBounds(91, 245, 31, 59);
						jLabelB.setVisible(false);
					}
					{
						jLabelC = new JLabel();
						jPanel1.add(jLabelC);
						jLabelC.setIcon(new ImageIcon(getClass()
								.getClassLoader().getResource("Link.jpg")));
						jLabelC.setBounds(213, 243, 31, 59);
						jLabelC.setVisible(false);
					}
					{
						jLabelD = new JLabel();
						jPanel1.add(jLabelD);
						jLabelD.setIcon(new ImageIcon(getClass()
								.getClassLoader().getResource("Link.jpg")));
						jLabelD.setBounds(237, 148, 31, 59);
						jLabelD.setVisible(false);
					}
					{
						jLabelE = new JLabel();
						jPanel1.add(jLabelE);
						jLabelE.setIcon(new ImageIcon(getClass()
								.getClassLoader().getResource("Link.jpg")));
						jLabelE.setBounds(360, 148, 31, 59);
						jLabelE.setVisible(false);
					}
					{
						jLabelF = new JLabel();
						jPanel1.add(jLabelF);
						jLabelF.setIcon(new ImageIcon(getClass()
								.getClassLoader().getResource("Link.jpg")));
						jLabelF.setBounds(360, 243, 31, 59);
						jLabelF.setVisible(false);
					}
					{
						jLabelG = new JLabel();
						jPanel1.add(jLabelG);
						jLabelG.setIcon(new ImageIcon(getClass()
								.getClassLoader().getResource("Link.jpg")));
						jLabelG.setBounds(470, 243, 31, 59);
						jLabelG.setVisible(false);
					}
					{
						jLabelH = new JLabel();
						jPanel1.add(jLabelH);
						jLabelH.setIcon(new ImageIcon(getClass()
								.getClassLoader().getResource("Link.jpg")));
						jLabelH.setBounds(470, 148, 31, 59);
						jLabelH.setVisible(false);
					}
					{
						jLabelI = new JLabel();
						jPanel1.add(jLabelI);
						jLabelI.setIcon(new ImageIcon(getClass()
								.getClassLoader().getResource("Link.jpg")));
						jLabelI.setBounds(525, 205, 30, 30);
						jLabelI.setVisible(false);
					}
					{
						jLabelATranTime = new JLabel();
						jPanel1.add(jLabelATranTime);
						jLabelATranTime
								.setText("TranTime：");
						jLabelATranTime.setBounds(49, 26, 96, 15);
						
					}
					{
						jTextFieldATranTime = new JTextField();
						jPanel1.add(jTextFieldATranTime);
						jTextFieldATranTime.setBounds(130, 23, 49, 22);
					}
				
					
					{
						jLabelBTranTime = new JLabel();
						jPanel1.add(jLabelBTranTime);
						jLabelBTranTime
								.setText("TranTime：");
					
						jLabelBTranTime.setBounds(49, 419, 96, 15);
					}
				
					{
						jTextFieldBTranTime = new JTextField();
						jPanel1.add(jTextFieldBTranTime);
						jTextFieldBTranTime.setBounds(130, 412, 49, 22);
					}
					{
						jLabelCTranTime = new JLabel();
						jPanel1.add(jLabelCTranTime);
						jLabelCTranTime
								.setText("TranTime：");
						
						jLabelCTranTime.setBounds(185, 419, 96, 15);
					}
				
				
					{
						jTextFieldCTranTime = new JTextField();
						jPanel1.add(jTextFieldCTranTime);
						jTextFieldCTranTime.setBounds(256, 412, 49, 22);
					}
					
					
					{
						jLabelDTranTime = new JLabel();
						jPanel1.add(jLabelDTranTime);
						jLabelDTranTime
								.setText("TranTime：");
						
						jLabelDTranTime.setBounds(182, 26, 96, 15);
					}
					
					{
						jTextFieldDTranTime = new JTextField();
						jPanel1.add(jTextFieldDTranTime);
						jTextFieldDTranTime.setBounds(255, 23, 49, 22);
					}
				
					
					{
						jButtonAControl = new JButton();
						jPanel1.add(jButtonAControl);
						jButtonAControl.setText("A");
						jButtonAControl.setBounds(90, 45, 80, 32);
						
						jButtonAControl.addActionListener(this);
					}
					{
						jButtonBControl = new JButton();
						jPanel1.add(jButtonBControl);
						jButtonBControl.setText("B");
						jButtonBControl.setBounds(66, 375, 80, 30);
						jButtonBControl.setSize(80, 32);
						
						jButtonBControl.addActionListener(this);
					}
					{
						jButtonCControl = new JButton();
						jPanel1.add(jButtonCControl);
						jButtonCControl.setText("C");
						jButtonCControl.setBounds(190, 375, 80, 30);
						jButtonCControl.setSize(80, 32);
						
						jButtonCControl.addActionListener(this);
					}
					{
						jButtonDControl = new JButton();
						jPanel1.add(jButtonDControl);
						jButtonDControl.setText("D");
						jButtonDControl.setBounds(214, 45, 80, 30);
						jButtonDControl.setSize(80, 32);
						jButtonDControl.addActionListener(this);
						JLabel label = new JLabel();
						label.setText("TranTime：");
						label.setBounds(446, 26, 96, 15);
						jPanel1.add(label);
						
						JLabel label_1 = new JLabel();
						label_1.setText("TranTime：");
						label_1.setBounds(319, 23, 96, 15);
						jPanel1.add(label_1);
						
						jTextFieldHTranTime = new JTextField();
						jTextFieldHTranTime.setBounds(527, 23, 49, 22);
						jPanel1.add(jTextFieldHTranTime);
						
						jTextFieldETranTime = new JTextField();
						jTextFieldETranTime.setBounds(398, 23, 49, 22);
						jPanel1.add(jTextFieldETranTime);
						
						JLabel label_2 = new JLabel();
						label_2.setText("TranTime：");
						label_2.setBounds(447, 415, 96, 15);
						jPanel1.add(label_2);
						
						JLabel label_3 = new JLabel();
						label_3.setText("TranTime：");
						label_3.setBounds(310, 419, 96, 15);
						jPanel1.add(label_3);
						
						JLabel label_4 = new JLabel();
						label_4.setText("TranTime：");
						label_4.setBounds(561, 275, 96, 15);
						jPanel1.add(label_4);
						
						jTextFieldGTranTime = new JTextField();
						jTextFieldGTranTime.setBounds(517, 412, 49, 22);
						jPanel1.add(jTextFieldGTranTime);
						
						jTextFieldFTranTime = new JTextField();
						jTextFieldFTranTime.setBounds(398, 413, 49, 22);
						jPanel1.add(jTextFieldFTranTime);
						
						jTextFieldITranTime = new JTextField();
						jTextFieldITranTime.setBounds(587, 293, 49, 22);
						jPanel1.add(jTextFieldITranTime);
						
						jButtonHControl = new JButton();
						jButtonHControl.setText("H");
						jButtonHControl.setBounds(472, 49, 80, 32);
						jPanel1.add(jButtonHControl);
						
						 jButtonEControl = new JButton();
						jButtonEControl.setText("E");
						jButtonEControl.setBounds(339, 49, 80, 32);
						jPanel1.add(jButtonEControl);
						
						 jButtonGControl = new JButton();
						jButtonGControl.setText("G");
						jButtonGControl.setBounds(463, 375, 80, 32);
						jPanel1.add(jButtonGControl);
						
						 jButtonFControl = new JButton();
						jButtonFControl.setText("F");
						jButtonFControl.setBounds(329, 375, 80, 32);
						jPanel1.add(jButtonFControl);
						
						 jButtonIControl = new JButton();
						jButtonIControl.setText("I");
						jButtonIControl.setBounds(556, 231, 80, 32);
						jPanel1.add(jButtonIControl);
						jButtonEControl.addActionListener(this);
						jButtonFControl.addActionListener(this);
						jButtonGControl.addActionListener(this);
						jButtonHControl.addActionListener(this);
						jButtonIControl.addActionListener(this);
						 jButtonH = new JButton();
						jButtonH.setBounds(472, 85, 80, 63);
						jPanel1.add(jButtonH);
						jButtonH.setIcon(new ImageIcon(getClass()
								.getClassLoader().getResource("dead.jpg")));
						 jButtonE = new JButton();
						jButtonE.setBounds(339, 85, 80, 63);
						jPanel1.add(jButtonE);
						jButtonE.setIcon(new ImageIcon(getClass()
								.getClassLoader().getResource("dead.jpg")));
						
						 jButtonG = new JButton();
						jButtonG.setBounds(463, 304, 80, 63);
						jPanel1.add(jButtonG);
						jButtonG.setIcon(new ImageIcon(getClass()
								.getClassLoader().getResource("dead.jpg")));
					  jButtonF = new JButton();
						jButtonF.setBounds(326, 304, 80, 63);
						jPanel1.add(jButtonF);
						jButtonF.setIcon(new ImageIcon(getClass()
								.getClassLoader().getResource("dead.jpg")));
						 jButtonI = new JButton();
						jButtonI.setBounds(556, 160, 80, 63);
						jPanel1.add(jButtonI);
						jButtonI.setIcon(new ImageIcon(getClass()
								.getClassLoader().getResource("dead.jpg")));
						
					}
				}
			}
			this.setSize(650, 482);
			WindowCenter.Center(this);

			addWindowListener(new WindowAdapter() {
				public void windowClosing(WindowEvent e) {
					dispose();
					System.exit(0);
				}
			});

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void actionPerformed(ActionEvent e)
	{
		if(e.getSource()==jButtonAControl)
		{   
			if (jTextFieldATranTime.getText().equals("")||new Integer(jTextFieldATranTime.getText().trim()).intValue()==0) {
				JOptionPane.showMessageDialog(this, "Wrong Transfer Time !", "TranTime",
						JOptionPane.WARNING_MESSAGE);
				}
			else	
			{   if(Bus.busStartTime==0.0){
				Bus.busStartTime = new Double((System.nanoTime()) / Math.pow(10, 9))
				.doubleValue();
				}
				int i=new Integer(jTextFieldATranTime.getText()).intValue();
				jButtonA.setIcon(new ImageIcon(getClass()
						.getClassLoader().getResource("unworking.jpg")));
				jButtonAControl.setEnabled(false);
				
				Bus bus=new Bus();            
			    Node a=new Node(i,"A",bus);	
			    a.start();
			  
			}
			}
		if(e.getSource()==jButtonBControl)
			
		{
		if (jTextFieldBTranTime.getText().equals("")||new Integer(jTextFieldBTranTime.getText().trim()).intValue()==0) {
			JOptionPane.showMessageDialog(this,  "Wrong Transfer Time !", "TranTime",
					JOptionPane.WARNING_MESSAGE);
			}
		else	
		{   
			 if(Bus.busStartTime==0.0){
					Bus.busStartTime = new Double((System.nanoTime()) / Math.pow(10, 9))
					.doubleValue();
					}
			int j=new Integer(jTextFieldBTranTime.getText()).intValue();
		jButtonB.setIcon(new ImageIcon(getClass()
				.getClassLoader().getResource("unworking.jpg")));
		jButtonBControl.setEnabled(false);
			Bus bus=new Bus();            
		    Node a=new Node(j,"B",bus);	
		    a.start();
	
		}
			
		}
		
		if(e.getSource()==jButtonCControl)
		{
		if (jTextFieldCTranTime.getText().equals("")||new Integer(jTextFieldCTranTime.getText().trim()).intValue()==0) {
			JOptionPane.showMessageDialog(this,  "Wrong Transfer Time !", "TranTime",
					JOptionPane.WARNING_MESSAGE);
			}
		else	
		{   
			 if(Bus.busStartTime==0.0){
					Bus.busStartTime = new Double((System.nanoTime()) / Math.pow(10, 9))
					.doubleValue();
					}
			int k=new Integer(jTextFieldCTranTime.getText()).intValue();
		   jButtonC.setIcon(new ImageIcon(getClass()
				.getClassLoader().getResource("unworking.jpg")));
		   jButtonCControl.setEnabled(false);
			Bus bus=new Bus();            
		    Node a=new Node(k,"C",bus);	
		    a.start();
	
		}
			
		}
		if(e.getSource()==jButtonDControl)
		{
		if (jTextFieldDTranTime.getText().equals("")||new Integer(jTextFieldDTranTime.getText().trim()).intValue()==0) {
			JOptionPane.showMessageDialog(this,  "Wrong Transfer Time !", "TranTime",
					JOptionPane.WARNING_MESSAGE);
			}
		else	
		{   
			 if(Bus.busStartTime==0.0){
					Bus.busStartTime = new Double((System.nanoTime()) / Math.pow(10, 9))
					.doubleValue();
					}
			int l=new Integer(jTextFieldDTranTime.getText()).intValue();
		   jButtonD.setIcon(new ImageIcon(getClass()
				.getClassLoader().getResource("unworking.jpg")));
		   jButtonDControl.setEnabled(false);
			Bus bus=new Bus();            
		    Node a=new Node(l,"D",bus);	
		    a.start();
	
		}			
		}
		if(e.getSource()==jButtonEControl)
		{
		if (jTextFieldETranTime.getText().equals("")||new Integer(jTextFieldETranTime.getText().trim()).intValue()==0) {
			JOptionPane.showMessageDialog(this,  "Wrong Transfer Time !", "TranTime",
					JOptionPane.WARNING_MESSAGE);
			}
		else	
		{   
			 if(Bus.busStartTime==0.0){
					Bus.busStartTime = new Double((System.nanoTime()) / Math.pow(10, 9))
					.doubleValue();
					}
			int l=new Integer(jTextFieldETranTime.getText()).intValue();
		   jButtonE.setIcon(new ImageIcon(getClass()
				.getClassLoader().getResource("unworking.jpg")));
		   jButtonEControl.setEnabled(false);
			Bus bus=new Bus();            
		    Node a=new Node(l,"E",bus);	
		    a.start();
	
		}			
		}
		if(e.getSource()==jButtonFControl)
		{
		if (jTextFieldFTranTime.getText().equals("")||new Integer(jTextFieldFTranTime.getText().trim()).intValue()==0) {
			JOptionPane.showMessageDialog(this,  "Wrong Transfer Time !", "TranTime",
					JOptionPane.WARNING_MESSAGE);
			}
		else	
		{   
			 if(Bus.busStartTime==0.0){
					Bus.busStartTime = new Double((System.nanoTime()) / Math.pow(10, 9))
					.doubleValue();
					}
			int l=new Integer(jTextFieldFTranTime.getText()).intValue();
		   jButtonF.setIcon(new ImageIcon(getClass()
				.getClassLoader().getResource("unworking.jpg")));
		   jButtonFControl.setEnabled(false);
			Bus bus=new Bus();            
		    Node a=new Node(l,"F",bus);	
		    a.start();
	
		}			
		}
		if(e.getSource()==jButtonGControl)
		{
		if (jTextFieldGTranTime.getText().equals("")||new Integer(jTextFieldGTranTime.getText().trim()).intValue()==0) {
			JOptionPane.showMessageDialog(this,  "Wrong Transfer Time !", "TranTime",
					JOptionPane.WARNING_MESSAGE);
			}
		else	
		{   
			 if(Bus.busStartTime==0.0){
					Bus.busStartTime = new Double((System.nanoTime()) / Math.pow(10, 9))
					.doubleValue();
					}
			int l=new Integer(jTextFieldGTranTime.getText()).intValue();
		   jButtonG.setIcon(new ImageIcon(getClass()
				.getClassLoader().getResource("unworking.jpg")));
		   jButtonGControl.setEnabled(false);
			Bus bus=new Bus();            
		    Node a=new Node(l,"G",bus);	
		    a.start();
	
		}			
		}
		if(e.getSource()==jButtonHControl)
		{
		if (jTextFieldHTranTime.getText().equals("")||new Integer(jTextFieldHTranTime.getText().trim()).intValue()==0) {
			JOptionPane.showMessageDialog(this,  "Wrong Transfer Time !", "TranTime",
					JOptionPane.WARNING_MESSAGE);
			}
		else	
		{   
			 if(Bus.busStartTime==0.0){
					Bus.busStartTime = new Double((System.nanoTime()) / Math.pow(10, 9))
					.doubleValue();
					}
			int l=new Integer(jTextFieldHTranTime.getText()).intValue();
		   jButtonH.setIcon(new ImageIcon(getClass()
				.getClassLoader().getResource("unworking.jpg")));
		   jButtonHControl.setEnabled(false);
			Bus bus=new Bus();            
		    Node a=new Node(l,"H",bus);	
		    a.start();
	
		}			
		}
		if(e.getSource()==jButtonIControl)
		{
		if (jTextFieldITranTime.getText().equals("")||new Integer(jTextFieldITranTime.getText().trim()).intValue()==0) {
			JOptionPane.showMessageDialog(this,  "Wrong Transfer Time !", "TranTime",
					JOptionPane.WARNING_MESSAGE);
			}
		else	
		{   
			 if(Bus.busStartTime==0.0){
					Bus.busStartTime = new Double((System.nanoTime()) / Math.pow(10, 9))
					.doubleValue();
					}
			int l=new Integer(jTextFieldITranTime.getText()).intValue();
		   jButtonI.setIcon(new ImageIcon(getClass()
				.getClassLoader().getResource("unworking.jpg")));
		   jButtonIControl.setEnabled(false);
			Bus bus=new Bus();            
		    Node a=new Node(l,"I",bus);	
		    a.start();
	
		}			
		}
	}
}
