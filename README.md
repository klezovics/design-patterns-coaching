== Overview == 

Patterns come in 3 types: 
1) Creational 
2) Structural
3) Behavioural 


== Creational == 
These are patterns of object creation, which solve specific problems.

*) Prototype

*) Problem: How to efficiently clone objects
*) Solution: Explains how to arrange entities in an inheritance hierarchy
and implement the clone method.
*) Note: Instances, which implement a specific interface are returned. Not concrete classes.



*) Factory method 

*) Problem: How to efficiently write business logic for classes, which 
do the same thing, but in slightly different ways. This XML and JSON serialisation
from some processor class. How to decouple object creation from the point of usage ?
*) All used objects follow a common Product inteface. All factories have the same interface
for creating products. To create a specific product you call a specific factory.
*) Note: Instances, which implement a specific interface are returned. Not concrete classes.
