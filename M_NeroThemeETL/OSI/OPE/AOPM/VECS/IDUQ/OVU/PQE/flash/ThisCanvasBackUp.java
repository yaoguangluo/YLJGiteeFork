package OSI.OPE.AOPM.VECS.IDUQ.OVU.PQE.flash;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.MenuItem;
import java.awt.PopupMenu;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextPane;

import OSI.OPE.MSQ.OVU.PQE.nodeInfo.NodeInfo;
import OSI.OPE.MSQ.OVU.PQE.nodeProject.NodeProject;
import OSI.OPE.MSQ.SS.stable.StableData;
import OSI.OPE.OVQ.MSQ.OVU.PQE.platForm.UnicornJSplitPane;
import OSI.OPE.OVU.MVQ.OVU.PQE.nodeView.NodeShow;
import OSI.OPE.OVU.MVU.OVU.PQE.nodeEdit.CheckRangeVPS;
import OSI.OPE.OVU.MVU.OVU.PQE.nodeEdit.ChooseQ_VPS;
import OSI.OPE.OVU.MVU.OVU.PQE.nodeEdit.DrawArrowVPS;
import OSI.OPE.OVU.MVU.OVU.PQE.nodeEdit.DrawFlashSide;
import OSI.OPE.OVU.MVU.OVU.PQE.nodeEdit.DynamicLineU_VPS;
import OSI.OPE.OVU.MVU.OVU.PQE.nodeEdit.LinkList;
import OSI.OPE.OVU.MVU.OVU.PQE.nodeEdit.LinkNode;
import OSI.OPE.OVU.MVU.OVU.PQE.nodeEdit.Sort;
//作者: 罗瑶光
public class ThisCanvasBackUp extends JPanel implements MouseMotionListener
, MouseListener, ItemListener, ActionListener, Runnable{
	private static final long serialVersionUID = 1L;
	public Thread threadApplet;
	public String fileCurrentpath;
	public int w, h;
	public boolean isInit= false;
	public int flash= 0;
	public int count= 0;
	public int mouseDirection= 0;
	public String currentNodeName;
	public int currentNodeID;
	public String currentNodePrimaryKey;
	public LinkList first;
	public int currentX, currentY;
	public int choose= 0;
	public int oldX, oldY;
	public int newx, newy;
	public int isOperation= 0;
	public String treeNodeName;
	public NodeShow nodeView;
	public NodeProject nodeProject;
	public NodeInfo nodeInfo;
	public UnicornJSplitPane mainSplitPane;
	public UnicornJSplitPane leftSplitPane;
	public UnicornJSplitPane rightSplitPane;
	public UnicornJSplitPane righttopSplitPane;
	public JScrollPane righttopScrollPane;
	public JScrollPane rightdownScrollPane;
	public JScrollPane rightrightScrollPane;
	public JTextPane rightBotJTextPane;
	public PopupMenu popupMenu, nodeMenu, itemMenu, engineMenu;
	public MenuItem save, saveAs, delete, load;
	public MenuItem menuItem;
	public MenuItem configre, run, show, dNode, dLine;
	public ChooseQ_VPS chooseCheck;
	public DynamicLineU_VPS dynamicLineUpdater;
	public DrawArrowVPS drawArrow;
	public CheckRangeVPS checkRange;
	public ThisCanvasBackUp(Thread threadApplet, LinkList first, NodeShow nodeView
			, PopupMenu nodeMenu, JTextPane rightBotJTextPane){
		this.setLayout(null);
		this.addMouseListener(this);
		this.addMouseMotionListener(this);
		this.start();
		this.setOpaque(false);
		this.threadApplet= threadApplet;
		this.first= first;
		this.nodeView= nodeView;
		this.nodeMenu= nodeMenu;
		this.rightBotJTextPane= rightBotJTextPane;
		chooseCheck= new ChooseQ_VPS();
		dynamicLineUpdater= new DynamicLineU_VPS();
		drawArrow= new DrawArrowVPS();
		checkRange= new CheckRangeVPS();
		this.setBackground(Color.white);
	}  
	@SuppressWarnings(StableData.TAG_DEPRECATION)
	public void run() {
		while(true){   
			try{
				Thread.sleep(80);
				this.updateUI();
			}catch (InterruptedException e) {
				//threadApplet.destroy(); //jdk16 没有了destroy
				threadApplet.stop();
				e.printStackTrace();
			}
		}      
	}
	public void start(){
		if(null== threadApplet){
			threadApplet =  new Thread(this);
			threadApplet.start();
		}

	}
	@SuppressWarnings(StableData.TAG_DEPRECATION)
	public void stop() {
		//threadApplet.destroy(); //jdk16 没有了destroy
		threadApplet.stop();
	}

	public void actionPerformed(ActionEvent arg0) {}

	public void itemStateChanged(ItemEvent arg0) {}

	public void mouseClicked(MouseEvent arg0) {}

	public void mouseEntered(MouseEvent arg0) {}

	public void mouseExited(MouseEvent arg0) {}

	public void mousePressed(MouseEvent arg0) {
		isOperation= 1;
		oldX= arg0.getX();
		oldY= arg0.getY();
		currentX= arg0.getX();
		currentY= arg0.getY();
		Object[] node= chooseCheck.chooseCheckNode(first.first, arg0);
		currentNodeName= (String) node[0];
		currentNodeID= (int) node[1];
		currentNodePrimaryKey= (String) node[2];
		rightBotJTextPane.setText("坐标位："+ arg0.getX()+ "|"+ arg0.getY());
		rightBotJTextPane.validate();
	}

	public void mouseReleased(MouseEvent arg0){
		isOperation= 0;
		currentX= arg0.getX();
		currentY= arg0.getY();
		LinkNode node= first.first;
		while(null!= node){
			if(node.rightChoose&& !node.leftChoose){
				if(oldX== arg0.getX()&&oldY == arg0.getY()){
					nodeMenu.show(this, arg0.getX(), arg0.getY());
				}
				else{
					checkRange.doCheckRange(first.first, node,arg0);
				}
			}
			node.setchoose(false);
			node.rightChoose= false;
			node.actionNodeLeft= false;
			node.actionNodeRight= false;
			node= node.next;
		}
	}

	public void mouseDragged(MouseEvent e) {
		isOperation= 1;
		try {
			Thread.sleep(32);//1000/25=40
		} catch (InterruptedException e1) {
			e1.printStackTrace();
		}
		currentX= e.getX();
		currentY= e.getY();
		LinkNode node= first.first;
		Graphics g= getGraphics();
		Graphics2D graphics2D= (Graphics2D)g;
		graphics2D.setColor(Color.black);
		boolean needUpdate= false;
		LinkNode actionNode= null;
		while(null!= node){
			if(node.rightChoose) {
				graphics2D.setColor(new Color(240, 240, 240));
				g.fillRect(node.x+19, node.y+12, 30, 30);
			}
			if(node.leftChoose|| node.rightChoose) {
				needUpdate= true;
			}
			if(node.leftChoose&& !node.rightChoose){
				node.actionNodeLeft= true;
				node.actionNodeRight= false;
				node.setxy(e.getX(), e.getY());
				actionNode= node;
				//移动后 节点输出坐标和连线更新
			}else {
				node.actionNodeLeft= false;
				node.actionNodeRight= true;
			}
			node= node.next;
		}
		if(needUpdate) {
			this.update(g);
			g.dispose();
			if(null!= actionNode) {
				actionNode.actionNodeLeft= false;
				actionNode.actionNodeRight= false;
			}
		}
		newx= currentX;
		newy= currentY;
	}

	public void mouseMoved(MouseEvent arg0) {
	}

	public void paint(Graphics g){
		try {
			nodeView.validate();
			Graphics2D graphics2D= (Graphics2D)g;
			//graphics2D.clearRect(0, 0, this.getWidth(), this.getHeight());
			first.first= Sort.sort(first.first);
			LinkNode node= first.first;
			while(node!= null){
				node.x= node.x< 0? 10: node.x;
				node.x= node.x> this.getWidth()-100? this.getWidth()-100: node.x;
				node.y= node.y< 0? 10: node.y;
				node.y= node.y> this.getHeight()-100? this.getHeight()-100: node.y;
			
				if(!node.actionNodeLeft&& !node.leftChoose) { 
					g.drawImage(node.thisFace.thisImage, node.x+19, node.y+12, this);
				}
				if(node.flash> 100){
					node.flash= 0;
				}
				//如果一个节点是移动节点 或者这个节点的连接前序节点是移动节点 
				if(node.actionNodeLeft) {
					DrawFlashSide.deleteFlashSide(graphics2D, node.oldx, node.oldy);
				}
				if(0== isOperation) {
					DrawFlashSide.drawFlashSide(graphics2D, node.x, node.y, node.flash++ % 3);
				}else {
					DrawFlashSide.drawFlashSide(graphics2D, node.x, node.y, node.flash);
				}
				if(node.actionNodeLeft) {
					graphics2D.setColor(new Color(240, 240, 240));
					g.drawString(node.name+ "->"+ node.ID, node.oldx- 5, node.oldy- 20);
				}
				graphics2D.setColor(Color.black);
				g.drawString(node.name+ "->"+ node.ID, node.x- 5, node.y- 20);
				graphics2D.setColor(new	Color(25, 25, 112));
				if(node.beconnect){
					if(node.tBeconnect){
						//记录arrow 同时 下一次画图, 清除该上一次 arrow
						if(node.actionNodeLeft) {
							graphics2D.setColor(new Color(240, 240, 240));
							drawArrow.doDrawArrow(graphics2D, node.tBeconnectX+ 62, node.tBeconnectY+ 28
									, node.oldx+ 14, node.oldy- 6);
							graphics2D.setColor(new	Color(25, 25, 112));
						}
						drawArrow.doDrawArrow(graphics2D, node.tBeconnectX+ 62, node.tBeconnectY+ 28
								, node.x+ 14, node.y- 6);
						if(node.tNode.actionNodeLeft) {
							graphics2D.setColor(new Color(240, 240, 240));
							drawArrow.doDrawArrow(graphics2D, node.tBeconnectX+ 62, node.tBeconnectY+ 28
									, node.x+ 14, node.y- 6);
							graphics2D.setColor(new	Color(25, 25, 112));
							drawArrow.doDrawArrow(graphics2D, node.tNode.x+ 62, node.tNode.y+ 28
									, node.x+ 14, node.y- 6);
							node.tBeconnectX= node.tNode.x;
							node.tBeconnectY= node.tNode.y;
						}
						if(!node.leftChoose&& node.rightChoose){
							graphics2D.setColor(new	Color(240, 240, 240));
							drawArrow.doDrawArrow(graphics2D, oldX, oldY, newx, newy);
							graphics2D.setColor(Color.black);
							drawArrow.doDrawArrow(graphics2D, oldX, oldY, currentX, currentY);
							graphics2D.setColor(new	Color(25, 25, 112));	
						}
					}if(node.mBeconnect){
						if(node.actionNodeLeft) {
							graphics2D.setColor(new Color(240, 240, 240));
							drawArrow.doDrawArrow(graphics2D, node.mBeconnectX+ 62, node.mBeconnectY+ 28
									, node.oldx- 4, node.oldy+ 25);
							graphics2D.setColor(new	Color(25, 25, 112));
						}
						drawArrow.doDrawArrow(graphics2D, node.mBeconnectX+ 62, node.mBeconnectY+ 28
								, node.x- 4, node.y+ 25);
						if(node.mNode.actionNodeLeft) {
							graphics2D.setColor(new Color(240, 240, 240));
							drawArrow.doDrawArrow(graphics2D, node.mBeconnectX+ 62, node.mBeconnectY+ 28
									, node.x- 4, node.y+ 25);
							graphics2D.setColor(new	Color(25, 25, 112));
							drawArrow.doDrawArrow(graphics2D,  node.mNode.x+ 62, node.mNode.y+ 28
									, node.x- 4, node.y+ 25);
							node.mBeconnectX= node.mNode.x;
							node.mBeconnectY= node.mNode.y;	
						}
						if(!node.leftChoose&& node.rightChoose){
							graphics2D.setColor(new	Color(240, 240, 240));
							drawArrow.doDrawArrow(graphics2D, oldX, oldY, newx, newy);
							graphics2D.setColor(Color.black);
							drawArrow.doDrawArrow(graphics2D, oldX, oldY, currentX, currentY);
							graphics2D.setColor(new	Color(25, 25, 112));	
						}
					}if(node.dBeconnect){
						if(node.actionNodeLeft) {
							graphics2D.setColor(new Color(240, 240, 240));
							drawArrow.doDrawArrow(graphics2D, node.dBeconnectX+ 62, node.dBeconnectY+ 28
									, node.oldx+ 6, node.oldy+ 55);
							graphics2D.setColor(new	Color(25, 25, 112));
						}
						drawArrow.doDrawArrow(graphics2D, node.dBeconnectX+ 62, node.dBeconnectY+ 28
								, node.x+ 6, node.y+ 55);
						if(node.dNode.actionNodeLeft) {
							graphics2D.setColor(new Color(240, 240, 240));
							drawArrow.doDrawArrow(graphics2D, node.dBeconnectX+ 62, node.dBeconnectY+ 28
									, node.oldx+ 6, node.oldy+ 55);
							graphics2D.setColor(new	Color(25, 25, 112));
							drawArrow.doDrawArrow(graphics2D,  node.dNode.x+ 62, node.dNode.y+ 28
									, node.x+ 6, node.y+ 55);
							node.dBeconnectX= node.dNode.x;
							node.dBeconnectY= node.dNode.y;
						}			
						if(!node.leftChoose&& node.rightChoose){
							graphics2D.setColor(new	Color(240, 240, 240));
							drawArrow.doDrawArrow(graphics2D, oldX, oldY, newx, newy);
							graphics2D.setColor(Color.black);
							drawArrow.doDrawArrow(graphics2D, oldX, oldY, currentX, currentY);
							graphics2D.setColor(new	Color(25, 25, 112));	
						}
					}
				}else if(!node.leftChoose&& node.rightChoose){
					graphics2D.setColor(new	Color(240, 240, 240));
					drawArrow.doDrawArrow(graphics2D, oldX, oldY, newx, newy);
					graphics2D.setColor(Color.black);
					drawArrow.doDrawArrow(graphics2D, oldX, oldY, currentX, currentY);
					graphics2D.setColor(new	Color(25, 25, 112));
				}
				if(node.actionNodeLeft) {
					node.oldx= node.x;
					node.oldy= node.y;
				}
				node= node.next;
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
	}	
}