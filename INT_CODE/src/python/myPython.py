def myFunc():
    print('hello from myFunc')
def myFuncWithArgs(day, greetings):
    print("%s, today is %s" %(greetings, day))
def sumOfTwoNums(a, b):
    return a+b
myFunc()
myFuncWithArgs('Tuesday', 'Welcome')
print(sumOfTwoNums(2, 3))

import random

def lottery():
    for i in range(6):
        yield random.randint(i,15)
        
for random_number in lottery():
    print("The next number is %d" %(random_number))