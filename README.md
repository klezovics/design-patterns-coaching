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
 2.1) Prototype -> allows to clone stuff
 
 2.2) Factory method -> all factories produce a single product. 
 Single product == same interface. However, concrete classes differ for each factory.
 
 2.3) Abstract factory -> a single factory produces a related family of products.
 Each product family consists of the same set of interfaces. Only implementing classes
 differ by factory

Now, let's look at the complex ones ... they allow to do 2 things ...

1) Create new objects 
 1.1) Factory method 
 1.2) Abstract factory
 
2) Clone existing objects
 2.1) Prototype



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
