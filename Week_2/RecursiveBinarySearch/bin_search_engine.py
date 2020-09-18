
def bin_search_find(srcList, id):
    if len(srcList) > 1:
        middle = len(srcList) // 2
        if (srcList[middle].Id == id):
            return srcList[middle]
        elif (srcList[middle].Id > id):
            return bin_search_find(srcList[:middle], id)
        else:
            return bin_search_find(srcList[middle:], id)
    else:
        return None