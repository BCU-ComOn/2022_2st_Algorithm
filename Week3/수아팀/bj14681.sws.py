sf = int(input())
while True:
    o=input()
    if o=='=':
        break
    num= int(input())
    if o=='+':
        f += num
    elif o == '-':
        f -= num
    elif o == '*':
        f *= num
    else:
        f//= num
print(f)