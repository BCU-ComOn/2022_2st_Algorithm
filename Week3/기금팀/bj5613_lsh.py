a=int(input()) #기금 : 고생하셨습니다!
while True:
    b=input()
    if b=='=':
        break
    n=int(input())
    if b=='+':
        a=a+n
    elif b=='-':
        a=a-n
    elif b=='*':
        a=a*n
    elif b=='/':
        a=a/n
print(a)