package PEU.P.table;

import java.awt.*;



import java.awt.event.*;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.*;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

import javax.swing.*;
import javax.swing.event.TableModelEvent;
import javax.swing.event.TableModelListener;
import javax.swing.table.*;
import ME.S.stables.PathLinkFile;
//import OEU.LYG4DQS4D.LYG10DWithChineseMixStringSort12D;
import OEU.LYG4DQS4D.LYG10DWithChineseMixStringSort13D;
import PEU.S.verbal.VerbalSource;



/**
 * TableSorter is a decorator for TableModels; adding sorting
 * functionality to a supplied TableModel. TableSorter does
 * not store or copy the data in its TableModel; instead it maintains
 * a map from the row indexes of the view to the row indexes of the
 * model. As requests are made of the sorter (like getValueAt(row, col))
 * they are passed to the underlying model after the row numbers
 * have been translated via the internal mapping array. This way,
 * the TableSorter appears to hold another copy of the table
 * with the rows in a different order.
 * <p/>
 * TableSorter registers itself as a listener to the underlying model,
 * just as the JTable itself would. Events recieved from the model
 * are examined, sometimes manipulated (typically widened), and then
 * passed on to the TableSorter's listeners (typically the JTable).
 * If a change to the model has invalidated the order of TableSorter's
 * rows, a note of this is made and the sorter will resort the
 * rows the next time a value is requested.
 * <p/>
 * When the tableHeader property is set, either by using the
 * setTableHeader() method or the two argument constructor, the
 * table header may be used as a complete UI for TableSorter.
 * The default renderer of the tableHeader is decorated with a renderer
 * that indicates the sorting status of each column. In addition,
 * a mouse listener is installed with the following behavior:
 * <ul>
 * <li>
 * Mouse-click: Clears the sorting status of all other columns
 * and advances the sorting status of that column through three
 * values: {NOT_SORTED, ASCENDING, DESCENDING} (then back to
 * NOT_SORTED again).
 * <li>
 * SHIFT-mouse-click: Clears the sorting status of all other columns
 * and cycles the sorting status of the column through the same
 * three values, in the opposite order: {NOT_SORTED, DESCENDING, ASCENDING}.
 * <li>
 * CONTROL-mouse-click and CONTROL-SHIFT-mouse-click: as above except
 * that the changes to the column do not cancel the statuses of columns
 * that are already sorting - giving a way to initiate a compound
 * sort.
 * </ul>
 * <p/>
 * This is a long overdue rewrite of a class of the same name that
 * first appeared in the swing table demos in 1997.
 * 
 * @author Philip Milne
 * @author Brendon McLean 
 * @author Dan van Enckevort
 * @author Parwinder Sekhon
 * @author Yaoguang Luo
 * @fix    Yaoguang Luo
 * @version 2.0 02/27/04
 */

public class TableSorterZYNK extends AbstractTableModel {
	private static final long serialVersionUID = 1L;
	protected TableModel tableModel;
    public static final int DESCENDING = -1;
    public static final int NOT_SORTED = 0;
    public static final int ASCENDING = 1;
    private static Directive EMPTY_DIRECTIVE = new Directive(-1, NOT_SORTED);
    @SuppressWarnings("rawtypes")
	public static final Comparator COMPARABLE_COMAPRATOR = new Comparator() {
        @SuppressWarnings("unchecked")
		public int compare(Object o1, Object o2) {
            return ((Comparable) o1).compareTo(o2);
        }
    };
    @SuppressWarnings("rawtypes")
	public static final Comparator LEXICAL_COMPARATOR = new Comparator() {
        public int compare(Object o1, Object o2) {
            return o1.toString().compareTo(o2.toString());
        }
    };
    private Row[] viewToModel;
    private int[] modelToView;
    private JTableHeader tableHeader;
    private MouseListener mouseListener;
    private TableModelListener tableModelListener;
    @SuppressWarnings("rawtypes")
	private Map columnComparators = new ConcurrentHashMap();
    @SuppressWarnings("rawtypes")
	private List sortingColumns = new ArrayList();
    private Map<String, String> pinYin= null;
    private Map<String, Integer> biHua= null;
	private String tableName= "default";
	//public static LYG9DWithChineseMixStringSort9D lYG9DWithChineseMixStringSort9D;
	
