d,h,w = map(int,input().split())
r = d/(h**2+w**2)**0.5
print(int(h*r),int(w*r))

#구글링의 도움을 받은....코드 입니다..