package model;

public class Subscriber extends Follower {
	String [] rvids;
	String s;
	int maxvideos;
	String[] videos;
	int countvideos;
	int channels;
	public Subscriber(String name, int maxchannel, int maxvideos) {
		super(name, maxchannel);
		this.maxvideos = maxvideos;
		videos = new String [maxvideos];
		
	}
	public void addvideo(String string) {
		videos[countvideos] = string;
		countvideos++;
	}

	public void watch(String string, int i) {
		// TODO Auto-generated method stub

	}
	
	

	public String toString() {

		if(super.i == 0 && super.j == 0) {
			s = "Subscriber " + super.name + " follows no channels and has no recommended videos.";
		}
		
		else {
			s = "Subscriber " + super.name + " follows [";
			for (int j = 0; j < super.i; j ++) {

				if(j == super.i -1) {
					s+= super.channelfollowed[j] + "]";
				}
				else {
					s+= super.channelfollowed[j] + ", ";
				}
			}
			
			s = s + " and ";
			if(channels == 0 ) {
				s+= "has no recommended videos.";
			}
			else {
				s+= "is recommended <";
				for(int i = 0; i < channels; i++) {
					if(i == channels -1) {
						s+= super.videofollowed[i] + ">.";
					}
					else {
						s+= super.videofollowed[i] + ", ";
					}

				}
			}
		}
		//"Subscriber Alan follows [Cafe Music BGM, I Love You Venice] and is recommended <Jazz Piano Radio>.
		
	

		return s;
	}


	public String getName1() {
		return "Subscriber " + super.name;
	}



}
