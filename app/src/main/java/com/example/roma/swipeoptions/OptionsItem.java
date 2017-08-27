package com.example.roma.swipeoptions;

/**
 * Created by roma on 27.08.17.
 */

public class OptionsItem {
    public String text;

    public OptionsItem(String text) {
        this.text = text;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        OptionsItem that = (OptionsItem) o;

        return text.equals(that.text);

    }

    @Override
    public int hashCode() {
        return text.hashCode();
    }
}
