import unittest

from account import Account


class AccountTest(unittest.TestCase):
    def setUp(self):
        self.account = Account("Bolaji Jibola", "6756")

    def test_depositMoneyWorks(self):
        self.account.deposit(12000.00)
        self.assertEqual(12000.00, self.account.check_balance("5645"))

    def test_withdrawMoneyWorks(self):
        self.account.deposit(12000.00)
        self.account.withdraw(5000.00, "6756")
        self.account.withdraw(7000.00, self.account.check_balance("6756"))


if __name__ == '__main__':
    unittest.main()
