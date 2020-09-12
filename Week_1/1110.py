while True:
  N = int(input())
  
  if (N == 0):
    break
  
  pilha = list(range(1, N+1)) #Pilha de cartas recebida
  descartadas = list() #Pilha de cartas descartadas
  
  while (len(pilha) >= 2):
    descartadas.append(pilha.pop(0)) #Descarta a carta do topo
    pilha.append(pilha.pop(0)) #Passa a carta do topo para baixo
  
  print('Discarded cards: ' + str(descartadas).replace(']', '').replace('[', ''))
  print('Remaining card: ' + str(pilha[0]))