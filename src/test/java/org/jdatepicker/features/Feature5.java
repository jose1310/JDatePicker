package org.jdatepicker.features;

import org.jdatepicker.JDatePanel;
import org.jdatepicker.JDatePicker;

import javax.swing.*;
import java.util.Locale;

/**
 * Change the locale for the widget.
 *
 * a. Locale should update ltr / rtl
 * b. Locale should update first day of the week
 * c. Locale should update texts being displayed.
 */
public class Feature5 {

    public static void main(String[] args) throws ClassNotFoundException, UnsupportedLookAndFeelException, InstantiationException, IllegalAccessException {
        // Changing the global locale
        // GERMAN: Monday is the first day of week
        //Locale.setDefault(Locale.GERMAN);

        // AR_SA: Saturday is the first day of week (Saudi Arabia), rtl
        // Locale.setDefault(new Locale("ar", "sa"));

        // US: Sunday is the first day of week (US)
        // Locale.setDefault(Locale.US);

        // SIMPLIFIED_CHINESE: ???
        //Locale.setDefault(Locale.SIMPLIFIED_CHINESE);

        // JAPAN
        // Locale.setDefault(Locale.JAPAN);

        // KOREAN
        // Locale.setDefault(Locale.KOREAN);

        // RUSSIAN
        Locale.setDefault(new Locale("ru"));

        // Create a frame
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        frame.setSize(550, 300);

        // Create a flow layout panel
        JPanel panel = new JPanel();
        frame.getContentPane().add(panel);

        // Create the JDatePanel
        JDatePanel datePanel = new JDatePanel();
        panel.add(datePanel);

        // Create the JDatePicker
        JDatePicker datePicker = new JDatePicker();
        panel.add(datePicker);

        // Make the frame visible
        frame.setVisible(true);
    }

}
