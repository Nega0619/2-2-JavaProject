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
		vec.addElement("����Ư����");
		vec.addElement("�λ걤����");
		vec.addElement("�뱸������");
		vec.addElement("��õ������");
		vec.addElement("���ֱ�����");
		vec.addElement("����������");
		vec.addElement("��걤����");
		vec.addElement("����Ư����ġ��");
		vec.addElement("��⵵");
		vec.addElement("������");
		vec.addElement("��û�ϵ�");
		vec.addElement("��û����");
		vec.addElement("����ϵ�");
		vec.addElement("���󳲵�");
		vec.addElement("���ϵ�");
		vec.addElement("��󳲵�");
		vec.addElement("����Ư����ġ��");
		vec.addElement("�̾");
		
		
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
					str= "����Ư����";
					break;
				case 1:
					XXX = 99;
					YYY = 75;
					str = "�λ걤����";
					break;
				case 2 :
					XXX = 90;
					YYY = 90;
					str = "�뱸������";
					break;
				case 3://��õ
					XXX = 54;
					YYY = 124;
					str = "��õ������";
					break;
				case 4://����
					XXX = 60;
					YYY = 75;
					str = "���ֱ�����";
					break;
				case 5:
					XXX=67;
					YYY = 100;
					str = "����������";
					break;
				case 6:
					XXX = 101;
					YYY = 81;
					str = "��걤����";
					break;
				case 7:
					XXX = 66;
					YYY = 103;
					str = "����Ư����ġ��";
					break;
				case 8:
					XXX = 60;
					YYY = 120;
					str = "��⵵";
					break;
				case 9:
					XXX = 98;
					YYY = 125;
					str = "������";
					break;
				case 10:
				XXX = 69;
				YYY = 107;
				str = "��û�ϵ�";
				break;
				case 11:
					XXX = 60;
					YYY = 110;
					str = "��û����";
					break;
				case 12:
					XXX = 63;
					YYY = 89;
					str = "����ϵ�";
					break;
				case 13://���󳲵�
					XXX = 70;
					YYY = 70;
					str = "���󳲵�";
					break;
				case 14:
					XXX = 91;
					YYY = 106;
					str = "���ϵ�";
					break;
				case 15:
					XXX = 91;
					YYY = 75 ;
					str = "��󳲵�";
					break;
				case 16:
					XXX = 52;
					YYY = 33;
					str = "����Ư����ġ��";
					break;
				case 17:
					XXX = 28;
					YYY = 8;
					str = "�̾";
					break;				
				}
			}
		});
		

		
		list.setBounds(42, 20, 361, 385);
		contentPane.add(list);
		
		JButton button = new JButton("�����ϱ�");
		button.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) { 
				JOptionPane.showMessageDialog(null, str+"�� ���� �Ͽ����ϴ�.", "�ּҼ���", JOptionPane.INFORMATION_MESSAGE);
			}
		});
		button.setBounds(165, 427, 97, 23);
		contentPane.add(button);
	}
	
	
}
