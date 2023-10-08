package com.example.xua1403;
public class DataModel {
        String name;
        String type;
        String url_image;
        public DataModel(String name, String type,  String feature ) {
            this.name=name;
            this.type=type;
            this.url_image=feature;
        }
        public String getName() {
            return name;
        }
        public String getType() {
            return type;
        }
        public String getFeature() {
            return url_image;
        }
}
