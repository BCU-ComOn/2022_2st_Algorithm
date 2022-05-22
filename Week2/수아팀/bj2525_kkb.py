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