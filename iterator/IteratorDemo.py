string ="1234567890"


#for char in string:
    #print(char)

# my_iterator = iter(string)
# print(my_iterator) # it gives the  memory location
#
# # print(next(my_iterator))
# print(next(my_iterator))
# print(next(my_iterator))
# print(next(my_iterator))
# print(next(my_iterator))
# print(next(my_iterator))
# print(next(my_iterator))
# print(next(my_iterator))
# print(next(my_iterator))
# print(next(my_iterator))

#print(next(my_iterator)) # this will  give error as we have only TEN iterations  possiable and this is eleventh call
# so it give error
# this how  for loop  works in  back


for char in string: # this is we see or use.
    print(char)


for char in iter(string): #This is how iterator works in  back
    print(char)



