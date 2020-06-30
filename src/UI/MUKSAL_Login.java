package UI;

import java.awt.EventQueue;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import java.awt.SystemColor;
import java.awt.Color;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;

import MUKSAL.CheckidDAO;
import MUKSAL.LoginDAO;
import UI2.MUKSAL_업체;

import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JTextField;

public class MUKSAL_Login {

	private JFrame frame;
	private JTextField text_id;
	private JTextField text_pw;
	LoginDAO login = new LoginDAO();
	static String id = null;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MUKSAL_Login window = new MUKSAL_Login();
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
	public MUKSAL_Login() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		String path = MUKSAL_Login.class.getResource("").getPath();
		System.out.println(path);
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.WHITE);
		frame.getContentPane().setLayout(null);
		/* frame.setBackground(Color.WHITE); */
		frame.setBounds(500, 200, 979, 684);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		JLabel lbl_login = new JLabel("");
		lbl_login.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {

				MUKSAL_Login.id = text_id.getText();
				String id = text_id.getText();
				String pw = text_pw.getText();

				boolean check = login.login(id, pw);
				if (check) {
					if (id.equals("admin")) {
						JOptionPane.showMessageDialog(null, "관리자 로그인 성공!");
						MUKSAL_업체.main(null);
						frame.dispose();

					} else {
						JOptionPane.showMessageDialog(null, "로그인 성공!", "로그인", JOptionPane.INFORMATION_MESSAGE);
						MUKSAL_Table.main(null);
						frame.dispose();
					}

				} else {
					JOptionPane.showMessageDialog(null, "로그인 실패!", "로그인", JOptionPane.ERROR_MESSAGE);
					text_id.setText(null);
					text_pw.setText(null);
				}

			}
		});
		lbl_login.setBounds(527, 477, 122, 55);
		frame.getContentPane().add(lbl_login);

		text_id = new JTextField();
		text_id.setFont(new Font("나눔바른고딕", Font.PLAIN, 16));
		text_id.setBounds(394, 349, 255, 41);
		frame.getContentPane().add(text_id);
		text_id.setColumns(10);

		text_pw = new JTextField();
		text_pw.setFont(new Font("나눔바른고딕", Font.PLAIN, 16));
		text_pw.setColumns(10);
		text_pw.setBounds(394, 415, 255, 41);
		frame.getContentPane().add(text_pw);

		JLabel label_back = new JLabel(new ImageIcon(path + "Icon/screen.png"));
		label_back.setBounds(0, 0, 963, 646);
		frame.getContentPane().add(label_back);
	}
}
