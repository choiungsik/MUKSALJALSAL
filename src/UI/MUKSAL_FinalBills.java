package UI;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import java.awt.Font;

public class MUKSAL_FinalBills {

	private JFrame frame;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MUKSAL_FinalBills window = new MUKSAL_FinalBills();
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
	public MUKSAL_FinalBills() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {

		String path = MUKSAL_FinalBills.class.getResource("").getPath();

		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(255, 255, 255));
		frame.setBounds(500, 200, 979, 684);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		JLabel label = new JLabel("");
		label.setBounds(100, 10, 43, 44);
		frame.getContentPane().add(label);

		JLabel label_1 = new JLabel("");
		label_1.setBounds(30, 10, 43, 44);
		frame.getContentPane().add(label_1);

		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(229, 232, 552, 304);
		frame.getContentPane().add(scrollPane);

		table = new JTable();
		table.setRowHeight(50);
		table.setFont(new Font("배달의민족 주아", Font.PLAIN, 20));
		table.setModel(new DefaultTableModel(MUKSAL_TotalMenu1.menuname, new String[] { "", "", "" }));
		scrollPane.setViewportView(table);
		
		JLabel lblNewLabel = new JLabel(Integer.toString(MUKSAL_TotalMenu1.totalscore));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("배달의민족 주아", Font.PLAIN, 25));
		lblNewLabel.setBounds(477, 546, 240, 44);
		frame.getContentPane().add(lblNewLabel);
		
				JLabel label_back = new JLabel(new ImageIcon(path + "Icon/finalbills.jpg"));
				label_back.setBounds(0, 0, 963, 646);
				frame.getContentPane().add(label_back);
		label_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				frame.dispose();
				MUKSAL_Table.main(null);

			}
		});
		label.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				frame.dispose();
				MUKSAL_Final.main(null);

			}
		});

	}
}
