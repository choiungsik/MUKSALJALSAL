package UI;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.SystemColor;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

public class MUKSAL_Table {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MUKSAL_Table window = new MUKSAL_Table();
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
	public MUKSAL_Table() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		
		String path = MUKSAL_Table.class.getResource("").getPath();
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.WHITE);
		frame.getContentPane().setForeground(Color.WHITE);
		frame.setBounds(500, 200, 979, 684);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lbl_call = new JLabel("");
		lbl_call.setBounds(508, 127, 401, 122);
		frame.getContentPane().add(lbl_call);
		lbl_call.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				MUKSAL_직원호출3.main(null);
				frame.dispose();
				
			}
		});
		lbl_call.setHorizontalAlignment(SwingConstants.CENTER);
		
		JLabel lbl_order = new JLabel("");
		lbl_order.setBounds(508, 377, 401, 122);
		frame.getContentPane().add(lbl_order);
		lbl_order.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				MUKSAL_인원수.main(null);
				frame.dispose();
				
			}
		});
		lbl_order.setHorizontalAlignment(SwingConstants.CENTER);
		
		
		JLabel label_back = new JLabel(new ImageIcon(path+"Icon/main.jpg"));
		label_back.setBounds(0, 0, 963, 646);
		frame.getContentPane().add(label_back);
		
	}
}
