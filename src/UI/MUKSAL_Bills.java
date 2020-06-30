package UI;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableModel;

import MUKSAL.TimecheckDAO;
import UI2.MUKSAL_오픈Table;

public class MUKSAL_Bills {

	private JFrame frame;
	private JTable table;
	int cnt = 0;
	int totalcnt = 1;
	int totalscore = 0;
	int ea = 1;
	int ea1 = 1;
	private JTextField textField;
	private JTextField textField_1;
	int saladP;
	int SteakP;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MUKSAL_Bills window = new MUKSAL_Bills();
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
	public MUKSAL_Bills() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {

		String path = MUKSAL_Bills.class.getResource("").getPath();

		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(255, 255, 255));
		frame.setBounds(500, 200, 979, 684);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setBounds(171, 519, 138, 69);
		frame.getContentPane().add(lblNewLabel_2);
		lblNewLabel_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {

				frame.dispose();
				MUKSAL_TotalMenu1.main(null);
			}
		});
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);

		JLabel label_8 = new JLabel("");
		label_8.setBounds(368, 526, 138, 62);
		frame.getContentPane().add(label_8);
		label_8.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				frame.dispose();
				MUKSAL_TotalMenu6기본메뉴.main(null);

			}
		});
		label_8.setHorizontalAlignment(SwingConstants.CENTER);

		JLabel label_9 = new JLabel("");
		label_9.setBounds(861, 23, 63, 43);
		frame.getContentPane().add(label_9);
		label_9.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {

				frame.dispose();
				MUKSAL_Final.main(null);

			}
		});
		label_9.setHorizontalAlignment(SwingConstants.CENTER);

		JLabel lbl_Status = new JLabel("");
		lbl_Status.setBounds(683, 221, 234, 152);
		lbl_Status.setFont(new Font("배달의민족 주아", Font.PLAIN, 20));
		frame.getContentPane().add(lbl_Status);
		lbl_Status.setHorizontalAlignment(SwingConstants.CENTER);

		TimecheckDAO timecheck = new TimecheckDAO();
		int timecheck2 = timecheck.timeCheckSelect();

		if (timecheck2 == 1) {

			lbl_Status.setText("현재 매장이 혼잡합니다.");

		} else if (timecheck2 == 2) {

			lbl_Status.setText("현재 매장상태가 원활합니다.");
		}

		JLabel label_2 = new JLabel("");
		label_2.setBounds(683, 567, 234, 69);
		frame.getContentPane().add(label_2);
		label_2.setHorizontalAlignment(SwingConstants.CENTER);

		JLabel label_3 = new JLabel("");
		label_3.setBounds(683, 466, 234, 69);
		frame.getContentPane().add(label_3);
		label_3.setHorizontalAlignment(SwingConstants.CENTER);

		JLabel label = new JLabel("");
		label.setBounds(97, 10, 43, 46);
		frame.getContentPane().add(label);

		JLabel label_1 = new JLabel("");
		label_1.setBounds(32, 10, 43, 46);
		frame.getContentPane().add(label_1);

		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(161, 198, 323, 264);
		frame.getContentPane().add(scrollPane);

		table = new JTable();
		table.setRowHeight(50);
		table.setFont(new Font("배달의민족 주아", Font.PLAIN, 15));
		table.setModel(new DefaultTableModel(MUKSAL_TotalMenu1.menuname, new String[] { "", "", "" }));

		scrollPane.setViewportView(table);

		label_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {

				MUKSAL_Table.main(null);

			}
		});
		label.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {

				frame.dispose();
				MUKSAL_TotalMenu1.main(null);

			}
		});

		JLabel lbl_cnt = new JLabel(Integer.toString(MUKSAL_TotalMenu1.totalcnt - 1));
		lbl_cnt.setHorizontalAlignment(SwingConstants.CENTER);
		lbl_cnt.setFont(new Font("배달의민족 주아", Font.PLAIN, 25));
		lbl_cnt.setBounds(254, 466, 63, 43);
		frame.getContentPane().add(lbl_cnt);

		JLabel lbl_money = new JLabel(Integer.toString(MUKSAL_TotalMenu1.totalscore));
		lbl_money.setFont(new Font("배달의민족 주아", Font.PLAIN, 25));
		lbl_money.setHorizontalAlignment(SwingConstants.CENTER);
		lbl_money.setBounds(368, 466, 122, 43);
		frame.getContentPane().add(lbl_money);

		JLabel label_back = new JLabel(new ImageIcon(path + "Icon/orderlist.jpg"));
		label_back.setBounds(0, 0, 963, 646);
		frame.getContentPane().add(label_back);
	}
}
