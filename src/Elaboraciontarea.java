public class Elaboraciontarea {
    public static void main(String[] args) {
        Thread leerPreguntas = new Thread(new LeerPreguntas());
        Thread hacerTarea = new Thread(new HacerTarea());
        Thread entregarTarea = new Thread(new EntregarTarea());

        leerPreguntas.start();
        hacerTarea.start();
        entregarTarea.start();

    }
}
