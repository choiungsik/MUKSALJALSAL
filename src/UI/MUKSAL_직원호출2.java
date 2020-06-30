package UI;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

public class MUKSAL_직원호출2 {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MUKSAL_직원호출2 window = new MUKSAL_직원호출2();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public MUKSAL_직원호출2() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		
		String path = MUKSAL_직원호출2.class.getResource("").getPath();
		
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.WHITE);
		frame.setBounds(500, 200, 979, 684);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lbl_pre = new JLabel("");
		lbl_pre.setBounds(90, 14, 52, 43);
		frame.getContentPane().add(lbl_pre);
		
		JLabel lbl_home = new JLabel("");
		lbl_home.setBounds(26, 10, 52, 51);
		frame.getContentPane().add(lbl_home);
		
		JLabel lbl_canclebnt = new JLabel("");
		lbl_canclebnt.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				JOptionPane.showMessageDialog(null, "호출이 취소되었습니다.");
				frame.dispose();
				MUKSAL_Final.main(null);
			}
		});
		lbl_canclebnt.setBounds(356, 527, 236, 68);
		frame.getContentPane().add(lbl_canclebnt);
		lbl_canclebnt.setHorizontalAlignment(SwingConstants.CENTER);
		
		JLabel label_back = new JLabel(new ImageIcon(path+"Icon/call.jpg"));
		label_back.setBounds(0, 0, 963, 646);
		frame.getContentPane().add(label_back);
		lbl_home.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				frame.dispose();
				MUKSAL_Table.main(null);
				
			}
		});
		lbl_pre.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				frame.dispose();
				MUKSAL_Table.main(null);
				
			}
		});
		
	}

}
