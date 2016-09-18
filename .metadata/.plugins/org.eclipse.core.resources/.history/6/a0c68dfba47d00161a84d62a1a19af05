package gui;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;

import javax.swing.JPanel;

public class DatabasePropertiesPane extends JPanel {

    private SourcePane sourcePane;
    private DatabasePane databasePane;
    private SystemDatabasePane systemDatabasePane;
    private ActionPane actionPane;

    public DatabasePropertiesPane() {
        setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.weightx = 1;
        gbc.weighty = 0.33;
        gbc.anchor = GridBagConstraints.WEST;
        gbc.fill = GridBagConstraints.BOTH;
        gbc.insets = new Insets(4, 4, 4, 4);

        add((sourcePane = new SourcePane()), gbc);
        gbc.gridy++;
        add((databasePane = new DatabasePane()), gbc);
        gbc.gridy++;
        add((systemDatabasePane = new SystemDatabasePane()), gbc);

        gbc.gridy = 0;
        gbc.gridx++;
        gbc.gridheight = GridBagConstraints.REMAINDER;
        gbc.fill = GridBagConstraints.VERTICAL;
        gbc.weighty = 1;
        gbc.weightx = 0;
        add((actionPane = new ActionPane()), gbc);
    }

}