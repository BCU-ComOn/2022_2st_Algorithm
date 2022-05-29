result = int(input())


while True:                             #민지 : 고생하셨습니다 ~!
    
    a = input()
    if a == '=':
        break
    b = int(input())
    if a == '+':
        result += b
    elif a == '-':
        result -= b
    elif a == '/':
        result = result // b
    else:
        result *= b
                
print(result)
