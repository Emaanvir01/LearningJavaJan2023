num= []
for i in range(1,6):
    n=int(input("enter number"))
    num.append(n)

print(num) # This is dump #

my_iterator = iter(num)

for i in  range(0,len(num)):
    next_item  = next(my_iterator)
    print(next_item)

# In simple way
for i in  num:
    print(i)




