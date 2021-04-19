package MVQ.tableRender;

import java.awt.Color;
import java.awt.Component;

import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;

public class ColorTableRender extends DefaultTableCellRenderer { 
		private static final long serialVersionUID = 1L;
		public Component getTableCellRendererComponent(JTable table,Object value
				, boolean isSelected, boolean hasFocus, int row,
				int column) {
			if (isSelected && hasFocus && row == table.getSelectedRow() && column 
					== table.getSelectedColumn()) {
				//2.���õ�ǰCell����ɫ
				Component c = super.getTableCellRendererComponent(table, value, isSelected
						, hasFocus, row, column);
				c.setBackground(Color.CYAN);//���ñ���ɫ
				c.setForeground(Color.gray);//����ǰ��ɫ
				return c;
			} else {
				//3.���õ����У�ż���е���ɫ
				if (row % 3 == 0) {//ż����ʱ����ɫ ������
					setBackground(new Color(253,233,254));
				}else if (row % 3 == 1) {//���õ����е���ɫ
					setBackground(new Color(233,254,234));
				}else if (row % 3 == 2) {//���õ����е���ɫ
					setBackground(new Color(255,251,232));
				}
				return super.getTableCellRendererComponent(table, value,
						isSelected, hasFocus, row, column);
			}
		}
	}