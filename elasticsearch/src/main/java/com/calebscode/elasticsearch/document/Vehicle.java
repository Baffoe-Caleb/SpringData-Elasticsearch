package com.calebscode.elasticsearch.document;

import com.calebscode.elasticsearch.helper.Indices;
import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;
import org.springframework.data.elasticsearch.annotations.Field;
import org.springframework.data.elasticsearch.annotations.FieldType;
import org.springframework.data.elasticsearch.annotations.Setting;


@Document(indexName = Indices.VEHICLE_INDEX)
@Setting(settingPath = "static/es-settings.json")
public class Vehicle {

    @Id
  //  @Field(type = FieldType.Keyword)
  //  private String id;

    @Field(type = FieldType.Text)
    private String brand;
    private String model;
    private String year;

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }
}
