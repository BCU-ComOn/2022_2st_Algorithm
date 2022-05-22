d, h, w = input().split()                   #현우 :고생하셨습니다
d = int(d)
h = int(h)
w = int(w)
r = d / ((h ** 2 + w ** 2) ** 0.5)
print(int(h * r), int(w * r))