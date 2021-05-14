package OSI.OSU.SI.ASQ.OSD.AVI.AEI.ACI.ASI.OVI.OEI.OCI.OSI.PVI.PEI.PCI.PSI.filterChuFangJinJiAttributeH;
import java.awt.event.ActionEvent;

import java.awt.event.ActionListener;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

import javax.swing.JButton;
import javax.swing.JTable;
import javax.swing.JTextPane;

import OSI.OPE.OEQ.MCQ.OVU.PQE.osgi.*;

import java.awt.Panel;
import java.awt.ScrollPane;
import java.awt.Color;
@SuppressWarnings("unused")
public class FilterChuFangJinJiAttributeHPanel extends OSU_AVQ_ASQ_AOI_AOD_AOU_AOQ_VES{
	private static final long serialVersionUID = 1L;
	private JTextPane textTemp;
	private Object[][] tableData_old;
	public FilterChuFangJinJiAttributeHPanel(final FilterChuFangJinJiAttributeHRun SQ_OSU_MSQ_OSU_AVQ_ASQ_OPE_OPC_ECI, JTextPane text
			, Object[][] tableData_old){
		this.textTemp = text;
		this.tableData_old = tableData_old;
		setLayout(null);
		scrollPane = new ScrollPane();
		add(scrollPane);
		panel = new Panel();
		panel.setLayout(null);
		panel.setBackground(Color.white);
		JButton button = new JButton("���");
		button.setBounds(0, 0, 150, 30);
		button.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				System.out.println(e.getSource());
				close = true;
				SQ_OSU_MSQ_OSU_AVQ_ASQ_OPE_OPC_ECI.value = 1;
			}
		});
		panel.add(button);
		JButton readfile = new JButton("���䴦������Ҫ����");
		readfile.setBounds(0, 35, 150, 65);
		readfile.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0) {
				try {
					int rc = SQ_OSU_MSQ_OSU_AVQ_ASQ_OPE_OPC_ECI.toptablein.getRowCount();
					//��ͷ
					Object[] spec = new Object[] {"��ҩ��","����","��Ч","����","��ζ","����"};
					//����
					Map<Integer,Object[]> cf = new ConcurrentHashMap<>();
					int c=0;
					Here:
						for(int i = 0; i < rc; i++){
							for(int j = 0; j < rc; j++){
								if(SQ_OSU_MSQ_OSU_AVQ_ASQ_OPE_OPC_ECI.toptablein.getValueAt(j, 3).toString()
										.contains(SQ_OSU_MSQ_OSU_AVQ_ASQ_OPE_OPC_ECI.toptablein.getValueAt(i, 0).toString())) {
									continue Here;
								}
							}
							Object[] obj = new Object[] {SQ_OSU_MSQ_OSU_AVQ_ASQ_OPE_OPC_ECI.toptablein.getValueAt(i, 0),
									SQ_OSU_MSQ_OSU_AVQ_ASQ_OPE_OPC_ECI.toptablein.getValueAt(i, 1),
									SQ_OSU_MSQ_OSU_AVQ_ASQ_OPE_OPC_ECI.toptablein.getValueAt(i, 2),
									SQ_OSU_MSQ_OSU_AVQ_ASQ_OPE_OPC_ECI.toptablein.getValueAt(i, 3),
									SQ_OSU_MSQ_OSU_AVQ_ASQ_OPE_OPC_ECI.toptablein.getValueAt(i, 4),
									SQ_OSU_MSQ_OSU_AVQ_ASQ_OPE_OPC_ECI.toptablein.getValueAt(i, 5),
							};
							cf.put(c++, obj);
						}
					Object[][] content = new Object[cf.size()][6]; 
					for(int i=0;i<content.length;i++) {
						content[i]=cf.get(i);
					}
					SQ_OSU_MSQ_OSU_AVQ_ASQ_OPE_OPC_ECI.toptablein = new JTable(content,spec); 
					SQ_OSU_MSQ_OSU_AVQ_ASQ_OPE_OPC_ECI.toptablein.setBounds(0, 100, 400, 400);
					SQ_OSU_MSQ_OSU_AVQ_ASQ_OPE_OPC_ECI.toptablein.setVisible(true);
				}catch(Exception e) {		
				}
				
			}
		});
		panel.add(readfile);
		scrollPane.add(panel);
		close=false;
		
	}
	public void config(){
		System.out.println("configued");
	}
}
