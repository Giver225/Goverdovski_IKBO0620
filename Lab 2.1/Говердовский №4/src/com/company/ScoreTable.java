package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ScoreTable extends JFrame {
    JButton Millan = new JButton("AC MIllan");
    JButton Real = new JButton("Real Madrid");
    JLabel Result = new JLabel("Result 0 X 0");
    JLabel lastScorer = new JLabel("Last Scorer: N/A");
    JLabel winnner = new JLabel("WINNDER: DRAW");
    JPanel bottom = new JPanel();
    JPanel middle = new JPanel();
    int scoreA = 0;
    int scoreB = 0;

    public ScoreTable(){
        super("Score Table");
        setLayout(new BorderLayout());
        add(bottom,BorderLayout.SOUTH);
        bottom.add(Millan);
        bottom.add(Real);
        add(winnner,BorderLayout.NORTH);
        add(middle,BorderLayout.CENTER);
        middle.add(Result);
        middle.add(lastScorer);
        Millan.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                scoreA++;
                lastScorer.setText("Last Scorer: AC Millan");
                if(scoreA>scoreB) {
                    winnner.setText("WINNER: AC Millan");
                } else if(scoreA==scoreB){
                    winnner.setText("WINNER: DRAW");
                }else {
                    winnner.setText("WINNER: Real Madrid");
                }
                Result.setText("Result " + scoreA + "X" + scoreB);
            }
        });
        Real.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                scoreB++;
                lastScorer.setText("Last Scorer: Real Madrid");
                if(scoreA>scoreB) {
                    winnner.setText("WINNER: AC Millan");
                } else if(scoreA==scoreB){
                    winnner.setText("WINNER: DRAW");
                }else {
                    winnner.setText("WINNER: Real Madrid");
                }
                Result.setText("Result " + scoreA + "X" + scoreB);
            }
        });
    }
}