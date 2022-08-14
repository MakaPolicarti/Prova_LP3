/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tools;

/**
 *
 * @author Usuario
package tools;**/



import java.io.Serializable;
import java.text.SimpleDateFormat;

import java.util.Date;


public class ConverteDatas implements Serializable{



    SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");



    public ConverteDatas() {

        simpleDateFormat.setLenient(false);//faz com que datas erradas sejam detectadas

    }



    public String converteDeDateParaString(Date data) {

        try {

            return simpleDateFormat.format(data); //converte a data para string

        } catch (Exception e) {

            return null;//se algo estiver errado na data, retorne null

            //tem que tratar o erro na classe que chamou

        }

    }



    public Date converteDeStringParaDate(String s) {

        try {

            return simpleDateFormat.parse(s);//converte

        } catch (Exception e) {

            return null;// se algo estiver errado, retorne null

        }

    }     

}
