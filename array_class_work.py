numbers = [17, 4, 9, 81, 25]




def find_max(numbers):
    largest_element = numbers[0]
    for number in numbers:
         if number > largest_element:
             largest_element = number
    return largest_element

print(find_max(numbers))


def reverse_list(numbers):
    return numbers[::-1]

print(reverse_list(numbers))


def is_in_list(element, numbers):
    return element in numbers


element = 0
print(is_in_list(element, numbers))


# def odd_elements(numbers_list):
#     for i in range(0, len(numbers_list), 2):
#         print(numbers_list[i])
#
#
# print(odd_elements(numbers))


def printers(numbers):
    print([numbers[i] for i in range(0, len(numbers), 2)])

    for i in range(0, len(numbers), 2):
        print(numbers[i])

printers(numbers)

