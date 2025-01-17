package ME.APM.VSQ.Harrison;
import java.awt.Color;


import java.awt.Component;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;

import AVQ.ASQ.OVQ.OSQ.VSQ.obj.Verbal;
import AVQ.ASQ.OVQ.OSQ.VSQ.obj.WordFrequency;
import AVQ.ASQ.OVQ.OSQ.VSQ.stable.StableData;
import ESU.list.List_ESU;
import ESU.sort.Quick9DLYGWithString_ESU;
import ME.APM.VSQ.App;
import PEU.P.table.TableSorterZYNK;
import MVQ.button.DetaButton;
import OCI.ME.analysis.C.A;
import OSI.AOP.neo.tts.ReadChinese;
public class CecilPage extends Container implements MouseListener, KeyListener{
	private static final long serialVersionUID = 1L;
	public String key;
	public JTextPane data ;
	public JTextPane statistic ;
	public DetaButton buttonPrev;
	public DetaButton buttonNext;
	public DetaButton buttonSum;
	public DetaButton buttonCrt;
	public int currentPage;
	public List<String> sets;
	public JTextField name;
	public javax.swing.JTable table;  
	public Object[][] tableData_old;
	public DefaultTableModel newTableModel = null;
	public List<String> copy;
	public List<String> dic_list;
	public Map<String, String> dic_map;
	public Object[] columnTitle = {"ID", "打分", "书名", "段落"};
	public A _A; 
	public Map<String, String> pos;
	public DetaButton buttonCTE;
	public DetaButton buttonFRS;
	public DetaButton buttonETC;
	public Map<String, String> pose;
	public Map<String, String> etc;
	public Map<String, String> cte;
	public Map<String, String> posec;
	public Map<String, String> posFullec;
	public ReadChinese readEnglish; 
	public JTextPane text ;
	public List<Verbal> verbals;
	public App app;
	public CecilPage(JTextPane text,A _A, Map<String, String> pos, Map<String, String> pose
			, Map<String, String> etc, Map<String, String> cte, Map<String, String> posec
			, Map<String, String> posFullec, App app) throws IOException{
		this.text = text;	this.pose = pose;
		this.etc = etc;
		this.cte = cte;
		this._A = _A;
		this.pos = pos;
		this.posec = posec;
		this.posFullec = posFullec;
		this.app = app;
		this.setLayout(null);
		this.setBounds(0, 0, 1490, 980);	
		JScrollPane jsp_name = new JScrollPane(this.name());
		jsp_name.setBounds(100, 15, 680, 50);
		JScrollPane jsp_data = new JScrollPane(this.data());
		JScrollPane jsp_statistic = new JScrollPane(this.statistic());

		jsp_statistic.setBounds(5, 290 + 100 - 80 + 200-260, 1440 - 650 - 645, 500-166+90-44);
		jsp_data.setBounds(5 + 800-650, 290 + 100 - 80 + 200-260+26, 1440-800+650-130, 500-166+90-70);
		JLabel jlabel = new JLabel("信息搜索:");  
		jlabel.setBounds(5, 15, 100, 50);
		JScrollPane jsp = new JScrollPane(this.jTable());
		jsp.setBounds(5, 80-80, 1440-130, 200+100+200-260);

		this.add(jsp);  
		this.add(jsp_data); 
		this.add(jsp_statistic);  
	}

