h, m = map(int, input().split())
cm = int(input())

m += cm
h += m // 60
m = m % 60
h = h % 24

print(h, m)  #유석 : 고생하셨습니다 #도현 : 고생하셨습니다!