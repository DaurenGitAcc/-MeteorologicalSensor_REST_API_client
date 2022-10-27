package org.example.responses;

import org.example.dto.MeasurementDTO;

import java.util.List;

public class MeasurementsList {
    private List<MeasurementDTO> measurementDTOList;

    public MeasurementsList(List<MeasurementDTO> measurementDTOList) {
        this.measurementDTOList = measurementDTOList;
    }

    public List<MeasurementDTO> getMeasurementDTOList() {
        return measurementDTOList;
    }

    public void setMeasurementDTOList(List<MeasurementDTO> measurementDTOList) {
        this.measurementDTOList = measurementDTOList;
    }
}
