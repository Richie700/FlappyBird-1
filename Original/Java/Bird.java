public class Bird {
  
  private double X;
  private double Y;
  private double YSpeed;
  private double rotation;
  private double rotSpeed;
  private long lastUp;
  /* X og Y eru � bilinu [0;100] og eru hnit Flappy
   * YSpeed [-0.9; 0.6] og er hra�i Flappy � y-stefnu
   * rotation er � bilinu [-20�;20�] og er stefna Flappy
   * rotSpeed er s� hra�i sem Flappy er a� sn�ast um
   * lastUp er t�mi �egar up() var s��ast virkja�
   */
  
  public Bird () {
    X = 50;
    Y = 50;
    YSpeed = 0;
    rotation = 0;
    rotSpeed = 0;
    lastUp = System.currentTimeMillis()/10;
  }
  
  public void up(long timi) {
    //////////////////
    // YSpeed Flappy
    // Kemur � veg fyrir a� h�gt s� a� halda inni upp �rvalykli:
    if (!(System.currentTimeMillis()/10 - lastUp < 8) && (YSpeed < 0.6)) {
      // �egar �tt er � upp�rvalykil �n �ess a� halda honum inni:  
      YSpeed = 0.45; // Hr��un upp � vi�
      Y += 1;
      rotSpeed = 10;
    }
    lastUp = timi; // Fyrir n�sta skipti sem kalla� er � up
  }
  
  public void draw() {
    // �yngdarhr��un jar�ar hefur �hrif
    if (YSpeed > -1.4) YSpeed -= 0.04; // Hr��un ni�ur � vi�
    Y += YSpeed;
    //rotSpeed
    if (rotSpeed > -4) rotSpeed -= 0.2;
    if (-90 < rotation || rotSpeed > 0) rotation += rotSpeed;
    if (rotation > 40) {rotation = 40; rotSpeed = 0;}
    
    StdDraw.picture(X, Y, "../Myndir/flappyBird.png", 10, 10, rotation);
  }
}