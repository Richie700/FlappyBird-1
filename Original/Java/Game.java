public class Game {
  
  public Game () {}
  
  public int eydamer() {
    return 5;
  }
  
  public void run() {
    StdDraw.setCanvasSize(512, 512);
    StdDraw.setScale(0, 100);
    Bird flappy = new Bird();
    long upThen = System.currentTimeMillis()/10;
    int score = 0;
    
    boolean running = true;
    while (running) {
      // �arf a� b�ta vi� pixlum efst � bakgrunninn
      StdDraw.show(5);
      StdDraw.picture(50, 30, "../Myndir/background.jpg", 110*1.6, 110);
      //////////////////////////////////////////
      
      flappy.draw();
      
      //////////////////
      // Takkaskipanir
      //////////////////
      
      // H�mlur � �a� hversu oft m� �ta � up me� vissu t�mabili
      if (StdDraw.isKeyPressed(38)) flappy.up(System.currentTimeMillis()/10);   // Er veri� a� �ta � upp �rvalykil?
      if (StdDraw.isKeyPressed(27)) close();                                    // Er veri� a� �ta � Escape?
      
      //////////////
      // Stigagj�f
      //////////////
      
      
      
      //////////////////////////////////////////
      StdDraw.show();
    }
  }
    
  public void close() {
    System.exit(0);
  }
    
}