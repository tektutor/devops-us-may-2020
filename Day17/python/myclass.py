#!/usr/bin/python

class MyClass:

    def __init__(self):
        print ("constructor got invoked ...")
        self.x = 10
        self.y = 20

    def setValues(self, a, b):
 	self.x = a
        self.y = b

    def printValues(self):
        print ( 'X ==>  ' + str(self.x) )
        print ( 'Y ==>  ' + str(self.y) )


obj1 = MyClass()
obj1.printValues()
obj1.setValues ( 1, 2 )
obj1.printValues()

obj2 = MyClass()
obj2.setValues ( 5, 6 )
obj2.printValues()
obj1.printValues()
