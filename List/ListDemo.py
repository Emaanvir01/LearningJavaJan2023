c_list =["green", "red" , "color"]

c_list.append("yellow")
c_list.remove("green")

for List in c_list:
    print("color list is  ", List)


even =[2, 4, 6, 8, 10]
odd = [1, 3, 5, 7, 9]

numbers= even + odd
#numbers.sort()
# print(numbers.sort())
# it will  not work  as it is behavior of python.
# the idea is that SORT METHOD WILL  WORK  ON OBJECT THAT IT WAS CALLED UPON RATHER THAN  CREATIING NEW OBECT
# in simple words it  works on exisitng  varibles
#for num in numbers:
nnum_in_ooder= sorted(numbers)
print(nnum_in_ooder)


if numbers ==  nnum_in_ooder :
    print("euqal list")
else:
    print("not equal  list")

if nnum_in_ooder == sorted(numbers):
     print("Equal list")
else:
    print("not equal")



for num in  nnum_in_ooder:
    print(num)


# LIST WITH CONSTRUCTURE

list_1 = []
list_2 = list()

print(" Listv 1:{}".format(list_1))
print(" Listv 2:{}".format(list_2))

if list_1 == list_2:
    print(" Yes they are equal lists")

print(list("the list  are  equal"))

