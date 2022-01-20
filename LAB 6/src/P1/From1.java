package P1;

import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Text;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import java.util.Stack;
import org.eclipse.swt.widgets.Label;
//import org.eclipse.ui.forms.widgets.FormToolkit;  

public class From1 {


	protected Shell fm1;
	private Text txt1;
    public int i = 0;
    public int x = 0;
    public int fac = 0;
    public int s = 0;
    public int a = 0;
    public int[] swap = new int[5];
    public Stack<Integer> stk= new Stack<>();  
    private Text txt2;
    private Text txt3;
    private Text txt4;
    private Text txt5;
    private Button btnRun;
    private Label lb1;
    private Label lb2;
    private Label lb4;
    private Label lb5;
    private Label lb6;
    private Label lb7;
    private Label lb8;
    private Label lblFinish;
  //  public Stack<Integer> stack = new Stack<Integer>();
	/**
	 * Launch the application.
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			From1 window = new From1();
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
		fm1.setSize(451, 653);
		fm1.setText("Form1");
		int [] sw = new int[20];
		txt1 = new Text(fm1, SWT.BORDER);
		txt1.setEditable(false);
		stk.push(0);
		txt1.setBounds(128, 182, 171, 47);
		
		Button btn1 = new Button(fm1, SWT.NONE);
		btn1.addSelectionListener(new SelectionAdapter() {
			

			@Override
			public void widgetSelected(SelectionEvent e) {
				
				
				btn1.setEnabled(false);
				
				
				
				From2 window2 = new From2();
				
				
//				window2.Answer=99;
//				window2.setAns(99);
				
				window2.open();
				i = window2.getAns();
				stk.push(i);
				
				System.out.println("stk is : " + stk );
				
				
				btnRun.setEnabled(true);
				btn1.setEnabled(true);
				
				txt1.setText("" + stk.peek() +"!");
				
				
				for(int a = 0 ; a<=5 ; a++) {
					
					sw[a] = 0;
					
				}
				
				
				for(int a = 0 ; a<=s ; a++) {
					
					 sw[a] = stk.pop();
					
				}
				txt2.setText("" + sw[1] +"!");
				txt3.setText("" + sw[2] +"!");
				txt4.setText("" + sw[3] +"!");
				txt5.setText("" + sw[4] +"!");
				for(int a = s ; a>=0 ; a--) {
					
				    stk.push(sw[a]);
					
				}
				
				
				lb1.setText(""+i+"!");
				lb2.setText("Push");
				lb6.setText("");
				lb7.setText("");
				lb8.setText("");
				lb4.setText("");
				lb5.setText("");
				s = stk.size();
				if(s == 1) {
					
					btnRun.setEnabled(false);
					
				}//end if
				System.out.println("stk2  is : " + stk );
			}
		});
		btn1.setBounds(69, 48, 289, 55);
		btn1.setText("Enter Factorial Number");
		
		txt2 = new Text(fm1, SWT.BORDER);
		txt2.setEditable(false);
		txt2.setBounds(128, 235, 171, 47);
		
		txt3 = new Text(fm1, SWT.BORDER);
		txt3.setEditable(false);
		txt3.setBounds(128, 289, 171, 47);
		
		txt4 = new Text(fm1, SWT.BORDER);
		txt4.setEditable(false);
		txt4.setBounds(128, 351, 171, 47);
		
		txt5 = new Text(fm1, SWT.BORDER);
		txt5.setEditable(false);
		txt5.setBounds(128, 415, 171, 47);
		
		btnRun = new Button(fm1, SWT.NONE);
		btnRun.setEnabled(false);
		btnRun.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				
				
//				System.out.println( "size3 = "+stk);
				lb1.setText("");
				lb2.setText("");
				lb4.setText("Pop");
				x= stk.pop();
				lb5.setText(""+x+"!");
				
				txt1.setText("" + stk.peek() +"!");
				
				
				
				for(int a = 0 ; a<=5 ; a++) {
					
					 sw[a] = sw[a+1];
					
				}//end
				
				txt2.setText("" + sw[1] +"!");
				txt3.setText("" + sw[2] +"!");
				txt4.setText("" + sw[3] +"!");
				txt5.setText("" + sw[4] +"!");
				
				fac = fac(x);
				lb6.setText("Fac =");
				lb7.setText("1 x " + x + "!");
				lb8.setText("= "+fac);
//				System.out.println( "size4 = "+stk);
				s = stk.size();
				
				if(s == 1) {
					
					btnRun.setEnabled(false);
					lblFinish.setText("FINISH");
				}//endif
				
				
			}//end method
		});
		btnRun.setBounds(10, 477, 124, 39);
		btnRun.setText("Run");
		
		lb1 = new Label(fm1, SWT.NONE);
		lb1.setBounds(29, 150, 59, 14);
		
		lb2 = new Label(fm1, SWT.NONE);
		lb2.setBounds(105, 132, 59, 14);
		
		lb4 = new Label(fm1, SWT.NONE);
		lb4.setBounds(281, 132, 59, 14);
		
		lb5 = new Label(fm1, SWT.NONE);
		lb5.setBounds(349, 150, 59, 14);
		
		lb6 = new Label(fm1, SWT.NONE);
		lb6.setBounds(315, 182, 59, 23);
		
		lb7 = new Label(fm1, SWT.NONE);
		lb7.setBounds(380, 182, 59, 23);
		
		lb8 = new Label(fm1, SWT.NONE);
		lb8.setBounds(380, 200, 59, 23);
		
		lblFinish = new Label(fm1, SWT.NONE);
		lblFinish.setBounds(328, 257, 59, 14);
		
		




		
		
		
	}//end method
	
	public void setI(int ans) {
		
		this.i = ans ;
		
	}//end method
	
	public int getI() {
		
		return this.i ;
		
	}//end method
	
	
	public int fac(int n) {
		if(n > 1) return n + fac( n-1 );
		else return 1 ; 
	}//end method
}//end class
