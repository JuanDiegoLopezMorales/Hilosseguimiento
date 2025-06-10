public class HacerTarea implements Runnable{
    @Override
    public void run() {

        System.out.println("Abriendo chat gpt, claude ai y Arle pdf de explicación");
        try{
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("La tarea se termino con ayuda de el pdf de Arle");
    }


}
