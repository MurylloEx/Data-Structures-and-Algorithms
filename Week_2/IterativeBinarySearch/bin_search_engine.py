# -*- coding: utf-8 -*-
def bin_search_find(srcList, id):
    l = 0 #Lado esquerdo onde a busca inicia
    r = len(srcList) - 1 #Lado direito onde a busca termina
    #Aplica de forma iterativa a busca e reajusta os limites a cada iteração (valores de l e r)
    while (l <= r):
        m = l + (r - l) / 2
        #Verifica se é o elemento do meio
        if (srcList[m].Id == id):
            return srcList[m]
        #Se o Id for maior, ignore o lado esquerdo
        elif (srcList[m].Id < id):
            l = m + 1
        #Se o ID é menor, ignora o lado direito
        else:
            r = m - 1
    #Elemento não encontrado
    return None
