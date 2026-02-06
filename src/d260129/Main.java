package d260129;

import d260129_01.LGWash;
import d260129_01.LowWash;
import d260129_01.SamsungWash;
import d260129_01.WashFunc;

public class Main {

	public static void main(String[] args) {
		SamsungWash sw=new SamsungWash();
		LGWash lw=new LGWash();
		
		//WashFunc wash=new SamsungWash();
		//WashFunc wash=new LGWash();
		//wash.dry();
		WashFunc wash=new LGWash();
		wash.clean();
		
		LowWash lowwash=new LGWash();
		lowwash.startButton();
		lowwash.stopButton();
		

	}

}
