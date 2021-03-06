package com.example.dada.Model;

import org.osmdroid.util.GeoPoint;


/**
 * The Location class will implements in
 * the requester and provider classes, contains the geo-coordinate
 * of task location and destination.
 */
public class Locations {
    private GeoPoint user_location;
    private GeoPoint task_location;
    private double distance;

    /**
     * Instantiates a new geo_point.
     *
     * @param task_location the coordinate of the task
     */
    public Locations(GeoPoint task_location){
        this.task_location = task_location;
    }

    /**
     * Instantiates a new geo_point.
     *
     * @param user_location     the user coordinate
     * @param task_location the coordinate of the task
     */

    public Locations(GeoPoint user_location, GeoPoint task_location){
        this.user_location = user_location;
        this.task_location = task_location;
    }

    /**
     * Gets location of task.
     *
     * @return the task coordinate
     */

    public GeoPoint getTask_location(){
        return this.task_location;
    }

    /**
     * Gets location of user.
     *
     * @return the user's coordinate
     */
    public GeoPoint getUser_location(){
        return this.user_location;
    }

    /**
     * Gets distance between task and user.
     *
     * @return the distance between coordinates
     */
    public Double get_distance(){
        return this.distance;
    }

    /**
     * Set the distance between points.
     * @param distance
     */
    public void setDistance(Double distance) {
        this.distance = distance;
    }
}
