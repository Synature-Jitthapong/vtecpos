package com.vtec.j1tth4.vtecpos;

import android.content.Context;
import android.database.Cursor;
import android.database.CursorWrapper;
import android.provider.ContactsContract;

/**
 * Created by j1tth4 on 6/10/15.
 */
public class StaffDataSource {

    public static final String TABLE_STAFF = "staffs";
    public static final String STAFF_ID = "StaffID";
    public static final String STAFF_ROLE_ID = "StaffRoleID";
    public static final String STAFF_PASS_WORD = "StaffPassword";
    public static final String STAFF_CODE = "StaffCode";
    public static final String STAFF_GENDER = "StaffGender";
    public static final String STAFF_FIRST_NAME = "StaffFirstName";
    public static final String STAFF_LAST_NAME = "StaffLastName";
    public static final String STAFF_ADDRESS1 = "StaffAddress1";
    public static final String STAFF_ADDRESS2 = "StaffAddress2";
    public static final String STAFF_CITY = "StaffCity";
    public static final String STAFF_PROVINCE = "StaffProvince";
    public static final String STAFF_ZIP_CODE = "StaffZipCode";
    public static final String STAFF_TEL = "StaffTelephone";
    public static final String STAFF_MODEL = "StaffMobile";
    public static final String STAFF_EMAIL = "StaffEmail";
    public static final String STAFF_BIRTH_DAY = "StaffBirthDay";
    public static final String STAFF_ADDITIONAL = "StaffAdditional";
    public static final String STAFF_ID_NUMBER = "StaffIDNumber";
    public static final String STAFF_ID_ISSUE_DATE = "StaffIDIssueDate";
    public static final String STAFF_ID_EXPIRE = "StaffIDExpiration";
    public static final String STAFF_BLOOD = "StaffBlood";
    public static final String STAFF_PIC_FILE_SERVER = "StaffPictureFileServer";
    public static final String STAFF_PIC_FILE_CLIENT = "StaffPictureFileClient";
    public static final String BASES_SALARY = "BasedSalary";
    public static final String LANG_ID = "LangID";
    public static final String INPUT_DATE = "InputDate";
    public static final String INPUT_BY = "InputBy";
    public static final String UPDATE_DATE = "UpdateDate";
    public static final String UPDATE_BY = "UpdateBy";
    public static final String LAST_USE_DATE = "LastUseDate";
    public static final String ACTIVATED = "Activated";
    public static final String DELETED = "Deleted";
    public static final String ADDING_FROM_BRANCH = "AddingFromBranch";

    private DatabaseHelper mDbHelper;

    public StaffDataSource(Context c){
        mDbHelper = DatabaseHelper.getInstance(c);
    }

    public Staff getStaff(int staffId){
        Staff staff = null;
        Cursor cursor = mDbHelper.getWritableDatabase().rawQuery(
                "select * " +
                        " from " + TABLE_STAFF +
                        " where " + STAFF_ID + "=?",
                new String[]{
                        String.valueOf(staffId)
                });
        StaffCursor staffCursor = new StaffCursor(cursor);
        if(staffCursor.moveToFirst()){
            staff = staffCursor.getStaff();
        }
        staffCursor.close();
        return staff;
    }

    public static class StaffCursor extends CursorWrapper{

        public StaffCursor(Cursor cursor) {
            super(cursor);
        }

        public Staff getStaff(){
            if(isBeforeFirst() || isAfterLast())
                return null;
            Staff staff = new Staff();
            staff.setStaffID(getInt(getColumnIndex(STAFF_ID)));
            staff.setStaffRoleID(getInt(getColumnIndex(STAFF_ROLE_ID)));
            staff.setStaffPassword(getString(getColumnIndex(STAFF_PASS_WORD)));
            staff.setStaffCode(getString(getColumnIndex(STAFF_CODE)));
            staff.setStaffGender(getInt(getColumnIndex(STAFF_GENDER)));
            staff.setStaffFirstName(getString(getColumnIndex(STAFF_FIRST_NAME)));
            staff.setStaffLastName(getString(getColumnIndex(STAFF_LAST_NAME)));
            staff.setStaffAddress1(getString(getColumnIndex(STAFF_ADDRESS1)));
            staff.setStaffAddress2(getString(getColumnIndex(STAFF_ADDRESS2)));
            staff.setStaffCity(getString(getColumnIndex(STAFF_CITY)));
            staff.setStaffProvince(getInt(getColumnIndex(STAFF_PROVINCE)));
            staff.setStaffZipCode(getString(getColumnIndex(STAFF_ZIP_CODE)));
            staff.setStaffTelephone(getString(getColumnIndex(STAFF_TEL)));
            staff.setStaffMobile(getString(getColumnIndex(STAFF_MODEL)));
            staff.setStaffEmail(getString(getColumnIndex(STAFF_EMAIL)));
            staff.setStaffBirthDay(getString(getColumnIndex(STAFF_BIRTH_DAY)));
            staff.setStaffAdditional(getString(getColumnIndex(STAFF_ADDITIONAL)));
            staff.setStaffIDNumber(getString(getColumnIndex(STAFF_ID_NUMBER)));
            staff.setStaffIDIssueDate(getString(getColumnIndex(STAFF_ID_ISSUE_DATE)));
            staff.setStaffIDExpiration(getString(getColumnIndex(STAFF_ID_EXPIRE)));
            staff.setStaffBlood(getString(getColumnIndex(STAFF_BLOOD)));
            staff.setStaffPictureFileServer(getString(getColumnIndex(STAFF_PIC_FILE_SERVER)));
            staff.setStaffPictureFileClient(getString(getColumnIndex(STAFF_PIC_FILE_CLIENT)));
            staff.setBasedSalary(getDouble(getColumnIndex(BASES_SALARY)));
            staff.setLangID(getInt(getColumnIndex(LANG_ID)));
            staff.setInputDate(getString(getColumnIndex(INPUT_DATE)));
            staff.setInputBy(getInt(getColumnIndex(INPUT_BY)));
            staff.setUpdateDate(getString(getColumnIndex(UPDATE_DATE)));
            staff.setUpdateBy(getInt(getColumnIndex(UPDATE_BY)));
            staff.setLastUseDate(getString(getColumnIndex(LAST_USE_DATE)));
            staff.setActivated(getInt(getColumnIndex(ACTIVATED)));
            staff.setDeleted(getInt(getColumnIndex(DELETED)));
            staff.setAddingFromBranch(getInt(getColumnIndex(ADDING_FROM_BRANCH)));
            return staff;
        }
    }
}
