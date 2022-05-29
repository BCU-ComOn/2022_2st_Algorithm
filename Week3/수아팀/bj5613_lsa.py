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
        
# 주연 : 고생하셨습니다.
