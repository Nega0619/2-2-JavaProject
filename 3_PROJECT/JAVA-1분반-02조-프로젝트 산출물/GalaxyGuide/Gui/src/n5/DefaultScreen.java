package n5;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SpringLayout;

import javax.swing.SwingConstants;

public class DefaultScreen extends JFrame {

	private JPanel contentPane;

	/**
	 * Create the frame.
	 */
	public DefaultScreen() {
		setResizable(false);
		setTitle("õ���� ���� ����"); 
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 880, 600);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		SpringLayout sl_contentPane = new SpringLayout();
		contentPane.setLayout(sl_contentPane);
		
		JLabel lblNewLabel = new JLabel("õ���� ���� ����");
		sl_contentPane.putConstraint(SpringLayout.WEST, lblNewLabel, 5, SpringLayout.WEST, contentPane);
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		sl_contentPane.putConstraint(SpringLayout.NORTH, lblNewLabel, 10, SpringLayout.NORTH, contentPane);
		lblNewLabel.setFont(new Font("�������", Font.PLAIN, 38));
		contentPane.add(lblNewLabel);
		
		JPanel panel = new JPanel();
		sl_contentPane.putConstraint(SpringLayout.NORTH, panel, 1, SpringLayout.SOUTH, lblNewLabel);
		sl_contentPane.putConstraint(SpringLayout.SOUTH, panel, -15, SpringLayout.SOUTH, contentPane);
		sl_contentPane.putConstraint(SpringLayout.EAST, lblNewLabel, 0, SpringLayout.EAST, panel);
		sl_contentPane.putConstraint(SpringLayout.WEST, panel, 5, SpringLayout.WEST, contentPane);
		sl_contentPane.putConstraint(SpringLayout.EAST, panel, 0, SpringLayout.EAST, contentPane);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JButton Button_1 = new JButton("��");
		Button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				JOptionPane.showMessageDialog(null, "���༺�� �¾���̿� ������ ��ġ�Ͽ� �¾�� ���༺�� ��Ȳ�� ���̰� 180���� �Ǵ� ����, �� �¾�-����-���༺ ������ ��ġ�� ���̴�.", "��", JOptionPane.INFORMATION_MESSAGE);
			}
		});
		Button_1.setBounds(14, 12, 402, 44);
		panel.add(Button_1);
		
		JButton Button_2 = new JButton("��");
		Button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				JOptionPane.showMessageDialog(null, "������ ���༺ ���̿� �¾��� ��ġ�Ͽ� �¾�� ���༺�� ��Ȳ���� ���� �Ǵ� ����, �� ���༺-�¾�-���� ������ ��ġ�� ���̴�.", "��", JOptionPane.INFORMATION_MESSAGE);
			}
		});
		Button_2.setBounds(14, 68, 402, 44);
		panel.add(Button_2);
		
		JButton Button_3 = new JButton("���հ� ����");
		Button_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				JOptionPane.showMessageDialog(null, "���հ� ������ �ð��� �¾�� ���༺ (����, �ݼ�)�� ��Ȳ���� ���� �Ǵ� �ð��̸�, ���༺�� �¾�� ���� ���̿� �ִ� ��츦 ����, ���༺�� ���� ���̿� �¾��� ���� ���� �����̶� �Ѵ�.\r\n" + 
						"", "���հ� ����", JOptionPane.INFORMATION_MESSAGE);
         }
		});
		Button_3.setBounds(14, 122, 402, 44);
		panel.add(Button_3);
		
		JButton Button_4 = new JButton("��");
		Button_4.addActionListener(new ActionListener() {
	         public void actionPerformed(ActionEvent arg0) {
	            JOptionPane.showMessageDialog(null, "�༺�� �������� ������ �ʴ� �ð��̸�, �� ���� �������� ��ȭ�� �ϸ��Ͽ� �׼��� ���Ͽ� �ÿ�� ���� ������ �����̴�.\r\n" + 
	            		"", "��", JOptionPane.INFORMATION_MESSAGE);
	         }
	      });
		Button_4.setBounds(14, 178, 402, 44);
		panel.add(Button_4);
		
		JButton Button_5 = new JButton("�ִ��̰�");
		Button_5.addActionListener(new ActionListener() {
	         public void actionPerformed(ActionEvent arg0) {
	            JOptionPane.showMessageDialog(null, "�¾�� ���༺�� ���Ÿ��� �ִ�� �Ǵ� �����̸�, �������� �� ��, �¾��� �������� �ִ� ���Ÿ��� �ִ� ��츦 �����ִ��̰�, ���ʿ� �ִ� ��츦 ���� �ִ��̰��̶� �Ѵ�.\r\n" + 
	            		"", "�ִ��̰�", JOptionPane.INFORMATION_MESSAGE);
	         }
	      });
		Button_5.setBounds(14, 234, 402, 44);
		panel.add(Button_5);
		
		JButton Button_6 = new JButton("����");
		Button_6.addActionListener(new ActionListener() {
	         public void actionPerformed(ActionEvent arg0) {
	            JOptionPane.showMessageDialog(null, "�ٷ� ���� �ջ� �������κ��� ���� ���� 9�ñ����� �ð��� ���Ѵ�.", "����", JOptionPane.INFORMATION_MESSAGE);
	         }
	      });
		Button_6.setBounds(430, 12, 402, 44);
		panel.add(Button_6);
		
		JButton Button_7 = new JButton("������");
		Button_7.addActionListener(new ActionListener() {
	         public void actionPerformed(ActionEvent arg0) {
	            JOptionPane.showMessageDialog(null, "�¾�� ���� ������ �Ÿ��� �ּҰ� �Ǵ� �����̴�.", "������", JOptionPane.INFORMATION_MESSAGE);
	         }
	      });
		Button_7.setBounds(430, 68, 402, 44);
		panel.add(Button_7);
		
		JButton Button_8 = new JButton("������");
		Button_8.addActionListener(new ActionListener() {
	         public void actionPerformed(ActionEvent arg0) {
	            JOptionPane.showMessageDialog(null, "�¾�� ���� ������ �Ÿ��� �ִ밡 �Ǵ� �����̴�.", "������", JOptionPane.INFORMATION_MESSAGE);
	         }
	      });
		Button_8.setBounds(430, 122, 402, 44);
		panel.add(Button_8);
		
		JButton Button_9 = new JButton("AU (Astronomical Unit)");
		Button_9.addActionListener(new ActionListener() {
	         public void actionPerformed(ActionEvent arg0) {
	            JOptionPane.showMessageDialog(null, "�¾�� ���� ������ ��հŸ�(1.496 X 10^11km)�� ���Ѵ�.", "AU (Astronomical Unit)", JOptionPane.INFORMATION_MESSAGE);
	         }
	      });
		Button_9.setBounds(430, 178, 402, 44);
		panel.add(Button_9);
		
		JButton Button_10 = new JButton("ZHR (Zenithal Hourly Rate)");
		Button_10.addActionListener(new ActionListener() {
	         public void actionPerformed(ActionEvent arg0) {
	            JOptionPane.showMessageDialog(null, "6.5������� ���̴� ���� ��, �������� �������� õ���� �ִٰ� ������ �� 1�ð� ���� �� ����� �Ǵ����� ������ �� �ִ� ������ ��, ������ ������ �� �ִ� ���� �̺��� ����.", "ZHR (Zenithal Hourly Rate)", JOptionPane.INFORMATION_MESSAGE);
	         }
	      });
		Button_10.setBounds(430, 234, 402, 44);
		panel.add(Button_10);
		
		JButton Button_11 = new JButton("��Ȳ��");
		Button_11.addActionListener(new ActionListener() {
	         public void actionPerformed(ActionEvent arg0) {
	            JOptionPane.showMessageDialog(null, "Ȳ����ǥ�迡�� ������ õü�� �浵�� ���� �߽��� ���������� �Ѵ�.", "��Ȳ��", JOptionPane.INFORMATION_MESSAGE);
	         }
	      });
		Button_11.setBounds(14, 290, 402, 44);
		panel.add(Button_11);
		
		JButton Button_12 = new JButton("�ջ�");
		Button_12.addActionListener(new ActionListener() {
	         public void actionPerformed(ActionEvent arg0) {
	            JOptionPane.showMessageDialog(null, "�ؿ� ������ ���� �߰��� �ΰ� �������� �Ǿ� ���� ���� ������ ���� ���� ���Ѵ�.", "�ջ�", JOptionPane.INFORMATION_MESSAGE);
	         }
	      });
		Button_12.setBounds(430, 290, 402, 44);
		panel.add(Button_12);
		
		JButton Button_13 = new JButton("���Ÿ�");
		Button_13.addActionListener(new ActionListener() {
	         public void actionPerformed(ActionEvent arg0) {
	            JOptionPane.showMessageDialog(null, "�����ڷκ��� �ָ� ������ �� �� A, B�� �����ڿ� ���� ���� �� �� ������ �̷�� ���� ���Ѵ�.", "���Ÿ�", JOptionPane.INFORMATION_MESSAGE);
	         }
	      });
		Button_13.setBounds(14, 346, 402, 44);
		panel.add(Button_13);
		
		JButton Button_14 = new JButton("������� ������");
		Button_14.addActionListener(new ActionListener() {
	         public void actionPerformed(ActionEvent arg0) {
	            JOptionPane.showMessageDialog(null, "���� ������ ��������� �������� ������ ������ ������, �������̶�� �Ͽ�, ���⿡ �ٽ� ���ֱ������� ������ ���� ������, �������̶�� �Ѵ�.","������� ������", JOptionPane.INFORMATION_MESSAGE);
	         }
	      });
		Button_14.setBounds(430, 346, 402, 44);
		panel.add(Button_14);
		
	}
}
