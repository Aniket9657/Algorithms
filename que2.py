a=[1,2,5,-1,5,1]
max=a[0]
min=a[0]
for i in a:
    if i>max:
        max=i
    if i<min:
        min=i


print(max)
print(min)