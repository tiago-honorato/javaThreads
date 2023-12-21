package pack;

public class Threads {

    public static void main(String[] args) {
        
        // Criando uma instância de Thread e passando t1 como Runnable
        Thread myThread = new Thread(t1);
        // Iniciando a thread criada
        myThread.start();
        
        // Criando e iniciando uma nova thread com t2 como Runnable
        new Thread(t2).start();
    }
    
    // Definindo um objeto Runnable t1 com implementação no local (classe anônima)
    public static Runnable t1 = new Runnable() {
        
        @Override
        public void run() {
            // Código que será executado na thread t1
            System.out.println("t1");
        }
    };
    
    // Definindo um objeto Runnable t2 com implementação no local (classe anônima)
    public static Runnable t2 = new Runnable() {
        
        @Override
        public void run() {
            // Código que será executado na thread t2
            System.out.println("t2");
        }
    };
}
