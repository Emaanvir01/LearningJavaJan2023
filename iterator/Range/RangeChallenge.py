even = range(0, 100, 2)
odd = range(1, 100, 2)

print(even)
print(odd)

even_num =even[::5]
for e in even_num:
    print("Even number",e)

print("*" * 50)

odd_num = odd
for o in odd_num[::5]:
    print("Odd number",o)

print("*" * 50)


