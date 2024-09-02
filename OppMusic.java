interface Playable
{
    void play();
    void stop();
}
class Mp3player implements Playable
{
     public void play()
     {
        System.out.println("mp3 player is playing");
     }
     public void stop()
     {
        System.out.println("mp3 player is stopped");
     }
}
class Radio implements Playable
{
     public void play()
     {
        System.out.println("radio player is playing");
     }
     public void stop()
     {
        System.out.println("radio player is stopped");
     }
}


public class OppMusic {
    public static void main(String[] args) {
        
     Mp3player mp=new Mp3player();
     mp.play();
     mp.stop();
     Radio r=new Radio();
     r.play();
     r.stop();


    }
}
