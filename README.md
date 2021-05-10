== Overview == 

Patterns come in 3 types: 
1) Creational 
2) Structural
3) Behavioural 

Next steps: SOLID principles : https://www.youtube.com/watch?v=StWB7NJjPZc&t=2091s&ab_channel=TechTrain

== Creational == 
These are patterns of object creation, which solve specific problems.

They can be divided into two parts:

1) Easy -> have an easy implementation
 1.1) Builder -> Lombok @Builder. Thank you, Lombok !
 1.2) Singleton -> Spring @Component, @Service, @Repository. Thank you, Spring !
 
2) Complex -> need to implement yourself
 2.1) Prototype
 2.2) Factory method 
 2.3) Abstract factory


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
