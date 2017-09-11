package com.variamos.gui.perspeditor.actions;

import java.awt.event.ActionEvent;

import com.mxgraph.util.mxResources;
import com.variamos.gui.maineditor.AbstractEditorAction;
import com.variamos.gui.maineditor.VariamosGraphEditor;

/**
 * A class to call the about dialog. Part of PhD work at University of Paris 1
 * 
 * @author Juan C. Munoz Fernandez <jcmunoz@gmail.com>
 * @version 1.1
 * @since 2014-03-15
 */
@SuppressWarnings("serial")
public class CheckUpdateAction extends AbstractEditorAction {

	public CheckUpdateAction() {
		this.putValue(SHORT_DESCRIPTION, mxResources.get("verifyParents"));
	}

	/**
		 * 
		 */
	public void actionPerformed(ActionEvent e) {

		VariamosGraphEditor editor = getEditor(e);
		editor.getMainFrame().checkUpdates(true);
	}
}