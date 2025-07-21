package webjis.ex;

public class Album extends Product{
		private String artist;
		
		Album(String name, int price, String artist){
			super(name, price);
			this.artist = artist;
		}
		
		@Override
		public String display() {
			return super.display() + " 아티스트 : " + artist;
		}
		
//		void displayAlbum() {
//			super.displayProduct();
//			System.out.println("아티스트 : " + artist);
//		}
}
