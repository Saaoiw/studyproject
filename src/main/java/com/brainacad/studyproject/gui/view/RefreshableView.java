package com.brainacad.studyproject.gui.view;

import javax.swing.*;

/**
 * Created by Fujitsu on 22.11.2016.
 */
public abstract class RefreshableView {

    protected JPanel content = new JPanel();

    public abstract View getName();

    public JPanel getContent() {
        return content;
    }

    public abstract void refresh(Object ... params);

}

