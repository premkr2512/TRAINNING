package logger1;

import org.apache.log4j.Logger;

class Add {

	private static final Logger log1 = Logger.getLogger(Add.class);

	void Add(int number1, int number2) {
		int c = number1 + number2;
		log1.info(" inside the  method Add()");
		log1.debug(log1);
	}

}

public class logger1 {

	public static void main(String[] args) {

		Add t = new Add();
		t.Add(10, 20);
	}

}

