time=input().split()
for minute in range(0,45):
    time[1]=int(time[1])-1
    if(time[1]==-1):
        if(int(time[0])>0):
            time[0]=int(time[0])-1
        else:
            time[0]=23    
        time[1]=59
print(str(time[0])+" "+str(time[1]))
