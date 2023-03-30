package model;

public class Follower {
	String s;
	String name;
	int max_channelfolloweed;
	String [] channelfollowed;
	int i;
	int max_videofolloweed;
	String [] videofollowed;
	int j = 0;
	public String toString(){

		return s;
	}
	public String getName1() {

		return name;
	}

	
	public Follower(String name, int max_channelfolloweed) {
		this.name = name;
		this.max_channelfolloweed = max_channelfolloweed;
		channelfollowed = new String [max_channelfolloweed];
	}
	public Follower(String name, int max_channelfolloweed, int max_videofolloweed ) {
		this.name = name;
		this.max_channelfolloweed = max_channelfolloweed;
		channelfollowed = new String [max_channelfolloweed];
		this.max_videofolloweed = max_videofolloweed;
		videofollowed = new String [max_videofolloweed];
		
	}
	
	public void follows(String string) {
		channelfollowed[i] = string;
		i++;
	}
	public void unfollows(String string) {
		int pos = -1;
		for(int k = 0; k < i; k ++) {
			if (channelfollowed[k] == string) {
				pos = k;
			}
		}
		if(pos != -1) {
			for (int m = pos; m < i-1; m++) {
				channelfollowed[m] = channelfollowed[m+1];
			}
			i--;
		}
		
	}
	public void addvideo(String string) {
		
		
	}
	
	
}