package UI;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

import MUKSAL.ExplainDAO;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class MUKSAL_MenuDetail {

	private JFrame frame;
	ExplainDAO dao = new ExplainDAO();
	private String Steak = null;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MUKSAL_MenuDetail window = new MUKSAL_MenuDetail();
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
	public MUKSAL_MenuDetail() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {

		String path = MUKSAL_MenuDetail.class.getResource("").getPath();

		frame = new JFrame();
		frame.getContentPane().setBackground(Color.WHITE);
		frame.setBounds(500, 200, 979, 684);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		Steak = dao.explain("등심 스테이크");

		JLabel lblNewLabel_1 = new JLabel(Steak);
		lblNewLabel_1.setFont(new Font("배달의민족 주아", Font.PLAIN, 35));
		lblNewLabel_1.setBounds(498, 160, 399, 340);
		frame.getContentPane().add(lblNewLabel_1);
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);

		JLabel label = new JLabel("");
		label.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {

				frame.dispose();
				MUKSAL_TotalMenu1.main(null);
			}
		});
		label.setBounds(97, 10, 43, 46);
		frame.getContentPane().add(label);

		JLabel label_1 = new JLabel("");
		label_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				frame.dispose();
				MUKSAL_Table.main(null);

			}
		});
		label_1.setBounds(31, 10, 43, 46);
		frame.getContentPane().add(label_1);

		JLabel label_back = new JLabel(new ImageIcon(path + "Icon/explain.jpg"));
		label_back.setBounds(0, 0, 963, 646);
		frame.getContentPane().add(label_back);

	}

}
