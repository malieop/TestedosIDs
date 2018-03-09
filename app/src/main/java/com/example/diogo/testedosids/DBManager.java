package com.example.diogo.testedosids;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.database.sqlite.SQLiteStatement;
import android.os.Environment;
import android.util.Log;
import android.widget.Toast;

import java.io.File;

/**
 * Created by diogo on 23-02-2018.
 */

public final class DBManager  {
   // Variáveis estáticas
    private static final int DATABASE_VERSION = 1 ;
    private static final String DB_NAME = "redes.db";
    private static final String NOME_TABELA = "Informação_das_redes";

    //Colunas da tabela

    private static final String coluna_id = "id";
    private static final String coluna_descricao= "Descricao";
    private static final String coluna_id_aparelho = "Id_aparelho";
    private static final String coluna_força = "Forca_sinal";
    private static final String coluna_data = "Data";

    private static SQLiteDatabase db;

    public DBManager(){


        //		File test  = new File(Environment.getExternalStorageDirectory() + "/documents/");
        //		String[] test2 = test.list();

        try {
            if (db == null)
                db = SQLiteDatabase.openDatabase(
                        Environment.getExternalStorageDirectory() + "/RedesDaUniversidade/" + DB_NAME,
                        null,
                        0);
            //Log.i(MODULE,"Db openned");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public static class DBHolder {
        public static final DBManager INSTANCE = new DBManager();
    }

    public static DBManager getDBManager(){

        return DBHolder.INSTANCE;
    }


    public static void initDatabase(){
        try{
            File db_storage_file = new File(Environment.getExternalStorageDirectory(), "/RedesDaUniversidade");
            if(!db_storage_file.exists())
                if(! db_storage_file.mkdir()){
                    //Log.e(MODULE,"error creating /touchCloud directory");
                    return;
                }
            db_storage_file = new File(db_storage_file, DB_NAME);

            if(! db_storage_file.exists()){
                db_storage_file.createNewFile();
                Log.i("merda", "apass");
                createDatabase(db_storage_file.getAbsolutePath());
            }
        }catch(Exception e){
            e.printStackTrace();
        }
    }
    public static boolean databaseExists()	{

        File storage_file = new File(Environment.getExternalStorageDirectory(), "/RedesDaUniversidade/"+DB_NAME);

        return storage_file.exists();
    }

    public static void createDatabase(String path) {
        db = SQLiteDatabase.openDatabase(path,
                null,
                SQLiteDatabase.CREATE_IF_NECESSARY);

        String criaDB = "CREATE TABLE " + NOME_TABELA+ "("
                +   coluna_id + " INTEGER PRIMARY KEY,"
                +   coluna_descricao+ " TEXT,"
                +   coluna_id_aparelho+ " TEXT,"
                +   coluna_força+ " INTEGER,"
                +   coluna_data+ " TEXT )";
        Log.i("hbbjh",criaDB);
        db.execSQL(criaDB);


    }
    public synchronized boolean insertDatabase(WifiManage redeInfo, String descricao, Context ctx){
        boolean res = false;
        SQLiteStatement stm = null;
        String id = redeInfo.getId(ctx);
        Log.i("Teste INSERT", "bosta");
        db.beginTransaction();
        try {
            // Create the insert statement
            String sql =
                    "insert into " +
                            "	" + NOME_TABELA
                            + " ( "+coluna_id+", "
                            +coluna_descricao+","
                            +coluna_id_aparelho+","
                            +coluna_força +","
                            +coluna_data+")" +
                            "values ( NULL,'"
                            + descricao+"' ,'"
                            +id+"' ,"
                            +redeInfo.getFreq(ctx)+" ,'"
                            +redeInfo.getDateTime()+"')";
            Log.i("QUERY INSERT", sql);
            stm = db.compileStatement(sql);

            // Iterate over the array, extracting values as necessary

               /* stm.bindNull(1);
                stm.bindString(2, descricao);
                stm.bindString(3, redeInfo.getId(ctx));
                stm.bindLong(4,redeInfo.getFreq(ctx));
                stm.bindString(5,redeInfo.getDateTime());*/
                Log.i("STM", String.valueOf(stm));
                if(!id.equals("00:00:00:00:00:00")) {
                    if (stm.executeInsert() <= 0){
                        Log.d("Insert", "Failed insertion of event into database");
                    }
                    else {
                    Toast.makeText(ctx,"Inseriu um novo id.",Toast.LENGTH_SHORT).show();
                        Toast.makeText(ctx,id,Toast.LENGTH_LONG).show();
                    }
                }
                else{
                    Toast.makeText(ctx,"Erro, não está ligado a nenhuma rede.",Toast.LENGTH_LONG).show();
                }
            // Signal success and update result value
            db.setTransactionSuccessful();
            res = true;
        } catch (Exception e) {
            e.printStackTrace();
        } finally	{
            stm.close();
            db.endTransaction();

            //Log.d(MODULE, "new event Data inserted");
        }

        return res;
    }
    public static void insereDatabase(WifiManage redeInfo, String descricao, Context ctx){
        String id = redeInfo.getId(ctx);
        String sql =
                "insert into " +
                        "	" + NOME_TABELA
                        + " ( "+coluna_id+", "
                        +coluna_descricao+","
                        +coluna_id_aparelho+","
                        +coluna_força +","
                        +coluna_data+")" +
                        "	values ( NULL,'"
                        + descricao+"' ,'"
                        +id+"' ,"
                        +redeInfo.getFreq(ctx)+" ,'"
                        +redeInfo.getDateTime()+"')";
        //Log.i("MethodINSERE", sql);
        Log.i("IdAparelho", id);
        Toast.makeText(ctx,id,Toast.LENGTH_LONG);
        if(id.equals("00:00:00:00:00:00")){
            Toast.makeText(ctx,"Erro, não está ligado a nenhuma rede.",Toast.LENGTH_LONG).show();
        }
        else {
            Toast.makeText(ctx,"Inseriu um novo id.",Toast.LENGTH_LONG).show();
            //Log.i("SQL", sql);
            db.execSQL(sql);
        }
    }

}



