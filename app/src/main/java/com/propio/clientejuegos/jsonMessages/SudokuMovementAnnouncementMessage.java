package com.propio.clientejuegos.jsonMessages;

import org.json.JSONException;
import org.json.JSONObject;

import edu.uclm.esi.common.jsonMessages.JSONMessage;
import edu.uclm.esi.common.jsonMessages.JSONable;

/**
 * Created by JoseAntonio on 05/04/2016.
 */
public class SudokuMovementAnnouncementMessage  extends JSONMessage {
    @JSONable
    private int row;
    @JSONable
    private int col;
    @JSONable
    private int value;

    public SudokuMovementAnnouncementMessage(int row, int col, int value) {
        super(false);
        this.setRow(row);
        this.setCol(col);
        this.setValue(value);
    }

    public SudokuMovementAnnouncementMessage (JSONObject jso) throws JSONException {
        this(jso.getInt("row"), jso.getInt("col"), jso.getInt("idMatch"));
    }



    public int getRow() { return row; }

    public void setRow(int row) { this.row = row; }

    public int getCol() { return col; }

    public void setCol(int col) { this.col = col; }

    public int getValue() { return value; }

    public void setValue(int value) { this.value = value; }


}