package n3;

import java.awt.EventQueue;
import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class infc_3 extends JFrame {

	private JPanel contentPane;

	/**
	 * Create the frame.
	 */
	public infc_3(int month) {
		setResizable(false);			//()�� int month�ؼ� �� ���� �ؾ���~
		
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton button = new JButton("���ڸ� ��");		//���� ��ư
		button.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {	
				
				EventQueue.invokeLater(new Runnable() {
					public void run() {
						try {
							left_StarMap frame = new left_StarMap(month);								//���߿� ������� �־������.

							frame.setVisible(true);
						} catch (Exception e) {
							e.printStackTrace();
						}
					}
				});
				
				//TODO: ���콺 �̺�Ʈ �ֱ�.
			}
		});
		button.setBounds(61, 88, 117, 79);
		contentPane.add(button);
		
		JButton button_1 = new JButton("VR");		//������ ��ư
		button_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Runtime runtime = Runtime.getRuntime();
				String ie = "C:\\Program Files\\internet explorer\\iexplore.exe";
				String vr = "https://astro.kasi.re.kr/life/pageView/6436";
				String [] ar = {ie, vr};
				try {
					runtime.exec(ar);
				}catch(Exception ee) {}
				//TODO : ���콺 �̺�Ʈ �ֱ�
			}
		});
		button_1.setBounds(239, 88, 117, 79);
		contentPane.add(button_1);
	}
}
