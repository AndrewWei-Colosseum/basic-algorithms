# Mergesort is nearly same as Quicksort, using the (Divide and Conquer), using recursion 

def merge_sort(array, low, high):  
    if low >= high:
        return
    start = low
    end = high
    mid = low + (high-low) // 2
    merge_sort(array, low, mid)
    merge_sort(array, mid+1, high)
    container = []
    i, j = low, mid+1
    while i <= mid and j <= high:
        if array[i] <= array[j]:
            container.append(array[i])
            i += 1
        else:
            container.append(array[j])
            j += 1
    if i <= mid:
        container.extend(array[i:mid+1])
    elif j <= high:
        container.extend(array[j:high+1])
    array[low:high+1] = container
    

if __name__ == '__main__':
    array = [3,4,6,4,9,34,2,23,12,1,2]
    merge_sort(array, 0, len(array)-1)
    print(array)

# Time complexity: O(nlogn); Space complexity: O(nlogn)
# From top to bottom 
