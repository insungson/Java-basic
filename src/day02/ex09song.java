package day02;

public class ex09song {

	private String title = "";
	private String artist = "";
	private String album = "";
	private String composer = "";
	private int year = 0;
	private int track = 0;

	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getArtist() {
		return artist;
	}
	public void setArtist(String artist) {
		this.artist = artist;
	}
	public String getAlbum() {
		return album;
	}
	public void setAlbum(String album) {
		this.album = album;
	}
	public String getComposer() {
		return composer;
	}
	public void setComposer(String composer) {
		this.composer = composer;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public int getTrack() {
		return track;
	}
	public void setTrack(int track) {
		this.track = track;
	}
	
	public void show() {
		System.out.println(artist+""+title+""+"("+album+","+year+","+track+"번트랙 ,"+composer+")");
	}

	public static void main(String[] args) {
		ex09song song = new ex09song();
		song.setAlbum("real");
		song.setArtist("아이유");
		song.setComposer("이민수 작곡");
		song.setTitle("좋은날");
		song.setTrack(3);
		song.setYear(2010);
		
		song.show();
	}
}
