package com.variamos.perspsupport.expressionsupport;

import java.util.ArrayList;
import java.util.List;

/**
 * A class to support the operations definition with GUI edition. Part of PhD
 * work at University of Paris 1
 * 
 * @author Juan C. Mu�oz Fern�ndez <jcmunoz@gmail.com>
 * 
 * @version 1.1
 * @since 2015-11-07
 */
public class OperationAction {
	public OperationAction(int position, String description) {
		super();
		this.position = position;
		this.description = description;
		expressionSubActions = new ArrayList<OperationSubAction>();
	}

	private int position;
	private String description;
	private List<OperationSubAction> expressionSubActions;

	public int getPosition() {
		return position;
	}

	public void setPosition(int position) {
		this.position = position;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public List<OperationSubAction> getExpressionSubActions() {
		return expressionSubActions;
	}

	public void setExpressionSubActions(
			List<OperationSubAction> expressionSubActions) {
		this.expressionSubActions = expressionSubActions;
	}

	public void addExpressionSubAction(OperationSubAction operationSubAction) {
		expressionSubActions.add(operationSubAction);
	}

	public List<String> getOperColumnsNames() {

		List<String> out = new ArrayList<String>();
		for (OperationSubAction subAction : expressionSubActions) {
			out.addAll(subAction.getOperationSubActionExpTypesNames());
		}
		return out;
	}

	public List<OperationSubActionExpType> getOperColumns() {

		List<OperationSubActionExpType> out = new ArrayList<OperationSubActionExpType>();
		for (OperationSubAction subAction : expressionSubActions) {
			out.addAll(subAction.getOperationSubActionExpTypes());
		}
		return out;
	}

	public List<String> getOperLabelNames() {
		List<String> out = new ArrayList<String>();
		for (OperationSubAction subAction : expressionSubActions) {
			out.addAll(subAction.getOperLabelNames());
		}
		return out;
	}

	public List<OperationLabeling> getOperLabels() {
		List<OperationLabeling> out = new ArrayList<OperationLabeling>();
		for (OperationSubAction subAction : expressionSubActions) {
			out.addAll(subAction.getOperLabels());
		}
		return out;
	}
}
