
def perm(n,stack):
    if len(n) == len(stack):
        res.append(stack[:])
    for i in range(len(n)):
        if n[i] in stack:
            continue 
        
        stack.append(n[i])
        perm(n, stack)
        stack.remove(n[i])    

res = []
stack = []
n=[1,2,3]
perm(n,stack)
print(res)