# MeteorologicalSensor_REST_API

<!-- ABOUT THE PROJECT -->
## О проекте/About project

  Реализация клиентской стороны REST API приложения для метеорологической службы. 
  Имеет следующие возможности:
  1. Регистрировать сенсор
  2. Записывать измерения температур и дождливости к определенному сенсору
  3. Получать все записи измерении
  4. Получать количество дождливых дней

  Implementation of the client-side of REST API application for the meteorological service. 
  It has the following features:
  1. Register the sensor
  2. Record temperature and raininess measurements to a specific sensor
  3. Request all measurement records
  4. Request total number of rainy days

## Реализация клиентской стороны/Implementation of the client-side
  Объекты классов Sensor и Measurement создаются в виде DTO-классов и передаются в json формате.
  
  Objects of the Sensor and Measurement classes are created as DTO-classes and transmitted in json format.

![RestAPIConsumer1](https://user-images.githubusercontent.com/114854020/215165179-0789a0ea-9677-4b17-8742-c9959d8dd2cd.gif)
