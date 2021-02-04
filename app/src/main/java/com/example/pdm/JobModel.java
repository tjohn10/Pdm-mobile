package com.example.pdm;

public class JobModel {


        // string course_name for storing course_name
        // and imgid for storing image id.
        private String job_name;
        private int imgid;

        public JobModel(String job_name, int imgid) {
            this.job_name = job_name;
            this.imgid = imgid;
        }

        public String getJob_name() {
            return job_name;
        }

        public void setJob_name(String job_name) {
            this.job_name = job_name;
        }

        public int getImgid() {
            return imgid;
        }

        public void setImgid(int imgid) {
            this.imgid = imgid;
        }

}
