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

# 주연 : sf 오타가 있는것 같습니다. 확인 부탁드립니다.