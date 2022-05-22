H, M = map(int, input().split())
req_min = int(input())

H += req_min // 60
M += req_min % 60

if M >= 60:
    H += 1
    M -= 60

if H >= 24:
    H -= 24

print(H, M) #유석 : 고생하셨습니다 #도현 : 고생하셨습니다!
