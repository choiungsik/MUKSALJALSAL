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

public class MUKSAL_성분체크 {

	private JFrame frame;
	boolean check = true;
	private JLabel lbl_어패류;
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
					MUKSAL_성분체크 window = new MUKSAL_성분체크();
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
	public MUKSAL_성분체크() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {

		String path = MUKSAL_성분체크.class.getResource("").getPath();

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

		JLabel lbl_고기 = new JLabel("");

		lbl_고기.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {

				int ingred = 2;
				IngredientDAO ingredDAO = new IngredientDAO();
				ArrayList<IngredientVO> vo = ingredDAO.ingred(ingred);
				result = vo.get(0).getMenuname2();
				lbl_고기.setOpaque(check);
				lbl_고기.setBackground(Color.PINK);

			}
		});

		lbl_고기.setBounds(661, 556, 21, 16);
		frame.getContentPane().add(lbl_고기);

		JLabel lbl_토마토 = new JLabel("");
		lbl_토마토.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {

				int ingred = 6;
				IngredientDAO ingredDAO = new IngredientDAO();
				ArrayList<IngredientVO> vo = ingredDAO.ingred(ingred);
				result2 = vo.get(0).getMenuname3();
				lbl_토마토.setOpaque(check);
				lbl_토마토.setBackground(Color.PINK);
			}
		});
		lbl_토마토.setBounds(661, 316, 21, 16);
		frame.getContentPane().add(lbl_토마토);

		JLabel lbl_밀가루 = new JLabel("");
		lbl_밀가루.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {

				lbl_밀가루.setOpaque(check);
				lbl_밀가루.setBackground(Color.PINK);
			}
		});
		lbl_밀가루.setBounds(393, 556, 21, 16);
		frame.getContentPane().add(lbl_밀가루);

		JLabel lbl_우유 = new JLabel("");
		lbl_우유.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {

				lbl_우유.setOpaque(check);
				lbl_우유.setBackground(Color.PINK);

			}
		});
		lbl_우유.setBounds(138, 556, 21, 16);
		frame.getContentPane().add(lbl_우유);

		lbl_어패류 = new JLabel("");
		lbl_어패류.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {

				lbl_어패류.setOpaque(check);
				lbl_어패류.setBackground(Color.PINK);

			}
		});
		lbl_어패류.setBounds(395, 315, 27, 16);
		frame.getContentPane().add(lbl_어패류);

		JLabel lbl_게 = new JLabel("");
		lbl_게.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				lbl_게.setOpaque(check);
				lbl_게.setBackground(Color.PINK);

			}
		});
		lbl_게.setBounds(138, 316, 21, 16);
		frame.getContentPane().add(lbl_게);

		JLabel lbl_취소 = new JLabel("");
		lbl_취소.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {

				lbl_고기.setOpaque(check);
				lbl_고기.setBackground(Color.white);
				lbl_밀가루.setOpaque(check);
				lbl_밀가루.setBackground(Color.white);
				lbl_우유.setOpaque(check);
				lbl_우유.setBackground(Color.white);
				lbl_어패류.setOpaque(check);
				lbl_어패류.setBackground(Color.white);
				lbl_게.setOpaque(check);
				lbl_게.setBackground(Color.white);
				lbl_토마토.setOpaque(check);
				lbl_토마토.setBackground(Color.white);

			}
		});
		lbl_취소.setHorizontalAlignment(SwingConstants.CENTER);
		lbl_취소.setBounds(793, 205, 138, 74);
		frame.getContentPane().add(lbl_취소);

		JLabel lbl_확인 = new JLabel("");
		lbl_확인.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {

				menuname = result+"";
				menuname2 = result2+"";

				frame.dispose();
				MUKSAL_TotalMenu1.main(null);
			}
		});
		lbl_확인.setBounds(793, 340, 138, 74);
		frame.getContentPane().add(lbl_확인);
		lbl_확인.setHorizontalAlignment(SwingConstants.CENTER);

		JLabel label_back = new JLabel(new ImageIcon(path + "Icon/check2.jpg"));
		label_back.setBounds(0, 0, 963, 646);
		frame.getContentPane().add(label_back);

	}
}
