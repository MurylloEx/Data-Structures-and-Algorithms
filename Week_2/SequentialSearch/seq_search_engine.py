
def seq_search_find(srcList, id):
  for srcObj in srcList:
    if ((srcObj is not None) and (srcObj.Id is not None) and (srcObj.Id == id)):
      return srcObj
  return None
