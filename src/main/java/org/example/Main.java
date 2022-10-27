package org.example;

import com.fasterxml.jackson.core.JsonProcessingException;
import org.example.dto.MeasurementDTO;
import org.example.dto.SensorDTO;
import org.example.responses.MeasurementsList;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Main {
    public static void main(String[] args) throws JsonProcessingException {
          registerSensor();
//        addMeasurements();
//        getAllMeasurements();
//        printRainyDaysCount();
    }

    public static void registerSensor() {
        RestTemplate restTemplate = new RestTemplate();
        SensorDTO sensor = new SensorDTO("EachNameUnique");
        String url = "http://localhost:8080/sensors/registration";
        String response1 = restTemplate.postForObject(url, sensor, String.class);
        System.out.println(response1);
    }

    public static void addMeasurements() {
        Random rd = new Random();
        float value;
        boolean raining;
        RestTemplate restTemplate = new RestTemplate();
        String url = "http://localhost:8080/measurements/add";
        for (int i = 0; i < 10; i++) { // add 10 random measurements for "SensorToTest" sensor
            SensorDTO sensor = new SensorDTO("EachNameUnique");
            value = Float.parseFloat(new DecimalFormat("##.##").format(rd.nextFloat(-100, 100)).replace(',', '.'));
            raining = rd.nextBoolean();
            MeasurementDTO measurement = new MeasurementDTO(value, raining, sensor);

            String response1 = restTemplate.postForObject(url, measurement, String.class);
            System.out.println(response1);
        }
    }

    public static void getAllMeasurements() {
        RestTemplate restTemplate = new RestTemplate();
        String url = "http://localhost:8080/measurements/";

        ResponseEntity<MeasurementDTO[]> response = restTemplate.getForEntity(url, MeasurementDTO[].class);
        List<MeasurementDTO> list = List.of(response.getBody());
        for (MeasurementDTO mDTO: list) {
            System.out.println(mDTO);
        }
    }

    public static void printRainyDaysCount() {
        RestTemplate restTemplate = new RestTemplate();
        String url = "http://localhost:8080/measurements/rainyDaysCount";
        String response1 = restTemplate.getForObject(url, String.class);
        System.out.println(response1);
    }
}