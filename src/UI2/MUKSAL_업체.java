package UI2;

import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

import UI.MUKSAL_Login;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class MUKSAL_업체 {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MUKSAL_업체 window = new MUKSAL_업체();
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
	public MUKSAL_업체() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		
		String path = MUKSAL_업체.class.getResource("").getPath();
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(255, 255, 255));
		frame.setBounds(500, 200, 979, 684);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lbl_prebnt = new JLabel("");
		lbl_prebnt.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				frame.dispose();
				MUKSAL_Login.main(null);
				
				
			}
		});
		lbl_prebnt.setBounds(119, 22, 43, 42);
		frame.getContentPane().add(lbl_prebnt);
		
		JLabel lbl_homebnt = new JLabel("");
		lbl_homebnt.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {

				frame.dispose();
				MUKSAL_Login.main(null);
				
			}
		});
		lbl_homebnt.setBounds(44, 22, 43, 42);
		frame.getContentPane().add(lbl_homebnt);
		
		JLabel lbl_마감 = new JLabel("");
		lbl_마감.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				
				if(MUKSAL_end.cnt == 1) {
					JOptionPane.showMessageDialog(null, "이미 마감이 완료되었습니다.","경고",JOptionPane.ERROR_MESSAGE);
				}
				else {
				frame.dispose();
				MUKSAL_end.main(null);
				}
			}
		});
		lbl_마감.setBounds(375, 201, 212, 211);
		frame.getContentPane().add(lbl_마감);
		lbl_마감.setHorizontalAlignment(SwingConstants.CENTER);
		
		JLabel lbl_통계 = new JLabel("");
		lbl_통계.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				frame.dispose();
				MUKSAL_static.main(null);
				
			}
		});
		lbl_통계.setHorizontalAlignment(SwingConstants.CENTER);
		lbl_통계.setBounds(673, 201, 212, 211);
		frame.getContentPane().add(lbl_통계);
		
		JLabel lbl_오픈 = new JLabel("");
		lbl_오픈.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				frame.dispose();
				MUKSAL_오픈Table.main(null);
				
				
				
			}
		});
		lbl_오픈.setHorizontalAlignment(SwingConstants.CENTER);
		lbl_오픈.setBounds(80, 201, 212, 211);
		frame.getContentPane().add(lbl_오픈);
		
		JLabel label_back = new JLabel(new ImageIcon(path+"Icon/select (2).jpg"));
		label_back.setBounds(0, 0, 963, 646);
		frame.getContentPane().add(label_back);
	}
}
