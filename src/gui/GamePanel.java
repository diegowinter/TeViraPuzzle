package gui;

import javax.swing.JPanel;
import javax.swing.Timer;

import core.Table;

import java.awt.Color;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import java.awt.Font;

public class GamePanel extends JPanel {
	
	Table table = new Table();
	boolean canMove = true;

	public GamePanel() {
		table.generateProblem();
		int[][] places = table.getPlaces();
		ArrayList<Integer> placesArray = table.getNumberList();
		
		setBackground(Color.DARK_GRAY);
		
		this.setBounds(0, 0, 400, 400);
		setLayout(null);
		
		JButton btn1 = new JButton("1");
		btn1.setFont(new Font("Nirmala UI", Font.BOLD, 20));
		btn1.setBounds(determineBounds(placesArray.indexOf(new Integer(1))));
		btn1.setFocusable(false);
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(table.validateMovement(1) != "false" && canMove == true) {
					String movement = table.validateMovement(1);
					table.performMovement(1);
					performMovement(movement, btn1);
				}
			}
		});
		add(btn1);
		
		JButton btn2 = new JButton("2");
		btn2.setFont(new Font("Nirmala UI", Font.BOLD, 20));
		btn2.setBounds(determineBounds(placesArray.indexOf(new Integer(2))));
		btn2.setFocusable(false);
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(table.validateMovement(2) != "false" && canMove == true) {
					String movement = table.validateMovement(2);
					table.performMovement(2);
					performMovement(movement, btn2);
				}
			}
		});
		add(btn2);
		
		JButton btn3 = new JButton("3");
		btn3.setFont(new Font("Nirmala UI", Font.BOLD, 20));
		btn3.setBounds(determineBounds(placesArray.indexOf(new Integer(3))));
		btn3.setFocusable(false);
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(table.validateMovement(3) != "false" && canMove == true) {
					String movement = table.validateMovement(3);
					table.performMovement(3);
					performMovement(movement, btn3);
				}
			}
		});
		add(btn3);
		
		JButton btn4 = new JButton("4");
		btn4.setFont(new Font("Nirmala UI", Font.BOLD, 20));
		btn4.setBounds(determineBounds(placesArray.indexOf(new Integer(4))));
		btn4.setFocusable(false);
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(table.validateMovement(4) != "false" && canMove == true) {
					String movement = table.validateMovement(4);
					table.performMovement(4);
					performMovement(movement, btn4);
				}
			}
		});
		add(btn4);
		
		JButton btn5 = new JButton("5");
		btn5.setFont(new Font("Nirmala UI", Font.BOLD, 20));
		btn5.setBounds(determineBounds(placesArray.indexOf(new Integer(5))));
		btn5.setFocusable(false);
		btn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(table.validateMovement(5) != "false" && canMove == true) {
					String movement = table.validateMovement(5);
					table.performMovement(5);
					performMovement(movement, btn5);
				}
			}
		});
		add(btn5);
		
		JButton btn6 = new JButton("6");
		btn6.setFont(new Font("Nirmala UI", Font.BOLD, 20));
		btn6.setBounds(determineBounds(placesArray.indexOf(new Integer(6))));
		btn6.setFocusable(false);
		btn6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(table.validateMovement(6) != "false" && canMove == true) {
					String movement = table.validateMovement(6);
					table.performMovement(6);
					performMovement(movement, btn6);	
				}
			}
		});
		add(btn6);
		
		JButton btn7 = new JButton("7");
		btn7.setFont(new Font("Nirmala UI", Font.BOLD, 20));
		btn7.setBounds(determineBounds(placesArray.indexOf(new Integer(7))));
		btn7.setFocusable(false);
		btn7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(table.validateMovement(7) != "false" && canMove == true) {
					String movement = table.validateMovement(7);
					table.performMovement(7);
					performMovement(movement, btn7);
				}
			}
		});
		add(btn7);
		
		JButton btn8 = new JButton("8");
		btn8.setFont(new Font("Nirmala UI", Font.BOLD, 20));
		btn8.setBounds(determineBounds(placesArray.indexOf(new Integer(8))));
		btn8.setFocusable(false);
		btn8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(table.validateMovement(8) != "false" && canMove == true) {
					String movement = table.validateMovement(8);
					table.performMovement(8);
					performMovement(movement, btn8);
				}
			}
		});
		add(btn8);
		
		JButton btn9 = new JButton("9");
		btn9.setFont(new Font("Nirmala UI", Font.BOLD, 20));
		btn9.setBounds(determineBounds(placesArray.indexOf(new Integer(9))));
		btn9.setFocusable(false);
		btn9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(table.validateMovement(9) != "false" && canMove == true) {
					String movement = table.validateMovement(9);
					table.performMovement(9);
					performMovement(movement, btn9);
				}
			}
		});
		add(btn9);
		
		JButton btn10 = new JButton("10");
		btn10.setFont(new Font("Nirmala UI", Font.BOLD, 20));
		btn10.setBounds(determineBounds(placesArray.indexOf(new Integer(10))));
		btn10.setFocusable(false);
		
		btn10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(table.validateMovement(10) != "false" && canMove == true) {
					String movement = table.validateMovement(10);
					table.performMovement(10);
					performMovement(movement, btn10);	
				}
			}
		});
		add(btn10);
		
		JButton btn11 = new JButton("11");
		btn11.setFont(new Font("Nirmala UI", Font.BOLD, 20));
		btn11.setBounds(determineBounds(placesArray.indexOf(new Integer(11))));
		btn11.setFocusable(false);
		btn11.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(table.validateMovement(11) != "false" && canMove == true) {
					String movement = table.validateMovement(11);
					table.performMovement(11);
					performMovement(movement, btn11);
				}
			}
		});
		add(btn11);
		
		JButton btn12 = new JButton("12");
		btn12.setFont(new Font("Nirmala UI", Font.BOLD, 20));
		btn12.setBounds(determineBounds(placesArray.indexOf(new Integer(12))));
		btn12.setFocusable(false);
		btn12.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(table.validateMovement(12) != "false" && canMove == true) {
					String movement = table.validateMovement(12);
					table.performMovement(12);
					performMovement(movement, btn12);
				}
			}
		});
		add(btn12);
		
		JButton btn13 = new JButton("13");
		btn13.setFont(new Font("Nirmala UI", Font.BOLD, 20));
		btn13.setBounds(determineBounds(placesArray.indexOf(new Integer(13))));
		btn13.setFocusable(false);
		btn13.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(table.validateMovement(13) != "false" && canMove == true) {
					String movement = table.validateMovement(13);
					table.performMovement(13);
					performMovement(movement, btn13);	
				}
			}
		});
		add(btn13);
		
		JButton btn14 = new JButton("14");
		btn14.setFont(new Font("Nirmala UI", Font.BOLD, 20));
		btn14.setBounds(determineBounds(placesArray.indexOf(new Integer(14))));
		btn14.setFocusable(false);
		btn14.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(table.validateMovement(14) != "false" && canMove == true) {
					String movement = table.validateMovement(14);
					table.performMovement(14);
					performMovement(movement, btn14);	
				}
			}
		});
		add(btn14);
		
		JButton btn15 = new JButton("15");
		btn15.setFont(new Font("Nirmala UI", Font.BOLD, 20));
		btn15.setBounds(determineBounds(placesArray.indexOf(new Integer(15))));
		btn15.setFocusable(false);
		btn15.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(table.validateMovement(15) != "false" && canMove == true) {
					String movement = table.validateMovement(15);
					table.performMovement(15);
					performMovement(movement, btn15);
				}
			}
		});
		add(btn15);
	}
	
	static int initialPosition = 0;
	static int targetPosition = 0;
	private void performMovement(String movement, JButton button) {
		canMove = false;
		switch(movement) {
			case "down":
				initialPosition = (int)button.getBounds().getY();
				targetPosition = initialPosition + 100;
				new Timer(1, new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						button.setBounds((int)button.getBounds().getX(), (int)button.getBounds().getY()+5, 100, 100);
						if ((int)button.getBounds().getY() == targetPosition)
							((Timer)e.getSource()).stop();
					}
				}).start();
				break;
			case "up":
				initialPosition = (int)button.getBounds().getY();
				targetPosition = initialPosition - 100;
				new Timer(1, new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						button.setBounds((int)button.getBounds().getX(), (int)button.getBounds().getY()-5, 100, 100);
						if ((int)button.getBounds().getY() == targetPosition)
							((Timer)e.getSource()).stop();
					}
				}).start();
				break;
			case "left":
				initialPosition = (int)button.getBounds().getX();
				targetPosition = initialPosition - 100;
				new Timer(1, new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						button.setBounds((int)button.getBounds().getX()-5, (int)button.getBounds().getY(), 100, 100);
						if ((int)button.getBounds().getX() == targetPosition)
							((Timer)e.getSource()).stop();
					}
				}).start();
				break;
			case "right":
				initialPosition = (int)button.getBounds().getX();
				targetPosition = initialPosition + 100;
				new Timer(1, new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						button.setBounds((int)button.getBounds().getX()+5, (int)button.getBounds().getY(), 100, 100);
						if ((int)button.getBounds().getX() == targetPosition)
							((Timer)e.getSource()).stop();
					}
				}).start();
				break;
		}
		canMove = true;
	}
	
	private Rectangle determineBounds(int index) {
		if(index == 0) {
			return new Rectangle(0, 0, 100, 100);
		}
		if(index == 1) {
			return new Rectangle(100, 0, 100, 100);
		}
		if(index == 2) {
			return new Rectangle(200, 0, 100, 100);
		}
		if(index == 3) {
			return new Rectangle(300, 0, 100, 100);
		}
		if(index == 4) {
			return new Rectangle(0, 100, 100, 100);
		}
		if(index == 5) {
			return new Rectangle(100, 100, 100, 100);
		}
		if(index == 6) {
			return new Rectangle(200, 100, 100, 100);
		}
		if(index == 7) {
			return new Rectangle(300, 100, 100, 100);
		}
		if(index == 8) {
			return new Rectangle(0, 200, 100, 100);
		}
		if(index == 9) {
			return new Rectangle(100, 200, 100, 100);
		}
		if(index == 10) {
			return new Rectangle(200, 200, 100, 100);
		}
		if(index == 11) {
			return new Rectangle(300, 200, 100, 100);
		}
		if(index == 12) {
			return new Rectangle(0, 300, 100, 100);
		}
		if(index == 13) {
			return new Rectangle(100, 300, 100, 100);
		}
		if(index == 14) {
			return new Rectangle(200, 300, 100, 100);
		}
		if(index == 15) {
			return new Rectangle(300, 300, 100, 100);
		}
		
		return null;
	}
	
}
