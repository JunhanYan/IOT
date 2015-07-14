import java.awt.Color;
import java.math.BigDecimal;
import java.util.Random;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class Node extends Thread {
	Bus bus;
	int waitDelay; // 竞争者的等待时延（后退时间）,单位为s
	int backCount = 0; // (回退次数)发生冲突的次数
	int delay; // 传输时间，单位为s

	public Node(int t, String s, Bus bus) {
		super(s);
		this.bus = bus;
		this.delay = t;
		
	}

	public JLabel getCurrentLabel(int index){
		switch(index){
			case 0:{
				return GTSSimulation.jLabelTS1;				
			}
			case 1:{
				return GTSSimulation.jLabelTS2;				
			}
			case 2:{
				return GTSSimulation.jLabelTS3;				
			}
			case 3:{
				return GTSSimulation.jLabelTS4;				
			}
			case 4:{
				return GTSSimulation.jLabelTS5;				
			}
			case 5:{
				return GTSSimulation.jLabelTS6;				
			}
			case 6:{
				return GTSSimulation.jLabelTS7;				
			}
			case 7:{
				return GTSSimulation.jLabelTS8;				
			}
			default:{
				return null;
			}
		}
	}
	 
	public boolean isTSFull(){
		//boolean result = false;
		for (int i=0;i<8;i++){
			if(Bus.TSState[i]==0){
				return false;
			}
		}
		return true;
	}
	
	public int getUsefulTS(){
		int result = 0;
		for (int i=0;i<8;i++){
			if(Bus.TSState[i]==0){
				result = i;
				break;
			}
		}
		return result;
	}
	public void run() {
	
		//Bus.GTSCount++;
		while (isTSFull()) {
			try {
				this.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			  System.out.println(this.getName()+" is waiting");
			  
		}

		synchronized (bus) {
			int index = getUsefulTS();
			Bus.TSState[index] = 1;
          			
		//	GTSSimulation.jProgressBar.setString(this.getName() + " owns the Channal");
//			if(index==0){
//				GTSSimulation.jLabelTS1.setBackground(Color.blue);
//			}
//			else if(index==1){
//				GTSSimulation.jLabelTS2.setBackground(Color.red);
//			}else{
//				GTSSimulation.jLabelTS3.setBackground(Color.green);
//			}		
			
			if (this.getName().equals("A")) 
			{
			  GTSSimulation.jLabelA.setVisible(true);
			  GTSSimulation.jButtonA.setIcon(new ImageIcon(getClass()
						.getClassLoader().getResource("sending.jpg")));
			}
		    else if(this.getName().equals("B"))
		    { GTSSimulation.jLabelB.setVisible(true);
		      GTSSimulation.jButtonB.setIcon(new ImageIcon(getClass()
					.getClassLoader().getResource("sending.jpg")));
		    }
		    else if(this.getName().equals("C"))
		    { GTSSimulation.jLabelC.setVisible(true);
		      GTSSimulation.jButtonC.setIcon(new ImageIcon(getClass()
					.getClassLoader().getResource("sending.jpg")));
		    }
		    else if(this.getName().equals("E"))
		    { GTSSimulation.jLabelE.setVisible(true);
		      GTSSimulation.jButtonE.setIcon(new ImageIcon(getClass()
					.getClassLoader().getResource("sending.jpg")));
		    }
		    else if(this.getName().equals("F"))
		    { GTSSimulation.jLabelF.setVisible(true);
		      GTSSimulation.jButtonF.setIcon(new ImageIcon(getClass()
					.getClassLoader().getResource("sending.jpg")));
		    }
		    else if(this.getName().equals("H"))
		    { GTSSimulation.jLabelH.setVisible(true);
		      GTSSimulation.jButtonH.setIcon(new ImageIcon(getClass()
					.getClassLoader().getResource("sending.jpg")));
		    }
		    else if(this.getName().equals("G"))
		    { GTSSimulation.jLabelG.setVisible(true);
		      GTSSimulation.jButtonG.setIcon(new ImageIcon(getClass()
					.getClassLoader().getResource("sending.jpg")));
		    }
		    else if(this.getName().equals("I"))
		    { GTSSimulation.jLabelI.setVisible(true);
		      GTSSimulation.jButtonI.setIcon(new ImageIcon(getClass()
					.getClassLoader().getResource("sending.jpg")));
		    }
			else
			    { GTSSimulation.jLabelD.setVisible(true);
			      GTSSimulation.jButtonD.setIcon(new ImageIcon(getClass()
						.getClassLoader().getResource("sending.jpg")));
			    }
		//	GTSSimulation.jProgressBar.setMaximum(this.delay);
            
			try {
				if(index==0){
					for (int i = 0; i <this.delay; i++) {
						
							getCurrentLabel(index).setText(this.getName());
							getCurrentLabel(index).setBackground(Color.green);
							this.sleep(1000);
							
							getCurrentLabel(index).setBackground(Color.gray);
							this.sleep((Bus.busIFS + 7000));
							
						
					}
				}else{
				for (int i = 0; i <=this.delay; i++) {
					if(i==0){
						double currentTime=new Double((System.nanoTime())/Math.pow(10, 9)).doubleValue();
						int passTime = (int)(currentTime - Bus.busStartTime)%8; 
						
						if(passTime <index){
							
							this.sleep((index-passTime)*1000);
						
						}else{
							this.sleep((8-passTime+index)*1000+Bus.busIFS );
							
						}
						getCurrentLabel(index).setBackground(Color.green);
					}
					else{
						getCurrentLabel(index).setText(this.getName());
						getCurrentLabel(index).setBackground(Color.green);
						this.sleep(1000);
						
						getCurrentLabel(index).setBackground(Color.gray);
						this.sleep((Bus.busIFS + 7000));
						
					}
					
				}
				}
				Bus.usedTime += this.delay;
				Bus.TSState[index] = 0;
				
				if (this.getName().equals("A")) 
				{
					GTSSimulation.jLabelA.setVisible(false);
					GTSSimulation.jButtonAControl.setEnabled(true);
					GTSSimulation.jTextFieldATranTime.setText("");
				
					GTSSimulation.jButtonA.setIcon(new ImageIcon(getClass()
							.getClassLoader().getResource("unworking.jpg")));
					
				}
			    else if(this.getName().equals("B"))
			    { 	GTSSimulation.jLabelB.setVisible(false);
			    GTSSimulation.jButtonBControl.setEnabled(true);
			    GTSSimulation.jTextFieldBTranTime.setText("");
			
				GTSSimulation.jButtonB.setIcon(new ImageIcon(getClass()
						.getClassLoader().getResource("unworking.jpg")));
			    }
			    else if(this.getName().equals("C"))
			    {  GTSSimulation.jLabelC.setVisible(false);
			       GTSSimulation.jButtonCControl.setEnabled(true);
			       GTSSimulation.jTextFieldCTranTime.setText("");
				  
				   GTSSimulation.jButtonC.setIcon(new ImageIcon(getClass()
						.getClassLoader().getResource("unworking.jpg")));
			    }
			    else if(this.getName().equals("E"))
			    {  GTSSimulation.jLabelE.setVisible(false);
			       GTSSimulation.jButtonEControl.setEnabled(true);
			       GTSSimulation.jTextFieldETranTime.setText("");
				  
				   GTSSimulation.jButtonE.setIcon(new ImageIcon(getClass()
						.getClassLoader().getResource("unworking.jpg")));
			    }
			    else if(this.getName().equals("F"))
			    {  GTSSimulation.jLabelF.setVisible(false);
			       GTSSimulation.jButtonFControl.setEnabled(true);
			       GTSSimulation.jTextFieldFTranTime.setText("");
				  
				   GTSSimulation.jButtonF.setIcon(new ImageIcon(getClass()
						.getClassLoader().getResource("unworking.jpg")));
			    }
			    else if(this.getName().equals("G"))
			    {  GTSSimulation.jLabelG.setVisible(false);
			       GTSSimulation.jButtonGControl.setEnabled(true);
			       GTSSimulation.jTextFieldGTranTime.setText("");
				  
				   GTSSimulation.jButtonG.setIcon(new ImageIcon(getClass()
						.getClassLoader().getResource("unworking.jpg")));
			    }
			    else if(this.getName().equals("H"))
			    {  GTSSimulation.jLabelH.setVisible(false);
			       GTSSimulation.jButtonHControl.setEnabled(true);
			       GTSSimulation.jTextFieldHTranTime.setText("");
				  
				   GTSSimulation.jButtonH.setIcon(new ImageIcon(getClass()
						.getClassLoader().getResource("unworking.jpg")));
			    }
			    else if(this.getName().equals("I"))
			    {  GTSSimulation.jLabelI.setVisible(false);
			       GTSSimulation.jButtonIControl.setEnabled(true);
			       GTSSimulation.jTextFieldITranTime.setText("");
				  
				   GTSSimulation.jButtonI.setIcon(new ImageIcon(getClass()
						.getClassLoader().getResource("unworking.jpg")));
			    }
				 else
				    {  GTSSimulation.jLabelD.setVisible(false);
				       GTSSimulation.jButtonDControl.setEnabled(true);
				       GTSSimulation.jTextFieldDTranTime.setText("");
					  
					   GTSSimulation.jButtonD.setIcon(new ImageIcon(getClass()
							.getClassLoader().getResource("unworking.jpg")));
				    }
				
			} catch (InterruptedException e) {
				//GTSSimulation.jProgressBar.setString("信道竞争异常！");
			} finally {
				Bus.TSState[index] = 0;
				getCurrentLabel(index).setBackground(Color.gray);
				getCurrentLabel(index).setText("");
			}

		}
		

		// 将利用率用百分号表示出来
		int r = (new BigDecimal(Bus.getRate() * 1000).setScale(0,
				BigDecimal.ROUND_HALF_UP)).intValue();
		String utilization = r / 10 + "." + r % 10;
		GTSSimulation.jLabelNote.setText("Utilization rate is：" + utilization + "% about "+utilization+"kbps");
		

	}
}
