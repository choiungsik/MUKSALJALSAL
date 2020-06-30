package UI;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class MUKSAL_TotalMenu2추천 {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MUKSAL_TotalMenu2추천 window = new MUKSAL_TotalMenu2추천();
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
	public MUKSAL_TotalMenu2추천() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.WHITE);
		frame.setBounds(100, 100, 979, 684);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setLayout(null);
		panel.setBackground(Color.WHITE);
		panel.setBounds(12, 10, 939, 626);
		frame.getContentPane().add(panel);
		
		JPanel panel_1 = new JPanel();
		panel_1.setLayout(null);
		panel_1.setBounds(12, 10, 63, 64);
		panel.add(panel_1);
		
		JLabel label = new JLabel("\uC774\uC804 \uBC84\uD2BC");
		label.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				frame.dispose();
				MUKSAL_Table.main(null);
			}
		});
		label.setBounds(8, 13, 90, 34);
		panel_1.add(label);
		
		JPanel panel_2 = new JPanel();
		panel_2.setLayout(null);
		panel_2.setBounds(84, 10, 63, 64);
		panel.add(panel_2);
		
		JLabel label_1 = new JLabel("\uD648\uBC84\uD2BC");
		label_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				frame.dispose();
				MUKSAL_Table.main(null);
				
			}
		});
		label_1.setBounds(8, 14, 90, 34);
		panel_2.add(label_1);
		
		JPanel panel_3 = new JPanel();
		panel_3.setLayout(null);
		panel_3.setBounds(797, 470, 130, 68);
		panel.add(panel_3);
		
		JLabel label_2 = new JLabel("\uD638\uCD9C\uCDE8\uC18C");
		label_2.setHorizontalAlignment(SwingConstants.CENTER);
		label_2.setBounds(0, 10, 130, 49);
		panel_3.add(label_2);
		
		JPanel panel_4 = new JPanel();
		panel_4.setLayout(null);
		panel_4.setBounds(797, 548, 130, 68);
		panel.add(panel_4);
		
		JLabel label_3 = new JLabel("\uC9C1\uC6D0\uD638\uCD9C");
		label_3.setHorizontalAlignment(SwingConstants.CENTER);
		label_3.setBounds(0, 10, 130, 49);
		panel_4.add(label_3);
		
		JPanel panel_5 = new JPanel();
		panel_5.setLayout(null);
		panel_5.setBounds(12, 84, 684, 532);
		panel.add(panel_5);
		
		JLabel label_4 = new JLabel("\uBC30\uACBD");
		label_4.setHorizontalAlignment(SwingConstants.CENTER);
		label_4.setBounds(0, 184, 684, 179);
		panel_5.add(label_4);
		
		JLabel label_5 = new JLabel("\uBA54\uB274\uC0AC\uC9C4");
		label_5.setHorizontalAlignment(SwingConstants.CENTER);
		label_5.setBounds(10, 38, 191, 190);
		panel_5.add(label_5);
		
		JLabel label_6 = new JLabel("\uBA54\uB274\uC0AC\uC9C4");
		label_6.setHorizontalAlignment(SwingConstants.CENTER);
		label_6.setBounds(10, 304, 191, 190);
		panel_5.add(label_6);
		
		JLabel label_7 = new JLabel("\uBA54\uB274\uC0AC\uC9C4");
		label_7.setHorizontalAlignment(SwingConstants.CENTER);
		label_7.setBounds(244, 38, 191, 190);
		panel_5.add(label_7);
		
		JLabel label_8 = new JLabel("\uBA54\uB274\uC0AC\uC9C4");
		label_8.setHorizontalAlignment(SwingConstants.CENTER);
		label_8.setBounds(244, 304, 191, 190);
		panel_5.add(label_8);
		
		JLabel label_9 = new JLabel("\uBA54\uB274\uC0AC\uC9C4");
		label_9.setHorizontalAlignment(SwingConstants.CENTER);
		label_9.setBounds(481, 38, 191, 190);
		panel_5.add(label_9);
		
		JLabel label_10 = new JLabel("\uBA54\uB274\uC0AC\uC9C4");
		label_10.setHorizontalAlignment(SwingConstants.CENTER);
		label_10.setBounds(481, 304, 191, 190);
		panel_5.add(label_10);
		
		JPanel panel_6 = new JPanel();
		panel_6.setLayout(null);
		panel_6.setBounds(159, 40, 537, 64);
		panel.add(panel_6);
		
		JLabel label_11 = new JLabel("\uCE74\uD14C\uACE0\uB9AC");
		label_11.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				frame.dispose();
				MUKSAL_TotalMenu1.main(null);
			}
		});
		label_11.setHorizontalAlignment(SwingConstants.CENTER);
		label_11.setBounds(0, 0, 78, 54);
		panel_6.add(label_11);
		
		JLabel label_12 = new JLabel("\uCD94\uCC9C!");
		label_12.setHorizontalAlignment(SwingConstants.CENTER);
		label_12.setBounds(87, 0, 78, 54);
		panel_6.add(label_12);
		
		JLabel label_13 = new JLabel("\uCE74\uD14C\uACE0\uB9AC");
		label_13.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				frame.dispose();
				MUKSAL_TotalMenu3스테이크.main(null);
			}
		});
		label_13.setHorizontalAlignment(SwingConstants.CENTER);
		label_13.setBounds(174, 0, 78, 54);
		panel_6.add(label_13);
		
		JLabel label_14 = new JLabel("\uCE74\uD14C\uACE0\uB9AC");
		label_14.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				frame.dispose();
				MUKSAL_TotalMenu4파스타.main(null);
			}
		});
		label_14.setHorizontalAlignment(SwingConstants.CENTER);
		label_14.setBounds(264, 0, 78, 54);
		panel_6.add(label_14);
		
		JLabel label_15 = new JLabel("\uCE74\uD14C\uACE0\uB9AC");
		label_15.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				frame.dispose();
				MUKSAL_TotalMenu5샐러드.main(null);
			}
		});
		label_15.setHorizontalAlignment(SwingConstants.CENTER);
		label_15.setBounds(355, 0, 78, 54);
		panel_6.add(label_15);
		
		JLabel label_16 = new JLabel("\uCE74\uD14C\uACE0\uB9AC");
		label_16.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				frame.dispose();
				MUKSAL_TotalMenu6기본메뉴.main(null);
			}
		});
		label_16.setHorizontalAlignment(SwingConstants.CENTER);
		label_16.setBounds(447, 0, 78, 54);
		panel_6.add(label_16);
		
		JPanel panel_7 = new JPanel();
		panel_7.setLayout(null);
		panel_7.setBounds(708, 40, 231, 415);
		panel.add(panel_7);
		
		JLabel label_19 = new JLabel("\uBC30\uACBD");
		label_19.setVerticalAlignment(SwingConstants.TOP);
		label_19.setHorizontalAlignment(SwingConstants.CENTER);
		label_19.setBounds(12, 10, 207, 347);
		panel_7.add(label_19);
		
		JLabel label_17 = new JLabel("\uC8FC\uBB38\uC11C");
		label_17.setHorizontalAlignment(SwingConstants.CENTER);
		label_17.setBounds(12, 70, 207, 266);
		panel_7.add(label_17);
		
		JLabel label_18 = new JLabel("\uC8FC\uBB38\uD558\uAE30\uBC84\uD2BC");
		label_18.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				frame.dispose();
				MUKSAL_Bills.main(null);
				
				
			}
		});
		label_18.setHorizontalAlignment(SwingConstants.CENTER);
		label_18.setBounds(105, 360, 114, 45);
		panel_7.add(label_18);
	}

}
