import java.util.Random;

public class Pumpkin implements Runnable{
    String pumpID;
    High h;
    int height;
    int curr_height;

    public Pumpkin(String pumpID, High h, int height){
        this.pumpID = pumpID;
        this.h = h;
        this.height =height;
        this.curr_height = 0;
    }
    public void grow(){
        Random r = new Random();
        int randomNum = r.nextInt(1,11);
        this.curr_height += randomNum;
        if(height-curr_height>0)
            System.out.println(this.pumpID+":"+"    "+(height-curr_height)+" cm to max height");

    }
    public String GetpumpID(){
        return pumpID;
    }

    @Override
    public void run() {
        try {
            while(curr_height < height) {
                Thread.sleep(2000);
                grow();
            }
            h.TheBigPumpkin(this);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
