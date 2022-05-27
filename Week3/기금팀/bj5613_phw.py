c=int(input())  #기금 : 고생하셨습니다 :>
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