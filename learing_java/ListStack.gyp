from typeing import Optional

class Node:
    def __init__(self, data, next):
        self._data = data
        self._next = next 
    
class LinkedStack:
    def __init__(self):
        self._top =  




if __name__ == '__main__':
    stack = LinkedStack()
    for i in range(9):
        stack.push(i)
    print(stack)
    for _ in range(3):
        stack.pop()
    print(stack)
