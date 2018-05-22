package org.vaadin.viritin.combobox;

import com.vaadin.ui.ComboBox;
import org.vaadin.viritin.fluency.ui.FluentComponent;
import org.vaadin.viritin.fluency.ui.FluentHasValue;

import java.util.Collection;
import java.util.stream.Stream;

public class MComboBox<V> extends ComboBox<V> implements
        FluentComponent<MComboBox<V>>, FluentHasValue<MComboBox<V>, V>{

    public MComboBox() {
    }

    public MComboBox(String caption) {
        super(caption);
    }

    public MComboBox(String caption, Collection<V> options) {
        super(caption, options);
    }

    /**
     *
     * @param items
     * @return
     */
    public MComboBox<V> withItems(final Collection<V> items){
        this.setItems(items);
        return this;
    }

    /**
     *
     * @param items
     * @return
     */
    public MComboBox<V> withItems(final Stream<V> items){
        this.setItems(items);
        return this;
    }

    /**
     *
     * @param items
     * @return
     */
    public MComboBox<V> withItems(final V ... items){
        this.setItems(items);
        return this;
    }
}
