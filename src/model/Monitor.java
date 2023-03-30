package model;

public class Monitor extends Follower {
	String s;

	public Monitor(String name, int i) {
		super(name, i);
	}


	public String toString(){
		if(super.i == 0) {
			s = "Monitor " + super.name + " follows no channels.";
		}
		else {
			s = "Monitor " + super.name + " follows [";
			for (int j = 0; j < super.i; j ++) {
				
				if(j == super.i -1) {
					s+= super.channelfollowed[j] + "].";
				}
				else {
					s+= super.channelfollowed[j] + ", ";
				}
			}
		}

		return s;
	}

	public String getName1() {
		return "Monitor " + super.name;
	}
}
