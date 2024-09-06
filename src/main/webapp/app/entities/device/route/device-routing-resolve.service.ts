import { inject } from '@angular/core';
import { HttpResponse } from '@angular/common/http';
import { ActivatedRouteSnapshot, Router } from '@angular/router';
import { EMPTY, Observable, of } from 'rxjs';
import { mergeMap } from 'rxjs/operators';

import { IDevice } from '../device.model';
import { DeviceService } from '../service/device.service';

const deviceResolve = (route: ActivatedRouteSnapshot): Observable<null | IDevice> => {
  const id = route.params.id;
  if (id) {
    return inject(DeviceService)
      .find(id)
      .pipe(
        mergeMap((device: HttpResponse<IDevice>) => {
          if (device.body) {
            return of(device.body);
          }
          inject(Router).navigate(['404']);
          return EMPTY;
        }),
      );
  }
  return of(null);
};

export default deviceResolve;
