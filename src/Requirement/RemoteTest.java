package Requirement;

public class RemoteTest {



    public static void main(String[] args){
        Remote remote = new Remote(new DogDoor());
        remote.pressButton();
        try{
           Thread.sleep(1000 * 2);
        }catch (Exception ex){
            System.out.println("Thread interrupted");
            System.out.println("barks again from outside");
            remote.pressButton();
        }

    }
}
