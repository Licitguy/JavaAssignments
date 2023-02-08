class Account:
    def __init__(self, name, pin):
        self._name = name
        self._pin = pin
        self._balance = 0

    def check_balance(self, pin):
        if pin == self._pin:
            return self._balance

    def deposit(self, amount):
        self._balance += amount
        pass

    def withdraw(self, amount, pin):
        if amount > self._balance:
            print("insufficient balance")
            if amount < 0:
                print("invalid input")
        elif pin == self._pin:
            self._balance -= amount
