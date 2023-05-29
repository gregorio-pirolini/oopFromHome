package androidTutorial.concurrency;

import javax.swing.plaf.basic.BasicTreeUI.TreeCancelEditingAction;

public class Main {
    public static void main(String[] args) {

        // Thread thread = new Thread(new Runnable() {
        //     @Override
        //     public void run() {

        //         for (int i = 0; i < 5; i++) {
        //             System.out.println("printing " +i + "in a worker threaad");
        //             try {
        //                 Thread.sleep(2000);
        //             } catch (InterruptedException e) {
        //                 // TODO Auto-generated catch block
        //                 e.printStackTrace();
        //             }
        //         }
        //         // System.out.println("hello from another thread");
        //     }
        // });
        // thread.start();

        // for (int i = 0; i < 5; i++) {
        //     System.out.println("printing " +i + "in a MAIN thread");
        //     try {
        //         Thread.sleep(2000);
        //     } catch (InterruptedException e) {
        //         // TODO Auto-generated catch block
        //         e.printStackTrace();
        //     }
        // }

        int a= 2;
        int b = 0;

        String name = null;
        try{
            name="Greg";
} catch (Exception e){
            
    System.out.println("B was ZERO");
        }


    }
}
