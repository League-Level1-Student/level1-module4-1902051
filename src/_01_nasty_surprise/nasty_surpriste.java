package _01_nasty_surprise;

import java.awt.Dimension;

import javax.swing.AbstractButton;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class nasty_surpriste {
	public static void main(String[] args) {

		JButton trick = new JButton();
		JPanel panel = new JPanel();

		Dimension trickDim = new Dimension(400, 400);
		Dimension treatDim = new Dimension(400, 400);

		frame.add(panel);
		frame.setVisible(true);
		trick.setText("trick");
		treat.setText("treat");
		trick.addActionListener(null);
		treat.addActionListener(null);
		panel.add(treat);
		panel.add(trick);
		frame.pack();
		frame.setTitle("Nasty Surprise");

	}
}
