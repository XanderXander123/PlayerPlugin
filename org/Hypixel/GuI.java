package org.Hypixel;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class GuI extends Frame {
        private TextArea codeTextArea; private TextArea outputTextArea;
        private Button runButton; private Button pushButton;  private Button pullButton;
        public GuI() { setTitle("Java IDE"); setSize(800, 600); setLayout(new BorderLayout());
        codeTextArea = new TextArea(); outputTextArea = new TextArea();
        runButton = new Button("Run"); pushButton = new Button("Push");
        pullButton = new Button("Pull"); Panel topPanel = new Panel();
        topPanel.setLayout(new BorderLayout()); topPanel.add(codeTextArea, BorderLayout.CENTER);
        Panel bottomPanel = new Panel(); bottomPanel.setLayout(new BorderLayout());
        bottomPanel.add(runButton, BorderLayout.WEST); bottomPanel.add(pushButton, BorderLayout.CENTER);
        bottomPanel.add(pullButton, BorderLayout.EAST); add(topPanel, BorderLayout.CENTER);
        add(bottomPanel, BorderLayout.SOUTH); add(outputTextArea, BorderLayout.EAST);
        runButton.addActionListener(new ActionListener() {  @Override
        public void actionPerformed(ActionEvent e) {    // Implement code execution logic here
        String code = codeTextArea.getText();  // Execute the code and display the result in outputTextArea
        outputTextArea.setText("Code executed:\n" + code);   }  }); 
        pushButton.addActionListener(new ActionListener() {   @Override   
        public void actionPerformed(ActionEvent e) {  // Implement push logic here 
        outputTextArea.setText("Push button clicked.");
        } });  pullButton.addActionListener(new ActionListener() { @Override
        public void actionPerformed(ActionEvent e) {  // Implement pull logic here
        outputTextArea.setText("Pull button clicked."); } });
        addWindowListener(new WindowAdapter() { @Override public void windowClosing(WindowEvent e) {
        dispose();   } });  setVisible(true); }
        public static void main(String[] args) {
        new GuI();
        }
}
