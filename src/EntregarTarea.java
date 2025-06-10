public class EntregarTarea implements Runnable{
    @Override
    public void run() {

        System.out.println("Abriendo portal cue");
        try {
            Thread.sleep(15000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Se envio el codigo para que Arle no lo termine revisando");
    }

}
