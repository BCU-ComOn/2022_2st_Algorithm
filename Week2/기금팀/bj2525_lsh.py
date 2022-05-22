h,m=map(int,input().split())    #기곰 : 고생하셨습니다 :>
time=int(input())               # 민규 : 수고하셨습니다 :)

time_h =time // 60
time_m =time % 60
h +=time_h
m +=time_m
if m>=60:
    h +=1
    m -=60
if h>=24:
    h -=24
print(h,m)