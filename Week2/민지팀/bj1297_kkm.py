d, h, w = input().split()
d = int(d)
h = int(h)
w = int(w)
r = d / ((h ** 2 + w ** 2) ** 0.5)
print(int(h * r), int(w * r))