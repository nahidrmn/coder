def fibo():
    a, b = 1, 1
    while 1:
        yield a
        a, b = b, a + b  

import types

if type(fibo()) == types.GeneratorType:
    print("Good, The fibo func is a generator.")
    
    counter=0
    for n in fibo():
        print(n)
        counter+=1
        if counter == 10:
            break        