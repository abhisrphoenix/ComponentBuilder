package com.ln.plugin.first.handlers;


import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.jface.window.Window;
import org.eclipse.jface.wizard.WizardDialog;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.widgets.Button;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.handlers.HandlerUtil;

/**
 * Our sample handler extends AbstractHandler, an IHandler base class.
 * @see org.eclipse.core.commands.IHandler
 * @see org.eclipse.core.commands.AbstractHandler
 */
public class SampleHandler extends AbstractHandler {
	/**
	 * The constructor.
	 */
	public SampleHandler() {
	}

	/**
	 * the command has been executed, so extract extract the needed information
	 * from the application context.
	 */
	public Object execute(ExecutionEvent event) throws ExecutionException {
		IWorkbenchWindow window = HandlerUtil.getActiveWorkbenchWindowChecked(event);
		
	/*	MessageDialog.openInformation(
				window.getShell(),
				"First",
				"Hello, Eclipse world");*/
			
		
		/*Shell shell = window.getShell();
			 MyPageOne wizard = new MyPageOne();
		   */
		   //WizardDialog dialog = new WizardDialog(shell, wizard);
		   //int result = dialog.open();
		
		WizardDialog wizardDialog = new WizardDialog(window.getShell(),
			      new MyWizard());
			    if (wizardDialog.open() == Window.OK) {
			      System.out.println("Ok pressed");
			    } else {
			      System.out.println("Cancel pressed");
			       }
			  
		
		/*Button button = new Button(parent, SWT.PUSH);
		button.setText("Open Wizard");
		button.addSelectionListener(new SelectionAdapter() {
		  @Override
		  public void widgetSelected(SelectionEvent e) {
		    WizardDialog wizardDialog = new WizardDialog(parent.getShell(),
		      new MyWizard());
		    if (wizardDialog.open() == Window.OK) {
		      System.out.println("Ok pressed");
		    } else {
		      System.out.println("Cancel pressed");
		       }
		  }
		}); */
		return null;
	}
}
