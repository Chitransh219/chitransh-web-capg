import re
hand = open('words.txt')
numlist = list()

for line in hand:
    line = line.rstrip()
    temp= re.findall('[0-9]+', line)
    if len(temp) == 0: continue
    for i in range(len(temp)):
        num = int(temp[i])
        numlist.append(num)
        

print(sum(numlist))