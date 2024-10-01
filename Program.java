package maquinaDeEstados;

public class Program {

	public static void main(String[] args) {
        Semaforo semaforo = new Semaforo();
        
        // Simulando a transição entre os estados
        for (int i = 0; i < 6; i++) {
            semaforo.proximoEstado();
            // Aguardar um segundo entre as mudanças de estado
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
	}

}
