package n1;

import java.awt.EventQueue;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.border.EmptyBorder;

import calendar.calendar;
import n3.infc_3;
import n4.infc_4;
import n5.DefaultScreen;
import _xml.xml;
import javax.swing.*;
import javax.swing.GroupLayout.Alignment;
import java.awt.SystemColor;
import java.awt.Font;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;

public class FirstGui extends JFrame {

	private JPanel contentPane;

	public int year ;
	public int month ;
	public int date;
	public String Moon_event = "FUll Moon";
	
	
	
	/**
	 * Launch the application.
	 */
	public void run() {

		this.setVisible(true);
	}

	/**
	 * Create the frame.
	 */
	
	public FirstGui() {
		setResizable(false);   //사이즈 변경 불가로 고정.
		setTitle("천문길잡이"); 

		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //이 gui가 꺼지면 전체 프로그램이 꺼지도록 설정.
	      setBounds(100, 100, 872, 547);
	      contentPane = new JPanel();
	      contentPane.setBackground(SystemColor.control);
	      contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
	      setContentPane(contentPane);
	      
	      
	      JButton btnNewButton = new JButton("별자리 정보");
	      btnNewButton.addMouseListener(new MouseAdapter() {
	      	@Override
	      	public void mousePressed(MouseEvent e) {	//마우스 입력이 있을때 진행되는 이벤트 함수
	      		EventQueue.invokeLater(new Runnable() {
    			public void run() {
    				try {    					
    					//별자리 달 전달
    					infc_3 frame = new infc_3(month);	//인터페이스3과 연결과 동시에 month 값을 넘겨줌.
    					frame.setVisible(true);
    				} catch (Exception e) {
    					e.printStackTrace();   				}
    			}    		});      	}	      });
	      
	      btnNewButton.setBounds(65, 377, 173, 121);
	      
	      JButton button = new JButton("날씨 정보");
	      button.addMouseListener(new MouseAdapter() {
	      	@Override
	      	public void mouseClicked(MouseEvent e) {
	      		
	      		EventQueue.invokeLater(new Runnable() {
	    			public void run() {
	    				try {
	    					infc_4 frame = new infc_4(year,month,date);
	    					frame.setVisible(true);
	    				} catch (Exception e) {
	    					e.printStackTrace();
	    				}
	    			}
	    		});
	      		
	      	}
	      });
	      button.setBounds(345, 377, 173, 121);
	      
	      JButton button_1 = new JButton("천문학 정보");
	      button_1.addMouseListener(new MouseAdapter() {
	      	@Override
	      	public void mouseClicked(MouseEvent e) {
	      		//5번 인터페이스
	      		EventQueue.invokeLater(new Runnable() {
	    			public void run() {
	    				try {
	    					DefaultScreen frame = new DefaultScreen();
	    					frame.setVisible(true);
	    				} catch (Exception e) {
	    					e.printStackTrace();
	    				}
	    			}
	    		});
	      	}
	      });
	      button_1.setBounds(628, 377, 173, 121);

	      JTextPane textArea = new JTextPane();
	      textArea.setText("천문학 정보");
	      contentPane.add(textArea);
	      
	   
	      JTextPane textPane_1 = new JTextPane();
	      textPane_1.addMouseListener(new MouseAdapter() {
	      	@Override
	      	public void mousePressed(MouseEvent e) {	//마우스 입력이 있으면 이벤트가 진행된다.
	      	if(year == 0 || month == 0 || date == 0)	
	      		return;		//날짜를 선택하지 않고 클릭했을 때는 이벤트함수 진행이 되지 않음.
	      		calendar calen = new calendar(year, month);		//calendar 창이 생성된다.
	      		calen.setVisible(true);
	      	}
	      });
	      textPane_1.setContentType("text-align:center/plain");
	      textPane_1.setFont(new Font("Gulim", Font.PLAIN, 12));
	      textPane_1.setBounds(65, 205, 736, 162);
	      textPane_1.setText("현재 날짜를 입력하세요." );		//아무 이벤트가 없을 때 '날짜를 선택하세요'가 입력된 상태이다.
	      
	      
	      contentPane.setLayout(null);
	      contentPane.add(btnNewButton);
	      contentPane.add(button);
	      contentPane.add(button_1);
	      contentPane.add(textPane_1,"Center");
	      
	      JTextArea Get_Year = new JTextArea();			//TextArea 객체 생성
	      Get_Year.addFocusListener(new FocusAdapter() {	//텍스트에 커서가 생기면 진행되는 이벤트
	      	@Override
	      	public void focusGained(FocusEvent e) 
	      	{    		Get_Year.setText("");      	}	      });		//이벤트가 생기면 '입력하세요'메시지를 없앤다.
	      Get_Year.setText("입력하세요.");		//아무런 이벤트를 진행하지 않으면 '입력하세요' 메시지가 떠있는 상태이다.
	      Get_Year.setBounds(187, 22, 173, 41);
	      contentPane.add(Get_Year);
	      
	      JTextArea YEAR = new JTextArea();
	      YEAR.setForeground(SystemColor.desktop);
	      YEAR.setBackground(SystemColor.control);		//TextArea 색을 프레임 색과 맞추기 위해 변경해줌.
	      YEAR.setEnabled(false);		//선택 불가.
	      YEAR.setEditable(false);	//'년' 변경불가
	      YEAR.setText("년");	
	      YEAR.setBounds(372, 22, 76, 41);
	      contentPane.add(YEAR);
	      
	      JTextArea MONTH = new JTextArea();
	      MONTH.setText("\uC6D4");
	      MONTH.setEnabled(false);
	      MONTH.setEditable(false);
	      MONTH.setBackground(SystemColor.menu);
	      MONTH.setBounds(372, 83, 76, 41);
	      contentPane.add(MONTH);
	      
	      JTextArea DATE = new JTextArea();
	      DATE.setText("\uC77C");
	      DATE.setEnabled(false);
	      DATE.setEditable(false);
	      DATE.setBackground(SystemColor.menu);
	      DATE.setBounds(372, 154, 76, 41);
	      contentPane.add(DATE);
	      
	      JTextArea Get_Month = new JTextArea();
	      Get_Month.addFocusListener(new FocusAdapter() {
	      	@Override
	      	public void focusGained(FocusEvent e) {	      		
	      		Get_Month.setText("");
	      	}
	      });
	      Get_Month.setText("\uC785\uB825\uD558\uC138\uC694.");
	      Get_Month.setBounds(187, 83, 173, 41);
	      contentPane.add(Get_Month);
	      
	      JTextArea Get_Date = new JTextArea();
	      Get_Date.addFocusListener(new FocusAdapter() {
	      	@Override
	      	public void focusGained(FocusEvent arg0) {	      		Get_Date.setText("");

	      	}
	      });
	      Get_Date.setText("\uC785\uB825\uD558\uC138\uC694.");
	      Get_Date.setBounds(187, 154, 173, 41);
	      contentPane.add(Get_Date);
	      
	      JButton btnNewButton_1 = new JButton("날짜 설정하기");	//버튼 객체 생성
	      btnNewButton_1.addMouseListener(new MouseAdapter() {
	      	@Override
	      	public void mousePressed(MouseEvent e) 	//마우스 클릭했을때 진행되는 이벤트
	      	{
	      		xml Data = new xml(Get_Year.getText(),Get_Month.getText(),Get_Date.getText());
	      		year = 	Integer.parseInt(Get_Year.getText());
		      	month = 	Integer.parseInt(Get_Month.getText());
		      	date = 	Integer.parseInt(Get_Date.getText());
		      	
		      	if(month>13 || month < 1 || date <1||date>31 )
			      	{  		
			      		JOptionPane.showMessageDialog(null, "날짜를 제대로 입력하세요.", "천문길잡이", JOptionPane.INFORMATION_MESSAGE);
			      		return;
			      	}
		      	
			    textPane_1.setText("월별 달력으로 천문 이벤트를 보고 싶다면 클릭하세요.\n\n"
			      		+ year+"년 " + month + "월 " +date +"일의 천문 이벤트 입니다.\n\n"
			      		+Data.getResult() );   
	      	}	      });
	     
	      btnNewButton_1.setBounds(471, 70, 188, 53);
	      contentPane.add(btnNewButton_1);
	      
	      
	     // this.setVisible(true);
	   }
	
	

}

