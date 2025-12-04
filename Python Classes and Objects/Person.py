
class Person:
    
    def __init__(self, name = "", age = 0, height = 2.0):
        # Inside here we can be able to define instance variables
        self.__name = name
        self.__age = age

        # Encapsulation is the concept of information hiding
        # in OOP
        # In Python we can be able to make instance variable
        # private by placing two underscores in front of the variable
        self.__height = height
    

    # Remember that we we create private variable,
    # We can be able to also create public getters and
    # setter for those private variables
    def get_height(self):
        return self.__height
    
    def get_age(self):
        return self.__age
    
    def get_name(self):
        return self.__name

    def set_height(self, height):
        self.__height = height

    def set_age(self, age):
        self.__age = age
    
    def set_name(self, name):
        self.__name = name
    
    def display(self):
        print("Name: ", self.__name)
        print("Age :", self.__age)
        print("Height: ", self.__height)
    
    def __str__(self):
        age1 = str(self.__age)
        height1 = str(self.__height)

        return "{Name: " + self.__name + ", Age: " + age1 + ", Height: " + height1 + "}"
# Let us test the class we have just created
