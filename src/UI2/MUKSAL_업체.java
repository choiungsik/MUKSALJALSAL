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

public class MUKSAL_��ü {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MUKSAL_��ü window = new MUKSAL_��ü();
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
	public MUKSAL_��ü() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		
		String path = MUKSAL_��ü.class.getResource("").getPath();
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
		
		JLabel lbl_���� = new JLabel("");
		lbl_����.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				
				if(MUKSAL_end.cnt == 1) {
					JOptionPane.showMessageDialog(null, "�̹� ������ �Ϸ�Ǿ����ϴ�.","���",JOptionPane.ERROR_MESSAGE);
				}
				else {
				frame.dispose();
				MUKSAL_end.main(null);
				}
			}
		});
		lbl_����.setBounds(375, 201, 212, 211);
		frame.getContentPane().add(lbl_����);
		lbl_����.setHorizontalAlignment(SwingConstants.CENTER);
		
		JLabel lbl_��� = new JLabel("");
		lbl_���.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				frame.dispose();
				MUKSAL_static.main(null);
				
			}
		});
		lbl_���.setHorizontalAlignment(SwingConstants.CENTER);
		lbl_���.setBounds(673, 201, 212, 211);
		frame.getContentPane().add(lbl_���);
		
		JLabel lbl_���� = new JLabel("");
		lbl_����.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				frame.dispose();
				MUKSAL_����Table.main(null);
				
				
				
			}
		});
		lbl_����.setHorizontalAlignment(SwingConstants.CENTER);
		lbl_����.setBounds(80, 201, 212, 211);
		frame.getContentPane().add(lbl_����);
		
		JLabel label_back = new JLabel(new ImageIcon(path+"Icon/select (2).jpg"));
		label_back.setBounds(0, 0, 963, 646);
		frame.getContentPane().add(label_back);
	}
}
