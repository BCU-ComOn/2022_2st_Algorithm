c=int(input())
while True:
    b=input()
    if b == '=':
        break
    a=int(input())
    if b == '+':
        c += a
        
    elif b == '-':
        c -= a
        
    elif b == '*':
        c *= a
        
    else:
        c //= a
print(c)