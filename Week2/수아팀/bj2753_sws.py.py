y = int(input())
#4의 배수이면서,
if (y%4  ==0):
    # 100의 배수가 아닐 때 또는 400의 배수일 때이다
    if (not(y%100 ==0) or (y%400 == 0)):
        print("1")
else:
    print("0")

# 주연 : 제가 알려드릴 때 조건문 조건식에 소괄호를 사용했는데 사용하지 않아도 됩니다.
# 자세한 건 bj2753_kkb.py 를 참고하면 좋을 것 같습니다.