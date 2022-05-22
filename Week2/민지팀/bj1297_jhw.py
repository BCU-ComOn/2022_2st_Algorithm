D,H,W = input().split()
D,H,W = int(D),int(H),int(W)                    #민지 : 고생하셨습니다 ~
r = D/(H**2+W**2)**0.5                          #경모 : 수고하셨습니다
height = int(H*r)
width = int(W*r)
print(height, width)
