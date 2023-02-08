value = [11, 3, 1, 2, 5, 62, 2, 1, 4, 55]
m = []
for number in value:
    if number < 5:
        m.append(number)

print(m)
print([number for number in value if number < 5])



compare_to = int(input("Enter a number to compare the list elements to: "))
for number in value:
    if number< compare_to:
        print(number)




