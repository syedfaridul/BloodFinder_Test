package org.hupbd.bloodfinder_test;

public class PostSmall {
    private String heading,desc;

    public PostSmall(String heading, String desc) {
        this.heading = heading;
        this.desc = desc;
    }
    public PostSmall(){

    }

    public void setHeading(String heading) {
        this.heading = heading;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String getHeading() {

        return heading;
    }

    public String getDesc() {
        return desc;
    }
}
