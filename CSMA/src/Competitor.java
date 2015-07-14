import java.math.BigDecimal;
import java.util.Random;

import javax.swing.ImageIcon;

public class Competitor extends Thread {
	Bus bus;
	int waitDelay; // 竞争者的等待时延（后退时间）,单位为s
	int backCount = 0; // (回退次数)发生冲突的次数
	int delay; // 传输时间，单位为s

	public Competitor(int t, String s, Bus bus) {
		super(s);
		this.bus = bus;
		this.delay = t;
	}

	public void run() {
		while (this.backCount < 16 && Bus.busState != 0) {
			if (Bus.busState != 0) {
				this.backCount++;

				
				// 改变界面中的回退次数显示
				if (this.getName().equals("A")) 
				{
					CSMASimulation.jTextFieldABackCount.setText(this.backCount+"");
				}
			    else if(this.getName().equals("B"))
			    {   CSMASimulation.jTextFieldBBackCount.setText(this.backCount+"");
			    }
			    else if(this.getName().equals("C"))
			    {   CSMASimulation.jTextFieldCBackCount.setText(this.backCount+"");
			    }
				else
				{   CSMASimulation.jTextFieldDBackCount.setText(this.backCount+"");
				}
				
			}

			int n;// n用于计算后退时间
			Random ran = new Random();
			if (this.backCount <= 10)
				n = this.backCount;
			else
				n = 10;
			this.waitDelay = 2 * ran.nextInt((int) Math.pow(2, n)); // 基本退避时间（争用期）2t=2

			
			//改变界面中的回退时间显示
			if (this.getName().equals("A")) 
			{
				CSMASimulation.jTextFieldABackTime.setText(this.waitDelay+"");
			}
		    else if(this.getName().equals("B"))
		    {   CSMASimulation.jTextFieldBBackTime.setText(this.waitDelay+"");
		    }
		    else if(this.getName().equals("C"))
		    {   CSMASimulation.jTextFieldCBackTime.setText(this.waitDelay+"");
		    }
		    else
		    {   CSMASimulation.jTextFieldDBackTime.setText(this.waitDelay+"");
		    }
			
			

			if (this.waitDelay == 0 && this.backCount != 0)
				continue;

			
			//非坚持CSMA/CD：若信道(Channal)闲，则发送数据；若忙，则随机等待一段时间（即回退时间），重新监听（注意：等待过程中不监听）
			
			
			//由于竞争者进程是动态建立（不是初始化时候将所有竞争者进程建立起来）的，所以可能会出现这样的情况：主机A的退避时间比主机B的退避时间长，
             //但是主机A却比B先发送，因为主机A和主机B的退避时间起点不相同
			//A wireless node transmits and if collision is detected, it will
			//back off for a random period and will re-transmit.
			try {
				this.sleep(this.waitDelay * 1000);
			     } catch (InterruptedException e) {
					CSMASimulation.jProgressBar.setString("信道竞争异常！");
				 }
		   /* if (Bus.busState != 0) {
				continue;
			} else
			{   
				break;
			}*/
		}

		synchronized (bus) {
			Bus.busState = 1;
          			
			CSMASimulation.jProgressBar.setString(this.getName() + " owns the Channal");
			
			if (this.getName().equals("A")) 
			{
			  CSMASimulation.jLabelA.setVisible(true);
			  CSMASimulation.jButtonA.setIcon(new ImageIcon(getClass()
						.getClassLoader().getResource("sending.jpg")));
			}
		    else if(this.getName().equals("B"))
		    { CSMASimulation.jLabelB.setVisible(true);
		      CSMASimulation.jButtonB.setIcon(new ImageIcon(getClass()
					.getClassLoader().getResource("sending.jpg")));
		    }
		    else if(this.getName().equals("C"))
		    { CSMASimulation.jLabelC.setVisible(true);
		      CSMASimulation.jButtonC.setIcon(new ImageIcon(getClass()
					.getClassLoader().getResource("sending.jpg")));
		    }
			 else
			    { CSMASimulation.jLabelD.setVisible(true);
			      CSMASimulation.jButtonD.setIcon(new ImageIcon(getClass()
						.getClassLoader().getResource("sending.jpg")));
			    }
			CSMASimulation.jProgressBar.setMaximum(this.delay);
            
			try {
				for (int i = 0; i <= this.delay; i++) {
					this.sleep((Bus.busIFS + 1000));

					// 在此添加进度条的值
						int j = CSMASimulation.jProgressBar.getValue();
						j++;
						CSMASimulation.jProgressBar.setValue(j);
					
				}
				CSMASimulation.jProgressBar.setValue(0);
				// 隐藏闪电图标

				Bus.usedTime += this.delay;
				Bus.busState = 0;			
				
				if (this.getName().equals("A")) 
				{
					CSMASimulation.jLabelA.setVisible(false);
					CSMASimulation.jButtonAControl.setEnabled(true);
					CSMASimulation.jTextFieldATranTime.setText("");
					CSMASimulation.jTextFieldABackCount.setText("");
					CSMASimulation.jTextFieldABackTime.setText("");
					CSMASimulation.jButtonA.setIcon(new ImageIcon(getClass()
							.getClassLoader().getResource("unworking.jpg")));
					
				}
			    else if(this.getName().equals("B"))
			    { 	CSMASimulation.jLabelB.setVisible(false);
			    CSMASimulation.jButtonBControl.setEnabled(true);
			    CSMASimulation.jTextFieldBTranTime.setText("");
				CSMASimulation.jTextFieldBBackCount.setText("");
				CSMASimulation.jTextFieldBBackTime.setText("");
				CSMASimulation.jButtonB.setIcon(new ImageIcon(getClass()
						.getClassLoader().getResource("unworking.jpg")));
			    }
			    else if(this.getName().equals("C"))
			    {  CSMASimulation.jLabelC.setVisible(false);
			       CSMASimulation.jButtonCControl.setEnabled(true);
			       CSMASimulation.jTextFieldCTranTime.setText("");
				   CSMASimulation.jTextFieldCBackCount.setText("");
				   CSMASimulation.jTextFieldCBackTime.setText("");
				   CSMASimulation.jButtonC.setIcon(new ImageIcon(getClass()
						.getClassLoader().getResource("unworking.jpg")));
			    }
				 else
				    {  CSMASimulation.jLabelD.setVisible(false);
				       CSMASimulation.jButtonDControl.setEnabled(true);
				       CSMASimulation.jTextFieldDTranTime.setText("");
					   CSMASimulation.jTextFieldDBackCount.setText("");
					   CSMASimulation.jTextFieldDBackTime.setText("");
					   CSMASimulation.jButtonD.setIcon(new ImageIcon(getClass()
							.getClassLoader().getResource("unworking.jpg")));
				    }
				
			} catch (InterruptedException e) {
				CSMASimulation.jProgressBar.setString("信道竞争异常！");
			} finally {
				Bus.busState = 0;

			}

		}

		if (this.backCount >= 16) {
			CSMASimulation.jProgressBar.setString("当前主机"+this.getName()+"不能使用信道！");
			this.backCount = 0;
		}

		// 将利用率用百分号表示出来
		int r = (new BigDecimal(Bus.getRate() * 1000).setScale(0,
				BigDecimal.ROUND_HALF_UP)).intValue();
		CSMASimulation.jProgressBar.setString(this.getName() + " free the channal,Utilization rate is：" + r / 10 + "." + r % 10 + "% about "+r/10+"."+r%10+ " kbps");
		

	}
}
