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
		setResizable(false);   //������ ���� �Ұ��� ����.
		setTitle("õ��������"); 

		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //�� gui�� ������ ��ü ���α׷��� �������� ����.
	      setBounds(100, 100, 872, 547);
	      contentPane = new JPanel();
	      contentPane.setBackground(SystemColor.control);
	      contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
	      setContentPane(contentPane);
	      
	      
	      JButton btnNewButton = new JButton("���ڸ� ����");
	      btnNewButton.addMouseListener(new MouseAdapter() {
	      	@Override
	      	public void mousePressed(MouseEvent e) {	//���콺 �Է��� ������ ����Ǵ� �̺�Ʈ �Լ�
	      		EventQueue.invokeLater(new Runnable() {
    			public void run() {
    				try {    					
    					//���ڸ� �� ����
    					infc_3 frame = new infc_3(month);	//�������̽�3�� ����� ���ÿ� month ���� �Ѱ���.
    					frame.setVisible(true);
    				} catch (Exception e) {
    					e.printStackTrace();   				}
    			}    		});      	}	      });
	      
	      btnNewButton.setBounds(65, 377, 173, 121);
	      
	      JButton button = new JButton("���� ����");
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
	      
	      JButton button_1 = new JButton("õ���� ����");
	      button_1.addMouseListener(new MouseAdapter() {
	      	@Override
	      	public void mouseClicked(MouseEvent e) {
	      		//5�� �������̽�
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
	      textArea.setText("õ���� ����");
	      contentPane.add(textArea);
	      
	   
	      JTextPane textPane_1 = new JTextPane();
	      textPane_1.addMouseListener(new MouseAdapter() {
	      	@Override
	      	public void mousePressed(MouseEvent e) {	//���콺 �Է��� ������ �̺�Ʈ�� ����ȴ�.
	      	if(year == 0 || month == 0 || date == 0)	
	      		return;		//��¥�� �������� �ʰ� Ŭ������ ���� �̺�Ʈ�Լ� ������ ���� ����.
	      		calendar calen = new calendar(year, month);		//calendar â�� �����ȴ�.
	      		calen.setVisible(true);
	      	}
	      });
	      textPane_1.setContentType("text-align:center/plain");
	      textPane_1.setFont(new Font("Gulim", Font.PLAIN, 12));
	      textPane_1.setBounds(65, 205, 736, 162);
	      textPane_1.setText("���� ��¥�� �Է��ϼ���." );		//�ƹ� �̺�Ʈ�� ���� �� '��¥�� �����ϼ���'�� �Էµ� �����̴�.
	      
	      
	      contentPane.setLayout(null);
	      contentPane.add(btnNewButton);
	      contentPane.add(button);
	      contentPane.add(button_1);
	      contentPane.add(textPane_1,"Center");
	      
	      JTextArea Get_Year = new JTextArea();			//TextArea ��ü ����
	      Get_Year.addFocusListener(new FocusAdapter() {	//�ؽ�Ʈ�� Ŀ���� ����� ����Ǵ� �̺�Ʈ
	      	@Override
	      	public void focusGained(FocusEvent e) 
	      	{    		Get_Year.setText("");      	}	      });		//�̺�Ʈ�� ����� '�Է��ϼ���'�޽����� ���ش�.
	      Get_Year.setText("�Է��ϼ���.");		//�ƹ��� �̺�Ʈ�� �������� ������ '�Է��ϼ���' �޽����� ���ִ� �����̴�.
	      Get_Year.setBounds(187, 22, 173, 41);
	      contentPane.add(Get_Year);
	      
	      JTextArea YEAR = new JTextArea();
	      YEAR.setForeground(SystemColor.desktop);
	      YEAR.setBackground(SystemColor.control);		//TextArea ���� ������ ���� ���߱� ���� ��������.
	      YEAR.setEnabled(false);		//���� �Ұ�.
	      YEAR.setEditable(false);	//'��' ����Ұ�
	      YEAR.setText("��");	
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
	      
	      JButton btnNewButton_1 = new JButton("��¥ �����ϱ�");	//��ư ��ü ����
	      btnNewButton_1.addMouseListener(new MouseAdapter() {
	      	@Override
	      	public void mousePressed(MouseEvent e) 	//���콺 Ŭ�������� ����Ǵ� �̺�Ʈ
	      	{
	      		xml Data = new xml(Get_Year.getText(),Get_Month.getText(),Get_Date.getText());
	      		year = 	Integer.parseInt(Get_Year.getText());
		      	month = 	Integer.parseInt(Get_Month.getText());
		      	date = 	Integer.parseInt(Get_Date.getText());
		      	
		      	if(month>13 || month < 1 || date <1||date>31 )
			      	{  		
			      		JOptionPane.showMessageDialog(null, "��¥�� ����� �Է��ϼ���.", "õ��������", JOptionPane.INFORMATION_MESSAGE);
			      		return;
			      	}
		      	
			    textPane_1.setText("���� �޷����� õ�� �̺�Ʈ�� ���� �ʹٸ� Ŭ���ϼ���.\n\n"
			      		+ year+"�� " + month + "�� " +date +"���� õ�� �̺�Ʈ �Դϴ�.\n\n"
			      		+Data.getResult() );   
	      	}	      });
	     
	      btnNewButton_1.setBounds(471, 70, 188, 53);
	      contentPane.add(btnNewButton_1);
	      
	      
	     // this.setVisible(true);
	   }
	
	

}

