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

public class MUKSAL_Final {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MUKSAL_Final window = new MUKSAL_Final();
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
	public MUKSAL_Final() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {

		String path = MUKSAL_Final.class.getResource("").getPath();

		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(255, 255, 255));
		frame.setBounds(500, 200, 979, 684);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		JLabel lbl_order = new JLabel("");
		lbl_order.setBounds(516, 32, 381, 111);
		frame.getContentPane().add(lbl_order);
		lbl_order.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				frame.dispose();
				MUKSAL_TotalMenu1.main(null);

			}
		});
		lbl_order.setHorizontalAlignment(SwingConstants.CENTER);

		JLabel lbl_call = new JLabel("");
		lbl_call.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				frame.dispose();
				MUKSAL_직원호출2.main(null);
			}
		});
		lbl_call.setBounds(516, 184, 381, 105);
		frame.getContentPane().add(lbl_call);
		lbl_call.setHorizontalAlignment(SwingConstants.CENTER);

		JLabel lbl_bills = new JLabel("");
		lbl_bills.setBounds(505, 509, 401, 111);
		frame.getContentPane().add(lbl_bills);
		lbl_bills.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				frame.dispose();
				MUKSAL_FinalBills.main(null);

			}
		});
		lbl_bills.setHorizontalAlignment(SwingConstants.CENTER);

		JLabel lbl_water = new JLabel("");
		lbl_water.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				JOptionPane.showMessageDialog(null, "물을 주문합니다");
						
			}
		});
		lbl_water.setBounds(505, 342, 113, 111);
		frame.getContentPane().add(lbl_water);
		lbl_water.setHorizontalAlignment(SwingConstants.CENTER);

		JLabel lbl_pickle = new JLabel("");
		lbl_pickle.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				JOptionPane.showMessageDialog(null, "피클을 주문합니다");
			}
		});
		lbl_pickle.setBounds(652, 342, 113, 111);
		frame.getContentPane().add(lbl_pickle);
		lbl_pickle.setHorizontalAlignment(SwingConstants.CENTER);

		JLabel lbl_spoon = new JLabel("");
		lbl_spoon.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				JOptionPane.showMessageDialog(null, "식기를 주문합니다");
			}
		});
		lbl_spoon.setBounds(799, 342, 113, 111);
		frame.getContentPane().add(lbl_spoon);
		lbl_spoon.setHorizontalAlignment(SwingConstants.CENTER);

		JLabel label = new JLabel("");
		label.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				frame.dispose();
				MUKSAL_TotalMenu1.main(null);
				
				
			}
		});
		label.setBounds(26, 10, 52, 51);
		frame.getContentPane().add(label);

		JLabel label_1 = new JLabel("");
		label_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				frame.dispose();
				MUKSAL_TotalMenu1.main(null);
				
			}
		});
		label_1.setBounds(90, 14, 52, 43);
		frame.getContentPane().add(label_1);

		JLabel label_back = new JLabel(new ImageIcon(path + "Icon/last.jpg"));
		label_back.setBounds(0, 0, 963, 646);
		frame.getContentPane().add(label_back);

	}

}
