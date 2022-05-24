ex=input()
while(True):
    opr=input()
    if(opr=="="):
        break
    ex=ex+opr+input()
value=eval(ex)
print(value)
    
