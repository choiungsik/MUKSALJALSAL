package UI;

import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.ImageIcon;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

import MUKSAL.IngredientDAO;
import MUKSAL.IngredientVO;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import javax.swing.Icon;
import java.awt.event.ContainerAdapter;
import java.awt.event.ContainerEvent;

public class MUKSAL_����üũ {

	private JFrame frame;
	boolean check = true;
	private JLabel lbl_���з�;
	static String menuname = "";
	static String menuname2 = "";
	String result;
	String result2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MUKSAL_����üũ window = new MUKSAL_����üũ();
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
	public MUKSAL_����üũ() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {

		String path = MUKSAL_����üũ.class.getResource("").getPath();

		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(255, 255, 255));
		frame.setBounds(500, 200, 979, 684);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		JLabel label_1 = new JLabel("");
		label_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {

				frame.dispose();
				MUKSAL_Table.main(null);

			}
		});
		label_1.setBounds(26, 10, 49, 49);
		frame.getContentPane().add(label_1);

		JLabel label = new JLabel("");
		label.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {

				frame.dispose();
				MUKSAL_TotalMenu1.main(null);

			}
		});
		label.setBounds(98, 13, 43, 42);
		frame.getContentPane().add(label);

		JLabel lbl_��� = new JLabel("");

		lbl_���.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {

				int ingred = 2;
				IngredientDAO ingredDAO = new IngredientDAO();
				ArrayList<IngredientVO> vo = ingredDAO.ingred(ingred);
				result = vo.get(0).getMenuname2();
				lbl_���.setOpaque(check);
				lbl_���.setBackground(Color.PINK);

			}
		});

		lbl_���.setBounds(661, 556, 21, 16);
		frame.getContentPane().add(lbl_���);

		JLabel lbl_�丶�� = new JLabel("");
		lbl_�丶��.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {

				int ingred = 6;
				IngredientDAO ingredDAO = new IngredientDAO();
				ArrayList<IngredientVO> vo = ingredDAO.ingred(ingred);
				result2 = vo.get(0).getMenuname3();
				lbl_�丶��.setOpaque(check);
				lbl_�丶��.setBackground(Color.PINK);
			}
		});
		lbl_�丶��.setBounds(661, 316, 21, 16);
		frame.getContentPane().add(lbl_�丶��);

		JLabel lbl_�а��� = new JLabel("");
		lbl_�а���.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {

				lbl_�а���.setOpaque(check);
				lbl_�а���.setBackground(Color.PINK);
			}
		});
		lbl_�а���.setBounds(393, 556, 21, 16);
		frame.getContentPane().add(lbl_�а���);

		JLabel lbl_���� = new JLabel("");
		lbl_����.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {

				lbl_����.setOpaque(check);
				lbl_����.setBackground(Color.PINK);

			}
		});
		lbl_����.setBounds(138, 556, 21, 16);
		frame.getContentPane().add(lbl_����);

		lbl_���з� = new JLabel("");
		lbl_���з�.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {

				lbl_���з�.setOpaque(check);
				lbl_���з�.setBackground(Color.PINK);

			}
		});
		lbl_���з�.setBounds(395, 315, 27, 16);
		frame.getContentPane().add(lbl_���з�);

		JLabel lbl_�� = new JLabel("");
		lbl_��.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				lbl_��.setOpaque(check);
				lbl_��.setBackground(Color.PINK);

			}
		});
		lbl_��.setBounds(138, 316, 21, 16);
		frame.getContentPane().add(lbl_��);

		JLabel lbl_��� = new JLabel("");
		lbl_���.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {

				lbl_���.setOpaque(check);
				lbl_���.setBackground(Color.white);
				lbl_�а���.setOpaque(check);
				lbl_�а���.setBackground(Color.white);
				lbl_����.setOpaque(check);
				lbl_����.setBackground(Color.white);
				lbl_���з�.setOpaque(check);
				lbl_���з�.setBackground(Color.white);
				lbl_��.setOpaque(check);
				lbl_��.setBackground(Color.white);
				lbl_�丶��.setOpaque(check);
				lbl_�丶��.setBackground(Color.white);

			}
		});
		lbl_���.setHorizontalAlignment(SwingConstants.CENTER);
		lbl_���.setBounds(793, 205, 138, 74);
		frame.getContentPane().add(lbl_���);

		JLabel lbl_Ȯ�� = new JLabel("");
		lbl_Ȯ��.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {

				menuname = result+"";
				menuname2 = result2+"";

				frame.dispose();
				MUKSAL_TotalMenu1.main(null);
			}
		});
		lbl_Ȯ��.setBounds(793, 340, 138, 74);
		frame.getContentPane().add(lbl_Ȯ��);
		lbl_Ȯ��.setHorizontalAlignment(SwingConstants.CENTER);

		JLabel label_back = new JLabel(new ImageIcon(path + "Icon/check2.jpg"));
		label_back.setBounds(0, 0, 963, 646);
		frame.getContentPane().add(label_back);

	}
}
