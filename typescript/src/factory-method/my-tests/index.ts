import { Logistic } from './logistic.interface';
import { RoadLogisticsFactory } from './road-logistics';
import { SeaLogisticsFactory } from './sea-logistics';

function clientCode(logistic: Logistic) {
  console.log(
    "Client: I'm not aware of the creator's class, but it still works.",
  );
  logistic.createTransport();
  logistic.delivery();
}

console.log('App: Launched with the RoadLogisticsFactory.');
clientCode(new RoadLogisticsFactory());
console.log('');

console.log('App: Launched with the SeaLogisticsFactory.');
clientCode(new SeaLogisticsFactory());
