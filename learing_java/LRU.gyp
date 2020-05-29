class ListNode:
    def __init__(self, x, y):
        self.key = x
        self.val = y 
        self.next = None
        self.prev = None

class LRUCache:
    def __init__(self, capacity):
        self.cap = capacity
        self.hkeys = {}
        # self.top and self.tail to get initialized and avoid surpassing boundary
        self.top = ListNode(None, -1)
        self.tail = ListNode(None, -1)
        self.top.next = self.tail
        self.tail.prev = self.top

    def get(self, key):
        if key in self.hkeys.keys():
            # update the sequence of node
            cur = self.hkeys[key]
            # jump out of the current position
            cur.prev.next = cur.next 
            cur.next.prev = cur.prev
            # placing at the top of the linked list
            top_node = self.top.next 
            self.top.next = cur    
            cur.prev = self.top 
            cur.next = top_node
            top_node.prev = cur 
            return self.hkeys[key].val
        return -1
    
    def put(self, key, value):
        # if key is in hash table, just try to update the sequence of linked list
        if key in self.hkeys.keys():
            cur = self.hkeys[key]
            cur.val = value 
            # jump out of the current position 
            cur.prev.next = cur.next 
            cur.next.prev = cur.prev 
            # placing at the top of the linked list
            top_node = self.top.next
            self.top.next = cur 
            cur.prev = self.top
            cur.next = top_node 
            top_node.prev = cur 
        # if key not in hash tables, inserting it :) 
        else:
            # add new node at the top of linked list 
            cur = ListNode(key, value)
            self.hkeys[key] = cur 
            # placing at the top of the linked list
            top_node = self.top.next 
            self.top.next = cur 
            cur.prev = self.top 
            cur.next = top_node 
            top_node.prev = cur 
            if len(self.hkeys.keys()) > self.cap:
                self.hkeys.pop(self.tail.prev.key)
                self.tail.prev.prev.next = self.tail 
                self.tail.prev = self.tail.prev.prev
        
    def __repr__(self):
        vals = []
        p = self.top.next 
        while p.next:
            vals.append(str(p.val))
            p = p.next
        return '->'.join(vals)


if __name__ == '__main__':
    cache = LRUCache(2)
    cache.put(1,1)
    cache.put(2,2)
    print(cache)

    cache.get(1)
    cache.put(3,3)
    print(cache)

    cache.get(2)
    cache.put(4,4)
    print(cache)

    cache.get(1)
    cache.get(3)
    print(cache)

    cache.get(4)
    print(cache)
