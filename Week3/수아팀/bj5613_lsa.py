result = int(input())

while True :
    char = input()

    if char == "+" :
        result += int(input())
    if char == "-" :
        result -= int(input())
    if char == "*" :
        result *= int(input())
    if char == "/" :
        result //= int(input())
    if char == "=" :
        break               
print(result)
        
        