	public void addTableName(String thisTableName) {
		tableName= thisTableName;
	}
	
    public TableSorterZYNK() {
    	try {
    		
    		InputStream inputStreamp= new VerbalSource().getClass().getResourceAsStream(PathLinkFile.PinYinCN_lyg);
    		BufferedReader cReaderp= new BufferedReader(new InputStreamReader(inputStreamp, "GBK"));
    		//index
    		String cInputStringp;
    		Map<String, String> map= new HashMap<>();
    		biHua= new HashMap<>();
    		while ((cInputStringp= cReaderp.readLine())!= null) {
    			String[] words= cInputStringp.split("->");
    			if(words.length>1) {
    				map.put(words[0], words[1]);
    			}
    		}
    		cReaderp.close();
    		InputStream inputStreamb= new VerbalSource().getClass().getResourceAsStream(PathLinkFile.BiHuaCN_lyg);
    		BufferedReader cReaderb= new BufferedReader(new InputStreamReader(inputStreamb, "GBK"));
    		//index
    		String cInputStringb;
    		while ((cInputStringb= cReaderb.readLine())!= null) {
    			String[] words= cInputStringb.split("->");
    			if(words.length>1) {
    				this.biHua.put(words[0], Integer.valueOf(words[1]));
    			}
    		}
    		this.pinYin= map;
    		cReaderb.close();
    	}catch(Exception e) {
    		
    	}
        this.mouseListener = new MouseHandler();
        this.tableModelListener = new TableModelHandler();
        this.mouseListener = new MouseHandler();
        this.tableModelListener = new TableModelHandler();
    }

    public TableSorterZYNK(TableModel tableModel) {
        this();
        setTableModel(tableModel);
    }

    public TableSorterZYNK(TableModel tableModel, JTableHeader tableHeader) {
        this();
        setTableHeader(tableHeader);
        setTableModel(tableModel);
    }

    private void clearSortingState() {
        viewToModel = null;
        modelToView = null;
    }

    public TableModel getTableModel() {
        return tableModel;
    }

    public void setTableModel(TableModel tableModel) {
        if (this.tableModel != null) {
            this.tableModel.removeTableModelListener(tableModelListener);
        }

        this.tableModel = tableModel;
        if (this.tableModel != null) {
            this.tableModel.addTableModelListener(tableModelListener);
        }

        clearSortingState();
        fireTableStructureChanged();
    }

    public JTableHeader getTableHeader() {
        return tableHeader;
    }

    public void setTableHeader(JTableHeader tableHeader) {
        if (this.tableHeader != null) {
            this.tableHeader.removeMouseListener(mouseListener);
            TableCellRenderer defaultRenderer = this.tableHeader.getDefaultRenderer();
            if (defaultRenderer instanceof SortableHeaderRenderer) {
                this.tableHeader.setDefaultRenderer(((SortableHeaderRenderer) defaultRenderer).tableCellRenderer);
            }
        }
        this.tableHeader = tableHeader;
        if (this.tableHeader != null) {
            this.tableHeader.addMouseListener(mouseListener);
            this.tableHeader.setDefaultRenderer(
                    new SortableHeaderRenderer(this.tableHeader.getDefaultRenderer()));
        }
    }

    public boolean isSorting() {
        return sortingColumns.size() != 0;
    }

    private Directive getDirective(int column) {
        for (int i = 0; i < sortingColumns.size(); i++) {
            Directive directive = (Directive)sortingColumns.get(i);
            if (directive.column == column) {
                return directive;
            }
        }
        return EMPTY_DIRECTIVE;
    }

    public int getSortingStatus(int column) {
        return getDirective(column).direction;
    }

