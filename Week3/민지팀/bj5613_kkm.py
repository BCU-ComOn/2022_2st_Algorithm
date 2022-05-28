r = int(input())
while True:
    o = input()
    if o == "=":                            #민지 : 고생하셨습니다 ~!
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