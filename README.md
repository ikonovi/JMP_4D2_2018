# m01-t06

### Custom collector
Define a complex class A with a few fields with different types. This class will be an item in collection.
Define a few methods which calculates some stat over the fields of the A class.
Make stream from the collection of A’s instances.
Write custom collector to accumulate the information from elements of your stream.
1. Implement Collector interface +
1. Don’t forget the final transformation +
1. Try to use Characteristics for the optimization purpose. +
1. Add tests for your collector. ??
Test your Collector with the parallel streams for significant amount of items in stream.
Look at the Collector interface and read about combine method if something is going wrong.
