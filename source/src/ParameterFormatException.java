/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author MickeyMouse
 */
public class ParameterFormatException extends Exception{
    String str;

    public ParameterFormatException(String x) {
        str = x;
    }

    @Override
    public String toString() {
        return "ParameterFormatException[key:\"" + str + "\"][line:" + getStackTrace()[0].getLineNumber() + "]";
    }
}
