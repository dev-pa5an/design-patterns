The code to create a object has been moved into a method of a new class called KnifeFactory. 
This allows the KnifeStore class to be a client for the KnifeFactory. 
The KnifeFactory object to use is passed into the constructor for the knifeStore class. 
Instead of performing concrete instantiation itself, the orderKnife method delegates the task to the factory object.

Concrete instantiation is the primary purpose of Factories. In general, a factory object is an instance of a factory class, which has a method to create product objects.