package com.lx.android_commerce.weight.entity;

import java.util.List;

public
/**
 *@author : 阿森
 *@date : 2020-10-18 11:27
 *@params : 
 *@description:
 */
class ClassifySecondEntity {

    /**
     * message : 二级类目获取成功
     * code : 0000
     * success : true
     * entity : [{"id":215,"opt_id":1291,"parent_opt_id":1282,"opt_name":"男士内衣","level":2,"image":"/upload/mavendemo/teacher/20180807/1533633964841023785.png"},{"id":216,"opt_id":1292,"parent_opt_id":1282,"opt_name":"女士内衣","level":2,"image":"/upload/mavendemo/teacher/20180807/1533633978430466759.png"},{"id":217,"opt_id":1293,"parent_opt_id":1282,"opt_name":"文胸","level":2,"image":"/upload/mavendemo/teacher/20180807/1533633991389697351.png"},{"id":1858,"opt_id":5300,"parent_opt_id":1282,"opt_name":"服饰配件","level":2,"image":"/upload/mavendemo/teacher/20181126/1543194206228491998.jpg"},{"id":1912,"opt_id":1296,"parent_opt_id":1282,"opt_name":"睡衣家居服","level":2,"image":"/upload/mavendemo/teacher/20181225/1545722201870835484.jpg"},{"id":2020,"opt_id":1295,"parent_opt_id":1282,"opt_name":"袜子","level":2,"image":"/upload/mavendemo/teacher/20190307/1551924421621854163.jpg"},{"id":2022,"opt_id":3210,"parent_opt_id":1282,"opt_name":"男士内裤","level":2,"image":"/upload/mavendemo/teacher/20190307/1551924703213838046.jpg"},{"id":2023,"opt_id":5301,"parent_opt_id":1282,"opt_name":"女士内裤","level":2,"image":"/upload/mavendemo/teacher/20190307/1551924910396124679.jpg"},{"id":2935,"opt_id":1373,"parent_opt_id":1282,"opt_name":"吊带背心","level":2,"image":""},{"id":2936,"opt_id":1757,"parent_opt_id":1282,"opt_name":"塑身美体","level":2,"image":""},{"id":2966,"opt_id":1760,"parent_opt_id":1282,"opt_name":"保暖内衣","level":2,"image":""}]
     */

    private String message;
    private String code;
    private boolean success;
    private List<EntityBean> entity;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public List<EntityBean> getEntity() {
        return entity;
    }

    public void setEntity(List<EntityBean> entity) {
        this.entity = entity;
    }

    public static class EntityBean {
        /**
         * id : 215
         * opt_id : 1291
         * parent_opt_id : 1282
         * opt_name : 男士内衣
         * level : 2
         * image : /upload/mavendemo/teacher/20180807/1533633964841023785.png
         */

        private int id;
        private int opt_id;
        private int parent_opt_id;
        private String opt_name;
        private int level;
        private String image;
        private boolean isChecked;

        public boolean isChecked() {
            return isChecked;
        }

        public void setChecked(boolean checked) {
            isChecked = checked;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public int getOpt_id() {
            return opt_id;
        }

        public void setOpt_id(int opt_id) {
            this.opt_id = opt_id;
        }

        public int getParent_opt_id() {
            return parent_opt_id;
        }

        public void setParent_opt_id(int parent_opt_id) {
            this.parent_opt_id = parent_opt_id;
        }

        public String getOpt_name() {
            return opt_name;
        }

        public void setOpt_name(String opt_name) {
            this.opt_name = opt_name;
        }

        public int getLevel() {
            return level;
        }

        public void setLevel(int level) {
            this.level = level;
        }

        public String getImage() {
            return image;
        }

        public void setImage(String image) {
            this.image = image;
        }
    }
}
