H,M=map(int, input().split()) #기곰: 고생하셨습니다!
if M>44:
    print(H,M-45)
elif M<45 and H>0:
    print(H-1,M+15)
else:
    print(23,M+15)