from abc import ABC, abstractmethod

# Class Bank
class Bank(ABC):
    
    
    def basicinfo(self) -> str:
        print('This is generic bank')
        return 'Generic Bank: 0'

    @abstractmethod
    def withdraw(self) -> None:
        pass

# Class Swiss
class Swiss(Bank):
    def __init__(self) -> None:
        self.bal = 1000

    def basicinfo(self) -> str:
        print("This is the Swiss Bank")
        return  f'Swiss Bank: {self.bal}'

    def withdraw(self, amount) -> float:
        if amount > self.bal:
            print('insufficent funds')
        else:
            self.bal = self.bal - amount
            print( f'withdrawn amount:{amount}')
            print( f'New Balence:{self.bal}')
        return self.bal

# Driver Code
def main():
    assert issubclass(Bank, ABC), "Bank must derive from class ABC"
    s = Swiss()
    print(s.basicinfo())
    s.withdraw(30)
    s.withdraw(1000)

if __name__ == "__main__":
    main()