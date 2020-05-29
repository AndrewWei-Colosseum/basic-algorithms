def l inkList(head):
    start = head 
    while start:
            count += 1 
            if count == k - 1:
                prev = start 
                tmp = start
                prev.next = tmp.next.next
                tmp.next.next = prev 
            start = start.next 
        print(head)
    

