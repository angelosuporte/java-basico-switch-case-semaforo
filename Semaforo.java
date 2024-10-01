package maquinaDeEstados;

public class Semaforo {
	
    private EstadoSemaforo estadoAtual;

    public Semaforo() {
        this.estadoAtual = EstadoSemaforo.VERMELHO; // Estado inicial

    }
    
    // Método para transitar para o próximo estado
    public void proximoEstado() {
        switch (estadoAtual) {
            case VERDE:
                estadoAtual = EstadoSemaforo.AMARELO;
                break;
            case AMARELO:
                estadoAtual = EstadoSemaforo.VERMELHO;
                break;
            case VERMELHO:
                estadoAtual = EstadoSemaforo.VERDE;
                break;
        }
        exibirEstado(); // Exibe o estado atual após a transição
    }

    // Método para exibir o estado atual
    public void exibirEstado() {
        System.out.println("Estado atual do semáforo: " + estadoAtual);
    }

}
