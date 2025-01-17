package MVQ.button;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;
import java.util.Random;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.Timer;
public class CfxButton extends JButton{
	/**
	 * Author Yaoguang Luo
	 */
	private static final long serialVersionUID = 1L;
	private int x, y=0;
	public CfxButton(String string, final int x, final int y, java.awt.Color c) {  
		super(string); 
		this.x = x;
		this.y = y; 
		this.setContentAreaFilled(false); 
		this.setBorder(BorderFactory.createRaisedBevelBorder()); 
		this.setPreferredSize(new Dimension(this.x+ 1, this.y+ 1));
		this.setOpaque(true);
		this.setBackground(c);
		this.addMouseMotionListener(new MouseMotionListener() {
			public void mouseDragged(MouseEvent e) {
			}
			
			public void mouseMoved(MouseEvent e) {
				Graphics g = getGraphics();
				setcolor(g);
				//g.setColor(new Color(255,0,255,128));
				int xPoints[]={8,8+15,8};
				int yPoints[]={8,8,8+15};
				g.fillPolygon(xPoints,yPoints,3);
				int xPoints1[]={x-16-5,x-8,x-8};
				int yPoints1[]={y-8,y-16-5,y-8};
				g.fillPolygon(xPoints1,yPoints1,3);
				g.fillRect(8,8,x-16 ,5);
				g.fillRect(8,8,5 ,y-16);
				g.fillRect(8,y-12,x-16 ,5);
				g.fillRect(x-12,8,5 ,y-16);
			}
		});
		Graphics g = getGraphics();
		this.callback(g); 
	}
	protected void setcolor(Graphics g) {
		// TODO Auto-generated method stub
		int x=1+new Random().nextInt(9);
		if(1==x){
			g.setColor(Color.BLACK);
		}
		if(2==x){
			g.setColor(Color.blue);
		}
		if(3==x){
			g.setColor(Color.cyan);
		}
		if(4==x){
			g.setColor(Color.DARK_GRAY);
		}
		if(5==x){
			g.setColor(Color.green);
		}
		if(6==x){
			g.setColor(Color.orange);
		}
		if(7==x){
			g.setColor(Color.pink);
		}
		if(8==x){
			g.setColor(Color.red);
		}
		if(9==x){
			g.setColor(Color.yellow);
		}	
	}
	public void callback(Graphics g){
		Timer blinkTimer = new Timer(800, new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Graphics g = getGraphics();
				if(null==g){
					return;
				}
				setcolor(g);
				g.drawLine(0, 0,0,y);
				g.drawLine(0, 0,x,0);	
				g.drawLine(x, y,x,0);
				g.drawLine(x, y,0,y);
				setcolor(g);
				g.drawLine(2, 2,2,y-2);
				g.drawLine(2, 2,x-2,2);	
				g.drawLine(x-2, y-2,x-2,2);
				g.drawLine(x-2, y-2,2,y-2);
				setcolor(g);
				g.drawLine(4, 4,4,y-4);
				g.drawLine(4, 4,x-4,4);	
				g.drawLine(x-4, y-4,x-4,4);
				g.drawLine(x-4, y-4,4,y-4);
				setcolor(g);
				g.drawLine(6, 6,6,y-6);
				g.drawLine(6, 6,x-6,6);	
				g.drawLine(x-6, y-6,x-6,6);
				g.drawLine(x-6, y-6,6,y-6);
				setcolor(g);
				g.drawLine(8, 8,8,y-8);
				g.drawLine(8, 8,x-8,8);	
				g.drawLine(x-8, y-8,x-8,8);
				g.drawLine(x-8, y-8,8,y-8);
			}
			private void setcolor(Graphics g) {
				int x=1+new Random().nextInt(9);
				if(1==x){
					g.setColor(Color.BLACK);
				}
				if(2==x){
					g.setColor(Color.blue);
				}
				if(3==x){
					g.setColor(Color.cyan);
				}
				if(4==x){
					g.setColor(Color.DARK_GRAY);
				}
				if(5==x){
					g.setColor(Color.green);
				}
				if(6==x){
					g.setColor(Color.orange);
				}
				if(7==x){
					g.setColor(Color.pink);
				}
				if(8==x){
					g.setColor(Color.red);
				}
				if(9==x){
					g.setColor(Color.yellow);
				}	
			}
		});
		blinkTimer.start(); 
	}
}