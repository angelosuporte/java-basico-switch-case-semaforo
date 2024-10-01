package maquinaDeEstados;

public class Semaforo {
	
    private EstadoSemaforo estadoAtual;

    public Semaforo() {
        this.estadoAtual = EstadoSemaforo.VERMELHO; // Estado inicial

    }
    
    // M�todo para transitar para o pr�ximo estado
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
        exibirEstado(); // Exibe o estado atual ap�s a transi��o
    }

    // M�todo para exibir o estado atual
    public void exibirEstado() {
        System.out.println("Estado atual do sem�foro: " + estadoAtual);
    }

}
