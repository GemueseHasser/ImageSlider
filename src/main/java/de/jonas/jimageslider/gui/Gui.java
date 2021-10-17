package de.jonas.jimageslider.gui;

import javax.swing.JFrame;

public final class Gui {

    private static final String TITLE = "Image-Slider";
    private static final int WIDTH = 750;
    private static final int HEIGHT = 500;


    private final JFrame gui;


    public Gui() {
        this.gui = new JFrame(TITLE);
        this.gui.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.gui.setBounds(0, 0, WIDTH, HEIGHT);
        this.gui.setLocationRelativeTo(null);
        this.gui.setLayout(null);
        this.gui.setResizable(false);
    }


    public void open() {
        this.gui.setVisible(true);
    }

}
