# Quicksort use the strategy of Divide and Conquer, using recursion to make the whole array 
# become the sorted array. 
def quick_sort(array, low, high):
    if low >= high:
        return 
    # Really important, find a temporory value to let all the values compare with this one.
    mid = array[low]
    start = low
    end = high
    while low < high:
        while low < high and array[high] > mid:
            high -= 1
        array[low] = array[high]
        while low < high and array[low] <= mid:
            low += 1
        array[high] = array[low]
    array[low] = mid
    # Repeat the above process utill all the subset only have one element.
    # Let the left and right side of temporory value become the new array.
    quick_sort(array, start, low-1)
    quick_sort(array, low+1, end)

if __name__ == '__main__':
    array = [3,4,6,4,9,34,2,23,12,1,2]
    quick_sort(array, 0, len(array)-1)
    print(array)

# Features: Time complexity: O(nlogn); Space complexity: O(nlogn)
# From top to bottom, and it is more popular than the merge_sort

