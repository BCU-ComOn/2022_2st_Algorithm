a = int(input())
while True:
    r = input()
    if r == '=':
        break
    n = int(input())
    if r == "+":
        a += n
    if r == "-":
        a -= n
    if r == "*":
        a *= n
    if r == "/":
        a //= n



print(a)
