package UI2;

import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

import MUKSAL.CheckidDAO;
import MUKSAL.OrdDAO;
import MUKSAL.OrderVO;
import MUKSAL.PeopleDAO;
import MUKSAL.TimecheckDAO;
import UI.MUKSAL_Login;
import UI.MUKSAL_MenuDetail;
import UI.MUKSAL_TotalMenu1;
import UI.MUKSAL_인원수;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.awt.Font;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.text.StyledEditorKit.ForegroundAction;

public class MUKSAL_오픈Table {

	public JLabel lbl_1번수;
	public JLabel lbl_1번일반수;
	public JLabel lbl_2번수;
	public JLabel lbl_2번일반수;
	private JFrame frame;
	PeopleDAO people = new PeopleDAO();
	private JTable table;
	private JTable table_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MUKSAL_오픈Table window = new MUKSAL_오픈Table();
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
	public MUKSAL_오픈Table() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {

		String path = MUKSAL_오픈Table.class.getResource("").getPath();

		CheckidDAO dao = new CheckidDAO();

		int[][] people1 = people.getPeople("table1");

		frame = new JFrame();
		frame.getContentPane().setBackground(Color.WHITE);
		frame.setBounds(500, 200, 979, 684);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		lbl_1번수 = new JLabel(people1[0][0] + "");
		lbl_1번수.setFont(new Font("배달의민족 주아", Font.PLAIN, 25));
		lbl_1번수.setBounds(92, 271, 47, 30);
		frame.getContentPane().add(lbl_1번수);
		lbl_1번수.setHorizontalAlignment(SwingConstants.CENTER);

		lbl_1번일반수 = new JLabel(people1[0][1] + "");
		lbl_1번일반수.setFont(new Font("배달의민족 주아", Font.PLAIN, 25));
		lbl_1번일반수.setBounds(188, 271, 47, 30);
		frame.getContentPane().add(lbl_1번일반수);
		lbl_1번일반수.setHorizontalAlignment(SwingConstants.CENTER);

		int[][] people2 = people.getPeople("table2");

		lbl_2번수 = new JLabel(people2[1][0] + "");
		lbl_2번수.setFont(new Font("배달의민족 주아", Font.PLAIN, 25));
		lbl_2번수.setHorizontalAlignment(SwingConstants.CENTER);
		lbl_2번수.setBounds(427, 271, 47, 30);
		frame.getContentPane().add(lbl_2번수);

		lbl_2번일반수 = new JLabel(people2[1][1] + "");
		lbl_2번일반수.setFont(new Font("배달의민족 주아", Font.PLAIN, 25));
		lbl_2번일반수.setHorizontalAlignment(SwingConstants.CENTER);
		lbl_2번일반수.setBounds(520, 271, 47, 30);
		frame.getContentPane().add(lbl_2번일반수);

		JLabel label = new JLabel("");
		label.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {

				frame.dispose();
				MUKSAL_Login.main(null);

			}
		});
		label.setBounds(30, 22, 43, 42);
		frame.getContentPane().add(label);

		JLabel label_1 = new JLabel("");
		label_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				frame.dispose();
				MUKSAL_업체.main(null);

			}
		});
		label_1.setBounds(96, 22, 43, 42);
		frame.getContentPane().add(label_1);

		JLabel bnt_1 = new JLabel("");
		bnt_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {

				frame.dispose();
				MUKSAL_TableDetail.main(null);

			}
		});
		bnt_1.setBounds(30, 112, 275, 203);
		frame.getContentPane().add(bnt_1);

		JLabel bnt_2 = new JLabel("");
		bnt_2.setBounds(351, 112, 275, 203);
		frame.getContentPane().add(bnt_2);

		JLabel bnt_3 = new JLabel("");
		bnt_3.setBounds(657, 112, 275, 203);
		frame.getContentPane().add(bnt_3);

		JLabel bnt_4 = new JLabel("");
		bnt_4.setBounds(30, 367, 275, 203);
		frame.getContentPane().add(bnt_4);

		JLabel bnt_5 = new JLabel("");
		bnt_5.setBounds(351, 367, 275, 203);
		frame.getContentPane().add(bnt_5);

		JLabel bnt_6 = new JLabel("");
		bnt_6.setBounds(657, 367, 275, 203);
		frame.getContentPane().add(bnt_6);

		JLabel label_2 = new JLabel("0");
		label_2.setFont(new Font("배달의민족 주아", Font.PLAIN, 25));
		label_2.setHorizontalAlignment(SwingConstants.CENTER);
		label_2.setBounds(734, 271, 47, 30);
		frame.getContentPane().add(label_2);

		JLabel label_3 = new JLabel("0");
		label_3.setFont(new Font("배달의민족 주아", Font.PLAIN, 25));
		label_3.setHorizontalAlignment(SwingConstants.CENTER);
		label_3.setBounds(832, 271, 47, 30);
		frame.getContentPane().add(label_3);

		JLabel label_4 = new JLabel("0");
		label_4.setFont(new Font("배달의민족 주아", Font.PLAIN, 25));
		label_4.setHorizontalAlignment(SwingConstants.CENTER);
		label_4.setBounds(92, 527, 47, 30);
		frame.getContentPane().add(label_4);

		JLabel label_5 = new JLabel("0");
		label_5.setFont(new Font("배달의민족 주아", Font.PLAIN, 25));
		label_5.setHorizontalAlignment(SwingConstants.CENTER);
		label_5.setBounds(203, 527, 47, 30);
		frame.getContentPane().add(label_5);

		JLabel label_6 = new JLabel("0");
		label_6.setFont(new Font("배달의민족 주아", Font.PLAIN, 25));
		label_6.setHorizontalAlignment(SwingConstants.CENTER);
		label_6.setBounds(427, 527, 47, 30);
		frame.getContentPane().add(label_6);

		JLabel label_7 = new JLabel("0");
		label_7.setFont(new Font("배달의민족 주아", Font.PLAIN, 25));
		label_7.setHorizontalAlignment(SwingConstants.CENTER);
		label_7.setBounds(520, 527, 47, 30);
		frame.getContentPane().add(label_7);

		JLabel label_8 = new JLabel("0");
		label_8.setFont(new Font("배달의민족 주아", Font.PLAIN, 25));
		label_8.setHorizontalAlignment(SwingConstants.CENTER);
		label_8.setBounds(734, 527, 47, 30);
		frame.getContentPane().add(label_8);

		JLabel label_9 = new JLabel("0");
		label_9.setFont(new Font("배달의민족 주아", Font.PLAIN, 25));
		label_9.setHorizontalAlignment(SwingConstants.CENTER);
		label_9.setBounds(832, 527, 47, 30);
		frame.getContentPane().add(label_9);

		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(60, 130, 241, 57);
		frame.getContentPane().add(scrollPane);
		OrdDAO orddao = new OrdDAO();

		table = new JTable();
		table.setRowHeight(50);
		table.setFont(new Font("배달의민족 주아", Font.PLAIN, 18));
		ArrayList<OrderVO> vo = new ArrayList<OrderVO>();
		vo = orddao.T_CURRENT_SITUATION(MUKSAL_TotalMenu1.ordcnt);
		table.setModel(new DefaultTableModel(new Object[][] { { vo.get(0).getMenuname(), vo.get(0).getPrice() }, },
				new String[] { "", "" }));
		scrollPane.setViewportView(table);

		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(60, 197, 241, 57);
		frame.getContentPane().add(scrollPane_1);

		table_1 = new JTable();
		table_1.setRowHeight(50);
		table_1.setFont(new Font("배달의민족 주아", Font.PLAIN, 18));
		ArrayList<OrderVO> vo2 = new ArrayList<OrderVO>();
		vo2 = orddao.T_CURRENT_SITUATION(MUKSAL_TotalMenu1.ordcnt + 1);
		table_1.setModel(new DefaultTableModel(new Object[][] { { vo2.get(0).getMenuname(), vo2.get(0).getPrice() }, },
				new String[] { "", "" }));
		scrollPane_1.setViewportView(table_1);

		if (MUKSAL_TableDetail.cnt == 1) {
			scrollPane.setVisible(false);
			scrollPane_1.setVisible(false);
			table.setVisible(false);
			table_1.setVisible(false);
			lbl_1번수.setText("0");
			lbl_1번일반수.setText("0");
		}

		JLabel lbl_혼잡 = new JLabel("");
		lbl_혼잡.setHorizontalAlignment(SwingConstants.CENTER);
		lbl_혼잡.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				
				TimecheckDAO timecheck = new TimecheckDAO();
				timecheck.timeCheckDelete();
				timecheck.timeCheck(1);
				
			}
		});
		lbl_혼잡.setBounds(682, 0, 117, 83);
		frame.getContentPane().add(lbl_혼잡);

		JLabel lbl_원활 = new JLabel("");
		lbl_원활.setHorizontalAlignment(SwingConstants.CENTER);
		lbl_원활.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				
				TimecheckDAO timecheck = new TimecheckDAO();
				timecheck.timeCheckDelete();
				timecheck.timeCheck(2);

			}
		});
		lbl_원활.setBounds(812, 0, 108, 83);
		frame.getContentPane().add(lbl_원활);
		
		JLabel lblNewLabel = new JLabel("\uC544\uB3D9");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("배달의민족 주아", Font.PLAIN, 23));
		lblNewLabel.setBounds(46, 271, 53, 30);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel label_10 = new JLabel("\uC77C\uBC18");
		label_10.setHorizontalAlignment(SwingConstants.CENTER);
		label_10.setFont(new Font("배달의민족 주아", Font.PLAIN, 23));
		label_10.setBounds(147, 271, 53, 30);
		frame.getContentPane().add(label_10);
		JLabel label_back = new JLabel(new ImageIcon(path + "Icon/statement11.jpg"));
		label_back.setBounds(0, 0, 963, 646);
		frame.getContentPane().add(label_back);
	}
}
