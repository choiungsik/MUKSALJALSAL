package UI;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.lang.reflect.Array;
import java.util.ArrayList;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.BevelBorder;
import javax.swing.table.DefaultTableModel;

import MUKSAL.OrdDAO;
import MUKSAL.PeopleDAO;

public class MUKSAL_TotalMenu1 {

	private JFrame frame;
	OrdDAO dao = new OrdDAO();
	String name = "";
	private JTable table_orderlist;
	public static String menuname[][] = new String[20][3];
	private int menunum;
	int cnt = 0;
	static int totalcnt = 1;
	static int totalscore = 0;
	int ea = 1;
	int ea1 = 1;
	private JTextField textField;
	private JTextField textField_1;
	int saladP;
	int SteakP;
	private JTable table;
	public static int ordcnt = 101;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MUKSAL_TotalMenu1 window = new MUKSAL_TotalMenu1();
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
	public MUKSAL_TotalMenu1() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {

		String path = MUKSAL_TotalMenu1.class.getResource("").getPath();
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.WHITE);
		frame.setBounds(500, 200, 979, 684);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		JLabel label = new JLabel("");
		label.setBounds(81, 0, 43, 49);
		frame.getContentPane().add(label);
		label.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {

				frame.dispose();
				MUKSAL_Table.main(null);

			}
		});

		JLabel label_13 = new JLabel("");
		label_13.setBounds(527, 27, 67, 54);
		frame.getContentPane().add(label_13);
		label_13.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				frame.dispose();
				MUKSAL_TotalMenu6기본메뉴.main(null);
			}
		});
		label_13.setHorizontalAlignment(SwingConstants.CENTER);

		JLabel label_9 = new JLabel("");
		label_9.setBounds(214, 27, 67, 54);
		frame.getContentPane().add(label_9);
		label_9.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				frame.dispose();
				MUKSAL_TotalMenu2추천.main(null);

			}
		});
		label_9.setHorizontalAlignment(SwingConstants.CENTER);

		JLabel lbl_cancle = new JLabel("");
		lbl_cancle.setBounds(859, 74, 92, 60);
		frame.getContentPane().add(lbl_cancle);
		lbl_cancle.setHorizontalAlignment(SwingConstants.CENTER);

		JLabel lbl_call = new JLabel("");
		lbl_call.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				frame.dispose();
				MUKSAL_직원호출.main(null);
			}
		});
		lbl_call.setBounds(859, 0, 92, 64);
		frame.getContentPane().add(lbl_call);
		lbl_call.setHorizontalAlignment(SwingConstants.CENTER);

		JLabel label_1 = new JLabel("");
		label_1.setBounds(22, 0, 43, 49);
		frame.getContentPane().add(label_1);

		JLabel lbl_pic = new JLabel("");
		lbl_pic.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {

				frame.dispose();
				MUKSAL_MenuDetail.main(null);

			}
		});
		lbl_pic.setBounds(250, 113, 52, 49);
		frame.getContentPane().add(lbl_pic);
		lbl_pic.setHorizontalAlignment(SwingConstants.CENTER);

		JLabel lbl_pic2 = new JLabel("");
		lbl_pic2.setBounds(509, 113, 52, 49);
		frame.getContentPane().add(lbl_pic2);
		lbl_pic2.setHorizontalAlignment(SwingConstants.CENTER);

		JLabel lblNewLabel_5 = new JLabel("");
		lblNewLabel_5.setBounds(722, 522, 114, 60);
		frame.getContentPane().add(lblNewLabel_5);
		lblNewLabel_5.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				frame.dispose();
				
				MUKSAL_Bills.main(null);
				OrdDAO dao = new OrdDAO();
				PeopleDAO people = new PeopleDAO();
			 dao.order(ordcnt++, MUKSAL_Login.id,people.getPeople2(MUKSAL_Login.id), menuname[0][0], ea,  SteakP*ea);
			 dao.order(ordcnt++, MUKSAL_Login.id,people.getPeople2(MUKSAL_Login.id), menuname[1][0], ea1, saladP*ea1 );	
			}
		});
		lblNewLabel_5.setHorizontalAlignment(SwingConstants.CENTER);

		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setBounds(136, 27, 67, 54);
		frame.getContentPane().add(lblNewLabel_2);
		lblNewLabel_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {

				frame.dispose();
				MUKSAL_성분체크.main(null);

			}
		});
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);

		JLabel label_10 = new JLabel("");
		label_10.setBounds(294, 27, 67, 54);
		frame.getContentPane().add(label_10);
		label_10.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				frame.dispose();
				MUKSAL_TotalMenu3스테이크.main(null);

			}
		});
		label_10.setHorizontalAlignment(SwingConstants.CENTER);

		JLabel label_11 = new JLabel("");
		label_11.setBounds(376, 27, 67, 54);
		frame.getContentPane().add(label_11);
		label_11.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {

				frame.dispose();
				MUKSAL_TotalMenu4파스타.main(null);

			}
		});
		label_11.setHorizontalAlignment(SwingConstants.CENTER);

		JLabel label_12 = new JLabel("");
		label_12.setBounds(453, 27, 62, 54);
		frame.getContentPane().add(label_12);
		label_12.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				frame.dispose();
				MUKSAL_TotalMenu5샐러드.main(null);

			}
		});

		label_12.setHorizontalAlignment(SwingConstants.CENTER);

		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(626, 177, 295, 297);
		frame.getContentPane().add(scrollPane);

		table = new JTable();

		table.setRowHeight(50);
		table.setFont(new Font("배달의민족 주아", Font.PLAIN, 15));
		table.setModel(new DefaultTableModel(new Object[][] {

		}, new String[] {

		}));
		scrollPane.setViewportView(table);

		JLabel lblsteak = new JLabel("");
		lblsteak.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {

				SteakP = 13000;
				menunum = 14;

				name = dao.Menuname(menunum);

				boolean isFind = false;

				for (int i = 0; i < cnt; i++) {
					if (menuname[i][0].equals(name)) {
						ea++;
						menuname[i][1] = Integer.parseInt(menuname[i][1]) + 1 + "";
						menuname[i][2] = SteakP * ea + "";
						isFind = true;

					}
				}

				if (!isFind) {
					menuname[cnt][0] = name;
					menuname[cnt][1] = "1";
					menuname[cnt][2] = Integer.toString(SteakP);
					cnt++;
					ea = 1;
				}

				table.setModel(new DefaultTableModel(menuname, new String[] { "", "", "" }));

				textField = new JTextField(Integer.toString(totalcnt));
				textField.setBounds(705, 484, 43, 21);
				textField.setFont(new Font("배달의민족 주아", Font.PLAIN, 15));
				frame.getContentPane().add(textField);
				textField.setColumns(10);

				totalcnt++;

				totalscore = ea1 * saladP + ea * SteakP;

				textField_1 = new JTextField(Integer.toString(totalscore));
				textField_1.setBounds(792, 484, 131, 21);
				textField_1.setFont(new Font("배달의민족 주아", Font.PLAIN, 15));
				frame.getContentPane().add(textField_1);
				textField_1.setColumns(10);

			}
		});
		lblsteak.setBounds(67, 161, 235, 156);
		frame.getContentPane().add(lblsteak);

		JLabel lbl_salad = new JLabel("");
		lbl_salad.addMouseListener(new MouseAdapter() {

			@Override
			public void mouseClicked(MouseEvent e) {
				saladP = 6000;
				menunum = 1;

				name = dao.Menuname(menunum);

				boolean isFind = false;

				for (int i = 0; i < cnt; i++) {
					if (menuname[i][0].equals(name)) {
						ea1++;
						menuname[i][1] = Integer.parseInt(menuname[i][1]) + 1 + "";
						menuname[i][2] = saladP * ea1 + "";
						isFind = true;

					}
				}

				if (!isFind) {
					menuname[cnt][0] = name;
					menuname[cnt][1] = "1";
					menuname[cnt][2] = Integer.toString(saladP);
					cnt++;
					ea1 = 1;
				}

				table.setModel(new DefaultTableModel(menuname, new String[] { "", "", "" }));

				textField = new JTextField(Integer.toString(totalcnt));
				textField.setBounds(705, 484, 43, 21);
				textField.setFont(new Font("배달의민족 주아", Font.PLAIN, 15));
				frame.getContentPane().add(textField);
				textField.setColumns(10);

				totalcnt++;

				totalscore = ea1 * saladP + ea * SteakP;

				textField_1 = new JTextField(Integer.toString(totalscore));
				textField_1.setBounds(792, 484, 131, 21);
				textField_1.setFont(new Font("배달의민족 주아", Font.PLAIN, 15));
				frame.getContentPane().add(textField_1);
				textField_1.setColumns(10);

			}
		});
		lbl_salad.setBounds(326, 161, 235, 156);
		frame.getContentPane().add(lbl_salad);

		JLabel lbl_pasta = new JLabel("");
		lbl_pasta.setBounds(67, 389, 235, 156);
		frame.getContentPane().add(lbl_pasta);

		JLabel lbl_water = new JLabel("");
		lbl_water.setBounds(326, 389, 235, 156);
		frame.getContentPane().add(lbl_water);

		boolean check1 = false;

		if (MUKSAL_성분체크.menuname.equals("등심 스테이크")) {
			check1 = true;
		}
		JLabel lbl_steakpic = new JLabel(new ImageIcon(path + "Icon/steak.png"));
		lbl_steakpic.setVisible(check1);
		lbl_steakpic.setBounds(74, 113, 50, 50);
		frame.getContentPane().add(lbl_steakpic);

		label_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				frame.dispose();
				MUKSAL_Table.main(null);
			}
		});

		boolean check2 = false;
		if (MUKSAL_성분체크.menuname2.equals("그린 샐러드")) {
			check2 = true;
		}

		JLabel lblNewLabel = new JLabel(new ImageIcon(path + "Icon/tomatoo.png"));
		lblNewLabel.setVisible(check2);
		lblNewLabel.setBounds(326, 113, 52, 49);
		frame.getContentPane().add(lblNewLabel);

		JLabel label_back = new JLabel(new ImageIcon(path + "Icon/order.jpg"));
		label_back.setBounds(0, 0, 963, 646);
		frame.getContentPane().add(label_back);

	}
}
