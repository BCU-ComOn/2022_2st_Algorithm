def quad(x,y): #기금: 고생하셨습니다! :)
    if(y>0):
        if(x>0):
            return 1
        return 2
    else:
        if(x<0):
            return 3
        return 4
val_1,val_2=input(),input()
print(quad(int(val_1),int(val_2)))
