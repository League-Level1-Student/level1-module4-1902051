package _01_nasty_surprise;

import java.awt.Dimension;
import java.net.MalformedURLException;
import java.net.URL;

import javax.swing.AbstractButton;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class nasty_surpriste {
	public static void main(String[] args) {

	}
	private void idk () {
		JButton trick = new JButton();
		JButton treat = new JButton();
		JPanel panel = new JPanel();
		JFrame frame = new JFrame();
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
		showPictureFromTheInternet("https://www.google.com/search?q=scary+image&source=lnms&tbm=isch&sa=X&ved=2ahUKEwju9Piio_PnAhUDS6wKHZzZAHcQ_AUoAXoECA4QAw&biw=1920&bih=828#imgrc=gted6IQ57ph0nM");	

	}
	
	private void showPictureFromTheInternet(String imageUrl) {
		try {
			URL url = new URL(imageUrl);
			Icon icon = new ImageIcon(url);
			JLabel imageLabel = new JLabel(icon);
			JFrame frame = new JFrame();
			frame.add(imageLabel);
			frame.setVisible(true);
			frame.pack();
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}

	}

}
