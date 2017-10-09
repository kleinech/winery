# Use builder pattern for model classes

Model classes should be instantiable simple without using large constructors.

## Considered Alternatives

* Builders
* Setters, getters and default constructor 
* Large constructors
* Factories

## Decision Outcome

* Chosen Alternative: *Builders*
* https://en.wikipedia.org/wiki/Builder_pattern

## Pros and Cons of the Alternatives <!-- optional -->

### Builders

* `+` Flexible
* `+` Simple for complex objects
* `-` Extensions cause problems () 

### Setters, getters and default constructor 

* `-`
### Large constructors

* `-`
### Factories

* `-`
