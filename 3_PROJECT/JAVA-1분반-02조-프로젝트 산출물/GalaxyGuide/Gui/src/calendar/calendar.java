package calendar;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Calendar;

import javax.swing.JFrame;

import _xml.xml; 

public class calendar extends JFrame {
 
	private String Current_date = "";
	
    private static final long serialVersionUID = 1L;
    private Panel SearchPanel = null;
    private Panel CaledarPanel = null;
    private Label labelMonth = null;
    private Label labelYear = null;
    private Label[] dayOfWeekLabel = null;
    private TextField textFieldYear = null;
    private TextField textFieldMonth = null;
    private Button searchButton = null;
    private Button[] dayButton = null;
    private int date;
    private int space;
    private int lastday;
    private String[] dayOfWeek = { "��", "��", "ȭ", "��", "��", "��", "��" };
    
    private int  GetYear = 0;
    private int GetMonth = 0;
    
    Font myFont = null;
 
    private Panel getSearchPanel() {
        if (SearchPanel == null) {
            // Year, Month Label
            myFont = new Font("Serif", Font.BOLD, 12);
            labelYear = new Label("��");
            labelYear.setFont(myFont);
            labelMonth = new Label("��");
            labelMonth.setFont(myFont);
            // Year, Month TextField
            textFieldYear = new TextField(String.valueOf(GetYear));
            textFieldYear.setFont(myFont);
            textFieldMonth = new TextField(String.valueOf(GetMonth));
            textFieldMonth.setFont(myFont);
 
            // Search Button
            searchButton = new Button("�˻�");
            searchButton.setFont(myFont);
            // Button event
            searchButton.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    getCalendarData(Integer.parseInt(textFieldYear.getText()),
                            Integer.parseInt(textFieldMonth.getText()));
                    setCalendarButton();
                    
                }
            });
 
            // Search Panel
            SearchPanel = new Panel();
            SearchPanel.setLayout(new FlowLayout());
            SearchPanel.add(textFieldYear, null);
            SearchPanel.add(labelYear, null);
            SearchPanel.add(textFieldMonth, null);
            SearchPanel.add(labelMonth, null);
            SearchPanel.add(searchButton, null);
        }
        return SearchPanel;
    }
 
    private void getCalendarData(Integer year, Integer month) {
        Calendar cal = Calendar.getInstance();
        cal.set(year, month - 1, 1); // ���� ��ü�� ��, ��, �� ���� ����
        date = cal.get(Calendar.DAY_OF_WEEK); // �ش� ���� 1���� ����(�Ͽ����� 1, ������� 7)
        space = date - 1; // �޷� ù ���� ���� ��ư�� ����
        lastday = cal.getActualMaximum(Calendar.DAY_OF_MONTH); // �ش� ���� ������ ��¥
    }
 
    private Panel getCalendarPanel() {
        if (CaledarPanel == null) {
            // Calendar Panel
            CaledarPanel = new Panel();
            CaledarPanel.setLayout(new GridLayout(7, 7));
 
            // Day of week Label
            dayOfWeekLabel = new Label[7];
            for (Integer i = 0; i < 7; i++) {
                dayOfWeekLabel[i] = new Label(dayOfWeek[i]);
                myFont = new Font("Serif", Font.BOLD, 14);
                dayOfWeekLabel[i].setFont(myFont);
                dayOfWeekLabel[i].setBackground(Color.GRAY);
                dayOfWeekLabel[i].setForeground(Color.WHITE);
                dayOfWeekLabel[i].setAlignment(Label.CENTER);
                CaledarPanel.add(dayOfWeekLabel[i]);
            }
 
            // Day Button
            dayButton = new Button[42];
            for (Integer i = 0; i < 42; i++) {
                dayButton[i] = new Button();
                // Button event
                dayButton[i].addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        if(e.getActionCommand() != ""){ // ������ ��ư�� ��¥�� ���� ��
                        	Current_date = e.getActionCommand();
                        	//�˾��� ���.
                        	EventQueue.invokeLater(new Runnable() {
                    			public void run() {
                    				try {
                    					calen_PopUp frame = new calen_PopUp(Integer.toString(GetYear), Integer.toString(GetMonth),Current_date);
                    					frame.setVisible(true);
                    				} catch (Exception e) {
                    					e.printStackTrace();
                    				}
                    			}
                    		});
                        }
                    }
                });
                CaledarPanel.add(dayButton[i]);
            }
             setCalendarButton();
        }
        return CaledarPanel;    }
 
    private void setCalendarButton() {
        // ��ư �ؽ�Ʈ �ʱ�ȭ
        for (Integer i = 0; i < 42; i++) {
            dayButton[i].setLabel("");
        }
 
        // ��ư �ؽ�Ʈ�� ��¥ ����
        for (Integer i = 1; i < lastday + 1; i++) {
            dayButton[i + space - 1].setLabel(i.toString());
        }
    }
    
    public calendar(int year, int month) { // constructor
        super();
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        //â�� ������ ��� â�� ������ �ʵ��� ����.
        initialize(year, month);
    }
 
    private void initialize(int year, int month) {
        this.setSize(400, 300);
        this.setTitle("Calendar");
 
        GetYear = year;
        GetMonth = month;
        
        getCalendarData(year, month);
 
        // add
        this.add(getSearchPanel(), BorderLayout.NORTH);
        this.add(getCalendarPanel(), BorderLayout.CENTER);
 
        // ���� �̺�Ʈ
     this.addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent e) {
                 }
        });
    }
}