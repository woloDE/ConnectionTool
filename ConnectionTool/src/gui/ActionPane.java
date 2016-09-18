package gui;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;

import javax.swing.JButton;
import javax.swing.JPanel;

public class ActionPane extends JPanel {

    private JButton okay, cancel, help, advanced, options;

    public ActionPane() {
        setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.gridwidth = GridBagConstraints.REMAINDER;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.weightx = 1;
        gbc.insets = new Insets(4, 4, 4, 4);

        add((okay = new JButton("Ok")), gbc);
        gbc.gridy++;
        add((cancel = new JButton("Cancel")), gbc);
        gbc.gridy++;
        add((help = new JButton("Help")), gbc);
        gbc.gridy++;
        add((advanced = new JButton("Advanced")), gbc);
        gbc.gridy++;
        gbc.weighty = 1;
        gbc.anchor = GridBagConstraints.SOUTH;
        add((options = new JButton("Options >>")), gbc);
    }

}