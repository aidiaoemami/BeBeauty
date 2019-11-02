package com.aidiaoemami.bebeauty;

import java.util.ArrayList;
import android.net.Uri;

public class ProductData {
    public static String[][] data = new String[][]{
            {"Pastel Mattifying Primer Makeup Base", "This mattifying primer base will penetrate your skin easily, eliminating the shiny look you dislike.",
                    "https://assets.goldenscent.com/catalog/product/8/6/8690644019135_pastel_pastel_profashion_mattifying_primer_make-up_base_20ml__2.jpg"},
            {"Popfeel Lip Gloss","Best selling Popfeel brand makeup waterproof pastel color lip gloss", "https://cdn.shopify.com/s/files/1/0128/7441/6192/products/product-image-868119937_1024x1024@2x.jpg?v=1545377995"},
            {"Wardah Lipcream / Wardah Exclusive Matte Lip Cream", "Wardah Lip Cream Matte has a creamy texture", "http://cdn.elevenia.co.id/g/7/2/4/0/8/7/19724087_B.jpeg"},
            {"Wardah Instaperfect Mineralight Matte BB Cushion", "MINERALIGHT MATTE BB Cushion with SPF 29 PA++","https://soc-phoenix.s3-ap-southeast-1.amazonaws.com/wp-content/uploads/2018/10/18151545/W3_BJ_Article_Wardah_BB_Cushion_cushion.jpg"},
            {"Fit Me! Matte Poreless Foundation", "Fit Me! Matte + Poreless Foudation","https://s3-ap-southeast-1.amazonaws.com/img-sociolla/img/p/2/5/6/8/1/25681-large_default.jpg"},
            {"MAKE OVER Perfect Shade Blush On Palette", "Perfect Shade Blush On Palette","https://s3-ap-southeast-1.amazonaws.com/img-sociolla/img/p/1/7/7/2/4/17724-large_default.jpg"},
            {"Tease Me palette", "Tease Me Eyeshaow Palette","https://soc-phoenix.s3-ap-southeast-1.amazonaws.com/wp-content/uploads/2018/07/17190522/beautycreation-teaseme-palette-3.jpeg"}
    };
    public static String[][] data2 = new String[][]{
            {"Pastel Mattifying Primer Makeup Base", "Basis primer mattifying ini akan menembus kulit Anda dengan mudah, menghilangkan tampilan mengkilap yang tidak Anda sukai.",
                    "https://assets.goldenscent.com/catalog/product/8/6/8690644019135_pastel_pastel_profashion_mattifying_primer_make-up_base_20ml__2.jpg"},
            {"Popfeel Lip Gloss","Lip gloss Popfeel terlaris warna pastel tahan air", "https://cdn.shopify.com/s/files/1/0128/7441/6192/products/product-image-868119937_1024x1024@2x.jpg?v=1545377995"},
            {"Wardah Lipcream / Wardah Exclusive Matte Lip Cream", "Wardah Lip Cream Matte memiliki tekstur yang creamy", "http://cdn.elevenia.co.id/g/7/2/4/0/8/7/19724087_B.jpeg"},
            {"Wardah Instaperfect Mineralight Matte BB Cushion", "MINERALIGHT MATTE BB Cushion dengan SPF 29 PA++","https://soc-phoenix.s3-ap-southeast-1.amazonaws.com/wp-content/uploads/2018/10/18151545/W3_BJ_Article_Wardah_BB_Cushion_cushion.jpg"},
            {"Fit Me! Matte Poreless Foundation", "Fit Me! Matte + Poreless Foudation","https://s3-ap-southeast-1.amazonaws.com/img-sociolla/img/p/2/5/6/8/1/25681-large_default.jpg"},
            {"MAKE OVER Perfect Shade Blush On Palette", "Blush on Palet yang sempurna","https://s3-ap-southeast-1.amazonaws.com/img-sociolla/img/p/1/7/7/2/4/17724-large_default.jpg"},
            {"Tease Me palette", "Tease Me Eyeshaow Palet","https://soc-phoenix.s3-ap-southeast-1.amazonaws.com/wp-content/uploads/2018/07/17190522/beautycreation-teaseme-palette-3.jpeg"}
    };

    public static ArrayList<Product> getListData(){
        Product product = null;
        ArrayList<Product> list = new ArrayList<>();
        for (int i = 0;i<data.length;i++){
            product = new Product();
            product.setName(data[i][0]);
            product.setDesc(data[i][1]);
            product.setPhoto(data[i][2]);

            list.add(product);
        }
        return list;
    }
    public static ArrayList<Product> getListData2(){
        Product product = null;
        ArrayList<Product> list2 = new ArrayList<>();
        for (int i = 0;i<data2.length;i++){
            product = new Product();
            product.setName(data2[i][0]);
            product.setDesc(data2[i][1]);
            product.setPhoto(data2[i][2]);

            list2.add(product);
        }
        return list2;
    }
}
