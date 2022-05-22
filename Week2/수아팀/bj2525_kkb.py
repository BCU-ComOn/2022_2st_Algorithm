a, b = map(int, input().split())
timer = int(input()) 

a += timer // 60
b += timer % 60

if b >= 60:
    a += 1
    b -= 60
if a >= 24:
    a -= 24

print(a,b)

# 주연 : 잘하셨습니다. 조금 더 고민하면 코드를 줄일 수 있을 것 같습니다. 