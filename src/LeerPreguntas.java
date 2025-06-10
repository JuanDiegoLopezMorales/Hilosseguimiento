public class LeerPreguntas implements Runnable {

    @Override
    public void run() {
        System.out.println("leyendo las preguntas de la tarea");
        try{
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Se le dio una primera vista a las preguntas");

    }
}
