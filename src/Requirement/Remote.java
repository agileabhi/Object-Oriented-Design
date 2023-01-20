package Requirement;

import java.util.Timer;
import java.util.TimerTask;

public class Remote {

    private DogDoor door;

    public Remote(DogDoor door){
        this.door=door;
    }

    public void pressButton(){

        // if door is open then close it.
        // if door is closed then open it and close it automatically after 10s

        if(door.isOpen()){
            door.setOpen(false);
            System.out.println("Door closed");
        }else{
            door.setOpen(true);
            System.out.println("door open");
//            TimerTask task = new TimerTask() {
//                @Override
//                public void run() {
//                    door.setOpen(false);
//                    System.out.println("door closed");
//                }
//            };

            Timer timer = new Timer();
            timer.schedule(new TimerTask() {
                @Override
                public void run() {
                    door.setOpen(false);
                    System.out.println("door closed");
                    timer.cancel();
                }
            },1000);

        }
    }
}
