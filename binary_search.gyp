def bsearch(arr2, val):
    return bsearchInternally(arr2, 0, len(arr2)-1, val)


def bsearchInternally(arr2, low, high, val):
    if low > high:
        return -1
    mid = low + ((high - low) >> 1)
    if arr2[mid] == val:
        return mid
    elif arr2[mid] < val:
        return bsearchInternally(arr2, mid+1, high, val)
    else:
        return bsearchInternally(arr2, low, mid-1, val)
        

def last_ele(arr, val):
    low, high = 0, len(arr)-1
    while low <= high:
        mid = low + ((high-low) >> 1)
        if arr[mid] > val:
            high = mid - 1
        elif arr[mid] < val:
            low = mid + 1
        else:
            if mid == len(arr)-1 or arr[mid+1] != val:
                return mid
            else:
                low = mid + 1
    return -1

def first_ele(arr, val):
    low, high = 0, len(arr)-1
    while low <= high:
        mid = low + ((high-low) >> 1)
        if arr[mid] > val:
            high = mid - 1
        elif arr[mid] < val:
            low = mid + 1
        else:
            if mid == 0 or arr[mid-1] != val:
                return mid
            else:
                high = mid - 1
    return -1



arr = [1,5,6,7,13,15,15,15,45]
res = last_ele(arr, 15)
res2 = first_ele(arr, 15)
print(res2)
print(res)

arr2 = [1,2,3,4,5,12,15,34,63,66]
res3 = bsearch(arr2, 11)
print(res3)
