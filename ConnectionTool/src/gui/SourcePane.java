package gui;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class SourcePane extends JPanel {
    private JTextField datasourceName;
    private JTextField desciption;

    public SourcePane() {
        setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.anchor = GridBagConstraints.WEST;

        add(new JLabel("Data Source Name: "), gbc);
        gbc.gridy++;
        add(new JLabel("Description: "), gbc);

        gbc.gridx++;
        gbc.gridy = 0;
        gbc.weightx = 1;
        gbc.fill = GridBagConstraints.HORIZONTAL;

        add((datasourceName = new JTextField(10)), gbc);
        gbc.gridy++;
        add((desciption = new JTextField(10)), gbc);
    }

    public String getDataSourceName() {
        return datasourceName.getText();
    }

    public String getDescription() {
        return desciption.getText();
    }

    public void setDataSourceName(String name) {
        datasourceName.setText(name);
    }

    public void setDescription(String description) {
        desciption.setText(description);
    }

}