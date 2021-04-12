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
		setTitle("천문학 정보 사전"); 
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 880, 600);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		SpringLayout sl_contentPane = new SpringLayout();
		contentPane.setLayout(sl_contentPane);
		
		JLabel lblNewLabel = new JLabel("천문학 정보 사전");
		sl_contentPane.putConstraint(SpringLayout.WEST, lblNewLabel, 5, SpringLayout.WEST, contentPane);
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		sl_contentPane.putConstraint(SpringLayout.NORTH, lblNewLabel, 10, SpringLayout.NORTH, contentPane);
		lblNewLabel.setFont(new Font("나눔고딕", Font.PLAIN, 38));
		contentPane.add(lblNewLabel);
		
		JPanel panel = new JPanel();
		sl_contentPane.putConstraint(SpringLayout.NORTH, panel, 1, SpringLayout.SOUTH, lblNewLabel);
		sl_contentPane.putConstraint(SpringLayout.SOUTH, panel, -15, SpringLayout.SOUTH, contentPane);
		sl_contentPane.putConstraint(SpringLayout.EAST, lblNewLabel, 0, SpringLayout.EAST, panel);
		sl_contentPane.putConstraint(SpringLayout.WEST, panel, 5, SpringLayout.WEST, contentPane);
		sl_contentPane.putConstraint(SpringLayout.EAST, panel, 0, SpringLayout.EAST, contentPane);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JButton Button_1 = new JButton("충");
		Button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				JOptionPane.showMessageDialog(null, "외행성과 태양사이에 지구가 위치하여 태양과 외행성의 시황경 차이가 180˚가 되는 현상, 즉 태양-지구-외행성 순서로 위치한 때이다.", "충", JOptionPane.INFORMATION_MESSAGE);
			}
		});
		Button_1.setBounds(14, 12, 402, 44);
		panel.add(Button_1);
		
		JButton Button_2 = new JButton("합");
		Button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				JOptionPane.showMessageDialog(null, "지구와 외행성 사이에 태양이 위치하여 태양과 외행성의 시황경이 같게 되는 현상, 즉 외행성-태양-지구 순서로 위치한 때이다.", "합", JOptionPane.INFORMATION_MESSAGE);
			}
		});
		Button_2.setBounds(14, 68, 402, 44);
		panel.add(Button_2);
		
		JButton Button_3 = new JButton("내합과 외합");
		Button_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				JOptionPane.showMessageDialog(null, "내합과 외합의 시각은 태양과 내행성 (수성, 금성)의 시황경이 같게 되는 시각이며, 내행성이 태양과 지구 사이에 있는 경우를 내합, 내행성과 지구 사이에 태양이 있을 때를 외합이라 한다.\r\n" + 
						"", "내합과 외합", JOptionPane.INFORMATION_MESSAGE);
         }
		});
		Button_3.setBounds(14, 122, 402, 44);
		panel.add(Button_3);
		
		JButton Button_4 = new JButton("유");
		Button_4.addActionListener(new ActionListener() {
	         public void actionPerformed(ActionEvent arg0) {
	            JOptionPane.showMessageDialog(null, "행성의 시적경이 변하지 않는 시간이며, 이 때의 시적위의 변화는 완만하여 항성에 대하여 시운동은 거의 정지된 상태이다.\r\n" + 
	            		"", "유", JOptionPane.INFORMATION_MESSAGE);
	         }
	      });
		Button_4.setBounds(14, 178, 402, 44);
		panel.add(Button_4);
		
		JButton Button_5 = new JButton("최대이각");
		Button_5.addActionListener(new ActionListener() {
	         public void actionPerformed(ActionEvent arg0) {
	            JOptionPane.showMessageDialog(null, "태양과 내행성의 각거리가 최대로 되는 각도이며, 지구에서 볼 때, 태양의 동쪽으로 최대 각거리에 있는 경우를 동방최대이각, 서쪽에 있는 경우를 서방 최대이각이라 한다.\r\n" + 
	            		"", "최대이각", JOptionPane.INFORMATION_MESSAGE);
	         }
	      });
		Button_5.setBounds(14, 234, 402, 44);
		panel.add(Button_5);
		
		JButton Button_6 = new JButton("월령");
		Button_6.addActionListener(new ActionListener() {
	         public void actionPerformed(ActionEvent arg0) {
	            JOptionPane.showMessageDialog(null, "바로 직전 합삭 시작으로부터 매일 오후 9시까지의 시간을 말한다.", "월령", JOptionPane.INFORMATION_MESSAGE);
	         }
	      });
		Button_6.setBounds(430, 12, 402, 44);
		panel.add(Button_6);
		
		JButton Button_7 = new JButton("근일점");
		Button_7.addActionListener(new ActionListener() {
	         public void actionPerformed(ActionEvent arg0) {
	            JOptionPane.showMessageDialog(null, "태양과 지구 사이의 거리가 최소가 되는 지점이다.", "근일점", JOptionPane.INFORMATION_MESSAGE);
	         }
	      });
		Button_7.setBounds(430, 68, 402, 44);
		panel.add(Button_7);
		
		JButton Button_8 = new JButton("원일점");
		Button_8.addActionListener(new ActionListener() {
	         public void actionPerformed(ActionEvent arg0) {
	            JOptionPane.showMessageDialog(null, "태양과 지구 사이의 거리가 최대가 되는 지점이다.", "원일점", JOptionPane.INFORMATION_MESSAGE);
	         }
	      });
		Button_8.setBounds(430, 122, 402, 44);
		panel.add(Button_8);
		
		JButton Button_9 = new JButton("AU (Astronomical Unit)");
		Button_9.addActionListener(new ActionListener() {
	         public void actionPerformed(ActionEvent arg0) {
	            JOptionPane.showMessageDialog(null, "태양과 지구 사이의 평균거리(1.496 X 10^11km)를 말한다.", "AU (Astronomical Unit)", JOptionPane.INFORMATION_MESSAGE);
	         }
	      });
		Button_9.setBounds(430, 178, 402, 44);
		panel.add(Button_9);
		
		JButton Button_10 = new JButton("ZHR (Zenithal Hourly Rate)");
		Button_10.addActionListener(new ActionListener() {
	         public void actionPerformed(ActionEvent arg0) {
	            JOptionPane.showMessageDialog(null, "6.5등성까지는 보이는 맑은 밤, 유성우의 복사점이 천정에 있다고 가정할 때 1시간 동안 한 사람이 맨눈으로 관측할 수 있는 유성의 수, 실제로 관측할 수 있는 것은 이보다 적다.", "ZHR (Zenithal Hourly Rate)", JOptionPane.INFORMATION_MESSAGE);
	         }
	      });
		Button_10.setBounds(430, 234, 402, 44);
		panel.add(Button_10);
		
		JButton Button_11 = new JButton("시황경");
		Button_11.addActionListener(new ActionListener() {
	         public void actionPerformed(ActionEvent arg0) {
	            JOptionPane.showMessageDialog(null, "황도좌표계에서 측정한 천체의 경도로 지구 중심을 기준점으로 한다.", "시황경", JOptionPane.INFORMATION_MESSAGE);
	         }
	      });
		Button_11.setBounds(14, 290, 402, 44);
		panel.add(Button_11);
		
		JButton Button_12 = new JButton("합삭");
		Button_12.addActionListener(new ActionListener() {
	         public void actionPerformed(ActionEvent arg0) {
	            JOptionPane.showMessageDialog(null, "해와 지구가 달을 중간에 두고 일직선이 되어 달이 전혀 보이지 않을 때를 말한다.", "합삭", JOptionPane.INFORMATION_MESSAGE);
	         }
	      });
		Button_12.setBounds(430, 290, 402, 44);
		panel.add(Button_12);
		
		JButton Button_13 = new JButton("각거리");
		Button_13.addActionListener(new ActionListener() {
	         public void actionPerformed(ActionEvent arg0) {
	            JOptionPane.showMessageDialog(null, "관찰자로부터 멀리 떨어진 두 점 A, B를 관찰자와 연결 했을 때 두 선분이 이루는 각을 말한다.", "각거리", JOptionPane.INFORMATION_MESSAGE);
	         }
	      });
		Button_13.setBounds(14, 346, 402, 44);
		panel.add(Button_13);
		
		JButton Button_14 = new JButton("시적경과 시적위");
		Button_14.addActionListener(new ActionListener() {
	         public void actionPerformed(ActionEvent arg0) {
	            JOptionPane.showMessageDialog(null, "관측 순간의 진춘분점과 진적도에 기초한 적위를 진적위, 진적경이라고 하여, 여기에 다시 연주광행차를 보정한 것을 시적위, 시적경이라고 한다.","시적경과 시적위", JOptionPane.INFORMATION_MESSAGE);
	         }
	      });
		Button_14.setBounds(430, 346, 402, 44);
		panel.add(Button_14);
		
	}
}
