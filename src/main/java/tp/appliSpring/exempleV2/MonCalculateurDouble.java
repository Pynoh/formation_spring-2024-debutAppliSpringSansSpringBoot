package tp.appliSpring.exempleV2;

import org.springframework.stereotype.Component;


public class MonCalculateurDouble implements MonCalculateur {

	@Override
	public double calculer(double x) {
		return 2*x;
	}

}
