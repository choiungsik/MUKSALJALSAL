package UI2;

import java.awt.EventQueue;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class MUKSAL_Pay {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MUKSAL_Pay window = new MUKSAL_Pay();
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
	public MUKSAL_Pay() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		
		String path = MUKSAL_Pay.class.getResource("").getPath();
		
		frame = new JFrame();
		frame.setBounds(500, 200, 979, 684);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel label = new JLabel("");
		label.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				frame.dispose();
				MUKSAL_¾÷Ã¼.main(null);
				
				
			}
		});
		label.setBounds(32, 10, 43, 42);
		frame.getContentPane().add(label);
		
		JLabel label_1 = new JLabel("");
		label_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				frame.dispose();
				MUKSAL_TableDetail.main(null);
				
			}
		});
		label_1.setBounds(98, 10, 43, 42);
		frame.getContentPane().add(label_1);
		
		
		JLabel label_back = new JLabel(new ImageIcon(path+"Icon/finalbills.jpg"));
		label_back.setBounds(0, 0, 963, 646);
		frame.getContentPane().add(label_back);

		
	}

}
