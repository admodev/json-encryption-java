/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 * Programa para encriptar JSON's usando BSON y Jackson.
 */
package com.exegesisba.encriptadorjson;

import java.util.Arrays;
import org.bson.BsonArray;
import org.bson.BsonDocument;
import org.bson.BsonInt32;
import org.bson.BsonString;
import org.bson.codecs.configuration.CodecRegistry;
import org.bson.conversions.Bson;

/**
 *
 * @author admodev
 */
public class Main {

    public static void main(String[] args) {
        Bson encriptador = new Bson() {
            @Override
            public <TDocument> BsonDocument toBsonDocument(Class<TDocument> type, CodecRegistry cr) {
                throw new UnsupportedOperationException("Not supported yet.");
            }
        };

        System.out.println(
                "Bienvenido, vamos a encriptar sus datos JSON. \n Por favor aguarde..."
        );

        var arrayParaEncriptar = new BsonDocument().append("a", new BsonString("Prueba"))
                .append("b", new BsonArray(Arrays.asList(new BsonInt32(1), new BsonInt32(2))));
        System.out.println(arrayParaEncriptar);
    }
}
