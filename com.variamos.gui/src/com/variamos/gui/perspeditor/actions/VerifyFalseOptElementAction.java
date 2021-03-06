package com.variamos.gui.perspeditor.actions;

import java.awt.event.ActionEvent;
import java.util.ArrayList;
import java.util.List;

import com.mxgraph.util.mxResources;
import com.variamos.gui.core.viewcontrollers.AbstractVariamoGUIAction;
import com.variamos.gui.maineditor.VariamosGraphEditor;

@SuppressWarnings("serial")
public class VerifyFalseOptElementAction extends AbstractVariamoGUIAction {

	public VerifyFalseOptElementAction() {
		this.putValue(SHORT_DESCRIPTION,
				mxResources.get("verifyFalseOptionalElements"));
	}
	/**
		 * 
		 */
	public void actionPerformed(ActionEvent e) {

		VariamosGraphEditor editor = getEditor(e);
		List<String> defect = new ArrayList<String>();
		defect.add("FalseOpt");
		editor.verify(defect);
	} 
}