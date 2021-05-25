package OSI.OSU.MSQ.ASU.OSU.PSU.MSU.AVQ.ASQ.OPE.wekaPilot2D;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Panel;
import java.awt.ScrollPane;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.swing.JButton;
import javax.swing.JScrollPane;

import OSI.OPE.OEQ.MCQ.OVU.PQE.osgi.*;
import weka.clusterers.*;
import weka.core.*;
import weka.core.converters.ConverterUtils.*;
import weka.gui.visualize.PlotData2D;
import weka.gui.visualize.VisualizePanel;
public class WekaPilot2DOSU_MSQ_AVQ_ASQ_OVQ_OSQ_VSQ extends OSU_AVQ_ASQ_AVQ_ASQ_OVQ_OSQ_VSQ{
	private static final long serialVersionUID = 1L;
	public JButton button;
	public String path;
	public WekaPilot2DOSU_MSQ_AVQ_ASQ_OVQ_OSQ_VSQ(){
	}
	public void view() throws Exception{
		try {
			scrollPane= new ScrollPane();
			panel=new Panel();
			panel.setBackground(Color.yellow);	
			//
			JScrollPane j= new JScrollPane();
			DataSource source= new DataSource(path);
			Instances train= source.getDataSet();
			if (train!= null && train.classIndex() != -1)
				throw new IllegalArgumentException("Data cannot have class attribute!");
			String[] options ;
			options= new String[2];
			options[0]= "-t";
			options[1]= path;
			ClusterEvaluation eval= new ClusterEvaluation();
			eval.evaluateClusterer(train);
			PlotData2D predData = new PlotData2D(train);
			String name = (new SimpleDateFormat("HH:mm:ss - ")).format(new Date());
			VisualizePanel vp = new VisualizePanel();
			vp.setName(name + " (" + train.relationName() + ")");
			predData.setPlotName(name + " (" + train.relationName() + ")");
			vp.addPlot(predData);
			// String plotName = vp.getName();
			vp.setPreferredSize(new Dimension(800,600));
			j.setViewportView(vp);
			//
			panel.add(j);
			scrollPane.add(panel);
			add(scrollPane);
			close=false;	
		}catch(Exception e) {		
		} 
	}
	@Override  
	public OSU_AVQ_ASQ_AVQ_ASQ_OVQ_OSQ_VSQ clone() {   
		objectView = (OSU_AVQ_ASQ_AVQ_ASQ_OVQ_OSQ_VSQ)super.clone();  
		return objectView;  
	}  
}
