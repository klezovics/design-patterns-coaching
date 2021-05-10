== Creational == 

OK, so we use creational patterns, when we want to create objects.
We will always need to create objects in an OOP paradigm, and let's think about 
how we do it ... and why we could want to use certain patterns in here ...

Now note, that we might want to do one of two things ...
1) Create an item from scratch 
2) Clone an existing item


C1) The simplest case is to create an object using a no-agrs constructor 

Product p = new Product(); 


C2) OK, let's make it more complicated and use a constructor with arguments 

var price = 10
var name = "chair"

Product p = new Product(name, price)



C3) OK, the next case in complexity is when a product has many-many fieds ... we might want to use a builder
in this case

Product p = Product.builder().setName("chair").setPrice(10).setHeight(100).setWidth(30).build();


C4) OK, seems fine ... it would be nice if we could get typical products, without having to call the builder each time.
Let's try to create something similar to the object mother pattern 


Product p = ProductFactory.getStandardChair(); 

class ProductFactory {

  Product getStandardChaid() {
     return Product.builder().setName("chair").setPrice(10).setHeight(100).setWidth(30).build();
  }
}

Cool, so we've created a factory class, which will return instances of correctly configured objects.





C5) Sometimes from a factory method we want to return not a specific class, but an instance which implements an interface.
Let's say we have a PrinterFactory, which can return an XML printer or a JSON printer.


class PrinterFactory {
  
  XmlPrinter getXmlPrinter() { // return XML printer }
  JsonPrinter getJsonPrinter() { // return JSON printer}
  
}

Looks pretty cool, but what kind of issues we can encounter here ... 

The client code gets couple to a concrete class and it would be hard ot make it generic. 
The PrinterFactory class will get BLOATED if it has too many printer types. 





C6) An improvement on this would be to use the FactoryMethod pattern 
See an example here: com.klezovich.designpatterns.creational.factorymethod.report.ReportProcessorWithFactoryMethodTest

C7) OK, so maybe we don't want to create an object from scratch, we want to clone an existing item.
Here we use the prototype pattern.




