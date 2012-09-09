/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.presensikaryawan.departmentSetting;

import com.presensikaryawan.groupShift.GroupShift;

/**
 *
 * @author Tinus
 */
public class Department {
    private String kodeDepartment;
    private String namaDepartment;
    private String deskripsi;
    private GroupShift groupShift;

    public Department() {
    }

    /**
     * @return the kodeDepartment
     */
    public String getKodeDepartment() {
        return kodeDepartment;
    }

    /**
     * @param kodeDepartment the kodeDepartment to set
     */
    public void setKodeDepartment(String kodeDepartment) {
        this.kodeDepartment = kodeDepartment;
    }

    /**
     * @return the namaDepartment
     */
    public String getNamaDepartment() {
        return namaDepartment;
    }

    /**
     * @param namaDepartment the namaDepartment to set
     */
    public void setNamaDepartment(String namaDepartment) {
        this.namaDepartment = namaDepartment;
    }

    /**
     * @return the deskripsi
     */
    public String getDeskripsi() {
        return deskripsi;
    }

    /**
     * @param deskripsi the deskripsi to set
     */
    public void setDeskripsi(String deskripsi) {
        this.deskripsi = deskripsi;
    }

    /**
     * @return the groupShift
     */
    public GroupShift getGroupShift() {
        return groupShift;
    }

    /**
     * @param groupShift the groupShift to set
     */
    public void setGroupShift(GroupShift groupShift) {
        this.groupShift = groupShift;
    }
    
    
}
