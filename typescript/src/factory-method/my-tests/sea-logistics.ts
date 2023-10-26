import { Transport } from './transport.interface';
import { Logistic } from './logistic.interface';

export class SeaLogisticsFactory extends Logistic {
  public createTransport(): Transport {
    return new Ship('any_ship');
  }
}

class Ship implements Transport {
  constructor(public code: string) {}

  public delivery(): void {
    console.log('delivery by ship');
  }
}
