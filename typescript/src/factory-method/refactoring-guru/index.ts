import { Creator } from './creator';
import { SecondConcreteCreator } from './second-concreate-creator';
import { FirstConcreteCreator } from './first-concrete-creator';

function clientCode(creator: Creator) {
  // ...
  console.log(
    "Client: I'm not aware of the creator's class, but it still works.",
  );
  console.log(creator.someOperation());
  // ...
}

console.log('App: Launched with the ConcreteCreator1.');
clientCode(new FirstConcreteCreator());
console.log('');

console.log('App: Launched with the ConcreteCreator2.');
clientCode(new SecondConcreteCreator());