    private void sortingStatusChanged() {
        clearSortingState();
        fireTableDataChanged();
        if (tableHeader != null) {
            tableHeader.repaint();
        }
    }

    @SuppressWarnings("unchecked")
	public void setSortingStatus(int column, int status) {
        Directive directive = getDirective(column);
        if (directive != EMPTY_DIRECTIVE) {
            sortingColumns.remove(directive);
        }
        if (status != NOT_SORTED) {
            sortingColumns.add(new Directive(column, status));
        }
        sortingStatusChanged();
    }

    protected Icon getHeaderRendererIcon(int column, int size) {
        Directive directive = getDirective(column);
        if (directive == EMPTY_DIRECTIVE) {
            return null;
        }
        return new Arrow(directive.direction == DESCENDING, size, sortingColumns.indexOf(directive));
    }

    private void cancelSorting() {
        sortingColumns.clear();
        sortingStatusChanged();
    }

    @SuppressWarnings("unchecked")
	public void setColumnComparator(@SuppressWarnings("rawtypes") Class type,
			@SuppressWarnings("rawtypes") Comparator comparator) {
        if (comparator == null) {
            columnComparators.remove(type);
        } else {
            columnComparators.put(type, comparator);
        }
    }

    @SuppressWarnings("rawtypes")
	protected Comparator getComparator(int column) {
        Class columnType = tableModel.getColumnClass(column);
        Comparator comparator = (Comparator) columnComparators.get(columnType);
        if (comparator != null) {
            return comparator;
        }
        if (Comparable.class.isAssignableFrom(columnType)) {
            return COMPARABLE_COMAPRATOR;
        }
        return LEXICAL_COMPARATOR;
    }

    private Row[] getViewToModel() {
        if (viewToModel == null) {
            int tableModelRowCount = tableModel.getRowCount();
            viewToModel = new Row[tableModelRowCount];
            for (int row = 0; row < tableModelRowCount; row++) {
                viewToModel[row] = new Row(row);
            }

            if (isSorting()) {
                Arrays.sort(viewToModel);
            }
        }
        return viewToModel;
    }

    public int modelIndex(int viewIndex) {
        return getViewToModel()[viewIndex].modelIndex;
    }

    private int[] getModelToView() {
        if (modelToView == null) {
            int n = getViewToModel().length;
            modelToView = new int[n];
            for (int i = 0; i < n; i++) {
                modelToView[modelIndex(i)] = i;
            }
        }
        return modelToView;
    }

    // TableModel interface methods 

    public int getRowCount() {
        return (tableModel == null) ? 0 : tableModel.getRowCount();
    }

    public int getColumnCount() {
        return (tableModel == null) ? 0 : tableModel.getColumnCount();
    }

    public String getColumnName(int column) {
        return tableModel.getColumnName(column);
    }

    @SuppressWarnings({ "unchecked", "rawtypes" })
	public Class getColumnClass(int column) {
        return tableModel.getColumnClass(column);
    }

    public boolean isCellEditable(int row, int column) {
        return tableModel.isCellEditable(modelIndex(row), column);
    }

    public Object getValueAt(int row, int column) {	
    	try {
    		return tableModel.getValueAt(modelIndex(row), column);
    	}catch(Exception e) {
    		return "";
    	}
    }

    public void setValueAt(Object aValue, int row, int column) {
        tableModel.setValueAt(aValue, modelIndex(row), column);
    }

    // Helper classes
    
    @SuppressWarnings("rawtypes")
    private class Row implements Comparable {
    	private int modelIndex;

    	public Row(int index) {
    		this.modelIndex = index;
    	}

