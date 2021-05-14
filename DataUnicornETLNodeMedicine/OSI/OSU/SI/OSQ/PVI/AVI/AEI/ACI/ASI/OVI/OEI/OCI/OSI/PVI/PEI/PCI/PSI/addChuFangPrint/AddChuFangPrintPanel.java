package OSI.OSU.SI.OSQ.PVI.AVI.AEI.ACI.ASI.OVI.OEI.OCI.OSI.PVI.PEI.PCI.PSI.addChuFangPrint;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JTable;
import javax.swing.JTextPane;

import OSI.OPE.OEQ.MCQ.OVU.PQE.osgi.*;

import java.awt.Panel;
import java.awt.ScrollPane;
import java.awt.Color;
@SuppressWarnings("unused")
public class AddChuFangPrintPanel extends OSU_AVQ_ASQ_AOI_AOD_AOU_AOQ_VES{
	private static final long serialVersionUID= 1L;
	private JTextPane textTemp;
	private Object[][] tableData_old;
	public AddChuFangPrintPanel(final AddChuFangPrintRun SQ_OSU_MSQ_OSU_AVQ_ASQ_OPE_OPC_ECI, JTextPane text
			, Object[][] tableData_old){
		this.textTemp= text;
		this.tableData_old= tableData_old;
		setLayout(null);
		scrollPane= new ScrollPane();
		add(scrollPane);
		panel= new Panel();
		panel.setLayout(null);
		panel.setBackground(Color.white);
		JButton button= new JButton("���");
		button.setBounds(0, 0, 150, 30);
		button.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				System.out.println(e.getSource());
				close= true;
				SQ_OSU_MSQ_OSU_AVQ_ASQ_OPE_OPC_ECI.value= 1;
			}
		});
		panel.add(button);
		JButton readfile= new JButton("���䴦������Ҫ����");
		readfile.setBounds(0, 35, 150, 65);
		readfile.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0) {
				try {
					int rc= SQ_OSU_MSQ_OSU_AVQ_ASQ_OPE_OPC_ECI.toptablein.getRowCount();
					Object[][] content= new Object[rc][6]; 
					//��ͷ
					Object[] spec= new Object[] {"��ҩ��","����","��Ч","����","��ζ","����"};
					//����
					Here:
						for(int i= 0; i< rc; i++){
							content[i][0]= SQ_OSU_MSQ_OSU_AVQ_ASQ_OPE_OPC_ECI.toptablein.getValueAt(i, 0);
							content[i][1]= SQ_OSU_MSQ_OSU_AVQ_ASQ_OPE_OPC_ECI.toptablein.getValueAt(i, 1);
							for(int j= 0; j< tableData_old.length; j++) {
								if(tableData_old[j][2].toString().equalsIgnoreCase(content[i][0].toString())) {
									content[i][2]=tableData_old[j][4];
									content[i][3]=tableData_old[j][5];
									content[i][4]=tableData_old[j][7];
									content[i][5]=tableData_old[j][8];
									continue Here;
								}
							}
						}				
					SQ_OSU_MSQ_OSU_AVQ_ASQ_OPE_OPC_ECI.toptablein= new JTable(content,spec); 
					SQ_OSU_MSQ_OSU_AVQ_ASQ_OPE_OPC_ECI.toptablein.setBounds(0, 100, 400, 400);
					SQ_OSU_MSQ_OSU_AVQ_ASQ_OPE_OPC_ECI.toptablein.setVisible(true);
				}catch(Exception e) {
				}
			}
		});
		panel.add(readfile);
		scrollPane.add(panel);
		close= false;
	}
	public void config(){
		System.out.println("configued");
	}
}
