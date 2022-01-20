package P1;

import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.widgets.Text;

public class From2 {

	protected Shell fm2;
    public int Answer = 0;
    private Text txt1;
	
	
	
	
	/**
	 * Launch the application.
	 * @param args
	 */
//	public static void main(String[] args) {
//		try {
//			From2 window = new From2();
//			window.open();
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//	}

	/**
	 * Open the window.
	 * @wbp.parser.entryPoint
	 */
	public void open() {
		Display display = Display.getDefault();
		createContents();
		
		
		fm2.open();
		fm2.layout();
		while (!fm2.isDisposed()) {
			if (!display.readAndDispatch()) {
				display.sleep();
			}
		}
	}

	/**
	 * Create contents of the window.
	 */
	protected void createContents() {
		fm2 = new Shell();
		fm2.setSize(450, 300);
		fm2.setText("Form2");
		
		Button btnSubmit = new Button(fm2, SWT.NONE);
		btnSubmit.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				
				
			
				
				
				Answer = Integer.parseInt(txt1.getText());
		
				
				
				From1 window1 = new From1();
				window1.setI( Answer );
				fm2.close();
				
				
				
			}//end method
		});
		btnSubmit.setBounds(110, 132, 222, 52);
		btnSubmit.setText("Submit");
		
		txt1 = new Text(fm2, SWT.BORDER);
		txt1.setText("" + this.getAns()  );
		txt1.setBounds(103, 73, 245, 44);

	}//end method
	
	public void setAns(int ans) {
		
		this.Answer = ans ;
		
	}//end method
	
	public int getAns() {
		
		return this.Answer ;
	}//end method
	
	
	
}//end class
