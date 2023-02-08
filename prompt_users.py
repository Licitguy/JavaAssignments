num = int(input("Enter a number: "))

if num % 2 == 0:
    print("The number is even.")
else:
    print("The number is odd.")

if num % 4 == 0:
    print("The number is multiple of 4. ")
else:
    print("It cannot be divided by 4. ")

user_number = int(input("Enter a number to check: "))
checker = int(input("Enter a number to divide by: "))

if user_number % checker == 0:
    print("The number divides evenly.")
else:
    print("The number does not divide evenly.")
