import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class TicTacToeGame extends JFrame {
    private JButton[][] buttons = new JButton[3][3];
    private boolean isXTurn = true;

    public TicTacToeGame() {
        super("Tic-Tac-Toe Game");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridLayout(3, 3));

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                JButton button = new JButton();
                button.addActionListener(new ButtonClickListener());
                add(button);
                buttons[i][j] = button;
            }
        }

        pack();
        setVisible(true);
    }

    private class ButtonClickListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            JButton button = (JButton) e.getSource();
            if (isXTurn) {
                button.setText("X");
            } else {
                button.setText("O");
            }
            isXTurn = !isXTurn;
            checkForWin();
        }
    }

    private void checkForWin() {
        // TO DO: implement win condition checking
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new TicTacToeGame();
            }
        });
    }
}