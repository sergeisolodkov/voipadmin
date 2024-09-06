import { TestBed } from '@angular/core/testing';

import { sampleWithNewData, sampleWithRequiredData } from '../option.test-samples';

import { OptionFormService } from './option-form.service';

describe('Option Form Service', () => {
  let service: OptionFormService;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    service = TestBed.inject(OptionFormService);
  });

  describe('Service methods', () => {
    describe('createOptionFormGroup', () => {
      it('should create a new form with FormControl', () => {
        const formGroup = service.createOptionFormGroup();

        expect(formGroup.controls).toEqual(
          expect.objectContaining({
            id: expect.any(Object),
            code: expect.any(Object),
            descr: expect.any(Object),
            valueType: expect.any(Object),
            multiple: expect.any(Object),
            vendors: expect.any(Object),
            models: expect.any(Object),
          }),
        );
      });

      it('passing IOption should create a new form with FormGroup', () => {
        const formGroup = service.createOptionFormGroup(sampleWithRequiredData);

        expect(formGroup.controls).toEqual(
          expect.objectContaining({
            id: expect.any(Object),
            code: expect.any(Object),
            descr: expect.any(Object),
            valueType: expect.any(Object),
            multiple: expect.any(Object),
            vendors: expect.any(Object),
            models: expect.any(Object),
          }),
        );
      });
    });

    describe('getOption', () => {
      it('should return NewOption for default Option initial value', () => {
        const formGroup = service.createOptionFormGroup(sampleWithNewData);

        const option = service.getOption(formGroup) as any;

        expect(option).toMatchObject(sampleWithNewData);
      });

      it('should return NewOption for empty Option initial value', () => {
        const formGroup = service.createOptionFormGroup();

        const option = service.getOption(formGroup) as any;

        expect(option).toMatchObject({});
      });

      it('should return IOption', () => {
        const formGroup = service.createOptionFormGroup(sampleWithRequiredData);

        const option = service.getOption(formGroup) as any;

        expect(option).toMatchObject(sampleWithRequiredData);
      });
    });

    describe('resetForm', () => {
      it('passing IOption should not enable id FormControl', () => {
        const formGroup = service.createOptionFormGroup();
        expect(formGroup.controls.id.disabled).toBe(true);

        service.resetForm(formGroup, sampleWithRequiredData);

        expect(formGroup.controls.id.disabled).toBe(true);
      });

      it('passing NewOption should disable id FormControl', () => {
        const formGroup = service.createOptionFormGroup(sampleWithRequiredData);
        expect(formGroup.controls.id.disabled).toBe(true);

        service.resetForm(formGroup, { id: null });

        expect(formGroup.controls.id.disabled).toBe(true);
      });
    });
  });
});
