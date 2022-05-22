import math

d, h, w = map(int, input().split())
print(int(d*h//math.sqrt((h*h)+(w*w))))
print(int(d*w//math.sqrt((h*h)+(w*w))))   #유석 : 고생하셨습니다 #도현 : 고생하셨습니다 !