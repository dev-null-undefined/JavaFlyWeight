package config;

import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;

public interface InsertDocumentListener extends DocumentListener {
    void update(DocumentEvent e);

    @Override
    default void insertUpdate(DocumentEvent e) {
        update(e);
    }

    @Override
    default void removeUpdate(DocumentEvent e) {
    }

    @Override
    default void changedUpdate(DocumentEvent e) {
    }
}