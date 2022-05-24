r = int(input())
while True:
    o=input()
    if o == '=':
        break
    n = int(input())
    if o == '+':
        r +=n
    elif o == '-':
        r -=n
    elif o == '*':
        r *=n
    else:
        r //=n
print(r)