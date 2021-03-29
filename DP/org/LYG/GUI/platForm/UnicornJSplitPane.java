package org.LYG.GUI.platForm;
import java.awt.Rectangle;
import javax.swing.JSplitPane;
import javax.swing.plaf.basic.BasicSplitPaneDivider;
import javax.swing.plaf.basic.BasicSplitPaneUI;
/**  
 *  ���߶�jdk ��Դ�������2���޸ġ����ڸ����������뷶Χ�ڡ�
 * @author LYG refer JDK authors from SUN Tech����
 */
public class UnicornJSplitPane extends JSplitPane {
	private static final long serialVersionUID = 1L;
	private int dividerDragSize = 3;
	private int dividerDragOffset = 3;
	public UnicornJSplitPane() {
		setDividerSize( 0 );
		setContinuousLayout( true );
	}
	@SuppressWarnings("deprecation")
	@Override
	public void layout() {
		super.layout();
		BasicSplitPaneDivider divider = ((BasicSplitPaneUI)getUI()).getDivider();
		Rectangle bounds = divider.getBounds();
		if( orientation == HORIZONTAL_SPLIT ) {
			bounds.x -= dividerDragOffset;
			bounds.width = dividerDragSize;
		} else {
			bounds.y -= dividerDragOffset;
			bounds.height = dividerDragSize;
		}
		divider.setBounds(bounds);
	}
}