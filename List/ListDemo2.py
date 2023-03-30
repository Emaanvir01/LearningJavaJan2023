menu=[]
menu.append(["egg", "spam", "bscon"])
menu.append(["egg", "sausage ", "bacon"])
menu.append(["egg", "spam"])
menu.append(["egg", "bacon", "spam"])
menu.append(["egg", "bacon", "sauage ", "spam"])
menu.append(["spam", "bacon", "sausage", " spam"])
menu.append(["spam", "egg", "spam", "spam", "bacon", "spam"])
menu.append(["spam", " egg ", "sausage", "spam"])
#menu.append(["spam ", " egg ", "sausage ", "spam " ])  this list  different as check  mentioned below  does  not work
# on it as it has EXTRA CHARATER I.E SPACE.

for m in menu:
    if  not "spam" in m:
        print(m)