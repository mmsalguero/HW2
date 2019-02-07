
public class BeerSong{

  public static void main(String args[]){

  }

  public static void Ninety_Nine_Bottles_of_Beer(){
    for(int i = 0; i < 98; i++){
      System.out.println((99-i) + " bottles of beer on the wall,"+ (99-i) +" bottles of beer\n take one down, pass it around, " + (98-i) + " bottles of beer on the wall");
    }
    System.out.println((1) + " bottles of beer on the wall,"+ (1) +" bottles of beer\n take one down, pass it around, no more bottles of beer on the wall");

  }

}
