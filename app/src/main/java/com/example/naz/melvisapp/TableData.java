package com.example.naz.melvisapp;

import android.provider.BaseColumns;

/**
 * Created by Naz on 27.09.2016.
 */

public class TableData {
    public TableData()

    {

    }

    public static abstract class TableInfo implements BaseColumns
    {
      public static final String CONTENT_RES = "content_res";
        public static final String CODE_TYPE = "code_type";
        public static final String DATABASE_NAME = "scan_info";
        public static final String TABLE_NAME = "code_info";
    }


}
