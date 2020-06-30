package UI2;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;

import MUKSAL.SalesDAO;
import MUKSAL.SalesVO;
import javax.swing.table.DefaultTableModel;
import javax.swing.SwingConstants;

public class MUKSAL_static{

	private JFrame frame;
	private JTextField text_orddate;
	private JTable table;
	ArrayList<SalesVO> list;
	private JTable table_1;
	private JScrollPane scrollPane;
	private JTable table_2;
	ArrayList<SalesVO> SalesList = new ArrayList<SalesVO>();
	SalesDAO salesdao = new SalesDAO();

	String col[] = { "메뉴번호", "가격" };
	int[][] salesDate = new int[SalesList.size()][2];
	private JTable table_3;
	private JTable table_4;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MUKSAL_static window = new MUKSAL_static();
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
	public MUKSAL_static() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		String path = MUKSAL_오픈Table.class.getResource("").getPath();
		
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.WHITE);
		frame.setBounds(500, 200, 979, 684);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		JPanel panel = new JPanel();
		panel.setBounds(131, 90, 723, 534);
		frame.getContentPane().add(panel);
		panel.setLayout(null);

		text_orddate = new JTextField();
		text_orddate.setHorizontalAlignment(SwingConstants.CENTER);
		text_orddate.setFont(new Font("배달의민족 주아", Font.PLAIN, 27));
		text_orddate.setBounds(102, 23, 335, 62);
		panel.add(text_orddate);
		text_orddate.setColumns(10);

		JButton button_serch = new JButton("\uAC80\uC0C9");
		button_serch.setFont(new Font("배달의민족 주아", Font.PLAIN, 26));
		button_serch.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

				text_orddate.getText();
			}
		});
		button_serch.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {

				scrollPane = new JScrollPane();
				scrollPane.setBounds(100, 100, 500, 300);
				panel.add(scrollPane);

				scrollPane.setViewportView(tableset());

			}
		});
		button_serch.setBounds(480, 23, 172, 62);
		panel.add(button_serch);
		
		
		JLabel label_back = new JLabel(new ImageIcon(path + "Icon/static.jpg"));
		label_back.setBounds(0, 0, 963, 646);
		frame.getContentPane().add(label_back);

	}

	public JTable tableset() {

		SalesDAO sales = new SalesDAO();
		SimpleDateFormat transFormat = new SimpleDateFormat("yyyy-MM-dd");
		String date = text_orddate.getText();

		java.util.Date utilDate;
		try {
			utilDate = transFormat.parse(date);
			java.sql.Date sqlDate = new java.sql.Date(utilDate.getTime());
			list = sales.Calculate(sqlDate);

		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		String[] column = { "메뉴번호", "가격" };
		Integer[][] row = new Integer[list.size()][2];

		for (int i = 0; i < row.length; i++) {
			row[i][0] = list.get(i).getMenuNum();
			row[i][1] = list.get(i).getPrice();
		}

		// DefaultTableModel model = new DefaultTableModel(row,column);

		JTable table = new JTable(row, column);
		table.setRowHeight(30);
		table.setFont(new Font("배달의민족 주아", Font.PLAIN, 20));
		
		return table;


	}
}