# O Semáforo como um Exemplo Clássico de Máquina de Estados

Um semáforo é um excelente exemplo de máquina de estados por diversas razões:

## 1. Estados finitos e bem definidos
- Um semáforo possui apenas alguns estados possíveis:
  - **Vermelho**
  - **Amarelo**
  - **Verde**
  
Esses estados são claramente definidos e não há estados intermediários.

## 2. Transições definidas
- As transições entre os estados são bem conhecidas e ocorrem em uma sequência específica. Por exemplo:
  - **Vermelho → Amarelo → Verde**

## 3. Eventos que causam transições
- A mudança de um estado para outro é causada por um evento externo: **o tempo decorrido**.
  - Após um determinado período em cada estado, o semáforo muda automaticamente para o próximo estado.

## Saídas Associadas aos Estados
Cada estado do semáforo está associado a uma saída específica, que indica aos veículos e pedestres o que devem fazer.

## Em resumo um semáforo demonstra as características fundamentais de uma máquina de estados:

### 1. Estados Discretos
- Um número finito de estados claramente definidos.

### 2. Transições entre Estados
- Mudanças de um estado para outro ocorrem de acordo com regras específicas.

### 3. Eventos que Acionam as Transições
- Um evento externo (o tempo, neste caso) causa a mudança de estado.

### 4. Saídas Associadas aos Estados
- Cada estado tem uma saída correspondente.
  
# Por que usar o semáforo como exemplo?

- **Simplicidade**: O semáforo é um sistema fácil de entender e visualizar, apresentando poucos estados e transições.
  
- **Aplicabilidade**: O conceito de máquina de estados é fundamental em diversas áreas da computação, e o semáforo serve como uma analogia que torna mais intuitivo o entendimento desse conceito.

- **Visualização**: O funcionamento de um semáforo pode ser representado através de um diagrama de estados, facilitando a análise e a compreensão do sistema.

Em resumo, o semáforo é um exemplo perfeito para introduzir o conceito de máquina de estados, pois ilustra de forma clara e concisa como um sistema pode mudar de um estado para outro em resposta a eventos externos.
