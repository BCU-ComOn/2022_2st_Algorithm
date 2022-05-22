year = int(input())
y1 = year % 4
y2 = year % 100
y3 = year % 400                                 #민지 : 고생하셨습니다 ~
                                                #경모 : 수고하셨습니다
if y1 != 0:
    print(0)
if y1 == 0 and y2 != 0:
    print(1)
if y3 == 0:
    print(1)
if y2 == 0 and y3 != 0:
    print(0)
