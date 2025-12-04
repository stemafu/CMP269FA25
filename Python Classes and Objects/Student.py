from Person import Person

class Student (Person):

    def __init__(self, name, age, height, emplid, major):
        # notice that name, age and height are already defined
        # in the parent class. So we can be able to use the
        # parent class to initialize name, age and height
        # using the keyword super
        super().__init__(name, age, height)
        self.__emplid = emplid
        self.__major = major
    
    def get_emplid(self):
        return self.__emplid
    
    def get_major(self):
        return self.__major
    
    def set_emplid(self, emplid):
        self.__emplid = emplid
    
    def set_major(self, major):
        self.__major = major
    
    def display(self):
        super().display()
        print("Emplid: ", self.__emplid)
        print("Major: ", self.__major)
    


def main():
    s1 = Student("Peter", 11, 5.6, "12345678", "CS")
    '''print(p1.get_height())
    p1.set_name("Peter")
    p1.set_height(5.9)
    p1.set_age(10)
    p1.display()
    '''
    #print(p1)
    s1.display()


main()