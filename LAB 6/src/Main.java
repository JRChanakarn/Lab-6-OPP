import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.widgets.Text;

public class Main {

	protected Shell fm1;
	private Text text;

	/**
	 * Launch the application.
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			Main window = new Main();
			window.open();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Open the window.
	 */
	public void open() {
		Display display = Display.getDefault();
		createContents();
		fm1.open();
		fm1.layout();
		while (!fm1.isDisposed()) {
			if (!display.readAndDispatch()) {
				display.sleep();
			}
		}
	}

	/**
	 * Create contents of the window.
	 */
	protected void createContents() {
		fm1 = new Shell();
		fm1.setSize(450, 300);
		fm1.setText("From 1");
		
		Button btnNewButton = new Button(fm1, SWT.NONE);
		btnNewButton.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				
				
				
				
				
				
				
			}
		});
		btnNewButton.setBounds(105, 78, 220, 97);
		btnNewButton.setText("Enter Factorail Number");
		
		text = new Text(fm1, SWT.BORDER);
		text.setBounds(64, 221, 64, 19);

	}
}
