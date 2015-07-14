import java.awt.BorderLayout;
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

public class CSMASimulation extends javax.swing.JDialog implements
		ActionListener {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private JPanel jPanel1;

	public static JLabel jLabelB;
	public static JLabel jLabelD;
	private JLabel jLabelATranTime;
	public static JButton jButtonCControl;
	public static JButton jButtonBControl;
	public static JButton jButtonAControl;
	public static JButton jButtonDControl;

	
	public static JTextField jTextFieldDBackTime;

	public static JTextField jTextFieldDBackCount;

	public static JTextField jTextFieldDTranTime;

	private JLabel jLabelDBackTime;

	private JLabel jLabelDBackCount;

	private JLabel jLabelDTranTime;
	
	public static JTextField jTextFieldCBackTime;

	public static JTextField jTextFieldCBackCount;

	public static JTextField jTextFieldCTranTime;

	private JLabel jLabelCBackTime;

	public static JTextField jTextFieldABackTime;

	private JLabel jLabelCBackCount;

	private JLabel jLabelCTranTime;

	public static JTextField jTextFieldBTranTime;

	public static JTextField jTextFieldBBackCount;

	public static JTextField jTextFieldBBackTime;

	private JLabel jLabelBTranTime;

	private JLabel jLabelBBackCount;

	private JLabel jLabelBBackTime;

	public static JTextField jTextFieldABackCount;

	private JLabel jLabelABackTime;

	private JLabel jLabelABackCount;

	public static JTextField jTextFieldATranTime;

	public static JLabel jLabelC;

	public static JLabel jLabelA;

	public static JButton jButtonC;
	public static JButton jButtonD;

	public static JButton jButtonB;

	public static JProgressBar jProgressBar;

	public static JButton jButtonA;

	
	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				JFrame frame = new JFrame();
				CSMASimulation inst = new CSMASimulation(frame);
				inst.setVisible(true);

			}
		});

