package UI2;

import java.awt.EventQueue;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;

import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.SwingConstants;

import MUKSAL.SalesDAO;
import MUKSAL.SalesVO;
import UI.MUKSAL_Login;

public class MUKSAL_end {

	private JFrame frame;
	private JTextField text_오만원;
	private JTextField text_만원;
	private JTextField text_오천원;
	private JTextField text_천원;
	private JTextField text_오백원;
	private JTextField text_백원;
	private JTextField text_오십원;
	private JTextField text_십원;
	private JLabel lbl_오천원합계;
	private JLabel lbl_천원합계;
	private JLabel lbl_오백원합계;
	private JLabel lbl_백원합계;
	private JLabel lbl_오십원합계;
	private JLabel lbl_십원합계;
	private JLabel lbl_총합계;
	private JLabel lbl_매출합계;
	private JLabel lbl_차액합계;
	private JLabel lbl_마감;
	private JLabel lbl_1;
	private JLabel lbl_2;
	private JLabel lbl_3;
	private JLabel lbl_4;
	private JLabel lbl_5;
	private JLabel lbl_6;
	private JLabel lbl_7;
	private JLabel lbl_8;
	private JLabel lbl_9;
	private JLabel lbl_0;
	private JLabel lbl_delete;
	private JLabel lbl_clear;
	Integer fif;
	Integer tentho;
	Integer fivth;
	Integer fivhun;
	Integer onetho;
	Integer one;
	Integer fift;
	Integer ten;
	static int cnt = 0;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MUKSAL_end window = new MUKSAL_end();
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
	public MUKSAL_end() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		String path = MUKSAL_end.class.getResource("").getPath();
		frame = new JFrame();
		frame.setBounds(500, 200, 979, 684);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		JLabel lbl_home = new JLabel("");
		lbl_home.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {

				frame.dispose();
				MUKSAL_Login.main(null);

			}
		});
		lbl_home.setBounds(44, 10, 43, 42);
		frame.getContentPane().add(lbl_home);

		JLabel lbl_previous = new JLabel("");
		lbl_previous.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {

				frame.dispose();
				MUKSAL_업체.main(null);

			}
		});
		lbl_previous.setBounds(110, 10, 43, 42);
		frame.getContentPane().add(lbl_previous);

		JLabel lbl_오만원합계 = new JLabel("");
		lbl_오만원합계.setFont(new Font("배달의민족 주아", Font.PLAIN, 19));
		lbl_오만원합계.setHorizontalAlignment(SwingConstants.CENTER);
		lbl_오만원합계.setBounds(284, 99, 131, 35);
		frame.getContentPane().add(lbl_오만원합계);

		JLabel lbl_만원합계 = new JLabel("");
		lbl_만원합계.setFont(new Font("배달의민족 주아", Font.PLAIN, 19));
		lbl_만원합계.setHorizontalAlignment(SwingConstants.CENTER);
		lbl_만원합계.setBounds(284, 155, 131, 35);
		frame.getContentPane().add(lbl_만원합계);

		lbl_오천원합계 = new JLabel("");
		lbl_오천원합계.setFont(new Font("배달의민족 주아", Font.PLAIN, 19));
		lbl_오천원합계.setHorizontalAlignment(SwingConstants.CENTER);
		lbl_오천원합계.setBounds(284, 212, 131, 42);
		frame.getContentPane().add(lbl_오천원합계);

		lbl_천원합계 = new JLabel("");
		lbl_천원합계.setFont(new Font("배달의민족 주아", Font.PLAIN, 19));
		lbl_천원합계.setHorizontalAlignment(SwingConstants.CENTER);
		lbl_천원합계.setBounds(284, 274, 131, 42);
		frame.getContentPane().add(lbl_천원합계);

		lbl_오백원합계 = new JLabel("");
		lbl_오백원합계.setFont(new Font("배달의민족 주아", Font.PLAIN, 19));
		lbl_오백원합계.setHorizontalAlignment(SwingConstants.CENTER);
		lbl_오백원합계.setBounds(284, 326, 131, 42);
		frame.getContentPane().add(lbl_오백원합계);

		lbl_백원합계 = new JLabel("");
		lbl_백원합계.setFont(new Font("배달의민족 주아", Font.PLAIN, 19));
		lbl_백원합계.setHorizontalAlignment(SwingConstants.CENTER);
		lbl_백원합계.setBounds(284, 383, 131, 42);
		frame.getContentPane().add(lbl_백원합계);

		lbl_오십원합계 = new JLabel("");
		lbl_오십원합계.setFont(new Font("배달의민족 주아", Font.PLAIN, 19));
		lbl_오십원합계.setHorizontalAlignment(SwingConstants.CENTER);
		lbl_오십원합계.setBounds(284, 438, 131, 42);
		frame.getContentPane().add(lbl_오십원합계);

		lbl_십원합계 = new JLabel("");
		lbl_십원합계.setFont(new Font("배달의민족 주아", Font.PLAIN, 19));
		lbl_십원합계.setHorizontalAlignment(SwingConstants.CENTER);
		lbl_십원합계.setBounds(284, 498, 131, 42);
		frame.getContentPane().add(lbl_십원합계);

		lbl_총합계 = new JLabel("");
		lbl_총합계.setFont(new Font("배달의민족 주아", Font.PLAIN, 19));
		lbl_총합계.setHorizontalAlignment(SwingConstants.CENTER);
		lbl_총합계.setBounds(173, 561, 167, 48);
		frame.getContentPane().add(lbl_총합계);

		lbl_매출합계 = new JLabel("");
		lbl_매출합계.setFont(new Font("배달의민족 주아", Font.PLAIN, 19));
		lbl_매출합계.setHorizontalAlignment(SwingConstants.CENTER);
		lbl_매출합계.setBounds(488, 561, 142, 48);
		frame.getContentPane().add(lbl_매출합계);

		lbl_차액합계 = new JLabel("");
		lbl_차액합계.setFont(new Font("배달의민족 주아", Font.PLAIN, 19));
		lbl_차액합계.setHorizontalAlignment(SwingConstants.CENTER);
		lbl_차액합계.setBounds(730, 561, 142, 48);
		frame.getContentPane().add(lbl_차액합계);

		lbl_마감 = new JLabel("");
		lbl_마감.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				JOptionPane.showMessageDialog(null, "마감이 완료되었습니다.","마감",JOptionPane.INFORMATION_MESSAGE);
				frame.dispose();
				MUKSAL_업체.main(null);
				cnt++;
			}
		});
		lbl_마감.setBounds(804, 284, 87, 85);
		frame.getContentPane().add(lbl_마감);

		lbl_1 = new JLabel("");
		lbl_1.setBounds(451, 109, 87, 85);
		frame.getContentPane().add(lbl_1);

		lbl_2 = new JLabel("");
		lbl_2.setBounds(567, 109, 87, 85);
		frame.getContentPane().add(lbl_2);

		lbl_3 = new JLabel("");
		lbl_3.setBounds(682, 109, 87, 85);
		frame.getContentPane().add(lbl_3);

		lbl_4 = new JLabel("");
		lbl_4.setBounds(451, 222, 87, 85);
		frame.getContentPane().add(lbl_4);

		lbl_5 = new JLabel("");
		lbl_5.setBounds(567, 222, 87, 85);
		frame.getContentPane().add(lbl_5);

		lbl_6 = new JLabel("");
		lbl_6.setBounds(682, 222, 87, 85);
		frame.getContentPane().add(lbl_6);

		lbl_7 = new JLabel("");
		lbl_7.setBounds(451, 333, 87, 85);
		frame.getContentPane().add(lbl_7);

		lbl_8 = new JLabel("");
		lbl_8.setBounds(567, 333, 87, 85);
		frame.getContentPane().add(lbl_8);

		lbl_9 = new JLabel("");
		lbl_9.setBounds(682, 333, 87, 85);
		frame.getContentPane().add(lbl_9);

		lbl_0 = new JLabel("");
		lbl_0.setBounds(451, 441, 87, 85);
		frame.getContentPane().add(lbl_0);

		lbl_delete = new JLabel("");
		lbl_delete.setBounds(567, 445, 87, 85);
		frame.getContentPane().add(lbl_delete);

		lbl_clear = new JLabel("");
		lbl_clear.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				
				
				text_십원.setText(null);
				text_오십원.setText(null);
				text_백원.setText(null);
				text_오백원.setText(null);
				text_천원.setText(null);
				text_오천원.setText(null);
				text_만원.setText(null);
				text_오만원.setText(null);
				lbl_십원합계.setText(null);
				lbl_오십원합계.setText(null);
				lbl_백원합계.setText(null);
				lbl_오백원합계.setText(null);
				lbl_천원합계.setText(null);
				lbl_오천원합계.setText(null);
				lbl_만원합계.setText(null);
				lbl_오만원합계.setText(null);
				lbl_매출합계.setText(null);
				lbl_총합계.setText(null);
				lbl_차액합계.setText(null);
				
			}
		});
		lbl_clear.setBounds(682, 445, 87, 85);
		frame.getContentPane().add(lbl_clear);

		text_오만원 = new JTextField();
		text_오만원.addKeyListener(new KeyListener() {

			@Override
			public void keyTyped(KeyEvent e) {

			}

			@Override
			public void keyReleased(KeyEvent e) {
				// TODO Auto-generated method stub

			}

			@Override
			public void keyPressed(KeyEvent e) {
				if (e.getKeyCode() == KeyEvent.VK_ENTER) {
					String fifth = text_오만원.getText();
					fif = Integer.parseInt(fifth);
					fif *= 50000;
					lbl_오만원합계.setText(fif + "");
					
				}
			}
		});

		text_오만원.setFont(new Font("배달의민족 주아", Font.PLAIN, 19));
		text_오만원.setBounds(173, 99, 61, 35);
		frame.getContentPane().add(text_오만원);
		text_오만원.setColumns(10);

		text_만원 = new JTextField();
		text_만원.addKeyListener(new KeyListener() {

			@Override
			public void keyTyped(KeyEvent e) {

			}
			@Override
			public void keyReleased(KeyEvent e) {
				// TODO Auto-generated method stub

			}

@Override
			public void keyPressed(KeyEvent e) {
				if (e.getKeyCode() == KeyEvent.VK_ENTER) {
					String tenth = text_만원.getText();
					tentho = Integer.parseInt(tenth);
					tentho *= 10000;
					lbl_만원합계.setText(tentho + "");
					
				}
			}
		});
		text_만원.setFont(new Font("배달의민족 주아", Font.PLAIN, 19));
		text_만원.setColumns(10);
		text_만원.setBounds(173, 155, 61, 35);
		frame.getContentPane().add(text_만원);

		text_오천원 = new JTextField();
		text_오천원.addKeyListener(new KeyListener() {

			@Override
			public void keyTyped(KeyEvent e) {

			}

			@Override
			public void keyReleased(KeyEvent e) {
				// TODO Auto-generated method stub

			}

			@Override
			public void keyPressed(KeyEvent e) {
				if (e.getKeyCode() == KeyEvent.VK_ENTER) {
					String fiveth = text_오천원.getText();
					fivth = Integer.parseInt(fiveth);
					fivth *= 5000;
					lbl_오천원합계.setText(fivth + "");
					
				}
			}
		});
		text_오천원.setFont(new Font("배달의민족 주아", Font.PLAIN, 19));
		text_오천원.setColumns(10);
		text_오천원.setBounds(173, 212, 61, 35);
		frame.getContentPane().add(text_오천원);

		text_천원 = new JTextField();
		text_천원.addKeyListener(new KeyListener() {

			@Override
			public void keyTyped(KeyEvent e) {

			}

			@Override
			public void keyReleased(KeyEvent e) {
				// TODO Auto-generated method stub

			}

			@Override
			public void keyPressed(KeyEvent e) {
				if (e.getKeyCode() == KeyEvent.VK_ENTER) {
					String oneth = text_천원.getText();
					onetho = Integer.parseInt(oneth);
					onetho *= 1000;
					lbl_천원합계.setText(onetho + "");
					
				}
			}
		});
		text_천원.setFont(new Font("배달의민족 주아", Font.PLAIN, 19));
		text_천원.setColumns(10);
		text_천원.setBounds(173, 274, 61, 35);
		frame.getContentPane().add(text_천원);

		text_오백원 = new JTextField();
		text_오백원.addKeyListener(new KeyListener() {

			@Override
			public void keyTyped(KeyEvent e) {

			}

			@Override
			public void keyReleased(KeyEvent e) {
				// TODO Auto-generated method stub

			}

			@Override
			public void keyPressed(KeyEvent e) {
				if (e.getKeyCode() == KeyEvent.VK_ENTER) {
					String fivehun = text_오백원.getText();
					fivhun = Integer.parseInt(fivehun);
					fivhun *= 500;
					lbl_오백원합계.setText(fivhun + "");
					
				}
			}
		});
		text_오백원.setFont(new Font("배달의민족 주아", Font.PLAIN, 19));
		text_오백원.setColumns(10);
		text_오백원.setBounds(173, 333, 61, 35);
		frame.getContentPane().add(text_오백원);

		text_백원 = new JTextField();
		text_백원.addKeyListener(new KeyListener() {

			@Override
			public void keyTyped(KeyEvent e) {

			}

			@Override
			public void keyReleased(KeyEvent e) {
				// TODO Auto-generated method stub

			}

			@Override
			public void keyPressed(KeyEvent e) {
				if (e.getKeyCode() == KeyEvent.VK_ENTER) {
					String onehun = text_백원.getText();
					one = Integer.parseInt(onehun);
					one *= 100;
					lbl_백원합계.setText(one + "");
					
				}
			}
		});
		text_백원.setFont(new Font("배달의민족 주아", Font.PLAIN, 19));
		text_백원.setColumns(10);
		text_백원.setBounds(173, 390, 61, 35);
		frame.getContentPane().add(text_백원);

		text_오십원 = new JTextField();
		text_오십원.addKeyListener(new KeyListener() {

			@Override
			public void keyTyped(KeyEvent e) {

			}

			@Override
			public void keyReleased(KeyEvent e) {
				// TODO Auto-generated method stub

			}

			@Override
			public void keyPressed(KeyEvent e) {
				if (e.getKeyCode() == KeyEvent.VK_ENTER) {
					String fifty = text_오십원.getText();
					fift = Integer.parseInt(fifty);
					fift *= 50;
					lbl_오십원합계.setText(fift + "");
					
				}
			}
		});

		text_오십원.setFont(new Font("배달의민족 주아", Font.PLAIN, 19));
		text_오십원.setColumns(10);
		text_오십원.setBounds(173, 445, 61, 35);
		frame.getContentPane().add(text_오십원);

		text_십원 = new JTextField();
		text_십원.addKeyListener(new KeyListener() {

			@Override
			public void keyTyped(KeyEvent e) {

			}

			@Override
			public void keyReleased(KeyEvent e) {
				// TODO Auto-generated method stub

			}

			@Override
			public void keyPressed(KeyEvent e) {
				if (e.getKeyCode() == KeyEvent.VK_ENTER) {
					String tenwon = text_십원.getText();
					ten = Integer.parseInt(tenwon);
					ten *= 10;
					lbl_십원합계.setText(ten + "");
					int input = fif + tentho + fivth + fivhun + onetho + one + fift + ten;
					lbl_총합계.setText(fif + tentho + fivth + fivhun + onetho + one + fift + ten + "");

					SalesDAO dao = new SalesDAO();
					ArrayList<SalesVO> list = dao.CalculateFinal();
					int result = 0;
					for (int i = 0; i < list.size(); i++) {
						result +=list.get(i).getPrice();
					}
					lbl_매출합계.setText(result+"");
					lbl_차액합계.setText(input-result+"");
					

				}
			}
		});

		text_십원.setFont(new Font("배달의민족 주아", Font.PLAIN, 19));
		text_십원.setColumns(10);
		text_십원.setBounds(173, 505, 61, 35);
		frame.getContentPane().add(text_십원);

		JLabel label_back = new JLabel(new ImageIcon(path + "Icon/end.jpg"));
		label_back.setFont(new Font("배달의민족 주아", Font.PLAIN, 12));
		label_back.setBounds(0, 0, 963, 646);
		frame.getContentPane().add(label_back);

	}

}
