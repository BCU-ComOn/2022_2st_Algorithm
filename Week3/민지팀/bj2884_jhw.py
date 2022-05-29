h,m = input().split()

h = int(h)                    #민지 : 고생하셨습니다 ~!              
m = int(m)                          

if m >= 45:
    print(h,m-45)
else:
    if h-1 <0 :
        print(23,60-(45-m))
    else:
        print(h-1,60-(45-m))
