package ar.edu.unlp.info.oo1.ej3;

public class VideoStreamAdapter extends Media{
	private VideoStream videoStream;
	
	public void play() {
		this.videoStream.reproduce();
	}
}
