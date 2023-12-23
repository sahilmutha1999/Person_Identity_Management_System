/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui.Employer;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.table.TableCellEditor;
import javax.swing.table.TableCellRenderer;

public class JTableWithButtonsExample {
//    public static void main(String[] args) {
//        SwingUtilities.invokeLater(() -> {
//            createAndShowGUI();
//        });
//    }

    private static void createAndShowGUI() {
        JFrame frame = new JFrame("JTable with Buttons Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Create a sample data model
        DefaultTableModel model = new DefaultTableModel();
        model.addColumn("Applicant Name");
        model.addColumn("Details");
        model.addColumn("Accept/Reject");

        // Add sample data
        model.addRow(new Object[]{"John Doe", "Details", "Accept/Reject"});
        model.addRow(new Object[]{"Jane Doe", "Details", "Accept/Reject"});
        model.addRow(new Object[]{"Alice", "Details", "Accept/Reject"});
        model.addRow(new Object[]{"Bob", "Details", "Accept/Reject"});

        // Create the JTable with the model
        JTable table = new JTable(model);

        // Create a custom renderer for the "Details" column
        table.getColumnModel().getColumn(1).setCellRenderer(new ButtonRenderer());

        // Create a custom editor for the "Details" column
        table.getColumnModel().getColumn(1).setCellEditor(new ButtonEditor(frame));

        JScrollPane scrollPane = new JScrollPane(table);
        frame.add(scrollPane, BorderLayout.CENTER);

        frame.setSize(400, 300);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }

    // Custom cell renderer for the "Details" column
    static class ButtonRenderer extends JButton implements TableCellRenderer {
        public ButtonRenderer() {
            setOpaque(true);
        }

        @Override
        public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
            setText((value == null) ? "" : value.toString());
            return this;
        }
    }

    // Custom cell editor for the "Details" column
    // Custom cell editor for the "Details" column
static class ButtonEditor extends AbstractCellEditor implements TableCellEditor {
    private JFrame parentFrame;
    private JButton button;
    private String clickedValue;

    public ButtonEditor(JFrame parentFrame) {
        this.parentFrame = parentFrame;
        this.button = new JButton();
        this.button.setOpaque(true);

        // Handle button click action
        this.button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                fireEditingStopped();
                // Open a popup JFrame when the button is clicked
                JFrame popupFrame = new JFrame("Details");
                popupFrame.setSize(300, 200);
                popupFrame.setLocationRelativeTo(parentFrame);
                popupFrame.setVisible(true);
            }
        });
    }

    @Override
    public Object getCellEditorValue() {
        return clickedValue;
    }

    public Component getTableCellEditorComponent(JTable table, Object value, boolean isSelected, int row, int column) {
        clickedValue = (value == null) ? "" : value.toString();
        button.setText(clickedValue);
        return button;
    }
}

}
