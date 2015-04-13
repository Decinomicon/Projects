package my_first_GUI;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.image.BufferStrategy;

import javax.swing.JFrame;

public class GUI extends Canvas implements Runnable {
	Thread mainThread;

	public static void main(String[] args) {
		GUI myFirst = new GUI();
		JFrame frame = new JFrame("Smiley.gif");
		Dimension word = new Dimension(500, 500);
		frame.setMaximumSize(word);
		frame.setPreferredSize(word);
		frame.setMinimumSize(word);
		frame.setResizable(false);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		frame.add(myFirst);
		frame.pack();
		myFirst.start();

	}

	public void run() {
		while(true){
			render();
		}

	}

	public void render() {
		BufferStrategy bs = this.getBufferStrategy();
		if (bs == null) {
			createBufferStrategy(3);
			return;
		}
		try {
			Thread.sleep(300);
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		//anger
		Graphics g = bs.getDrawGraphics();
		g.setColor(Color.yellow);
		g.fillOval(150, 150, 200, 200);
		g.setColor(Color.black);
		g.fillOval(200, 200, 30, 30);
		g.fillOval(275, 200, 30, 30);
		g.fillOval(195, 230, 115, 90);
		g.setColor(Color.yellow);
		g.fillOval(195, 240, 115, 80);
		g.setColor(Color.black);
		int xPoints[] = {204,204,250,294,294,250};
		int yPoints[] = {187,176,190,176,187,200};
		int nPoints = 6;
		g.fillPolygon(xPoints, yPoints, nPoints);
		g.dispose();
		bs.show();
		try {
			Thread.sleep(300);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//smile
		Graphics gi = bs.getDrawGraphics();
		gi.setColor(Color.yellow);
		gi.fillOval(150, 150, 200, 200);
		gi.setColor(Color.black);
		gi.fillOval(200, 200, 30, 30);
		gi.fillOval(275, 200, 30, 30);
		gi.fillOval(195, 240, 115, 90);
		gi.setColor(Color.yellow);
		gi.fillOval(195, 240, 115, 80);
		gi.setColor(Color.blue);
		int Lx[] = {51,61,63,114,114,51};
		int Ly[] = {17,17,108,107,117,117};
		int Lpoints = 6;
		gi.fillPolygon(Lx, Ly, Lpoints);
		gi.fillOval(134, 17, 100, 100);
		int Vx[] = {266,276,309,342,352,309};
		int Vy[] = {12,12,76,12,12,86};
		int Vpoints = 6;
		gi.fillPolygon(Vx, Vy, Vpoints);
		gi.setColor(Color.lightGray);
		gi.fillOval(150, 30, 70, 70);
		gi.dispose();
		bs.show();
	}

	public void start() {
		if (mainThread == null) {
			mainThread = new Thread(this);
			mainThread.start();
		}
	}

	public void stop() {
		try {
			mainThread.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
