
public class Board {
	Pixel[][] Grid = new Pixel[Visualizer.DIMENSION][Visualizer.DIMENSION];
	
	public void fillBoardLight(){
		for(Pixel[] line : Grid){
			for(Pixel p: line){
				p.setALL(Pixel.MAX_LIGHT, Pixel.MAX_LIGHT, Pixel.MAX_LIGHT);
			}
		}
	}
	
	public void fillBoardDark(){
		for(Pixel[] line : Grid){
			for(Pixel p: line){
				p.setALL(Pixel.MIN_LIGHT, Pixel.MIN_LIGHT, Pixel.MIN_LIGHT);
			}
		}
	}
}
