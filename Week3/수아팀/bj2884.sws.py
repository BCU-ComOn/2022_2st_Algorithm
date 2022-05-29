h,m =map(int, input().split())
if m >= 45: # 60분에서 45를빼면 정수가 나오지만 45이하에서 빼면 실수가 나오기 때문에
    m -= 45
elif h == 0 :
    h = 23
    m += 15 
else :
    h -= 1
    m += 15

print (h,m) 



