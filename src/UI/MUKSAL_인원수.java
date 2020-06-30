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

import MUKSAL.CheckidDAO;
import MUKSAL.PeopleDAO;
import UI2.MUKSAL_오픈Table;

import java.awt.Font;

public class MUKSAL_인원수 {

	private JFrame frame;

	int people1 = 0;
	int people2 = 0;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MUKSAL_인원수 window = new MUKSAL_인원수();
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
	public MUKSAL_인원수() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {

		String path = MUKSAL_인원수.class.getResource("").getPath();

		frame = new JFrame();
		frame.getContentPane().setBackground(Color.WHITE);
		frame.getContentPane().setLayout(null);

		JLabel label = new JLabel("");
		label.setBounds(90, 10, 52, 46);
		frame.getContentPane().add(label);
		label.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {

				MUKSAL_Table.main(null);
				frame.dispose();
			}
		});

		JLabel label_1 = new JLabel("");
		label_1.setBounds(31, 10, 48, 45);
		frame.getContentPane().add(label_1);
		label_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				MUKSAL_Table.main(null);
				frame.dispose();

			}
		});
		frame.setBounds(500, 200, 979, 684);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		JLabel lbl_cntbnt = new JLabel(people1 + "");
		lbl_cntbnt.setFont(new Font("배달의민족 주아", Font.PLAIN, 25));
		lbl_cntbnt.setBounds(184, 315, 134, 60);
		frame.getContentPane().add(lbl_cntbnt);
		lbl_cntbnt.setHorizontalAlignment(SwingConstants.CENTER);

		JLabel lbl_plusbnt = new JLabel("");
		lbl_plusbnt.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {

				people1 += 1;
				lbl_cntbnt.setText(people1 + "");

			}
		});
		lbl_plusbnt.setBounds(348, 322, 57, 47);
		frame.getContentPane().add(lbl_plusbnt);
		lbl_plusbnt.setHorizontalAlignment(SwingConstants.CENTER);

		JLabel lbl_minusbnt = new JLabel("");
		lbl_minusbnt.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {

				if (people1 > 0) {
					people1 -= 1;
				}
				lbl_cntbnt.setText(people1 + "");

			}
		});
		lbl_minusbnt.setBounds(102, 322, 57, 47);
		frame.getContentPane().add(lbl_minusbnt);
		lbl_minusbnt.setHorizontalAlignment(SwingConstants.CENTER);

		JLabel label_3 = new JLabel(people2 + "");
		label_3.setFont(new Font("배달의민족 주아", Font.PLAIN, 25));
		label_3.setHorizontalAlignment(SwingConstants.CENTER);
		label_3.setBounds(647, 315, 134, 60);
		frame.getContentPane().add(label_3);

		JLabel lbl_minusbnt2 = new JLabel("");
		lbl_minusbnt2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {

				if (people2 > 0) {
					people2 -= 1;
				}
				label_3.setText(people2 + "");

			}
		});
		lbl_minusbnt2.setHorizontalAlignment(SwingConstants.CENTER);
		lbl_minusbnt2.setBounds(564, 322, 57, 47);
		frame.getContentPane().add(lbl_minusbnt2);

		JLabel lbl_plusbnt2 = new JLabel("");
		lbl_plusbnt2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {

				people2 += 1;
				label_3.setText(people2 + "");

			}
		});
		lbl_plusbnt2.setHorizontalAlignment(SwingConstants.CENTER);
		lbl_plusbnt2.setBounds(810, 322, 57, 47);
		frame.getContentPane().add(lbl_plusbnt2);

		JLabel lbl_enter = new JLabel("");
		lbl_enter.setBounds(425, 526, 114, 60);
		frame.getContentPane().add(lbl_enter);
		lbl_enter.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {

				if (people1 == 0 && people2 == 0) {
					JOptionPane.showMessageDialog(null, "인원수를 선택하세요");
				} else {
					PeopleDAO people = new PeopleDAO();
					people.deletePeople(MUKSAL_Login.id);
					people.setInsert(people1, people2, MUKSAL_Login.id);
					frame.dispose();
					MUKSAL_TotalMenu1.main(null);
				}

			}
		});
		lbl_enter.setHorizontalAlignment(SwingConstants.CENTER);

		JLabel label_back = new JLabel(new ImageIcon(path + "Icon/people.jpg"));
		label_back.setBounds(0, 0, 963, 646);
		frame.getContentPane().add(label_back);

	}

}