//		Bus.busStartTime = new Double((System.nanoTime()) / Math.pow(10, 9))
//				.doubleValue();

	}

	public CSMASimulation(JFrame frame) {
		super(frame);
		initGUI();
	}

	private void initGUI() {
		try {
			{
				this.setResizable(false);
				this.setTitle("CSMASimulation");
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
						jProgressBar = new JProgressBar();
						jPanel1.add(jProgressBar);
						jProgressBar.setStringPainted(true);
						jProgressBar.setBounds(90, 207, 461, 36);
					}
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
						jButtonC.setBounds(495, 302, 80, 63);
						
					}
					{
						jButtonD = new JButton();
						jPanel1.add(jButtonD);
						jButtonD.setIcon(new ImageIcon(getClass()
								.getClassLoader().getResource("dead.jpg")));
						jButtonD.setBounds(495, 85, 80, 63);
						
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
						jLabelC.setBounds(518, 243, 31, 59);
						jLabelC.setVisible(false);
					}
					{
						jLabelD = new JLabel();
						jPanel1.add(jLabelD);
						jLabelD.setIcon(new ImageIcon(getClass()
								.getClassLoader().getResource("Link.jpg")));
						jLabelD.setBounds(518, 148, 31, 59);
						jLabelD.setVisible(false);
					}
					{
						jLabelATranTime = new JLabel();
						jPanel1.add(jLabelATranTime);
						jLabelATranTime
								.setText("TranTime：");
						jLabelATranTime.setBounds(187, 58, 96, 15);
						
					}
					{
						jTextFieldATranTime = new JTextField();
						jPanel1.add(jTextFieldATranTime);
						jTextFieldATranTime.setBounds(270, 55, 49, 22);
					}
					{
						jLabelABackCount = new JLabel();
						jPanel1.add(jLabelABackCount);
						jLabelABackCount
								.setText("BackCount：");
						jLabelABackCount.setBounds(187, 93, 96, 15);
						
					}
					{
						jLabelABackTime = new JLabel();
						jPanel1.add(jLabelABackTime);
						jLabelABackTime
								.setText("BackTime：");
						jLabelABackTime.setBounds(187, 125, 96, 15);
						
					}
					{
						jTextFieldABackCount = new JTextField();
						jPanel1.add(jTextFieldABackCount);
						jTextFieldABackCount.setBounds(270, 90, 49, 22);
						jTextFieldABackCount.setEditable(false);
					}
					{
						jTextFieldABackTime = new JTextField();
						jPanel1.add(jTextFieldABackTime);
						jTextFieldABackTime.setEditable(false);
						jTextFieldABackTime.setBounds(270, 122, 49, 22);
					}
					{
						jLabelBBackTime = new JLabel();
						jPanel1.add(jLabelBBackTime);
						jLabelBBackTime
								.setText("BackTime：");
						
						jLabelBBackTime.setBounds(150, 375, 96, 15);
					}
					{
						jLabelBBackCount = new JLabel();
						jPanel1.add(jLabelBBackCount);
						jLabelBBackCount
								.setText("BackCount：");
						
						jLabelBBackCount.setBounds(150, 341, 96, 15);
					}
					{
						jLabelBTranTime = new JLabel();
						jPanel1.add(jLabelBTranTime);
						jLabelBTranTime
								.setText("TranTime：");
					
						jLabelBTranTime.setBounds(150, 307, 96, 15);
					}
					{
						jTextFieldBBackTime = new JTextField();
						jPanel1.add(jTextFieldBBackTime);
						jTextFieldBBackTime.setEditable(false);
						jTextFieldBBackTime.setBounds(231, 372, 49, 22);
					}
					{
						jTextFieldBBackCount = new JTextField();
						jPanel1.add(jTextFieldBBackCount);
						jTextFieldBBackCount.setEditable(false);
						jTextFieldBBackCount.setBounds(232, 337, 49, 22);
					}
					{
						jTextFieldBTranTime = new JTextField();
						jPanel1.add(jTextFieldBTranTime);
						jTextFieldBTranTime.setBounds(232, 304, 49, 22);
					}
					{
						jLabelCTranTime = new JLabel();
						jPanel1.add(jLabelCTranTime);
						jLabelCTranTime
								.setText("TranTime：");
						
						jLabelCTranTime.setBounds(350, 307, 96, 15);
					}
					{
						jLabelCBackCount = new JLabel();
						jPanel1.add(jLabelCBackCount);
						jLabelCBackCount
								.setText("BackCount：");
						
						jLabelCBackCount.setBounds(350, 341, 96, 15);
					}
					{
						jLabelCBackTime = new JLabel();
						jPanel1.add(jLabelCBackTime);
						jLabelCBackTime
								.setText("BackTime：");
						
						jLabelCBackTime.setBounds(350, 375, 96, 15);
					}
					{
						jTextFieldCTranTime = new JTextField();
						jPanel1.add(jTextFieldCTranTime);
						jTextFieldCTranTime.setBounds(434, 304, 49, 22);
					}
					{
						jTextFieldCBackCount = new JTextField();
						jPanel1.add(jTextFieldCBackCount);
						jTextFieldCBackCount.setEditable(false);
						jTextFieldCBackCount.setBounds(434, 337, 49, 22);
					}
					{
						jTextFieldCBackTime = new JTextField();
						jPanel1.add(jTextFieldCBackTime);
						jTextFieldCBackTime.setEditable(false);
						jTextFieldCBackTime.setBounds(433, 372, 49, 22);
					}
					
					{
						jLabelDTranTime = new JLabel();
						jPanel1.add(jLabelDTranTime);
						jLabelDTranTime
								.setText("TranTime：");
						
						jLabelDTranTime.setBounds(350, 58, 96, 15);
					}
					{
						jLabelDBackCount = new JLabel();
						jPanel1.add(jLabelDBackCount);
						jLabelDBackCount
								.setText("BackCount：");
						
						jLabelDBackCount.setBounds(350, 93, 96, 15);
					}
					{
						jLabelDBackTime = new JLabel();
						jPanel1.add(jLabelDBackTime);
						jLabelDBackTime
								.setText("BackTime：");
						
						jLabelDBackTime.setBounds(350, 125, 96, 15);
					}
					{
						jTextFieldDTranTime = new JTextField();
						jPanel1.add(jTextFieldDTranTime);
						jTextFieldDTranTime.setBounds(434, 55, 49, 22);
					}
					{
						jTextFieldDBackCount = new JTextField();
						jPanel1.add(jTextFieldDBackCount);
						jTextFieldDBackCount.setEditable(false);
						jTextFieldDBackCount.setBounds(434, 90, 49, 22);
					}
					{
						jTextFieldDBackTime = new JTextField();
						jPanel1.add(jTextFieldDBackTime);
						jTextFieldDBackTime.setEditable(false);
						jTextFieldDBackTime.setBounds(433, 122, 49, 22);
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
						jButtonCControl.setBounds(495, 375, 80, 30);
						jButtonCControl.setSize(80, 32);
						
						jButtonCControl.addActionListener(this);
					}
					{
						jButtonDControl = new JButton();
						jPanel1.add(jButtonDControl);
						jButtonDControl.setText("D");
						jButtonDControl.setBounds(495, 45, 80, 30);
						jButtonDControl.setSize(80, 32);
						
						jButtonDControl.addActionListener(this);
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
			    Competitor a=new Competitor(i,"A",bus);	
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
		    Competitor a=new Competitor(j,"B",bus);	
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
		    Competitor a=new Competitor(k,"C",bus);	
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
		    Competitor a=new Competitor(l,"D",bus);	
		    a.start();
	
		}
			
		}
		
	}
     
}