	public JTextPane data() throws IOException {
		data = new JTextPane();  
		data.setBounds(850, 150, 1440-600, 800-70);

		buttonSum = new DetaButton("共有 " + (sets==null?0:(1 + sets.size() / 2001))+ " 页");
		buttonSum.setBounds(0, 0, 100, 30);
		buttonCrt = new DetaButton("当前页面：" + (currentPage + 1));
		buttonCrt.setBounds(120, 0, 150, 30);

		buttonPrev= new DetaButton("<-向前翻页");
		buttonPrev.setBounds(290, 0, 100, 30);
		buttonPrev.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Map<String, WordFrequency> map = new ConcurrentHashMap<>();
				try {
					currentPage-=1;
					currentPage = (currentPage< 0 ? 0 : currentPage );
					StringBuilder page = new StringBuilder().append("");
					List<String> setsForGet = sets.subList(currentPage*2000, (currentPage + 1)*2000<sets.size()? (currentPage + 1)*2000 : sets.size());
					Iterator<String> iterator = setsForGet.iterator();
					Here:
						while(iterator.hasNext()) {
							String setOfi = iterator.next();
							String pecsi="";
							String pfullecsi=posFullec.get(setOfi);
							if(pfullecsi == null) {
								page.append("<span style=\"background:#F1F1F1\"><font color=\"black\" size=\"5\">" + setOfi + "</font></span>");
								continue Here;
							}
							if(pos.containsKey(pfullecsi)) {
								pecsi=pos.get(pfullecsi);
							}
							if(pecsi.contains("名")||pecsi.contains("动")||pecsi.contains("形")) {
								if (map.containsKey(setOfi)) {
									WordFrequency wordFrequency = map.get(setOfi);
									wordFrequency.setFrequency(wordFrequency.getFrequency() + StableData.INT_ONE);
									map.put(setOfi, wordFrequency);
								} else {
									WordFrequency wordFrequency = new WordFrequency();
									wordFrequency.setFrequency(StableData.INT_ONE);
									wordFrequency.setWord(setOfi);
									map.put(setOfi, wordFrequency);
								}
							}
							if (!setOfi.equals("")) {
								if(key.contains(setOfi)&&(setOfi.length()>2)&&(pecsi.contains("名")||pecsi.contains("动")||pecsi.contains("形"))) {
									page.append("<span style=\"background:red\"><font color=\"white\">" + setOfi + "</font></span>");
									continue Here;
								}
								if(pecsi.contains("名")) {
									page.append("<span style=\"background:"+new PEU.P.image.ColorProcessor().Processor(255, 245, 255)+"\"><font color=\"black\" size=\"5\">"+setOfi+"</font></span>");
									continue Here;
								}
								if(pecsi.contains("动")) {
									page.append("<span style=\"background:"+new PEU.P.image.ColorProcessor().Processor(245, 255, 245)+"\"><font color=\"black\" size=\"5\">"+setOfi+"</font></span>");
									continue Here;
								}
								if(pecsi.contains("形")) {
									page.append("<span style=\"background:"+new PEU.P.image.ColorProcessor().Processor(255, 255, 245)+"\"><font color=\"black\" size=\"5\">"+setOfi+"</font></span>");
									continue Here;
								}
								if(pecsi.contains("副")) {
									page.append("<span style=\"background:#F1FFFF\"><font color=\"black\" size=\"5\">"+setOfi+"</font></span>");
									continue Here;
								} 
								page.append("<span style=\"background:white\"><font color=\"black\" size=\"5\">"+setOfi+"</font></span>");			 
							}
						}	
					buttonCrt.setText("当前页面：" + (currentPage + 1));
					data.setText(page.toString());
					data.setSelectionStart(0);
					data.setSelectionEnd(0);
					data.validate();
				}catch(Exception e1){	
					data.validate();
				}   
				try {
					statistic.setSize(500, 800);
					Map<Integer, WordFrequency> fwa = _A.sortWordFrequencyMapToSortMap(map);
					statistic.setContentType("text/html");
					StringBuilder page = new StringBuilder();
					Here:
						for (int i = fwa.size()-1; i >= 0; i--) {
							if (fwa.get(i) != null) {
								String pecsi="";
								String pfullecsi = posFullec.get(fwa.get(i).getWord().toLowerCase());
								if(pfullecsi == null) {
									page.append("<div style=\"background:black\"><font color=\"white\">" + fwa.get(i).getWord()+""+fwa.get(i).getFrequency() + "</font></div>");
									continue Here;
								}
								if(pos.containsKey(pfullecsi)) {
									pecsi=pos.get(pfullecsi);
								}
								if(pecsi.contains("名")) {
									page.append( "<div style=\"background:#FF44FF\"><font color=\"white\">" + fwa.get(i).getWord()+""+fwa.get(i).getFrequency() +"</font></div>");
									continue Here;
								}
								if(pecsi.contains("动")) {
									page.append("<div style=\"background:#8CEA00\"><font color=\"black\" size=\"5\">" + fwa.get(i).getWord()+""+fwa.get(i).getFrequency() +"</font></div>");
									continue Here;
								}
								if(pecsi.contains("形")) {
									page.append("<div style=\"background:#FF9224\"><font color=\"black\" size=\"5\">" + fwa.get(i).getWord()+""+fwa.get(i).getFrequency() +"</font></div>");
								}
							}
						}	
					statistic.setText(page.toString());
					statistic.setSelectionStart(0);
					statistic.setSelectionEnd(0);
					statistic.validate();
				}catch(Exception e1){	
					statistic.validate();
				}          
			}
		});
		buttonNext= new DetaButton("向后翻页->");
		buttonNext.setBounds(410, 0, 100, 30);
		buttonNext.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Map<String, WordFrequency> map = new ConcurrentHashMap<>();
				try {
					currentPage+=1;
					currentPage = (currentPage > (sets == null ? 0 : sets.size()) / 2001 ? currentPage - 1 : currentPage );
					StringBuilder page = new StringBuilder().append("");
					List<String> setsForGet = sets.subList(currentPage*2000, (currentPage + 1)*2000<sets.size()? (currentPage + 1)*2000 : sets.size());
					Iterator<String> iterator = setsForGet.iterator();
					Here:
						while(iterator.hasNext()) {
							String setOfi = iterator.next();
							String pecsi="";
							String pfullecsi=posFullec.get(setOfi);
							if(pfullecsi == null) {
								page.append("<span style=\"background:#F1F1F1\"><font color=\"black\" size=\"5\">" + setOfi + "</font></span>");
								continue Here;
							}
							if(pos.containsKey(pfullecsi)) {
								pecsi=pos.get(pfullecsi);
							}
							if(pecsi.contains("名")||pecsi.contains("动")||pecsi.contains("形")) {
								if (map.containsKey(setOfi)) {
									WordFrequency wordFrequency = map.get(setOfi);
									wordFrequency.setFrequency(wordFrequency.getFrequency() + StableData.INT_ONE);
									map.put(setOfi, wordFrequency);
								} else {
									WordFrequency wordFrequency = new WordFrequency();
									wordFrequency.setFrequency(StableData.INT_ONE);
									wordFrequency.setWord(setOfi);
									map.put(setOfi, wordFrequency);
								}
							}
							if (!setOfi.equals("")) {
								if(key.contains(setOfi)&&(setOfi.length()>2)&&(pecsi.contains("名")||pecsi.contains("动")||pecsi.contains("形"))) {
									page.append("<span style=\"background:red\"><font color=\"white\">" + setOfi + "</font></span>");
									continue Here;
								}
								if(pecsi.contains("名")) {
									page.append("<span style=\"background:"+new PEU.P.image.ColorProcessor().Processor(255, 245, 255)+"\"><font color=\"black\" size=\"5\">"+setOfi+"</font></span>");
									continue Here;
								}
								if(pecsi.contains("动")) {
									page.append("<span style=\"background:"+new PEU.P.image.ColorProcessor().Processor(245, 255, 245)+"\"><font color=\"black\" size=\"5\">"+setOfi+"</font></span>");
									continue Here;
								}
								if(pecsi.contains("形")) {
									page.append("<span style=\"background:"+new PEU.P.image.ColorProcessor().Processor(255, 255, 245)+"\"><font color=\"black\" size=\"5\">"+setOfi+"</font></span>");
									continue Here;
								}
								if(pecsi.contains("副")) {
									page.append("<span style=\"background:#F1FFFF\"><font color=\"black\" size=\"5\">"+setOfi+"</font></span>");
									continue Here;
								} 
								page.append("<span style=\"background:white\"><font color=\"black\" size=\"5\">"+setOfi+"</font></span>");			 
							}
						}
					buttonCrt.setText("当前页面：" + (currentPage + 1));
					data.setText(page.toString());
					data.setSelectionStart(0);
					data.setSelectionEnd(0);
					data.validate();
				}catch(Exception e1){	
					data.validate();
				}   
				try {
					statistic.setSize(500, 800);
					Map<Integer, WordFrequency> fwa = _A.sortWordFrequencyMapToSortMap(map);
					statistic.setContentType("text/html");
					StringBuilder page = new StringBuilder();
					Here:
						for (int i = fwa.size()-1; i >= 0; i--) {
							if (fwa.get(i) != null) {
								String pecsi="";
								String pfullecsi = posFullec.get(fwa.get(i).getWord().toLowerCase());
								if(pfullecsi == null) {
									page.append("<div style=\"background:black\"><font color=\"white\">" + fwa.get(i).getWord()+""+fwa.get(i).getFrequency() + "</font></div>");
									continue Here;
								}
								if(pos.containsKey(pfullecsi)) {
									pecsi=pos.get(pfullecsi);
								}
								if(pecsi.contains("名")) {
									page.append( "<div style=\"background:#FF44FF\"><font color=\"white\">" + fwa.get(i).getWord()+""+fwa.get(i).getFrequency() +"</font></div>");
									continue Here;
								}
								if(pecsi.contains("动")) {
									page.append("<div style=\"background:#8CEA00\"><font color=\"black\" size=\"5\">" + fwa.get(i).getWord()+""+fwa.get(i).getFrequency() +"</font></div>");
									continue Here;
								}
								if(pecsi.contains("形")) {
									page.append("<div style=\"background:#FF9224\"><font color=\"black\" size=\"5\">" + fwa.get(i).getWord()+""+fwa.get(i).getFrequency() +"</font></div>");
								}
							}
						}	
					statistic.setText(page.toString());
					statistic.setSelectionStart(0);
					statistic.setSelectionEnd(0);
					statistic.validate();
				}catch(Exception e1){	
					statistic.validate();
				}  
			}
		});
		buttonCTE = new DetaButton("中文注释");
		buttonCTE.setBounds(630, 0, 100, 30);
		buttonCTE.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {if(sets==null) {
				return;
			}
			StringBuilder page = new StringBuilder().append("");
			List<String> setsForGet = sets.subList(currentPage * 2000, (currentPage + 1)*2000<sets.size()? (currentPage + 1)*2000 : sets.size());
			Iterator<String> iterator = setsForGet.iterator();
			Here:
				while(iterator.hasNext()) {
					String setOfi = iterator.next();
					String pecsi="";
					String pfullecsi=posFullec.get(setOfi);
					if(pfullecsi == null) {
						page.append("<span style=\"background:#F1F1F1\"><font color=\"black\" size=\"5\">" + setOfi +(posFullec.containsKey(setOfi)?":("+posFullec.get(setOfi)+")":"") + "</font></span>");
						continue Here;
					}
					if(pos.containsKey(pfullecsi)) {
						pecsi=pos.get(pfullecsi);
					}
					if (!setOfi.equals("")) {
						if(key.contains(setOfi)&&(setOfi.length()>2)&&(pecsi.contains("名")||pecsi.contains("动")||pecsi.contains("形"))) {
							page.append("<span style=\"background:red\"><font color=\"white\">" + setOfi +(posFullec.containsKey(setOfi)?":("+posFullec.get(setOfi)+")":"") + "</font></span>");
							continue Here;
						}
						if(pecsi.contains("名")) {
							page.append("<span style=\"background:"+new PEU.P.image.ColorProcessor().Processor(255, 245, 255)+"\"><font color=\"black\" size=\"5\">" + setOfi +(posFullec.containsKey(setOfi)?":("+posFullec.get(setOfi)+")":"") + "</font></span>");
							continue Here;
						}
						if(pecsi.contains("动")) {
							page.append("<span style=\"background:"+new PEU.P.image.ColorProcessor().Processor(245, 255, 245)+"\"><font color=\"black\" size=\"5\">" + setOfi +(posFullec.containsKey(setOfi)?":("+posFullec.get(setOfi)+")":"") + "</font></span>");
							continue Here;
						}
						if(pecsi.contains("形")) {
							page.append("<span style=\"background:"+new PEU.P.image.ColorProcessor().Processor(255, 255, 245)+"\"><font color=\"black\" size=\"5\">" + setOfi +(posFullec.containsKey(setOfi)?":("+posFullec.get(setOfi)+")":"") + "</font></span>");
							continue Here;
						}
						if(pecsi.contains("副")) {
							page.append("<span style=\"background:#F1FFFF\"><font color=\"black\" size=\"5\">" + setOfi +(posFullec.containsKey(setOfi)?":("+posFullec.get(setOfi)+")":"") + "</font></span>");
							continue Here;
						} 
						page.append("<span style=\"background:white\"><font color=\"black\" size=\"5\">" + setOfi +(posFullec.containsKey(setOfi)?":("+posFullec.get(setOfi)+")":"") + "</font></span>");			 
					}
				}	
			buttonCrt.setText("当前页面：" + (currentPage + 1));
			data.setText(page.toString());
			data.setSelectionStart(0);
			data.setSelectionEnd(0);
			data.validate();
			}
		});

		buttonFRS = new DetaButton("英文还原");
		buttonFRS.setBounds(520, 0, 100, 30);
		buttonFRS.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {if(sets==null) {
				return;
			}
			StringBuilder page = new StringBuilder().append("");
			List<String> setsForGet = sets.subList(currentPage * 2000, (currentPage + 1)*2000<sets.size()? (currentPage + 1)*2000 : sets.size());
			Iterator<String> iterator = setsForGet.iterator();
			Here:
				while(iterator.hasNext()) {
					String setOfi = iterator.next();
					String pecsi="";
					String pfullecsi=posFullec.get(setOfi);
					if(pfullecsi == null) {
						page.append("<span style=\"background:#F1F1F1\"><font color=\"black\" size=\"5\">" + setOfi + "</font></span>");
						continue Here;
					}
					if(pos.containsKey(pfullecsi)) {
						pecsi=pos.get(pfullecsi);
					}
					if (!setOfi.equals("")) {
						if(key.contains(setOfi)&&(setOfi.length()>2)&&(pecsi.contains("名")||pecsi.contains("动")||pecsi.contains("形"))) {
							page.append("<span style=\"background:red\"><font color=\"white\">"+setOfi +"</font></span>");
							continue Here;
						}
						if(pecsi.contains("名")) {
							page.append("<span style=\"background:"+new PEU.P.image.ColorProcessor().Processor(255, 245, 255)+"\"><font color=\"black\" size=\"5\">"+setOfi+"</font></span>");
							continue Here;
						}
						if(pecsi.contains("动")) {
							page.append("<span style=\"background:"+new PEU.P.image.ColorProcessor().Processor(245, 255, 245)+"\"><font color=\"black\" size=\"5\">"+setOfi+"</font></span>");
							continue Here;
						}
						if(pecsi.contains("形")) {
							page.append("<span style=\"background:"+new PEU.P.image.ColorProcessor().Processor(255, 255, 245)+"\"><font color=\"black\" size=\"5\">"+setOfi+"</font></span>");
							continue Here;
						}
						if(pecsi.contains("副")) {
							page.append("<span style=\"background:#F1FFFF\"><font color=\"black\" size=\"5\">"+setOfi+"</font></span>");
							continue Here;
						} 
						page.append("<span style=\"background:white\"><font color=\"black\" size=\"5\">"+setOfi+"</font></span>");			 
					}
				}	
			buttonCrt.setText("当前页面：" + (currentPage + 1));
			data.setText(page.toString());
			data.setSelectionStart(0);
			data.setSelectionEnd(0);
			data.validate();
			}
		});
		readEnglish= new ReadChinese(app, _A);
		buttonETC = new DetaButton("语音阅读关");
		buttonETC.setBounds(740, 0, 100, 30);
		buttonETC.addActionListener(new ActionListener() {
			@SuppressWarnings("deprecation")
			public void actionPerformed(ActionEvent e) {
				if(sets==null) {
					return;
				}
//				if(app.appConfig.SectionJPanel.jlabel_end_boxs.isSelected()) {
//					return;
//				}
//				List<String> setsForGet = sets.subList(currentPage * 2000, (currentPage + 1)*2000<sets.size()
//						? (currentPage + 1)*2000: sets.size());
				if(!readEnglish.isAlive()) {
					buttonETC.setLabel("语音阅读开");
					readEnglish= new ReadChinese(app, _A);
					readEnglish.setPreReadList(sets);
					readEnglish.start();
				}else {
					buttonETC.setLabel("语音阅读关");
					readEnglish.finish= 0;
					readEnglish.setNullSap();
					readEnglish.stop();
				}
			}
		});
		DetaButton buttonADD = new DetaButton("添加到编辑页");
		buttonADD.setBounds(868, 0, 115, 30);
		buttonADD.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(sets==null) {
					return;
				}
				if(text.getText().length()>5000) {
					return;
				}
				StringBuilder page = new StringBuilder();
				List<String> setsForGet = sets.subList(currentPage * 2000, (currentPage + 1)*2000<sets.size()? (currentPage + 1)*2000 : sets.size());
				Iterator<String> iterator = setsForGet.iterator();
				while(iterator.hasNext()) {
					String setOfi = iterator.next();
					page.append(setOfi); 
				}
				if(!text.getText().isEmpty()) {
					text.setText(text.getText() +"\r\n\r\n"+ page.toString());
				}else {
					text.setText(page.toString());
				}
				text.validate();
			}
		});
		Box buttonBox = new Box(BoxLayout.X_AXIS);  
		buttonBox.add(buttonPrev);
		buttonBox.add(buttonNext);
		buttonBox.add(buttonSum);
		buttonBox.add(buttonCrt);
		buttonBox.add(buttonCTE);
		buttonBox.add(buttonFRS);
		buttonBox.add(buttonETC);
		buttonBox.add(buttonADD);
		buttonBox.setBounds(5 + 800-650, 290 + 100 - 80 + 200-260, 950, 20);
		this.add(buttonBox);
		return data;
	}

	public JTextPane statistic() throws IOException {
		statistic = new JTextPane();  
		statistic.setBounds(850, 150, 1440-840, 800);
		return statistic;  
	}

	public JTextField name() throws IOException {
		name = new JTextField();  
		name.setBounds(180, 50, 380, 80);
		name.addKeyListener(this);
		return name;
	}	

	@SuppressWarnings({"serial"})
	public javax.swing.JTable jTable() throws IOException {  
		Dictionary d = new Dictionary();
		dic_list = d.txtToListName();
		dic_map = d.listNameToMap(dic_list);//.listNameToMap(dic_list);
		tableData_old = new Object[dic_map.size()][4];
		Iterator<String> iter = dic_map.keySet().iterator();
		copy = new ArrayList<String>();
		while (iter.hasNext())
			copy.add(iter.next());
		for(int i=0; i<copy.size(); i++) {
			tableData_old[i] = new Object[]{""+(i+1),""+0,copy.get(i).trim(),
					dic_map.get(copy.get(i)).toString().replaceAll("\\s+", " ")};
		}	
		table = new javax.swing.JTable();  
		newTableModel = new DefaultTableModel(tableData_old,columnTitle){  
			@Override  
			public boolean isCellEditable(int row,int column){  
				return false;  
			}  
		};  
		TableSorterZYNK sorter= new TableSorterZYNK(newTableModel); //ADDE
		sorter.setTableHeader(table.getTableHeader());
		table.setModel(sorter); 
		table.setRowHeight(35);                                        //设置高度
		JTableHeader header=table.getTableHeader();
		header.setFont(new Font("楷体", Font.PLAIN, 18));// 设置表格字体
		table.getColumnModel().getColumn(0).setPreferredWidth(80+30);
		table.getColumnModel().getColumn(1).setPreferredWidth(80+30);
		table.getColumnModel().getColumn(2).setPreferredWidth(80+130);
		table.getColumnModel().getColumn(3).setPreferredWidth(80+930);
		table.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		table.addMouseListener(this);
		colorTableRender tcr = new colorTableRender();  
		table.setDefaultRenderer(Object.class, tcr);	
		return table;
	}

	@Override
	public void mouseClicked(MouseEvent arg0) {
		if(key == null) {
			key = "";
		}
		sets = null;
		Map<String, WordFrequency> map = new ConcurrentHashMap<>();
		try {
			int row = table.getSelectedRow();
			int col = table.getSelectedColumn();
			String value = (String) table.getValueAt(row, col);
			data.setSize(500, 800);
			sets = _A.parserMixedString(value);//词性分析		
			data.setContentType("text/html");
			StringBuilder page = new StringBuilder().append("");
			currentPage = 0;
			List<String> setsForGet = sets.subList(currentPage*2000, (currentPage + 1)*2000<sets.size()? (currentPage + 1)*2000 : sets.size());
			Iterator<String> iterator = setsForGet.iterator();
			Here:
				while(iterator.hasNext()) {
					String setOfi = iterator.next();
					String pecsi = "";
					String pfullecsi = posFullec.get(setOfi);
					if(pfullecsi == null) {
						page.append("<span style=\"background:#F1F1F1\"><font color=\"black\" size=\"5\">" + setOfi + "</font></span>");
						continue Here;
					}
					if(pos.containsKey(pfullecsi)) {
						pecsi = pos.get(pfullecsi);
					}
					if(pecsi.contains("名")||pecsi.contains("动")||pecsi.contains("形")) {
						if (map.containsKey(setOfi)) {
							WordFrequency wordFrequency = map.get(setOfi);
							wordFrequency.setFrequency(wordFrequency.getFrequency() + StableData.INT_ONE);
							map.put(setOfi, wordFrequency);
						} else {
							WordFrequency wordFrequency = new WordFrequency();
							wordFrequency.setFrequency(StableData.INT_ONE);
							wordFrequency.setWord(setOfi);
							map.put(setOfi, wordFrequency);
						}
					}
					if (!setOfi.equals("")) {
						if(key.contains(setOfi)&&(setOfi.length()>2)&&(pecsi.contains("名")||pecsi.contains("动")||pecsi.contains("形"))) {
							page.append("<span style=\"background:red\"><font color=\"white\">" + setOfi + "</font></span>");
							continue Here;
						}
						if(pecsi.contains("名")) {
							page.append("<span style=\"background:"+new PEU.P.image.ColorProcessor().Processor(255, 245, 255)+"\"><font color=\"black\" size=\"5\">"+setOfi+"</font></span>");
							continue Here;
						}
						if(pecsi.contains("动")) {
							page.append("<span style=\"background:"+new PEU.P.image.ColorProcessor().Processor(245, 255, 245)+"\"><font color=\"black\" size=\"5\">"+setOfi+"</font></span>");
							continue Here;
						}
						if(pecsi.contains("形")) {
							page.append("<span style=\"background:"+new PEU.P.image.ColorProcessor().Processor(255, 255, 245)+"\"><font color=\"black\" size=\"5\">"+setOfi+"</font></span>");
							continue Here;
						}
						if(pecsi.contains("副")) {
							page.append("<span style=\"background:#F1FFFF\"><font color=\"black\" size=\"5\">"+setOfi+"</font></span>");
							continue Here;
						} 
						page.append("<span style=\"background:white\"><font color=\"black\" size=\"5\">"+setOfi+"</font></span>");			 
					}
				}
			buttonSum.setText("共有 " + (sets == null ? 0 : (1 + sets.size() / 2001)) + " 页");
			buttonCrt.setText("当前页面：" + (sets == null? 0 : 1));
			data.setText(page.toString());
			data.setSelectionStart(0);
			data.setSelectionEnd(0);
			data.validate();
		}catch(Exception e){	
			data.validate();
		}   
		try {
			statistic.setSize(500, 800);
			Map<Integer, WordFrequency> fwa = _A.sortWordFrequencyMapToSortMap(map);
			statistic.setContentType("text/html");
			StringBuilder page = new StringBuilder();
			Here:
				for (int i = fwa.size()-1; i >= 0; i--) {
					if (fwa.get(i) != null) {
						String pecsi="";
						String pfullecsi = posFullec.get(fwa.get(i).getWord().toLowerCase());
						if(pfullecsi == null) {
							page.append("<div style=\"background:black\"><font color=\"white\">" + fwa.get(i).getWord()+""+fwa.get(i).getFrequency() + "</font></div>");
							continue Here;
						}
						if(pos.containsKey(pfullecsi)) {
							pecsi=pos.get(pfullecsi);
						}
						if(pecsi.contains("名")) {
							page.append( "<div style=\"background:#FF44FF\"><font color=\"white\">" + fwa.get(i).getWord()+""+fwa.get(i).getFrequency() +"</font></div>");
							continue Here;
						}
						if(pecsi.contains("动")) {
							page.append("<div style=\"background:#8CEA00\"><font color=\"black\" size=\"5\">" + fwa.get(i).getWord()+""+fwa.get(i).getFrequency() +"</font></div>");
							continue Here;
						}
						if(pecsi.contains("形")) {
							page.append("<div style=\"background:#FF9224\"><font color=\"black\" size=\"5\">" + fwa.get(i).getWord()+""+fwa.get(i).getFrequency() +"</font></div>");
						}
					}
				}	
			statistic.setText(page.toString());
			statistic.setSelectionStart(0);
			statistic.setSelectionEnd(0);
			statistic.validate();
		}catch(Exception e){	
			statistic.validate();
		}          
	}

	@Override
	public void mouseEntered(MouseEvent arg0) {
	}

	@Override
	public void mouseExited(MouseEvent arg0) {	
	}

	@Override
	public void mousePressed(MouseEvent arg0) {	
	}

	@Override
	public void mouseReleased(MouseEvent arg0) {
	}

	@Override
	public void keyPressed(KeyEvent arg0) {
	}

	@Override
	public void keyReleased(KeyEvent arg0) {
		String[] score = new String[copy.size()];
		int[] score_code = new int[copy.size()];
		int[] reg = new int[copy.size()];
		int count = 0;
		Iterator<String> iteratorForCopy = copy.iterator();	
		int copyCount = 0;
		this.key = "";
		Iterator<Verbal> iteratorWordFrequency = verbals.iterator();
		while(iteratorWordFrequency.hasNext()) {  
			Verbal iteratorWordFrequencyVerbal=iteratorWordFrequency.next();
			String mapSearchaAtII = iteratorWordFrequencyVerbal.getEnglish()==null?" ":iteratorWordFrequencyVerbal.getEnglish().replaceAll("\\s+", " ");
			this.key += mapSearchaAtII;
		}
		List<String> list= _A.parserMixedString(key);
		String[] string= List_ESU.listToArray(list);
		
		String[] stringReg= new String[key.length()/3];
		for(int i= 0; i< stringReg.length; i++) {
			stringReg[i]= key.substring(i*3, (i*3+ 3)<key.length()?(i*3+ 3):key.length()-1);
		}
		while(iteratorForCopy.hasNext()) {
			String iteratorForCopyString = iteratorForCopy.next();
			score[copyCount] = iteratorForCopyString;
			//得到数据
			String temps = dic_map.get(iteratorForCopyString).toString();
			iteratorWordFrequency = verbals.iterator();
			//遍历搜索字
			Here:
				while(iteratorWordFrequency.hasNext()) {  
					Verbal iteratorWordFrequencyVerbal=iteratorWordFrequency.next();
					String mapSearchaAtII = iteratorWordFrequencyVerbal.getEnglish()==null?" ":iteratorWordFrequencyVerbal.getEnglish().replaceAll("\\s+", " ");
					//如果有数据
					if(temps.contains(mapSearchaAtII) && mapSearchaAtII.length() > 2) {
						if(reg[copyCount] == 0){
							count += 1;
						}
						//加入关键表行
						score[copyCount] = iteratorForCopyString;
						String pecsi = "";
						if(iteratorForCopyString.toLowerCase().contains(mapSearchaAtII)) {
							score_code[copyCount] += 10000;
						}
						//获取中文
						String pfullecsi = posFullec.get(mapSearchaAtII);
						if(pfullecsi == null) {
							reg[copyCount] += 1;
							score_code[copyCount] += 1 ;
							continue Here;
						}
						//识别词性
						if(!pos.containsKey(pfullecsi)) {
							reg[copyCount] += 1;
							score_code[copyCount] += 1 ;
							continue Here;
						}
						pecsi = pos.get(pfullecsi);
						if(pecsi.contains("名")||pecsi.contains("动")||pecsi.contains("形")||pecsi.contains("谓")) {
							reg[copyCount] += 5;
						}
						reg[copyCount] += 1;
						score_code[copyCount] += (iteratorForCopyString.contains(mapSearchaAtII) ? 2 : 1) 
								* (!pecsi.contains("名") ? pecsi.contains("动")? 10 : 1 : 50) ;
					}
				}
			score_code[copyCount] = score_code[copyCount] * reg[copyCount];
			
			//词距
			int code= 100;
			int tempb= 0;
			int tempa= score_code[copyCount];
			if(key.length()> 24) {
				//全词
				for(int i= 0; i< string.length; i++) {
					if(temps.contains(string[i])) {
						tempb+= code;
					}
				}
				//断句
				for(int i= 0; i< stringReg.length; i++) {
					if(temps.contains(stringReg[i])) {
						tempb+= code;
					}
				}
				score_code[copyCount] = (int) (tempa/Math.pow(this.app.lookrot+ 1, 4) + tempb*Math.pow(this.app.lookrot, 2));
			}
			if(key.replace(" ", "").length()> 1&& key.replace(" ", "").length()< 25) {
				if(temps.contains(key)) {
					tempb+= code<< 7;
				}
				score_code[copyCount] = (int) (tempa/Math.pow(this.app.lookrot+ 1, 4) + tempb*Math.pow(this.app.lookrot, 2));
			}
			copyCount++;
		}
		new Quick9DLYGWithString_ESU().sort(score_code, score);
		int new_count= 0;
		newTableModel.getDataVector().clear();
		if(count < 1) {
			for(int i= 0; i< tableData_old.length; i++) {
				newTableModel.insertRow(i, tableData_old[i]);
			}		
			newTableModel.fireTableDataChanged();	
			return;
		}
		int register= 0;
		for(int i= copy.size()- 1; i> -1; i--) {
			if(score_code[i]> 1){
				register++;
			}
		}
		Object[][] tableData= new Object[register][13];
		Here:
			for(int i = copy.size()-1; i > -1; i--) {
				if(score_code[i] <= 1){
					continue Here;
				}
				try {
					tableData[new_count]= new Object[]{new_count+1,score_code[i],score[i],
							dic_map.get(score[i]).toString(),
					};  
				}catch(Exception e) {
					System.out.println(323);
				}
 
				newTableModel.insertRow(new_count, tableData[new_count]);
				new_count+=1;
			}
		newTableModel.fireTableDataChanged();	
	}

	public class colorTableRender extends DefaultTableCellRenderer { 
		private static final long serialVersionUID = 1L;
		public Component getTableCellRendererComponent(JTable table,Object value, boolean isSelected, boolean hasFocus, int row,
				int column) {
			if (isSelected && hasFocus && row == table.getSelectedRow() && column == table.getSelectedColumn()) {
				//2.设置当前Cell的颜色
				Component c = super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);
				c.setBackground(Color.CYAN);//设置背景色
				c.setForeground(Color.gray);//设置前景色
				return c;
			} else {
				//3.设置单数行，偶数行的颜色
				if (row % 3 == 0) {//偶数行时的颜色
					setBackground(new Color(253,233,254));
				}else if (row % 3 == 1) {//设置单数行的颜色
					setBackground(new Color(233,254,234));
				}else if (row % 3 == 2) {//设置单数行的颜色
					setBackground(new Color(255,251,232));
				}
				return super.getTableCellRendererComponent(table, value,
						isSelected, hasFocus, row, column);
			}
		}
	}

	@Override
	public void keyTyped(KeyEvent arg0) {
		// TODO Auto-generated method stub
	}
}