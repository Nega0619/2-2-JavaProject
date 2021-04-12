package n4;

import java.awt.EventQueue;
import java.util.*;
import javafx.application.*;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JTextArea;
import _xml.Weather;

public class infc_4 extends JFrame {

	//변수 선언
 String address = "부산광역시";
	
	String currt_weather = "맑음";		//현재 날씨
	float temperature = (float)25.0; //온도
	int rise_hour = 6 ; //일출 시각
	int rise_min = 30; //일출 분
	int set_hour = 17 ; //일몰 시각
	int set_min = 45; //일몰 분
	
	private JPanel contentPane;
		
	/**
	 * Create the frame.
	 */
	public infc_4(int year, int month, int date) {
		setResizable(false);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 700, 550);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		Get_address frame = new Get_address();
		
		JButton btnNewButton = new JButton("주소 설정하기");		//주소를 출력

		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				EventQueue.invokeLater(new Runnable() {
					public void run() {
						try {
							
							frame.setVisible(true);
						} catch (Exception e) {
							e.printStackTrace();
						}
					}
				});	
			}
		});
		
		btnNewButton.setBounds(12, 10, 660, 99);
		contentPane.add(btnNewButton);
		
		JTextArea textArea = new JTextArea();
		textArea.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				Weather NalSi = new Weather(Integer.toString(year),Integer.toString(month),Integer.toString(date),frame.getXXX(), frame.getYYY());
				address = frame.getaddress();
				
				textArea.setText("\n 현재 지역은 " + address +"입니다. 업데이트를 원한다면 클릭하십시오. \n\n"+
						NalSi.getResult()
						);
				}
		});
		textArea.setText("\n\n꼭 현재 날짜를 입력하시고 업데이트를 원한다면 클릭하십시오. \n\n"
				
				);
		textArea.setBounds(79, 167, 505, 240);
		contentPane.add(textArea);
	}
}
