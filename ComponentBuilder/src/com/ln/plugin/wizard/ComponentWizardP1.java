package com.ln.plugin.wizard;

import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Text;

public class ComponentWizardP1 extends WizardPage {

	
	  private Composite container;
	  private Text text1;
	  
	protected ComponentWizardP1() {
		super("Component Builder");
		setTitle("Component Setup");
		setDescription("Creates the component structure");
	}

	@Override
	public void createControl(Composite parent) {
	    container = new Composite(parent, SWT.NONE);
	    GridLayout layout = new GridLayout();
	    container.setLayout(layout);
	    layout.numColumns = 2;
	    Label label1 = new Label(container, SWT.NONE);
	    label1.setText("Put here a value");

	    text1 = new Text(container, SWT.BORDER | SWT.SINGLE);
	    text1.setText("");
	}

}
