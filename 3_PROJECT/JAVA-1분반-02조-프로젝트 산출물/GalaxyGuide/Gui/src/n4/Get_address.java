package n4;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import java.util.*;
import javafx.application.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Get_address extends JFrame {

	private JPanel contentPane;

	private int XXX ;
	private int YYY ;
	private String str;
	
	/**
	 * Launch the application.
	 */
	
	
	public String getXXX()
	{
		return Integer.toString(XXX);
	}
	public String getYYY()
	{
		return Integer.toString(YYY);
	}
	public String getaddress()
	{
		return  str;
	}
	
	
	/**
	 * Create the frame.
	 */
	public Get_address() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 450, 519);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		Vector vec = new Vector();
		vec.addElement("서울특별시");
		vec.addElement("부산광역시");
		vec.addElement("대구광역시");
		vec.addElement("인천광역시");
		vec.addElement("광주광역시");
		vec.addElement("대전광역시");
		vec.addElement("울산광역시");
		vec.addElement("세종특별자치시");
		vec.addElement("경기도");
		vec.addElement("강원도");
		vec.addElement("충청북도");
		vec.addElement("충청남도");
		vec.addElement("전라북도");
		vec.addElement("전라남도");
		vec.addElement("경상북도");
		vec.addElement("경상남도");
		vec.addElement("제주특별자치도");
		vec.addElement("이어도");
		
		
		JList list = new JList();
		list.setListData(vec);
		list.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				//list.setSelectedIndex(0);
				int kk = list.getSelectedIndex();
				switch(kk)
				{
				case 0:
					XXX = 62;
					YYY = 125;
					str= "서울특별시";
					break;
				case 1:
					XXX = 99;
					YYY = 75;
					str = "부산광역시";
					break;
				case 2 :
					XXX = 90;
					YYY = 90;
					str = "대구광역시";
					break;
				case 3://인천
					XXX = 54;
					YYY = 124;
					str = "인천광역시";
					break;
				case 4://광주
					XXX = 60;
					YYY = 75;
					str = "광주광역시";
					break;
				case 5:
					XXX=67;
					YYY = 100;
					str = "대전광역시";
					break;
				case 6:
					XXX = 101;
					YYY = 81;
					str = "울산광역시";
					break;
				case 7:
					XXX = 66;
					YYY = 103;
					str = "세종특별자치시";
					break;
				case 8:
					XXX = 60;
					YYY = 120;
					str = "경기도";
					break;
				case 9:
					XXX = 98;
					YYY = 125;
					str = "강원도";
					break;
				case 10:
				XXX = 69;
				YYY = 107;
				str = "충청북도";
				break;
				case 11:
					XXX = 60;
					YYY = 110;
					str = "충청남도";
					break;
				case 12:
					XXX = 63;
					YYY = 89;
					str = "전라북도";
					break;
				case 13://전라남도
					XXX = 70;
					YYY = 70;
					str = "전라남도";
					break;
				case 14:
					XXX = 91;
					YYY = 106;
					str = "경상북도";
					break;
				case 15:
					XXX = 91;
					YYY = 75 ;
					str = "경상남도";
					break;
				case 16:
					XXX = 52;
					YYY = 33;
					str = "제주특별자치도";
					break;
				case 17:
					XXX = 28;
					YYY = 8;
					str = "이어도";
					break;				
				}
			}
		});
		

		
		list.setBounds(42, 20, 361, 385);
		contentPane.add(list);
		
		JButton button = new JButton("설정하기");
		button.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) { 
				JOptionPane.showMessageDialog(null, str+"로 설정 하였습니다.", "주소설정", JOptionPane.INFORMATION_MESSAGE);
			}
		});
		button.setBounds(165, 427, 97, 23);
		contentPane.add(button);
	}
	
	
}
