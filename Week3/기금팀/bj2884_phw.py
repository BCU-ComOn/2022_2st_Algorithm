h,m = map(int,input().split()) #기금 : 고생하셨습니다!

if m < 45:   
    if h-1<0:
        print(23,15+m)
    else:
        print(h-1,15+m)
else:
    print(h,m-45)