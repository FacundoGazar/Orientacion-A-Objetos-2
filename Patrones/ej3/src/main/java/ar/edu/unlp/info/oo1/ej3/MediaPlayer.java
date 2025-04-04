package ar.edu.unlp.info.oo1.ej3;

import java.util.List;
import java.util.ArrayList;

public class MediaPlayer {
	public List<Media> media;
	
	public MediaPlayer() {
		this.media = new ArrayList<Media>();
	}
	
	public void play() {
		this.media.stream().forEach(media -> media.play());
	}
}
