import math

def merge_sort(srcList, sl_idx, sr_idx):
    if sr_idx > sl_idx:
        middle = (sl_idx + sr_idx) // 2
        merge_sort(srcList, sl_idx, middle)
        merge_sort(srcList, middle + 1, sr_idx)
        merge(srcList, sl_idx, middle, sr_idx)

def merge(srcList, l_idx, middle, r_idx):
    r_len = (middle - l_idx) + 1
    l_len = (r_idx - middle)

    left = [None] * (l_len + 1)
    right = [None] * (r_len + 1)

    for idx in range(l_len):
        left[idx] = srcList[l_idx + 1]
    for idx in range(r_len):
        right[idx] = srcList[middle + idx + 1]
    
    left[-1] = math.inf
    right[-1] = math.inf

    i = 0
    j = 0
