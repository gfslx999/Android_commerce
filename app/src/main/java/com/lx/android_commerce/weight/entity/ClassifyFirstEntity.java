package com.lx.android_commerce.weight.entity;

import java.util.List;

public
/**
 *@author : 阿森
 *@date : 2020-10-18 11:23
 *@params : 
 *@description:
 */
class ClassifyFirstEntity {

    /**
     * message : 一级类目获取成功
     * code : 0000
     * success : true
     * entity : {"goods_opt_get_response":{"goods_opt_list":[{"id":null,"opt_id":14,"parent_opt_id":0,"opt_name":"女装","level":1,"image":null},{"id":null,"opt_id":1281,"parent_opt_id":0,"opt_name":"鞋包","level":1,"image":null},{"id":null,"opt_id":4,"parent_opt_id":0,"opt_name":"母婴","level":1,"image":null},{"id":null,"opt_id":743,"parent_opt_id":0,"opt_name":"男装","level":1,"image":null},{"id":null,"opt_id":1282,"parent_opt_id":0,"opt_name":"内衣","level":1,"image":null},{"id":null,"opt_id":1,"parent_opt_id":0,"opt_name":"食品","level":1,"image":null},{"id":null,"opt_id":15,"parent_opt_id":0,"opt_name":"百货","level":1,"image":null},{"id":null,"opt_id":16,"parent_opt_id":0,"opt_name":"美妆","level":1,"image":null},{"id":null,"opt_id":1543,"parent_opt_id":0,"opt_name":"手机","level":1,"image":null},{"id":null,"opt_id":18,"parent_opt_id":0,"opt_name":"电器","level":1,"image":null},{"id":null,"opt_id":818,"parent_opt_id":0,"opt_name":"家纺","level":1,"image":null},{"id":null,"opt_id":2974,"parent_opt_id":0,"opt_name":"家具","level":1,"image":null},{"id":null,"opt_id":2478,"parent_opt_id":0,"opt_name":"电脑","level":1,"image":null},{"id":null,"opt_id":590,"parent_opt_id":0,"opt_name":"充值","level":1,"image":null},{"id":null,"opt_id":13,"parent_opt_id":0,"opt_name":"水果","level":1,"image":null},{"id":null,"opt_id":1451,"parent_opt_id":0,"opt_name":"运动","level":1,"image":null},{"id":null,"opt_id":1917,"parent_opt_id":0,"opt_name":"家装","level":1,"image":null},{"id":null,"opt_id":2048,"parent_opt_id":0,"opt_name":"汽车","level":1,"image":null},{"id":null,"opt_id":12,"parent_opt_id":0,"opt_name":"海淘","level":1,"image":null},{"id":null,"opt_id":3279,"parent_opt_id":0,"opt_name":"健康","level":1,"image":null}]}}
     */

    private String message;
    private String code;
    private boolean success;
    private EntityBean entity;

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

    public EntityBean getEntity() {
        return entity;
    }

    public void setEntity(EntityBean entity) {
        this.entity = entity;
    }

    public static class EntityBean {
        /**
         * goods_opt_get_response : {"goods_opt_list":[{"id":null,"opt_id":14,"parent_opt_id":0,"opt_name":"女装","level":1,"image":null},{"id":null,"opt_id":1281,"parent_opt_id":0,"opt_name":"鞋包","level":1,"image":null},{"id":null,"opt_id":4,"parent_opt_id":0,"opt_name":"母婴","level":1,"image":null},{"id":null,"opt_id":743,"parent_opt_id":0,"opt_name":"男装","level":1,"image":null},{"id":null,"opt_id":1282,"parent_opt_id":0,"opt_name":"内衣","level":1,"image":null},{"id":null,"opt_id":1,"parent_opt_id":0,"opt_name":"食品","level":1,"image":null},{"id":null,"opt_id":15,"parent_opt_id":0,"opt_name":"百货","level":1,"image":null},{"id":null,"opt_id":16,"parent_opt_id":0,"opt_name":"美妆","level":1,"image":null},{"id":null,"opt_id":1543,"parent_opt_id":0,"opt_name":"手机","level":1,"image":null},{"id":null,"opt_id":18,"parent_opt_id":0,"opt_name":"电器","level":1,"image":null},{"id":null,"opt_id":818,"parent_opt_id":0,"opt_name":"家纺","level":1,"image":null},{"id":null,"opt_id":2974,"parent_opt_id":0,"opt_name":"家具","level":1,"image":null},{"id":null,"opt_id":2478,"parent_opt_id":0,"opt_name":"电脑","level":1,"image":null},{"id":null,"opt_id":590,"parent_opt_id":0,"opt_name":"充值","level":1,"image":null},{"id":null,"opt_id":13,"parent_opt_id":0,"opt_name":"水果","level":1,"image":null},{"id":null,"opt_id":1451,"parent_opt_id":0,"opt_name":"运动","level":1,"image":null},{"id":null,"opt_id":1917,"parent_opt_id":0,"opt_name":"家装","level":1,"image":null},{"id":null,"opt_id":2048,"parent_opt_id":0,"opt_name":"汽车","level":1,"image":null},{"id":null,"opt_id":12,"parent_opt_id":0,"opt_name":"海淘","level":1,"image":null},{"id":null,"opt_id":3279,"parent_opt_id":0,"opt_name":"健康","level":1,"image":null}]}
         */

        private GoodsOptGetResponseBean goods_opt_get_response;

        public GoodsOptGetResponseBean getGoods_opt_get_response() {
            return goods_opt_get_response;
        }

        public void setGoods_opt_get_response(GoodsOptGetResponseBean goods_opt_get_response) {
            this.goods_opt_get_response = goods_opt_get_response;
        }

        public static class GoodsOptGetResponseBean {
            private List<GoodsOptListBean> goods_opt_list;

            public List<GoodsOptListBean> getGoods_opt_list() {
                return goods_opt_list;
            }

            public void setGoods_opt_list(List<GoodsOptListBean> goods_opt_list) {
                this.goods_opt_list = goods_opt_list;
            }

            public static class GoodsOptListBean {
                /**
                 * id : null
                 * opt_id : 14
                 * parent_opt_id : 0
                 * opt_name : 女装
                 * level : 1
                 * image : null
                 */

                private Object id;
                private int opt_id;
                private int parent_opt_id;
                private String opt_name;
                private int level;
                private Object image;
                private boolean isChecked;

                public boolean isChecked() {
                    return isChecked;
                }

                public void setChecked(boolean checked) {
                    isChecked = checked;
                }

                public Object getId() {
                    return id;
                }

                public void setId(Object id) {
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

                public Object getImage() {
                    return image;
                }

                public void setImage(Object image) {
                    this.image = image;
                }
            }
        }
    }
}
