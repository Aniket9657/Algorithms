mylist=['Ravi', 'Kishor', 'Ben10', 'Mahesh', 'Ranjeet', 'Samuel', 'Joker']
print(mylist)




#checks if element is present uding in 
if  "Kishor" in mylist:
    print("found")

#extend method 
   
mylist1 = [1,2,3,4]
print(mylist1)

mylist.extend(mylist1)

print("Update list \n",mylist)

#length of list
print(len(mylist))


mylistx = [1,2,3,4,-13,4,2,-1,34,-356]
# get the maximum value 
print(max(mylistx))
# get the min value 
print(min(mylistx))

# how to make copy of the list 
mylisty = mylistx.copy()
print(mylisty)


#sort a list 
mylisty.sort()
print(mylisty)


#reverse the order 
mylist.reverse()
print(mylist)

