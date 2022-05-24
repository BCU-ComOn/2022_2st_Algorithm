result = int(input())


while True:
    
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