    	@SuppressWarnings("unchecked")
    	public int compareTo(Object o) {
    		int row1= modelIndex;
    		int row2= ((Row) o).modelIndex;

    		for (Iterator it= sortingColumns.iterator(); it.hasNext();) {
    			Directive directive= (Directive) it.next();
    			int column= directive.column;
    			Object o1= tableModel.getValueAt(row1, column);
    			Object o2= tableModel.getValueAt(row2, column);

    			int comparison = 0;
    			// Define null less than everything, except null.
    			if (o1 == null && o2 == null) {
    				comparison = 0;
    				return directive.direction == DESCENDING ? -comparison : comparison;
    			}else if (o1 == null) {
    				comparison = -1;
    				return directive.direction == DESCENDING ? -comparison : comparison;
    			} else if (o2 == null) {
    				comparison = 1;
    				return directive.direction == DESCENDING ? -comparison : comparison;
    			}else {
    				if(0== column) {
    					if(tableName.contains("zybc")) {
    						int returnInt= new LYG10DWithChineseMixStringSort13D()
    								.quick4DChineseStringArrayWithSmallInTwoChar3bihuaReturns(new String[] 
    										{o1.toString().substring(0, o1.toString().length()> 30? 30: o1.toString().length())
    												, o2.toString().substring(0, o2.toString().length()> 30? 30: o2.toString().length())}
    								, 0, 1, 30, pinYin, biHua, 7, 70);
    						if(returnInt== 1) {
    							comparison= 1;
    							return directive.direction == DESCENDING ? -comparison : comparison;
    						}
    						if(returnInt== -1) {
    							comparison= -1;
    							return directive.direction == DESCENDING ? -comparison : comparison;
    						}
    						if(returnInt!= 1&& returnInt!= -1) {
    							comparison= 0;
    							return directive.direction == DESCENDING ? -comparison : comparison;
    						}
    					}else {
    						if(Double.valueOf(o1.toString())== Double.valueOf(o2.toString())) {
    							comparison= 0;
    						}else if(Double.valueOf(o1.toString())> Double.valueOf(o2.toString())) {
    							comparison= -1;
    							return directive.direction == DESCENDING ? -comparison : comparison;
    						}else if(Double.valueOf(o1.toString())< Double.valueOf(o2.toString())) {
    							comparison= 1;
    							return directive.direction == DESCENDING ? -comparison : comparison;
    						}
    					}
    				}if(1== column) {
    					if(Double.valueOf(o1.toString())== Double.valueOf(o2.toString())) {
    						comparison= 0;
    					}else if(Double.valueOf(o1.toString())> Double.valueOf(o2.toString())) {
    						comparison= -1;
    						return directive.direction == DESCENDING ? -comparison : comparison;
    					}else if(Double.valueOf(o1.toString())< Double.valueOf(o2.toString())) {
    						comparison= 1;
    						return directive.direction == DESCENDING ? -comparison : comparison;
    					}
    				}
    				else 
    					if(2321315!= column){
    						int returnInt= new LYG10DWithChineseMixStringSort13D()
    								.quick4DChineseStringArrayWithSmallInTwoChar3bihuaReturns(new String[] 
    										{o1.toString().substring(0, o1.toString().length()> 30? 30: o1.toString().length())
    												, o2.toString().substring(0, o2.toString().length()> 30? 30: o2.toString().length())}
    								, 0, 1, 30, pinYin, biHua, 7, 70);
    						if(returnInt== 1) {
    							comparison= 1;
    							return directive.direction == DESCENDING ? -comparison : comparison;
    						}
    						if(returnInt== -1) {
    							comparison= -1;
    							return directive.direction == DESCENDING ? -comparison : comparison;
    						}
    						if(returnInt!= 1&& returnInt!= -1) {
    							comparison= 0;
    							return directive.direction == DESCENDING ? -comparison : comparison;
    						}
    					}
    					else {
    						comparison = getComparator(column).compare(o1, o2);
    						return directive.direction == DESCENDING ? -comparison : comparison;
    					}
    			}
    			if (comparison != 0) {
    				return directive.direction == DESCENDING ? -comparison : comparison;
    			}

    		}//for loop
    		return 0;
    	}
    }

