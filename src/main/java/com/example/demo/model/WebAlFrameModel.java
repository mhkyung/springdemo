package com.example.demo.model;

import java.util.List;

public class WebAlFrameModel {
    private String asset;
    private List<WebJoint> joints;
    private List<WebSegment>    segments;

    public WebAlFrameModel(List<WebJoint> joints, List<WebSegment> segments) {
        this.asset =  "{\"generator\":\"Al-Profile\", \"version\":\"0.1\"";
        this.joints = joints;
        this.segments = segments;
    }

    public List<WebJoint> getJoints() {
        return joints;
    }

    public void setJoints(List<WebJoint> joints) {
        this.joints = joints;
    }

    public List<WebSegment> getSegments() {
        return segments;
    }

    public void setSegments(List<WebSegment> segments) {
        this.segments = segments;
    }

    static public class WebJoint {
        private String name;
        private List<Double> size;
        private List<Double> position;
        private List<Integer> segments;

        public WebJoint(String name, List<Double> size, List<Double> position, List<Integer> segments) {
            this.name = name;
            this.size = size;
            this.position = position;
            this.segments = segments;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public List<Double> getSize() {
            return size;
        }

        public void setSize(List<Double> size) {
            this.size = size;
        }

        public List<Double> getPosition() {
            return position;
        }

        public void setPosition(List<Double> position) {
            this.position = position;
        }

        public List<Integer> getSegments() {
            return segments;
        }

        public void setSegments(List<Integer> segments) {
            this.segments = segments;
        }
    }

    static public class WebSegment {
        private String  name;
        private String  mode;
        private double[] scale;
        private double[] rotate;
        private double[] position;

        public WebSegment(String name, String mode, double[] scale, double[] rotate, double[] position) {
            this.name = name;
            this.mode = mode;
            this.scale = scale;
            this.rotate = rotate;
            this.position = position;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getMode() {
            return mode;
        }

        public void setMode(String mode) {
            this.mode = mode;
        }

        public double[] getScale() {
            return scale;
        }

        public void setScale(double[] scale) {
            this.scale = scale;
        }

        public double[] getRotate() {
            return rotate;
        }

        public void setRotate(double[] rotate) {
            this.rotate = rotate;
        }

        public double[] getPosition() {
            return position;
        }

        public void setPosition(double[] position) {
            this.position = position;
        }
    }
}
