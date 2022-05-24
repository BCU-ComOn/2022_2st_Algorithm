h, m = input().split()
n = 45
h = int(h)
m = int(m)
n = int(n)

h -= n // 60
m -= n % 60

if m >= 60 :
    h += 1
    m -= 60
if h >= 24:
    h -= 24;
if m < 0 :
    h -= 1
    m += 60
if h < 0:
    h += 24


print(h,m)