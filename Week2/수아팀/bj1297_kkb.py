d, h, w = map(int, input().split())
r = d / ((h ** 2 + w ** 2) ** 0.5)
print(int(h * r), int(w * r))

# 주연 : 고생하셨습니다.
# 수아: 깔끔한 코드네요!