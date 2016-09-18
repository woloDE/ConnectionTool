package gui;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.CompoundBorder;
import javax.swing.border.EmptyBorder;
import javax.swing.border.TitledBorder;

public class DatabasePane extends JPanel {

    private JButton select, create, repair, compact;
    private JLabel database;

    public DatabasePane() {
        setLayout(new GridBagLayout());
        setBorder(new CompoundBorder(new TitledBorder("Database"), new EmptyBorder(12, 0, 0, 0)));
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.anchor = GridBagConstraints.WEST;
        gbc.insets = new Insets(0, 0, 0, 4);

        JPanel panel = new JPanel(new GridBagLayout());
        panel.add(new JLabel("Database: "), gbc);
        gbc.gridx++;
        gbc.weightx = 1;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.insets = new Insets(0, 0, 0, 0);
        panel.add((database = new JLabel()), gbc);

        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.weightx = 1;
        gbc.gridwidth = GridBagConstraints.REMAINDER;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.insets = new Insets(4, 4, 4, 4);
        add(panel, gbc);

        gbc.gridwidth = 1;
        gbc.weightx = 0.25;
        gbc.gridy++;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        add((select = new JButton("Select")), gbc);
        gbc.gridx++;
        add((create = new JButton("Create")), gbc);
        gbc.gridx++;
        add((repair = new JButton("Repair")), gbc);
        gbc.gridx++;
        add((compact = new JButton("Compact")), gbc);
    }

}