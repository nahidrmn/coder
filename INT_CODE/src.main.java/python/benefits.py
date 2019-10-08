def list_benefits():
    return "More organized code", "More readable code", "Easier code reuse", "Allowing programmers to share and connect code together"

def build_sentence(benefit):
    return "%s is a benefit of functions!" %benefit

def name_the_benefits_of_functions():
    list_of_benefits = list_benefits()
    for benefit in list_of_benefits:
        print(build_sentence(benefit))
        
name_the_benefits_of_functions()

class MyClass():
    x="test string x"
    def function(self):
        print("This is a func inside the class")
    y="test string y"

myObject = MyClass()
print(myObject.x+", "+myObject.y)
print(myObject.function())

class Vehicle():
    year = 2010
    model = "325i"
    make = "bmw"
    value = 425.876
    
    def description(self):
        print(self.year, self.make, self.model,"%.2f" %self.value)

car1 = Vehicle()
car2 = Vehicle()

car1.description()

car2.year=2018
car2.make="toyota"
car2.model="rav4"
car2.value=2345.5767
car2.description() 


phonebook = {"jack":1234,"jams":3456}
print(phonebook)

for name, numb in phonebook.items():
    print(name, numb)
if "jack" in phonebook:
    print("jack available")
if "jill" not in phonebook:
    print("jill not in phonebook")
del phonebook["jack"]
print(phonebook)
