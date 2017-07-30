package de.tu_berlin.ise.open_data.airquality.umweltbundesamt.service;

import de.tu_berlin.ise.open_data.airquality.umweltbundesamt.model.Schema;
import org.springframework.batch.item.file.LineMapper;

import java.net.MalformedURLException;
import java.net.URL;

/**
 * Created by ahmadjawid on 6/10/17.
 */
public interface ApplicationService {
    String [] getFields(Class<? extends Object> weatherDataClass);
    Double parseToDouble(String number);
    String toISODateFormat(String date);

    LineMapper createLineMapper(Class<? extends Schema> aClass) throws IllegalAccessException, InstantiationException;

    URL generateUrl(String forPollutant, String scope, String startDate, String endDate) throws MalformedURLException;
}