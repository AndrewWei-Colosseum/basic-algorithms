

def xor(a):
    res = 0
    for i in a:
        res = res ^ i
    first = 1
    while not (first & res):
        first <<= 1
    b, c = 0, 0 
    for i in a:
        if i & first:
            b ^= i
        else:
            c ^= i

    return [b,c]

def xor2(a):
    res = 0 
    for i in a:
        res ^= i
    for i in set(a):
        res ^= i 
    return res
    


if __name__ == '__main__':
    a = [1,2,1,3,2,5,4,4]
    res = xor(a)
    print(res) # --> [3,5]

    b = [5,4,3,2,1,2]
    res = xor2(b)
    print(res) # --> 2