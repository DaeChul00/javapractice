package d260202_01;

import java.io.IOException;

public class PhonebookMain {

	public static void main(String[] args) throws IOException {
		//new PhonebookProgram(new OraclePhonebookDAO());
		new PhonebookProgram(new H2PhonebookDAO());
	}

}
