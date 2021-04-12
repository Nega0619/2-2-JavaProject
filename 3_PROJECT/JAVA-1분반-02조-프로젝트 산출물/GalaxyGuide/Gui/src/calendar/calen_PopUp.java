package calendar;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import _xml.xml;

import javax.swing.JTextArea;

public class calen_PopUp extends JFrame {

	private JPanel contentPane;
	private int Cur_Date = 0;


	/**
	 * Create the frame.
	 */
	public calen_PopUp(String year, String month, String date) {
		
		Cur_Date = Integer.parseInt(date);
		
		if (Cur_Date == 0)
		{return;}
		else {
		setResizable(false);
	
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		xml Data = new xml(year, month, date);
				
		JTextArea txtrIk = new JTextArea();
		txtrIk.setText("\n"+Cur_Date+"일의 이벤트 \n\n " +Data.getResult());
		txtrIk.setBounds(29, 37, 383, 194);
		contentPane.add(txtrIk);
	}
}
}