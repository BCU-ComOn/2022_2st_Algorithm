c = int(input())
a = 0
b = 0
while True:
    b = str(input())
    if b == '=':
        break
    a = int(input())
    if b == '+':
        c += a
    elif b == '-':
        c -= a
    elif b == '*':
        c *= a
    elif b == '/':
        c //= a
print(c)