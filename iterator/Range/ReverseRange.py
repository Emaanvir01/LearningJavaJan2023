decimals= range(0, 100)
my_r= decimals[3:40:3]
print(my_r == range(3, 40, 3))
print(range(0, 5, 2) == range(0, 6, 2)) #Returns true as sequence has equal number in both ranges though value is diff
print(list(range(0, 5, 2)))

print(list(range(0, 6, 2)))

r= range(0,100)
print(r)

for i in r[:: -2]:
    print(i)

print("*" * 20)
for i in range(99, 0, -2):
    print(i)

print("*" * 20)

print(range(0, 100)[::-2] == range(99, 0, -2))

print("*" * 20)

for i in range(100, 0, -2):
    print(i)

print("*" * 20)

backstring ="ghnis rivnaamE"
compare = "Emaanvir singh"
print(compare)
print(backstring[::-1])   #RAnge in revrse order
print(backstring[::-2])

print("*" * 20)


rr = range(0, 10)
for ii in rr[::-1]:
    print(ii)
