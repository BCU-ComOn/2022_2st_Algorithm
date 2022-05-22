h, m = map(int,input().split())
a = int(input())

h += a // 60
m += a % 60

if m >= 60 :
    h += 1
    m -=60

if h >= 24:
    h -= 24

print('%d %d' %(h,m))

# 주연 : 잘하셨습니다. 조금 더 고민하면 코드를 줄일 수 있을 것 같습니다. 