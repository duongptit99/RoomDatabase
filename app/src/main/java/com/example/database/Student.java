package com.example.database;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity(tableName = "student")
public class Student {
    @PrimaryKey(autoGenerate = true)
    private int idStudent;
    @ColumnInfo
    private String name;
    @ColumnInfo
    private String sex;
    @ColumnInfo
    private String idClass;
    @ColumnInfo
    private String pointMath;
    @ColumnInfo
    private String pointPhysic;
    @ColumnInfo
    private String pointChemistry;

    public Student() {

    }

    public Student(String name, String sex, String iClass, String pointMath, String pointPhysic, String pointChemistry) {
        this.name = name;
        this.sex = sex;
        this.idClass = iClass;
        this.pointMath = pointMath;
        this.pointPhysic = pointPhysic;
        this.pointChemistry = pointChemistry;
    }

    public int getIdStudent() {
        return idStudent;
    }


    public void setIdStudent(int idStudent) {
        this.idStudent = idStudent;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getPointMath() {
        return pointMath;
    }

    public void setPointMath(String pointMath) {
        this.pointMath = pointMath;
    }

    public String getPointPhysic() {
        return pointPhysic;
    }

    public void setPointPhysic(String pointPhysic) {
        this.pointPhysic = pointPhysic;
    }

    public String getPointChemistry() {
        return pointChemistry;
    }

    public void setPointChemistry(String pointChemistry) {
        this.pointChemistry = pointChemistry;
    }

    public String getIdClass() {
        return idClass;
    }
    public void setIdClass(String idClass) {
        this.idClass = idClass;
    }
}
