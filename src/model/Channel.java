package model;

public class Channel {

	String channel;
	int vids;
	int followers;
	String s;
	String[] vid;
	Follower[] follower;
	public Channel(String string, int i, int j) {
		channel = string;
		vid = new String [i];
		follower = new Follower[j];
	}

	public void releaseANewVideo(String string) {
		vid[vids] = string;
		vids++;
		for(int i =0;i< followers;i++) {
			follower[i].addvideo(string);
		}
		
	}
	

	public void follow(Follower v) {
		follower[followers] = v;
		follower[followers].follows(channel);
		followers++;

	}

	public void unfollow(Follower f1) {
		int pos = -1;
		for(int i = 0; i < followers; i ++) {
			if (follower[i] == f1) {
				pos = i;
			}
		}
		if(pos != -1) {
			for (int j = pos; j < followers-1; j++) {
				follower[j] = follower[j+1];
				
				
			}
			followers--;
		}
		
		follower[followers].unfollows(channel);

	}

	public String toString() {
		if (vids == 0 && followers == 0) {

			s = channel +" released no videos and has no followers.";
		}
		else {
			s = channel + " released ";
			if(vids == 0 ) {
				s+= "no videos";
			}
			else {
				s+= "<";
				for(int i = 0; i < vids; i++) {
					if(i == vids -1) {
						s+= vid[i] + ">";
					}
					else {
						s+= vid[i] + ", ";
					}

				}
			}

			s = s + " and ";
			if(followers == 0 ) {
				s+= "has no followers.";
			}
			else {
				s+= "is followed by [";
				for(int i = 0; i < followers; i++) {
					if(i == followers -1) {
						s+= follower[i].getName1() + "].";
					}
					else {
						s+= follower[i].getName1() + ", ";
					}

				}
			}


		}
		return s;
	}

	public String getName() {
		return channel;
	}


}