    private class TableModelHandler implements TableModelListener {
    	public void tableChanged(TableModelEvent e) {             
    		if (!isSorting()) {
    			clearSortingState();
    			fireTableChanged(e);
    			return;
    		}

    		if (e.getFirstRow() == TableModelEvent.HEADER_ROW) {
    			cancelSorting();
    			fireTableChanged(e);
    			return;
    		}

    		int column= e.getColumn();
    		if (e.getFirstRow()== e.getLastRow()
    				&& column!= TableModelEvent.ALL_COLUMNS
    				&& getSortingStatus(column) == NOT_SORTED
    				&& modelToView!= null) {
    			int viewIndex= getModelToView()[e.getFirstRow()];
    			fireTableChanged(new TableModelEvent(TableSorterZYNK.this, 
    					viewIndex, viewIndex, 
    					column, e.getType()));
    			return;
    		}

    		clearSortingState();
    		fireTableDataChanged();
    		return;
    	}
    }

    private class MouseHandler extends MouseAdapter {
    	public void mouseClicked(MouseEvent e) {
    		JTableHeader h = (JTableHeader) e.getSource();
    		TableColumnModel columnModel = h.getColumnModel();
    		int viewColumn = columnModel.getColumnIndexAtX(e.getX());
    		int column = columnModel.getColumn(viewColumn).getModelIndex();
    		if (column != -1) {
    			int status = getSortingStatus(column);
    			if (!e.isControlDown()) {
    				cancelSorting();
    			}
    			status = status + (e.isShiftDown() ? -1 : 1);
    			status = (status + 4) % 3 - 1; 
    			setSortingStatus(column, status);
    		}
    	}
    }

    private static class Arrow implements Icon {
        private boolean descending;
        private int size;
        private int priority;

        public Arrow(boolean descending, int size, int priority) {
            this.descending = descending;
            this.size = size;
            this.priority = priority;
        }

        public void paintIcon(Component c, Graphics g, int x, int y) {
            Color color = c == null ? Color.gray : c.getBackground();             
            int dx = (int)(size/2*Math.pow(0.8, priority));
            int dy = descending ? dx : -dx;
            y = y + 5*size/6 + (descending ? -dy : 0);
            int shift = descending ? 1 : -1;
            g.translate(x, y);
            g.setColor( Color.BLUE);           
            g.drawLine(dx / 2, dy, 0, 0);
            g.drawLine(dx / 2, dy + shift, 0, shift); 
            g.setColor( Color.RED);        
            g.drawLine(dx / 2, dy, dx, 0);
            g.drawLine(dx / 2, dy + shift, dx, shift);        
            if (descending) {
                g.setColor(color.darker().darker());
            } else {
                g.setColor(color.brighter().brighter());
            }
            g.drawLine(dx, 0, 0, 0);

            g.setColor(color);
            g.translate(-x, -y);
        }

        public int getIconWidth() {
            return size;
        }

        public int getIconHeight() {
            return size;
        }
    }

    private class SortableHeaderRenderer implements TableCellRenderer {
        private TableCellRenderer tableCellRenderer;

        public SortableHeaderRenderer(TableCellRenderer tableCellRenderer) {
            this.tableCellRenderer = tableCellRenderer;
        }

        public Component getTableCellRendererComponent(JTable table, 
                                                       Object value,
                                                       boolean isSelected, 
                                                       boolean hasFocus,
                                                       int row, 
                                                       int column) {
            Component c = tableCellRenderer.getTableCellRendererComponent(table, 
                    value, isSelected, hasFocus, row, column);
            if (c instanceof JLabel) {
                JLabel l = (JLabel) c;
                l.setHorizontalTextPosition(JLabel.LEFT);
                int modelColumn = table.convertColumnIndexToModel(column);
                l.setIcon(getHeaderRendererIcon(modelColumn, l.getFont().getSize()));
            }
            return c;
        }
    }

    private static class Directive {
        private int column;
        private int direction;

        public Directive(int column, int direction) {
            this.column = column;
            this.direction = direction;
        }
    }
}


 