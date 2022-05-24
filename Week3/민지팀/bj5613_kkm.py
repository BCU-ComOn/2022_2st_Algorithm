r = int(input())
while True:
    o = input()
    if o == "=":
        break
    n = int(input())
    if o == "+":
        r += n
    if o == "-":
        r -= n
    if o == "*":
        r *= n
    if o == "/":
        r //= n
print(r)