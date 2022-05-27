ex=input()   #기금 : 고생하셨습니다!
while(True):
    opr=input()
    if(opr=="="):
        break
    ex=ex+opr+input()
value=eval(ex)
print(value)
    
