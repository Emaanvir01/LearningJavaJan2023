print(range(100))

my_list= list(range(0,10))
print(my_list)

even =list(range(0,10,2))
opd = list(range(1,10,2))

print(even)
print(opd)

test=list(range(1,30,3)) # Here 1 is starting point
                         # 30 in  ending #
                         #3 is difference we want#
                         # we cannot use operators like multiply and additon  on range

print(test)

print(test.index(4))

list_test =[1,2,3,4,5]
print(list_test.index(5))
print(list_test[4])

odd =range(1, 10000, 2)
print(odd[900])

# seven =range(7, 10000000, 7)
# x= int(input("ENter number"))
# if x in seven:
#     print("{} is divisble  by seven".format(x))

smal_num = list(range(0, 10))
print(smal_num)
my_range = smal_num[::4]
print(my_range)
