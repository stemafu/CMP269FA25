
# This is a comment in Python.
# To create a a function in Python, we use the keyword def
# and that is followed by the name of the function
# When we create variables or parameter, we do not have to
# provide their data type. This is because Python is 
# a dyamically typed language. 
# All functions in Python, return a value.
# If you do not specify that a function will return a value,
# by default that Python function returns a NONE
def sumOFTwo(num1, num2):
    if (num1 < 0) or (num2 < 0):
        return 0
    else:
        return (num1 + num2)
'''
Let us create a function that takes age as a parameter
and determines if one is minor, a teenager, young adult,
adult or senior.
age is 0 that a new born
minor is any below 13
teenager is anyone between 13 and 19
young adult is anyone between 20 and 30
and adult is anyone between 31 and 59
and senior is anyone 60 or above.
'''
def ageGroup(age):

    group = ""
    if(age < 0):
        group = "age cannot be negative"
    elif (age == 0):
        group = "Newborn"
    elif(age > 0 and age < 13):
        group = "Minor"
    elif (age >= 13 and age < 20 ):
        group = "Teenager"
    elif (age >= 20 and age <= 30 ):
        group = "Young adult"
    elif (age >= 31 and age <= 59 ): 
        group = "Adult"  
    else:
        group = "Senior"
    
    return group

'''
Create a function called sum that takes a number and
returns the sum of the first natural numbers.

if the parameter number is 10, the function return 55
'''
def sum(num):

    if (num < 0):
        return 0
    total = 0
    for i in range(num + 1):
        total = total + i
    
    return total

def main():
    num = 7
    num = -3
    print(sumOFTwo(num, 5))
    #print()
    print(num)

    print(ageGroup(61))

    words = ["cat", "window", "dog", "chicken"]
    print(words[0])
    print(len(words))

    for i in range(len(words)):
        print(i)
        print(words[i])

# A function does not execute until it is called.
# To call a function in Python, we just use the name of the
# function

main()