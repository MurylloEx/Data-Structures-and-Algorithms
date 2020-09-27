def insertion_sort(srcList):
    for r_idx in range(1, len(srcList)):
        key = srcList[r_idx]
        l_idx = r_idx - 1
        while l_idx >= 0 and srcList[l_idx] > key:
            srcList[l_idx + 1] = srcList[l_idx]
            l_idx = l_idx - 1
        srcList[l_idx + 1] = key
        print(srcList)

lista = [4, 1, 7, 2, 8, 3, 8, 8, 8, 8.1, 9]

insertion_sort(lista)

print(lista)