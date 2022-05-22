hours, mins = map(int, input().split())
times = int(input())

mins += times

while mins>= 60:
     mins -=60
     hours+=1

if hours >= 24:
     hours-=24

print(hours, mins)
#이해를 돕기 위해 구글링을 통하여 최대한 이해해 보았습니다 ..ㅎ