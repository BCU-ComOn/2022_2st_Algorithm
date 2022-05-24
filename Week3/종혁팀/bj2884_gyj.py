a, b = map(int, input().split())
c = (b+60-45) % 60
if b < 45:
    a = a-1
print((a % 24), c)