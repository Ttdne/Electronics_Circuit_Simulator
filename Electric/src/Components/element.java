package Components;

import Components.complexNum.Complex;

public abstract class element {
	protected double value;
	public element(double value) {
		 this.value = value;
	}
	public double getValue() {
    	return value;
    }
	public abstract Complex getImpedance(double frequency);

}