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
	private JTextField text_������;
	private JTextField text_����;
	private JTextField text_��õ��;
	private JTextField text_õ��;
	private JTextField text_�����;
	private JTextField text_���;
	private JTextField text_���ʿ�;
	private JTextField text_�ʿ�;
	private JLabel lbl_��õ���հ�;
	private JLabel lbl_õ���հ�;
	private JLabel lbl_������հ�;
	private JLabel lbl_����հ�;
	private JLabel lbl_���ʿ��հ�;
	private JLabel lbl_�ʿ��հ�;
	private JLabel lbl_���հ�;
	private JLabel lbl_�����հ�;
	private JLabel lbl_�����հ�;
	private JLabel lbl_����;
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
				MUKSAL_��ü.main(null);

			}
		});
		lbl_previous.setBounds(110, 10, 43, 42);
		frame.getContentPane().add(lbl_previous);

		JLabel lbl_�������հ� = new JLabel("");
		lbl_�������հ�.setFont(new Font("����ǹ��� �־�", Font.PLAIN, 19));
		lbl_�������հ�.setHorizontalAlignment(SwingConstants.CENTER);
		lbl_�������հ�.setBounds(284, 99, 131, 35);
		frame.getContentPane().add(lbl_�������հ�);

		JLabel lbl_�����հ� = new JLabel("");
		lbl_�����հ�.setFont(new Font("����ǹ��� �־�", Font.PLAIN, 19));
		lbl_�����հ�.setHorizontalAlignment(SwingConstants.CENTER);
		lbl_�����հ�.setBounds(284, 155, 131, 35);
		frame.getContentPane().add(lbl_�����հ�);

		lbl_��õ���հ� = new JLabel("");
		lbl_��õ���հ�.setFont(new Font("����ǹ��� �־�", Font.PLAIN, 19));
		lbl_��õ���հ�.setHorizontalAlignment(SwingConstants.CENTER);
		lbl_��õ���հ�.setBounds(284, 212, 131, 42);
		frame.getContentPane().add(lbl_��õ���հ�);

		lbl_õ���հ� = new JLabel("");
		lbl_õ���հ�.setFont(new Font("����ǹ��� �־�", Font.PLAIN, 19));
		lbl_õ���հ�.setHorizontalAlignment(SwingConstants.CENTER);
		lbl_õ���հ�.setBounds(284, 274, 131, 42);
		frame.getContentPane().add(lbl_õ���հ�);

		lbl_������հ� = new JLabel("");
		lbl_������հ�.setFont(new Font("����ǹ��� �־�", Font.PLAIN, 19));
		lbl_������հ�.setHorizontalAlignment(SwingConstants.CENTER);
		lbl_������հ�.setBounds(284, 326, 131, 42);
		frame.getContentPane().add(lbl_������հ�);

		lbl_����հ� = new JLabel("");
		lbl_����հ�.setFont(new Font("����ǹ��� �־�", Font.PLAIN, 19));
		lbl_����հ�.setHorizontalAlignment(SwingConstants.CENTER);
		lbl_����հ�.setBounds(284, 383, 131, 42);
		frame.getContentPane().add(lbl_����հ�);

		lbl_���ʿ��հ� = new JLabel("");
		lbl_���ʿ��հ�.setFont(new Font("����ǹ��� �־�", Font.PLAIN, 19));
		lbl_���ʿ��հ�.setHorizontalAlignment(SwingConstants.CENTER);
		lbl_���ʿ��հ�.setBounds(284, 438, 131, 42);
		frame.getContentPane().add(lbl_���ʿ��հ�);

		lbl_�ʿ��հ� = new JLabel("");
		lbl_�ʿ��հ�.setFont(new Font("����ǹ��� �־�", Font.PLAIN, 19));
		lbl_�ʿ��հ�.setHorizontalAlignment(SwingConstants.CENTER);
		lbl_�ʿ��հ�.setBounds(284, 498, 131, 42);
		frame.getContentPane().add(lbl_�ʿ��հ�);

		lbl_���հ� = new JLabel("");
		lbl_���հ�.setFont(new Font("����ǹ��� �־�", Font.PLAIN, 19));
		lbl_���հ�.setHorizontalAlignment(SwingConstants.CENTER);
		lbl_���հ�.setBounds(173, 561, 167, 48);
		frame.getContentPane().add(lbl_���հ�);

		lbl_�����հ� = new JLabel("");
		lbl_�����հ�.setFont(new Font("����ǹ��� �־�", Font.PLAIN, 19));
		lbl_�����հ�.setHorizontalAlignment(SwingConstants.CENTER);
		lbl_�����հ�.setBounds(488, 561, 142, 48);
		frame.getContentPane().add(lbl_�����հ�);

		lbl_�����հ� = new JLabel("");
		lbl_�����հ�.setFont(new Font("����ǹ��� �־�", Font.PLAIN, 19));
		lbl_�����հ�.setHorizontalAlignment(SwingConstants.CENTER);
		lbl_�����հ�.setBounds(730, 561, 142, 48);
		frame.getContentPane().add(lbl_�����հ�);

		lbl_���� = new JLabel("");
		lbl_����.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				JOptionPane.showMessageDialog(null, "������ �Ϸ�Ǿ����ϴ�.","����",JOptionPane.INFORMATION_MESSAGE);
				frame.dispose();
				MUKSAL_��ü.main(null);
				cnt++;
			}
		});
		lbl_����.setBounds(804, 284, 87, 85);
		frame.getContentPane().add(lbl_����);

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
				
				
				text_�ʿ�.setText(null);
				text_���ʿ�.setText(null);
				text_���.setText(null);
				text_�����.setText(null);
				text_õ��.setText(null);
				text_��õ��.setText(null);
				text_����.setText(null);
				text_������.setText(null);
				lbl_�ʿ��հ�.setText(null);
				lbl_���ʿ��հ�.setText(null);
				lbl_����հ�.setText(null);
				lbl_������հ�.setText(null);
				lbl_õ���հ�.setText(null);
				lbl_��õ���հ�.setText(null);
				lbl_�����հ�.setText(null);
				lbl_�������հ�.setText(null);
				lbl_�����հ�.setText(null);
				lbl_���հ�.setText(null);
				lbl_�����հ�.setText(null);
				
			}
		});
		lbl_clear.setBounds(682, 445, 87, 85);
		frame.getContentPane().add(lbl_clear);

		text_������ = new JTextField();
		text_������.addKeyListener(new KeyListener() {

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
					String fifth = text_������.getText();
					fif = Integer.parseInt(fifth);
					fif *= 50000;
					lbl_�������հ�.setText(fif + "");
					
				}
			}
		});

		text_������.setFont(new Font("����ǹ��� �־�", Font.PLAIN, 19));
		text_������.setBounds(173, 99, 61, 35);
		frame.getContentPane().add(text_������);
		text_������.setColumns(10);

		text_���� = new JTextField();
		text_����.addKeyListener(new KeyListener() {

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
					String tenth = text_����.getText();
					tentho = Integer.parseInt(tenth);
					tentho *= 10000;
					lbl_�����հ�.setText(tentho + "");
					
				}
			}
		});
		text_����.setFont(new Font("����ǹ��� �־�", Font.PLAIN, 19));
		text_����.setColumns(10);
		text_����.setBounds(173, 155, 61, 35);
		frame.getContentPane().add(text_����);

		text_��õ�� = new JTextField();
		text_��õ��.addKeyListener(new KeyListener() {

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
					String fiveth = text_��õ��.getText();
					fivth = Integer.parseInt(fiveth);
					fivth *= 5000;
					lbl_��õ���հ�.setText(fivth + "");
					
				}
			}
		});
		text_��õ��.setFont(new Font("����ǹ��� �־�", Font.PLAIN, 19));
		text_��õ��.setColumns(10);
		text_��õ��.setBounds(173, 212, 61, 35);
		frame.getContentPane().add(text_��õ��);

		text_õ�� = new JTextField();
		text_õ��.addKeyListener(new KeyListener() {

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
					String oneth = text_õ��.getText();
					onetho = Integer.parseInt(oneth);
					onetho *= 1000;
					lbl_õ���հ�.setText(onetho + "");
					
				}
			}
		});
		text_õ��.setFont(new Font("����ǹ��� �־�", Font.PLAIN, 19));
		text_õ��.setColumns(10);
		text_õ��.setBounds(173, 274, 61, 35);
		frame.getContentPane().add(text_õ��);

		text_����� = new JTextField();
		text_�����.addKeyListener(new KeyListener() {

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
					String fivehun = text_�����.getText();
					fivhun = Integer.parseInt(fivehun);
					fivhun *= 500;
					lbl_������հ�.setText(fivhun + "");
					
				}
			}
		});
		text_�����.setFont(new Font("����ǹ��� �־�", Font.PLAIN, 19));
		text_�����.setColumns(10);
		text_�����.setBounds(173, 333, 61, 35);
		frame.getContentPane().add(text_�����);

		text_��� = new JTextField();
		text_���.addKeyListener(new KeyListener() {

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
					String onehun = text_���.getText();
					one = Integer.parseInt(onehun);
					one *= 100;
					lbl_����հ�.setText(one + "");
					
				}
			}
		});
		text_���.setFont(new Font("����ǹ��� �־�", Font.PLAIN, 19));
		text_���.setColumns(10);
		text_���.setBounds(173, 390, 61, 35);
		frame.getContentPane().add(text_���);

		text_���ʿ� = new JTextField();
		text_���ʿ�.addKeyListener(new KeyListener() {

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
					String fifty = text_���ʿ�.getText();
					fift = Integer.parseInt(fifty);
					fift *= 50;
					lbl_���ʿ��հ�.setText(fift + "");
					
				}
			}
		});

		text_���ʿ�.setFont(new Font("����ǹ��� �־�", Font.PLAIN, 19));
		text_���ʿ�.setColumns(10);
		text_���ʿ�.setBounds(173, 445, 61, 35);
		frame.getContentPane().add(text_���ʿ�);

		text_�ʿ� = new JTextField();
		text_�ʿ�.addKeyListener(new KeyListener() {

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
					String tenwon = text_�ʿ�.getText();
					ten = Integer.parseInt(tenwon);
					ten *= 10;
					lbl_�ʿ��հ�.setText(ten + "");
					int input = fif + tentho + fivth + fivhun + onetho + one + fift + ten;
					lbl_���հ�.setText(fif + tentho + fivth + fivhun + onetho + one + fift + ten + "");

					SalesDAO dao = new SalesDAO();
					ArrayList<SalesVO> list = dao.CalculateFinal();
					int result = 0;
					for (int i = 0; i < list.size(); i++) {
						result +=list.get(i).getPrice();
					}
					lbl_�����հ�.setText(result+"");
					lbl_�����հ�.setText(input-result+"");
					

				}
			}
		});

		text_�ʿ�.setFont(new Font("����ǹ��� �־�", Font.PLAIN, 19));
		text_�ʿ�.setColumns(10);
		text_�ʿ�.setBounds(173, 505, 61, 35);
		frame.getContentPane().add(text_�ʿ�);

		JLabel label_back = new JLabel(new ImageIcon(path + "Icon/end.jpg"));
		label_back.setFont(new Font("����ǹ��� �־�", Font.PLAIN, 12));
		label_back.setBounds(0, 0, 963, 646);
		frame.getContentPane().add(label_back);

	}

}
