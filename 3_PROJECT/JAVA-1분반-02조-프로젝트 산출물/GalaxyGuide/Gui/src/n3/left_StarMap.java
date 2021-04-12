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
			textArea.setText("겨울철 밤하늘은 다른 계절보다도 유난히 별이 많으며 볼 것도 풍성하다. 안드로메다은하와 오리온성운 , 플레이아데스산개성단과 히야데스 산개성단 등 맨 눈으로도 볼 수 있는 은하와 성운 및 성단이 있는가 하면, 오리온자리의 베텔기우스, 리겔, 큰개자리의 시리우스, 작은개자리의 프로키온, 황소자리의 알데바란, 마차부자리의 카펠라 등 보석처럼 밝은 별들이 하늘을 가득 채우고 있다. 춥다는 사실만 제외하면 밤하늘도 맑아 별자리를 관측하기에는 가장 좋은 계절이다. 겨울철 별자리- 오리온자리, 큰개자리, 작은개자리, 토끼자리, 에리다누스자리, 황소자리, 쌍둥이자리, 외뿔소자리, 마차부자리, 게자리 \r\n" + 
					"\r\n" + 
					"겨울의 대삼각형\r\n" + 
					"\r\n" + 
					"오리온자리의 베텔기우스와 큰개자리의 시리우스 및 작은개자리의 프로키온은 거대한 삼각형을 이루는데 겨울의 대삼각형으로 불리며 겨울철 별자리를 찾는데 길잡이 역할을 한다. 또한, 여기에 황소자리의 알데바란과 마차부자리의 카펠라, 그리고 쌍둥이자리의 폴룩스를 연결하여 겨울철 대육각형이라 부르기도 한다.");
			break;
		case 3:
		case 4:
		case 5: //spring
			lblNewLabel.setIcon(new ImageIcon(Spring));
			lblNewLabel.setBounds(121, 10, 433, 471);
			contentPane.add(lblNewLabel);
			
			textArea.setText("봄이 되면 겨울철 별자리들은 서쪽 하늘 아래로 기울고 하늘 높은 곳에는 봄을 대표하는 목동자리의 아크투르스, 처녀자리의 스피카, 사자자리 레굴루스 등이 밝게 빛을 낸다. 이들은 봄을 대표하는 길잡이 별로 봄의 대삼각형을 이룬다. \r\n" + 
					"\r\n" + 
					"봄철 별자리- 사자자리, 작은사자자리, 살쾡이자리, 목동자리, 왕관자리, 사냥개자리, 처녀자리, 까마귀자리, 머리털자리, 천칭자리, 바다뱀자리, 육분의자리, 컵자리 \r\n" + 
					"\r\n" + 
					"봄의 대삼각형\r\n" + 
					"\r\n" + 
					"봄을 대표하는 목동자리 α별 아크투르스와 처녀자리 α별 스피카는 사자자리 β별 데네볼라와 함께 거대한 삼각형을 만든다. 이 삼각형을 봄의 대삼각형이라 부르며, 봄의 별자리들을 찾는데 편리하게 이용된다.");
			break;
		case 6:
		case 7:
		case 8:	//summer
			lblNewLabel.setIcon(new ImageIcon(Summer));
			lblNewLabel.setBounds(121, 10, 433, 471);
			contentPane.add(lblNewLabel);
			textArea.setText("여름 밤, 은하수는 하늘 한 가운데를 가로질러 흐르고, 백조는 그 위를 날고 있다. 그리고 양쪽 강변엔 견우와 직녀가 칠석날을 기다리며 반짝인다. \r\n" + 
					"\r\n" + 
					"여름철 별자리- 거문고자리, 독수리자리, 백조자리, 화살자리, 여우자리, 방패자리, 돌고래자리, 헤르쿨레스자리, 전갈자리, 뱀주인자리, 뱀자리, 궁수자리 \r\n" + 
					"\r\n" + 
					"여름철 대삼각형\r\n" + 
					"\r\n" + 
					"견우와 직녀 및 데네브는 거대한 삼각형을 이룬다. 이것을 여름의 대삼각형이라고 하며 여름철의 별자리들을 찾는데 길잡이로 많이 이용된다.");
			break;
		case 9:
		case 10:
		case 11:
			lblNewLabel.setIcon(new ImageIcon(Autumn));
			lblNewLabel.setBounds(121, 10, 433, 471);
			contentPane.add(lblNewLabel);
			textArea.setText("가을의 별자리는 다른 계절에 비하여 상대적으로 밝은 별이 없어 자세히 보지 않으면 별자리를 찾기 어렵다. 가을밤이 깊어 가면 하늘 한가운데에 거대한 사각형을 볼 수 있다. 이것은 페가수스의 몸통 부분으로 가을의 대사각형이라고 불린다. 이 대사각형은 가을의 대표적인 별들이며, 다른 가을철 별자리들을 찾는데 유용하게 사용된다. \r\n" + 
					"\r\n" + 
					"가을철 별자리- 페가수스자리, 안드로메다자리, 페르세우스자리, 도마뱀자리, 삼각형자리, 양자리, 물고기자리, 조랑말자리, 남쪽물고기자리, 물병자리, 염소자리, 고래자리. ");
			break;
		default :
			//TODO 예외처리하거나 이걸 지우거나~
			lblNewLabel.setIcon(new ImageIcon("C:\\Users\\Hwi\\Desktop\\KakaoTalk_20180324_004626046.jpg"));
			lblNewLabel.setBounds(121, 10, 433, 471);
			contentPane.add(lblNewLabel);
			textArea.setText(month + "월은 없어요~");
			break;
		
		}
		
	}
}
