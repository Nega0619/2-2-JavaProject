package n3;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.*;
import java.awt.image.*;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.Panel;
import java.awt.event.ContainerAdapter;
import java.awt.event.ContainerEvent;

public class left_StarMap extends JFrame {
	
	private String Spring = "E:\\Java_Image\\Spring.PNG";
	private String Summer = "E:\\Java_Image\\Summer.PNG";
	private String Autumn = "E:\\Java_Image\\Autumn.PNG";
	private String Winter = "E:\\Java_Image\\Winter.PNG";
	
	private JPanel contentPane;

	/**
	 * Create the frame.
	 */
	public left_StarMap(int i) {
		
		//TODO get month data 		exception of month
		int month =i;
		
		setResizable(false);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 700, 776);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(78, 491, 525, 214);
		contentPane.add(scrollPane);
		
		JTextArea textArea = new JTextArea();
		scrollPane.setViewportView(textArea);
		textArea.setEditable(false);
		textArea.setLineWrap(true);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		
		
		
		
		
		switch (month) {
		case 12:
		case 1:
		case 2:	//winter
			lblNewLabel.setIcon(new ImageIcon(Winter));
			lblNewLabel.setBounds(121, 10, 433, 471);
			contentPane.add(lblNewLabel);
			textArea.setText("�ܿ�ö ���ϴ��� �ٸ� �������ٵ� ������ ���� ������ �� �͵� ǳ���ϴ�. �ȵ�θ޴����Ͽ� �����¼��� , �÷��̾Ƶ����갳���ܰ� ���ߵ��� �갳���� �� �� �����ε� �� �� �ִ� ���Ͽ� ���� �� ������ �ִ°� �ϸ�, �������ڸ��� ���ڱ�콺, ����, ū���ڸ��� �ø��콺, �������ڸ��� ����Ű��, Ȳ���ڸ��� �˵��ٶ�, �������ڸ��� ī��� �� ����ó�� ���� ������ �ϴ��� ���� ä��� �ִ�. ��ٴ� ��Ǹ� �����ϸ� ���ϴõ� ���� ���ڸ��� �����ϱ⿡�� ���� ���� �����̴�. �ܿ�ö ���ڸ�- �������ڸ�, ū���ڸ�, �������ڸ�, �䳢�ڸ�, �����ٴ����ڸ�, Ȳ���ڸ�, �ֵ����ڸ�, �ܻԼ��ڸ�, �������ڸ�, ���ڸ� \r\n" + 
					"\r\n" + 
					"�ܿ��� ��ﰢ��\r\n" + 
					"\r\n" + 
					"�������ڸ��� ���ڱ�콺�� ū���ڸ��� �ø��콺 �� �������ڸ��� ����Ű���� �Ŵ��� �ﰢ���� �̷�µ� �ܿ��� ��ﰢ������ �Ҹ��� �ܿ�ö ���ڸ��� ã�µ� ������ ������ �Ѵ�. ����, ���⿡ Ȳ���ڸ��� �˵��ٶ��� �������ڸ��� ī���, �׸��� �ֵ����ڸ��� ���轺�� �����Ͽ� �ܿ�ö ���������̶� �θ��⵵ �Ѵ�.");
			break;
		case 3:
		case 4:
		case 5: //spring
			lblNewLabel.setIcon(new ImageIcon(Spring));
			lblNewLabel.setBounds(121, 10, 433, 471);
			contentPane.add(lblNewLabel);
			
			textArea.setText("���� �Ǹ� �ܿ�ö ���ڸ����� ���� �ϴ� �Ʒ��� ���� �ϴ� ���� ������ ���� ��ǥ�ϴ� ���ڸ��� ��ũ������, ó���ڸ��� ����ī, �����ڸ� �����罺 ���� ��� ���� ����. �̵��� ���� ��ǥ�ϴ� ������ ���� ���� ��ﰢ���� �̷��. \r\n" + 
					"\r\n" + 
					"��ö ���ڸ�- �����ڸ�, ���������ڸ�, �������ڸ�, ���ڸ�, �հ��ڸ�, ��ɰ��ڸ�, ó���ڸ�, ����ڸ�, �Ӹ����ڸ�, õĪ�ڸ�, �ٴٹ��ڸ�, �������ڸ�, ���ڸ� \r\n" + 
					"\r\n" + 
					"���� ��ﰢ��\r\n" + 
					"\r\n" + 
					"���� ��ǥ�ϴ� ���ڸ� �Ằ ��ũ�������� ó���ڸ� �Ằ ����ī�� �����ڸ� �⺰ ���׺���� �Բ� �Ŵ��� �ﰢ���� �����. �� �ﰢ���� ���� ��ﰢ���̶� �θ���, ���� ���ڸ����� ã�µ� ���ϰ� �̿�ȴ�.");
			break;
		case 6:
		case 7:
		case 8:	//summer
			lblNewLabel.setIcon(new ImageIcon(Summer));
			lblNewLabel.setBounds(121, 10, 433, 471);
			contentPane.add(lblNewLabel);
			textArea.setText("���� ��, ���ϼ��� �ϴ� �� ����� �������� �帣��, ������ �� ���� ���� �ִ�. �׸��� ���� ������ �߿�� ���డ ĥ������ ��ٸ��� ��¦�δ�. \r\n" + 
					"\r\n" + 
					"����ö ���ڸ�- �Ź����ڸ�, �������ڸ�, �����ڸ�, ȭ���ڸ�, �����ڸ�, �����ڸ�, �����ڸ�, �츣�𷹽��ڸ�, �����ڸ�, �������ڸ�, ���ڸ�, �ü��ڸ� \r\n" + 
					"\r\n" + 
					"����ö ��ﰢ��\r\n" + 
					"\r\n" + 
					"�߿�� ���� �� ���׺�� �Ŵ��� �ﰢ���� �̷��. �̰��� ������ ��ﰢ���̶�� �ϸ� ����ö�� ���ڸ����� ã�µ� �����̷� ���� �̿�ȴ�.");
			break;
		case 9:
		case 10:
		case 11:
			lblNewLabel.setIcon(new ImageIcon(Autumn));
			lblNewLabel.setBounds(121, 10, 433, 471);
			contentPane.add(lblNewLabel);
			textArea.setText("������ ���ڸ��� �ٸ� ������ ���Ͽ� ��������� ���� ���� ���� �ڼ��� ���� ������ ���ڸ��� ã�� ��ƴ�. �������� ��� ���� �ϴ� �Ѱ���� �Ŵ��� �簢���� �� �� �ִ�. �̰��� �䰡������ ���� �κ����� ������ ��簢���̶�� �Ҹ���. �� ��簢���� ������ ��ǥ���� �����̸�, �ٸ� ����ö ���ڸ����� ã�µ� �����ϰ� ���ȴ�. \r\n" + 
					"\r\n" + 
					"����ö ���ڸ�- �䰡�����ڸ�, �ȵ�θ޴��ڸ�, �丣���콺�ڸ�, �������ڸ�, �ﰢ���ڸ�, ���ڸ�, ������ڸ�, �������ڸ�, ���ʹ�����ڸ�, �����ڸ�, �����ڸ�, ���ڸ�. ");
			break;
		default :
			//TODO ����ó���ϰų� �̰� ����ų�~
			lblNewLabel.setIcon(new ImageIcon("C:\\Users\\Hwi\\Desktop\\KakaoTalk_20180324_004626046.jpg"));
			lblNewLabel.setBounds(121, 10, 433, 471);
			contentPane.add(lblNewLabel);
			textArea.setText(month + "���� �����~");
			break;
		
		}
		
	}
}
