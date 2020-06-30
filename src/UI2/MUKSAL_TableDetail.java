package UI2;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableModel;

import MUKSAL.OrdDAO;
import MUKSAL.OrderVO;
import UI.MUKSAL_TotalMenu1;

public class MUKSAL_TableDetail {

	private JFrame frame;
	private JTable table;
	private JTable table_1;
	static int cnt = 0;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MUKSAL_TableDetail window = new MUKSAL_TableDetail();
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
	public MUKSAL_TableDetail() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {

		String path = MUKSAL_TableDetail.class.getResource("").getPath();
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(255, 255, 255));
		frame.setBounds(500, 200, 979, 684);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		JLabel label = new JLabel("");
		label.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {

				frame.dispose();
				MUKSAL_업체.main(null);
				;

			}
		});
		label.setBounds(33, 10, 43, 42);
		frame.getContentPane().add(label);

		JLabel label_1 = new JLabel("");
		label_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {

				frame.dispose();
				MUKSAL_오픈Table.main(null);
			}
		});
		label_1.setBounds(99, 10, 43, 42);
		frame.getContentPane().add(label_1);

		JLabel lbl_테이블번호 = new JLabel("1");
		lbl_테이블번호.setFont(new Font("배달의민족 주아", Font.PLAIN, 29));
		lbl_테이블번호.setHorizontalAlignment(SwingConstants.CENTER);
		lbl_테이블번호.setBounds(359, 0, 62, 52);
		frame.getContentPane().add(lbl_테이블번호);

		JLabel lbl_결제bnt = new JLabel("");
		lbl_결제bnt.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {

				JOptionPane.showMessageDialog(null, "결제가 완료되었습니다.","결제",JOptionPane.INFORMATION_MESSAGE);
				cnt++;
				frame.dispose();
				MUKSAL_오픈Table.main(null);
				

			}
		});
		lbl_결제bnt.setBounds(426, 526, 113, 59);
		frame.getContentPane().add(lbl_결제bnt);
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(74, 137, 813, 83);
		frame.getContentPane().add(scrollPane);

		table = new JTable();
		table.setRowHeight(70);
		table.setFont(new Font("배달의민족 주아", Font.PLAIN, 35));
		OrdDAO orddao = new OrdDAO();
		ArrayList<OrderVO> vo = new ArrayList<OrderVO>();
		vo = orddao.T_CURRENT_SITUATION(MUKSAL_TotalMenu1.ordcnt);
		table.setModel(new DefaultTableModel(new Object[][] 
				{{vo.get(0).getMenuname(),vo.get(0).getPrice(),vo.get(0).getCnt()}},
				new String[] { "", "", "" }));
		scrollPane.setViewportView(table);
		
		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(74, 232, 813, 83);
		frame.getContentPane().add(scrollPane_1);
		
		table_1 = new JTable();
		table_1.setRowHeight(70);
		table_1.setFont(new Font("배달의민족 주아", Font.PLAIN, 35));
		ArrayList<OrderVO> vo2 = new ArrayList<OrderVO>();
		vo2 = orddao.T_CURRENT_SITUATION(MUKSAL_TotalMenu1.ordcnt+1);
		table_1.setModel(new DefaultTableModel(
			new Object[][] {
				{vo2.get(0).getMenuname(),vo2.get(0).getPrice(),vo2.get(0).getCnt()}},
			new String[] {
				"", "", ""
			}
		));
		scrollPane_1.setViewportView(table_1);
		
				JLabel label_back = new JLabel(new ImageIcon(path + "Icon/big.jpg"));
				label_back.setBounds(0, 0, 963, 646);
				frame.getContentPane().add(label_back);

	}

}
