package Study_02;

import java.util.ArrayList;
import java.util.List;

public class Study_0205_kataChange {
    
    public Study_0205_kataChange(){
        // 
        // System.out.plintln();

        // 自動変換データ型
        displayAssignmentTypeConversionAutoConversion();

        // キャスト変換

        // 
    }

    /**
     * 代入型変換の自動変換
     * 
     * @describe 代入型自動変換
     * @author haruna
     * @createData 2022/07/24
     */
    public static void displayAssignmentTypeConversionAutoConversion() {
        
        List<Object> obj01 = new ArrayList<Object>();

        final Byte byte01 = 011;

        final short short01 = 123;

        final int int01 = 123;

        final long long01 = 123456;

        final float float01 = 123;

        final double double01 = 123.12;

        obj01.add(byte01);
        obj01.add(short01);
        obj01.add(int01);
        obj01.add(long01);
        obj01.add(float01);
        obj01.add(double01);

        // 変換した内容の結果を表示
        getTypeInfoDisplay(obj01);
    }

    /**
     * 型情報の表示
     * @description 渡された引数の型を表示する
     * @param objList [List<Object>] 調査したい
     */
    public static void getTypeInfoDisplay(List<Object> objList){

        for(Object obj : objList){
            System.out.println(obj.getClass().getSimpleName() + "型　:「" + obj + "」");
        }

    }

}
