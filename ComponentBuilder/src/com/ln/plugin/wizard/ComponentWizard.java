package com.ln.plugin.wizard;

import org.eclipse.jface.wizard.Wizard;

public class ComponentWizard extends Wizard {

	public ComponentWizard() {
		super();
		setNeedsProgressMonitor(true);
		}

	@Override
	public boolean performFinish() {
		// TODO Auto-generated method stub
		return false;
	}
	
	@Override
	public void addPages() {
		// TODO Auto-generated method stub
		super.addPages();
	}

}
