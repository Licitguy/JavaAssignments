def find_divisors():
    user_input = int(input("Enter a number: "))
    divisors = []
    for i in range(1, user_input +1):
        if user_input % i == 0:
            divisors.append(i)
    print(divisors)
find_divisors()

def common_elements(list1, list2):
    common = []
    for element in list1:
        if element in list2 and element not in common:
            common.append(element)
    return common

list1 = [1, 2, 3, 4, 5, 7, 8]
list2 = [2, 4, 6, 8, 10]
print(common_elements(list1, list2))

print([i for i in list1 if i in list2])