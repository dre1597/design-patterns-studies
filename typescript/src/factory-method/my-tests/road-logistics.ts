import { Transport } from './transport.interface';
import { Logistic } from './logistic.interface';

export class RoadLogisticsFactory extends Logistic {
  public createTransport(): Transport {
    return new Truck('any_truck');
  }
}

class Truck implements Transport {
  constructor(public code: string) {}

  public delivery(): void {
    console.log('delivery by truck');
  }
}
