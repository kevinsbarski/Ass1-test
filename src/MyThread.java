public class MyThread extends Thread
{
    String name;
    public MyThread(){
        name = "Egor";
    }

    public void run(){
        for(int i =0 ; i < 500 ; i++)
            System.out.println("hey");
    }



}
