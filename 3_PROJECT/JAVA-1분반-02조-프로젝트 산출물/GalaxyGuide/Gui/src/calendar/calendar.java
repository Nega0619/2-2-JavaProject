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
    private String[] dayOfWeek = { "일", "월", "화", "수", "목", "금", "토" };
    
    private int  GetYear = 0;
    private int GetMonth = 0;
    
    Font myFont = null;
 
    private Panel getSearchPanel() {
        if (SearchPanel == null) {
            // Year, Month Label
            myFont = new Font("Serif", Font.BOLD, 12);
            labelYear = new Label("년");
            labelYear.setFont(myFont);
            labelMonth = new Label("월");
            labelMonth.setFont(myFont);
            // Year, Month TextField
            textFieldYear = new TextField(String.valueOf(GetYear));
            textFieldYear.setFont(myFont);
            textFieldMonth = new TextField(String.valueOf(GetMonth));
            textFieldMonth.setFont(myFont);
 
            // Search Button
            searchButton = new Button("검색");
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
        cal.set(year, month - 1, 1); // 현재 객체의 년, 월, 일 값을 설정
        date = cal.get(Calendar.DAY_OF_WEEK); // 해당 달의 1일의 요일(일요일은 1, 토요일은 7)
        space = date - 1; // 달력 첫 주의 여백 버튼의 갯수
        lastday = cal.getActualMaximum(Calendar.DAY_OF_MONTH); // 해당 달의 마지막 날짜
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
                        if(e.getActionCommand() != ""){ // 누르는 버튼에 날짜가 있을 때
                        	Current_date = e.getActionCommand();
                        	//팝업을 띄움.
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
        // 버튼 텍스트 초기화
        for (Integer i = 0; i < 42; i++) {
            dayButton[i].setLabel("");
        }
 
        // 버튼 텍스트에 날짜 설정
        for (Integer i = 1; i < lastday + 1; i++) {
            dayButton[i + space - 1].setLabel(i.toString());
        }
    }
    
    public calendar(int year, int month) { // constructor
        super();
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        //창이 꺼질때 모든 창이 꺼지지 않도록 설정.
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
 
        // 종료 이벤트
     this.addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent e) {
                 }
        });
    }
}