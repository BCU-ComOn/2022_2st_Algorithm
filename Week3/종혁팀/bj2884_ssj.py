h,m = map(int,input().split())

if m < 45:
    if(h !=0):
        print(h-1, 60-45+m)
    else:
        print(23-h, 60-45+m)
elif m >= 45:
    print(h, m-45)