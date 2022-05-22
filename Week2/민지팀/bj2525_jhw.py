a,b = input().split()
c = input()

a = int(a)                              #민지 : 고생하셨습니다 ~
b = int(b)                              #경모 : 수고하셨습니다
c = int(c)

b = b + c
while a >= 24 or b >= 60:   
    if b>=60:
        a = a + 1
        b = b - 60
    if a >= 24:
        a = a - 24
        
print("%d %d" %(a,b))
