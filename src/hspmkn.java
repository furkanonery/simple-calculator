import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.math.BigDecimal;
import java.awt.event.ActionEvent;
import java.awt.Font;
import javax.swing.SwingConstants;

public class hspmkn extends JFrame {

	private JPanel contentPane;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					hspmkn frame = new hspmkn();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public hspmkn() {
		setTitle("Hesap Makinesi 1.0.0");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 385, 499);
		contentPane = new JPanel();
		contentPane.setBackground(Color.DARK_GRAY);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton = new JButton("7");
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				textField.setText(textField.getText()+"7");
			}
		});
		btnNewButton.setBackground(Color.ORANGE);
		btnNewButton.setBounds(12, 79, 76, 62);
		contentPane.add(btnNewButton);
		
		textField = new JTextField();
		textField.setFont(new Font("Tahoma", Font.BOLD, 25));
		textField.setHorizontalAlignment(SwingConstants.RIGHT);
		textField.setBounds(12, 13, 344, 56);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JButton button = new JButton("8");
		button.setFont(new Font("Tahoma", Font.BOLD, 20));
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText()+"8");
			}
		});
		button.setBackground(Color.ORANGE);
		button.setBounds(100, 79, 76, 62);
		contentPane.add(button);
		
		JButton button_1 = new JButton("9");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText()+"9");
			}
		});
		button_1.setFont(new Font("Tahoma", Font.BOLD, 20));
		button_1.setBackground(Color.ORANGE);
		button_1.setBounds(188, 79, 76, 62);
		contentPane.add(button_1);
		
		JButton btnC = new JButton("C");
		btnC.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText("");
			}
		});
		btnC.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnC.setBackground(Color.ORANGE);
		btnC.setBounds(276, 79, 76, 62);
		contentPane.add(btnC);
		
		JButton button_4 = new JButton("4");
		button_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText()+"4");
			}
		});
		button_4.setFont(new Font("Tahoma", Font.BOLD, 20));
		button_4.setBackground(Color.ORANGE);
		button_4.setBounds(12, 154, 76, 62);
		contentPane.add(button_4);
		
		JButton button_5 = new JButton("5");
		button_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText()+"5");
			}
		});
		button_5.setFont(new Font("Tahoma", Font.BOLD, 20));
		button_5.setBackground(Color.ORANGE);
		button_5.setBounds(100, 154, 76, 62);
		contentPane.add(button_5);
		
		JButton button_6 = new JButton("6");
		button_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText()+"6");
			}
		});
		button_6.setFont(new Font("Tahoma", Font.BOLD, 20));
		button_6.setBackground(Color.ORANGE);
		button_6.setBounds(188, 154, 76, 62);
		contentPane.add(button_6);
		
		JButton btnNewButton_2 = new JButton("+");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText()+"+");
			}
		});
		btnNewButton_2.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnNewButton_2.setBackground(Color.ORANGE);
		btnNewButton_2.setBounds(276, 154, 76, 62);
		contentPane.add(btnNewButton_2);
		
		JButton button_9 = new JButton("1");
		button_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText()+"1");
			}
		});
		button_9.setFont(new Font("Tahoma", Font.BOLD, 20));
		button_9.setBackground(Color.ORANGE);
		button_9.setBounds(12, 229, 76, 62);
		contentPane.add(button_9);
		
		JButton button_10 = new JButton("2");
		button_10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText()+"2");
			}
		});
		button_10.setFont(new Font("Tahoma", Font.BOLD, 20));
		button_10.setBackground(Color.ORANGE);
		button_10.setBounds(100, 229, 76, 62);
		contentPane.add(button_10);
		
		JButton button_11 = new JButton("3");
		button_11.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText()+"3");
			}
		});
		button_11.setFont(new Font("Tahoma", Font.BOLD, 20));
		button_11.setBackground(Color.ORANGE);
		button_11.setBounds(188, 229, 76, 62);
		contentPane.add(button_11);
		
		JButton button_12 = new JButton("-");
		button_12.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText()+"-");
			}
		});
		button_12.setFont(new Font("Tahoma", Font.BOLD, 27));
		button_12.setBackground(Color.ORANGE);
		button_12.setBounds(276, 229, 76, 62);
		contentPane.add(button_12);
		
		JButton btnNewButton_1 = new JButton("0");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText()+"0");
			}
		});
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnNewButton_1.setBackground(Color.ORANGE);
		btnNewButton_1.setBounds(12, 304, 76, 62);
		contentPane.add(btnNewButton_1);
		
		JButton button_16 = new JButton("=");
		button_16.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					textField.setText(""+hesapla(textField.getText()));
				} catch (ScriptException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		button_16.setFont(new Font("Tahoma", Font.BOLD, 20));
		button_16.setBackground(Color.ORANGE);
		button_16.setBounds(100, 304, 76, 62);
		contentPane.add(button_16);
		
		JButton button_17 = new JButton("/");
		button_17.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText()+"/");
			}
		});
		button_17.setFont(new Font("Tahoma", Font.BOLD, 20));
		button_17.setBackground(Color.ORANGE);
		button_17.setBounds(276, 304, 76, 62);
		contentPane.add(button_17);
		
		JButton btnX = new JButton("X");
		btnX.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText()+"*");
			}
		});
		btnX.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnX.setBackground(Color.ORANGE);
		btnX.setBounds(188, 304, 76, 62);
		contentPane.add(btnX);
		
		JButton button_2 = new JButton("(");
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText()+"(");
			}
		});
		button_2.setFont(new Font("Tahoma", Font.BOLD, 20));
		button_2.setBackground(Color.ORANGE);
		button_2.setBounds(12, 379, 76, 62);
		contentPane.add(button_2);
		
		JButton button_3 = new JButton(")");
		button_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText()+")");
			}
		});
		button_3.setFont(new Font("Tahoma", Font.BOLD, 20));
		button_3.setBackground(Color.ORANGE);
		button_3.setBounds(100, 379, 76, 62);
		contentPane.add(button_3);
		
		JButton button_7 = new JButton(".");
		button_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText()+".");
			}
		});
		button_7.setFont(new Font("Tahoma", Font.BOLD, 20));
		button_7.setBackground(Color.ORANGE);
		button_7.setBounds(188, 379, 76, 62);
		contentPane.add(button_7);
		
		JButton btnDel = new JButton("EXIT");
		btnDel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
			return;
				
			}
		});
		btnDel.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnDel.setBackground(Color.ORANGE);
		btnDel.setBounds(276, 379, 76, 62);
		contentPane.add(btnDel);
	}
	public static double hesapla(String x) throws ScriptException
	{
	    double result;
	   ScriptEngineManager mgr = new ScriptEngineManager();    
	   ScriptEngine engine = mgr.getEngineByName("JavaScript");        
	    return new BigDecimal(engine.eval(x).toString()).floatValue();
	}
}
