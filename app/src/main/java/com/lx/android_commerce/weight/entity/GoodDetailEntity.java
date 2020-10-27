package com.lx.android_commerce.weight.entity;

import java.util.List;

public
/**
 *@author : 阿森
 *@date : 2020-10-27 09:24
 *@params : 
 *@description:
 */
class GoodDetailEntity {
    /**
     * message : 获取成功
     * success : true
     * entity : {"goods_detail_response":{"goods_details":[{"category_name":"食品","clt_cpn_end_time":1616947199,"clt_cpn_min_amt":500,"coupon_remain_quantity":46000,"clt_cpn_remain_quantity":1832000,"promotion_rate":10,"service_tags":[24,13],"mall_id":542637220,"mall_name":"利百家食品专营店","mall_coupon_end_time":0,"clt_cpn_batch_sn":"A0201VC-551550238058284196","lgst_txt":"高","goods_name":"【特价2斤】猴头菇饼干粗粮饼干早餐饼干香葱苏打夹心饼干零食1斤","clt_cpn_discount":500,"goods_gallery_urls":["https://img.pddpic.com/mms-material-img/2020-07-13/5cd950b8-ed17-4442-ab5c-04812a4f8f4f.jpg.a.jpeg","https://img.pddpic.com/mms-material-img/2020-10-19/5da0c2c3-541f-4550-9a71-799f4adff102.jpeg.a.jpeg","https://img.pddpic.com/mms-material-img/2020-10-19/adafc1aa-02f7-4052-934d-e050475d99a4.jpeg.a.jpeg","https://img.pddpic.com/mms-material-img/2020-10-19/1d2eab9c-8edb-4a04-980a-b8efa6b4bce0.jpeg.a.jpeg","https://img.pddpic.com/mms-material-img/2020-10-19/5e027325-c32e-4ffe-8fce-a6e3f7d8ef3e.jpeg.a.jpeg","https://img.pddpic.com/mms-material-img/2020-10-19/9029c883-0da9-485d-9414-2c60ab2c48fc.jpeg.a.jpeg","https://img.pddpic.com/mms-material-img/2020-10-19/3b21b716-75c8-4b46-89fb-d3cd3f0e8545.jpeg.a.jpeg","https://img.pddpic.com/mms-material-img/2020-10-19/be3d8bc9-aa79-4efb-be29-7b8cbf8033b5.jpeg.a.jpeg"],"goods_id":60457356393,"predict_promotion_rate":10,"goods_desc":"【特价2斤】猴头菇饼干粗粮饼干早餐饼干香葱苏打夹心饼干零食1斤","opt_name":"食品","opt_ids":[1024,21857,1,226,2,10723,11876,22950,8584,10696,8585,8586,10700,12,22926,22932,8569,22297,8570,8571,219,667,94],"goods_image_url":"https://img.pddpic.com/mms-material-img/2020-07-13/5cd950b8-ed17-4442-ab5c-04812a4f8f4f.jpg.a.jpeg","has_mall_coupon":false,"unified_tags":["极速退款"],"video_urls":[],"coupon_start_time":1603036800,"min_group_price":1080,"coupon_discount":600,"coupon_end_time":1604159999,"zs_duo_id":0,"mall_coupon_remain_quantity":0,"plan_type":2,"clt_cpn_quantity":2000000,"cat_ids":[6398,6469,6470],"coupon_min_order_amount":600,"category_id":1,"mall_coupon_discount_pct":0,"coupon_total_quantity":50000,"mall_coupon_min_order_amount":0,"merchant_type":5,"clt_cpn_start_time":1601395200,"sales_tip":"10万+","only_scene_auth":false,"desc_txt":"高","goods_thumbnail_url":"https://t00img.yangkeduo.com/goods/images/2020-07-13/6b4b86378b1811ee402e59e421ed19fb.jpeg","opt_id":1,"has_coupon":true,"min_normal_price":1180,"mall_coupon_start_time":0,"serv_txt":"高","mall_coupon_total_quantity":0,"mall_coupon_max_discount_amount":0,"mall_cps":1}],"request_id":"16037618225263111"}}
     */

    private String message;
    private boolean success;
    private EntityBean entity;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
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
         * goods_detail_response : {"goods_details":[{"category_name":"食品","clt_cpn_end_time":1616947199,"clt_cpn_min_amt":500,"coupon_remain_quantity":46000,"clt_cpn_remain_quantity":1832000,"promotion_rate":10,"service_tags":[24,13],"mall_id":542637220,"mall_name":"利百家食品专营店","mall_coupon_end_time":0,"clt_cpn_batch_sn":"A0201VC-551550238058284196","lgst_txt":"高","goods_name":"【特价2斤】猴头菇饼干粗粮饼干早餐饼干香葱苏打夹心饼干零食1斤","clt_cpn_discount":500,"goods_gallery_urls":["https://img.pddpic.com/mms-material-img/2020-07-13/5cd950b8-ed17-4442-ab5c-04812a4f8f4f.jpg.a.jpeg","https://img.pddpic.com/mms-material-img/2020-10-19/5da0c2c3-541f-4550-9a71-799f4adff102.jpeg.a.jpeg","https://img.pddpic.com/mms-material-img/2020-10-19/adafc1aa-02f7-4052-934d-e050475d99a4.jpeg.a.jpeg","https://img.pddpic.com/mms-material-img/2020-10-19/1d2eab9c-8edb-4a04-980a-b8efa6b4bce0.jpeg.a.jpeg","https://img.pddpic.com/mms-material-img/2020-10-19/5e027325-c32e-4ffe-8fce-a6e3f7d8ef3e.jpeg.a.jpeg","https://img.pddpic.com/mms-material-img/2020-10-19/9029c883-0da9-485d-9414-2c60ab2c48fc.jpeg.a.jpeg","https://img.pddpic.com/mms-material-img/2020-10-19/3b21b716-75c8-4b46-89fb-d3cd3f0e8545.jpeg.a.jpeg","https://img.pddpic.com/mms-material-img/2020-10-19/be3d8bc9-aa79-4efb-be29-7b8cbf8033b5.jpeg.a.jpeg"],"goods_id":60457356393,"predict_promotion_rate":10,"goods_desc":"【特价2斤】猴头菇饼干粗粮饼干早餐饼干香葱苏打夹心饼干零食1斤","opt_name":"食品","opt_ids":[1024,21857,1,226,2,10723,11876,22950,8584,10696,8585,8586,10700,12,22926,22932,8569,22297,8570,8571,219,667,94],"goods_image_url":"https://img.pddpic.com/mms-material-img/2020-07-13/5cd950b8-ed17-4442-ab5c-04812a4f8f4f.jpg.a.jpeg","has_mall_coupon":false,"unified_tags":["极速退款"],"video_urls":[],"coupon_start_time":1603036800,"min_group_price":1080,"coupon_discount":600,"coupon_end_time":1604159999,"zs_duo_id":0,"mall_coupon_remain_quantity":0,"plan_type":2,"clt_cpn_quantity":2000000,"cat_ids":[6398,6469,6470],"coupon_min_order_amount":600,"category_id":1,"mall_coupon_discount_pct":0,"coupon_total_quantity":50000,"mall_coupon_min_order_amount":0,"merchant_type":5,"clt_cpn_start_time":1601395200,"sales_tip":"10万+","only_scene_auth":false,"desc_txt":"高","goods_thumbnail_url":"https://t00img.yangkeduo.com/goods/images/2020-07-13/6b4b86378b1811ee402e59e421ed19fb.jpeg","opt_id":1,"has_coupon":true,"min_normal_price":1180,"mall_coupon_start_time":0,"serv_txt":"高","mall_coupon_total_quantity":0,"mall_coupon_max_discount_amount":0,"mall_cps":1}],"request_id":"16037618225263111"}
         */

        private GoodsDetailResponseBean goods_detail_response;

        public GoodsDetailResponseBean getGoods_detail_response() {
            return goods_detail_response;
        }

        public void setGoods_detail_response(GoodsDetailResponseBean goods_detail_response) {
            this.goods_detail_response = goods_detail_response;
        }

        public static class GoodsDetailResponseBean {
            /**
             * goods_details : [{"category_name":"食品","clt_cpn_end_time":1616947199,"clt_cpn_min_amt":500,"coupon_remain_quantity":46000,"clt_cpn_remain_quantity":1832000,"promotion_rate":10,"service_tags":[24,13],"mall_id":542637220,"mall_name":"利百家食品专营店","mall_coupon_end_time":0,"clt_cpn_batch_sn":"A0201VC-551550238058284196","lgst_txt":"高","goods_name":"【特价2斤】猴头菇饼干粗粮饼干早餐饼干香葱苏打夹心饼干零食1斤","clt_cpn_discount":500,"goods_gallery_urls":["https://img.pddpic.com/mms-material-img/2020-07-13/5cd950b8-ed17-4442-ab5c-04812a4f8f4f.jpg.a.jpeg","https://img.pddpic.com/mms-material-img/2020-10-19/5da0c2c3-541f-4550-9a71-799f4adff102.jpeg.a.jpeg","https://img.pddpic.com/mms-material-img/2020-10-19/adafc1aa-02f7-4052-934d-e050475d99a4.jpeg.a.jpeg","https://img.pddpic.com/mms-material-img/2020-10-19/1d2eab9c-8edb-4a04-980a-b8efa6b4bce0.jpeg.a.jpeg","https://img.pddpic.com/mms-material-img/2020-10-19/5e027325-c32e-4ffe-8fce-a6e3f7d8ef3e.jpeg.a.jpeg","https://img.pddpic.com/mms-material-img/2020-10-19/9029c883-0da9-485d-9414-2c60ab2c48fc.jpeg.a.jpeg","https://img.pddpic.com/mms-material-img/2020-10-19/3b21b716-75c8-4b46-89fb-d3cd3f0e8545.jpeg.a.jpeg","https://img.pddpic.com/mms-material-img/2020-10-19/be3d8bc9-aa79-4efb-be29-7b8cbf8033b5.jpeg.a.jpeg"],"goods_id":60457356393,"predict_promotion_rate":10,"goods_desc":"【特价2斤】猴头菇饼干粗粮饼干早餐饼干香葱苏打夹心饼干零食1斤","opt_name":"食品","opt_ids":[1024,21857,1,226,2,10723,11876,22950,8584,10696,8585,8586,10700,12,22926,22932,8569,22297,8570,8571,219,667,94],"goods_image_url":"https://img.pddpic.com/mms-material-img/2020-07-13/5cd950b8-ed17-4442-ab5c-04812a4f8f4f.jpg.a.jpeg","has_mall_coupon":false,"unified_tags":["极速退款"],"video_urls":[],"coupon_start_time":1603036800,"min_group_price":1080,"coupon_discount":600,"coupon_end_time":1604159999,"zs_duo_id":0,"mall_coupon_remain_quantity":0,"plan_type":2,"clt_cpn_quantity":2000000,"cat_ids":[6398,6469,6470],"coupon_min_order_amount":600,"category_id":1,"mall_coupon_discount_pct":0,"coupon_total_quantity":50000,"mall_coupon_min_order_amount":0,"merchant_type":5,"clt_cpn_start_time":1601395200,"sales_tip":"10万+","only_scene_auth":false,"desc_txt":"高","goods_thumbnail_url":"https://t00img.yangkeduo.com/goods/images/2020-07-13/6b4b86378b1811ee402e59e421ed19fb.jpeg","opt_id":1,"has_coupon":true,"min_normal_price":1180,"mall_coupon_start_time":0,"serv_txt":"高","mall_coupon_total_quantity":0,"mall_coupon_max_discount_amount":0,"mall_cps":1}]
             * request_id : 16037618225263111
             */

            private String request_id;
            private List<GoodsDetailsBean> goods_details;

            public String getRequest_id() {
                return request_id;
            }

            public void setRequest_id(String request_id) {
                this.request_id = request_id;
            }

            public List<GoodsDetailsBean> getGoods_details() {
                return goods_details;
            }

            public void setGoods_details(List<GoodsDetailsBean> goods_details) {
                this.goods_details = goods_details;
            }

            public static class GoodsDetailsBean {
                /**
                 * category_name : 食品
                 * clt_cpn_end_time : 1616947199
                 * clt_cpn_min_amt : 500
                 * coupon_remain_quantity : 46000
                 * clt_cpn_remain_quantity : 1832000
                 * promotion_rate : 10
                 * service_tags : [24,13]
                 * mall_id : 542637220
                 * mall_name : 利百家食品专营店
                 * mall_coupon_end_time : 0
                 * clt_cpn_batch_sn : A0201VC-551550238058284196
                 * lgst_txt : 高
                 * goods_name : 【特价2斤】猴头菇饼干粗粮饼干早餐饼干香葱苏打夹心饼干零食1斤
                 * clt_cpn_discount : 500
                 * goods_gallery_urls : ["https://img.pddpic.com/mms-material-img/2020-07-13/5cd950b8-ed17-4442-ab5c-04812a4f8f4f.jpg.a.jpeg","https://img.pddpic.com/mms-material-img/2020-10-19/5da0c2c3-541f-4550-9a71-799f4adff102.jpeg.a.jpeg","https://img.pddpic.com/mms-material-img/2020-10-19/adafc1aa-02f7-4052-934d-e050475d99a4.jpeg.a.jpeg","https://img.pddpic.com/mms-material-img/2020-10-19/1d2eab9c-8edb-4a04-980a-b8efa6b4bce0.jpeg.a.jpeg","https://img.pddpic.com/mms-material-img/2020-10-19/5e027325-c32e-4ffe-8fce-a6e3f7d8ef3e.jpeg.a.jpeg","https://img.pddpic.com/mms-material-img/2020-10-19/9029c883-0da9-485d-9414-2c60ab2c48fc.jpeg.a.jpeg","https://img.pddpic.com/mms-material-img/2020-10-19/3b21b716-75c8-4b46-89fb-d3cd3f0e8545.jpeg.a.jpeg","https://img.pddpic.com/mms-material-img/2020-10-19/be3d8bc9-aa79-4efb-be29-7b8cbf8033b5.jpeg.a.jpeg"]
                 * goods_id : 60457356393
                 * predict_promotion_rate : 10
                 * goods_desc : 【特价2斤】猴头菇饼干粗粮饼干早餐饼干香葱苏打夹心饼干零食1斤
                 * opt_name : 食品
                 * opt_ids : [1024,21857,1,226,2,10723,11876,22950,8584,10696,8585,8586,10700,12,22926,22932,8569,22297,8570,8571,219,667,94]
                 * goods_image_url : https://img.pddpic.com/mms-material-img/2020-07-13/5cd950b8-ed17-4442-ab5c-04812a4f8f4f.jpg.a.jpeg
                 * has_mall_coupon : false
                 * unified_tags : ["极速退款"]
                 * video_urls : []
                 * coupon_start_time : 1603036800
                 * min_group_price : 1080
                 * coupon_discount : 600
                 * coupon_end_time : 1604159999
                 * zs_duo_id : 0
                 * mall_coupon_remain_quantity : 0
                 * plan_type : 2
                 * clt_cpn_quantity : 2000000
                 * cat_ids : [6398,6469,6470]
                 * coupon_min_order_amount : 600
                 * category_id : 1
                 * mall_coupon_discount_pct : 0
                 * coupon_total_quantity : 50000
                 * mall_coupon_min_order_amount : 0
                 * merchant_type : 5
                 * clt_cpn_start_time : 1601395200
                 * sales_tip : 10万+
                 * only_scene_auth : false
                 * desc_txt : 高
                 * goods_thumbnail_url : https://t00img.yangkeduo.com/goods/images/2020-07-13/6b4b86378b1811ee402e59e421ed19fb.jpeg
                 * opt_id : 1
                 * has_coupon : true
                 * min_normal_price : 1180
                 * mall_coupon_start_time : 0
                 * serv_txt : 高
                 * mall_coupon_total_quantity : 0
                 * mall_coupon_max_discount_amount : 0
                 * mall_cps : 1
                 */

                private String category_name;
                private int clt_cpn_end_time;
                private int clt_cpn_min_amt;
                private int coupon_remain_quantity;
                private int clt_cpn_remain_quantity;
                private int promotion_rate;
                private int mall_id;
                private String mall_name;
                private int mall_coupon_end_time;
                private String clt_cpn_batch_sn;
                private String lgst_txt;
                private String goods_name;
                private int clt_cpn_discount;
                private long goods_id;
                private int predict_promotion_rate;
                private String goods_desc;
                private String opt_name;
                private String goods_image_url;
                private boolean has_mall_coupon;
                private int coupon_start_time;
                private int min_group_price;
                private int coupon_discount;
                private int coupon_end_time;
                private int zs_duo_id;
                private int mall_coupon_remain_quantity;
                private int plan_type;
                private int clt_cpn_quantity;
                private int coupon_min_order_amount;
                private int category_id;
                private int mall_coupon_discount_pct;
                private int coupon_total_quantity;
                private int mall_coupon_min_order_amount;
                private int merchant_type;
                private int clt_cpn_start_time;
                private String sales_tip;
                private boolean only_scene_auth;
                private String desc_txt;
                private String goods_thumbnail_url;
                private int opt_id;
                private boolean has_coupon;
                private int min_normal_price;
                private int mall_coupon_start_time;
                private String serv_txt;
                private int mall_coupon_total_quantity;
                private int mall_coupon_max_discount_amount;
                private int mall_cps;
                private List<Integer> service_tags;
                private List<String> goods_gallery_urls;
                private List<Integer> opt_ids;
                private List<String> unified_tags;
                private List<?> video_urls;
                private List<Integer> cat_ids;

                public String getCategory_name() {
                    return category_name;
                }

                public void setCategory_name(String category_name) {
                    this.category_name = category_name;
                }

                public int getClt_cpn_end_time() {
                    return clt_cpn_end_time;
                }

                public void setClt_cpn_end_time(int clt_cpn_end_time) {
                    this.clt_cpn_end_time = clt_cpn_end_time;
                }

                public int getClt_cpn_min_amt() {
                    return clt_cpn_min_amt;
                }

                public void setClt_cpn_min_amt(int clt_cpn_min_amt) {
                    this.clt_cpn_min_amt = clt_cpn_min_amt;
                }

                public int getCoupon_remain_quantity() {
                    return coupon_remain_quantity;
                }

                public void setCoupon_remain_quantity(int coupon_remain_quantity) {
                    this.coupon_remain_quantity = coupon_remain_quantity;
                }

                public int getClt_cpn_remain_quantity() {
                    return clt_cpn_remain_quantity;
                }

                public void setClt_cpn_remain_quantity(int clt_cpn_remain_quantity) {
                    this.clt_cpn_remain_quantity = clt_cpn_remain_quantity;
                }

                public int getPromotion_rate() {
                    return promotion_rate;
                }

                public void setPromotion_rate(int promotion_rate) {
                    this.promotion_rate = promotion_rate;
                }

                public int getMall_id() {
                    return mall_id;
                }

                public void setMall_id(int mall_id) {
                    this.mall_id = mall_id;
                }

                public String getMall_name() {
                    return mall_name;
                }

                public void setMall_name(String mall_name) {
                    this.mall_name = mall_name;
                }

                public int getMall_coupon_end_time() {
                    return mall_coupon_end_time;
                }

                public void setMall_coupon_end_time(int mall_coupon_end_time) {
                    this.mall_coupon_end_time = mall_coupon_end_time;
                }

                public String getClt_cpn_batch_sn() {
                    return clt_cpn_batch_sn;
                }

                public void setClt_cpn_batch_sn(String clt_cpn_batch_sn) {
                    this.clt_cpn_batch_sn = clt_cpn_batch_sn;
                }

                public String getLgst_txt() {
                    return lgst_txt;
                }

                public void setLgst_txt(String lgst_txt) {
                    this.lgst_txt = lgst_txt;
                }

                public String getGoods_name() {
                    return goods_name;
                }

                public void setGoods_name(String goods_name) {
                    this.goods_name = goods_name;
                }

                public int getClt_cpn_discount() {
                    return clt_cpn_discount;
                }

                public void setClt_cpn_discount(int clt_cpn_discount) {
                    this.clt_cpn_discount = clt_cpn_discount;
                }

                public long getGoods_id() {
                    return goods_id;
                }

                public void setGoods_id(long goods_id) {
                    this.goods_id = goods_id;
                }

                public int getPredict_promotion_rate() {
                    return predict_promotion_rate;
                }

                public void setPredict_promotion_rate(int predict_promotion_rate) {
                    this.predict_promotion_rate = predict_promotion_rate;
                }

                public String getGoods_desc() {
                    return goods_desc;
                }

                public void setGoods_desc(String goods_desc) {
                    this.goods_desc = goods_desc;
                }

                public String getOpt_name() {
                    return opt_name;
                }

                public void setOpt_name(String opt_name) {
                    this.opt_name = opt_name;
                }

                public String getGoods_image_url() {
                    return goods_image_url;
                }

                public void setGoods_image_url(String goods_image_url) {
                    this.goods_image_url = goods_image_url;
                }

                public boolean isHas_mall_coupon() {
                    return has_mall_coupon;
                }

                public void setHas_mall_coupon(boolean has_mall_coupon) {
                    this.has_mall_coupon = has_mall_coupon;
                }

                public int getCoupon_start_time() {
                    return coupon_start_time;
                }

                public void setCoupon_start_time(int coupon_start_time) {
                    this.coupon_start_time = coupon_start_time;
                }

                public int getMin_group_price() {
                    return min_group_price;
                }

                public void setMin_group_price(int min_group_price) {
                    this.min_group_price = min_group_price;
                }

                public int getCoupon_discount() {
                    return coupon_discount;
                }

                public void setCoupon_discount(int coupon_discount) {
                    this.coupon_discount = coupon_discount;
                }

                public int getCoupon_end_time() {
                    return coupon_end_time;
                }

                public void setCoupon_end_time(int coupon_end_time) {
                    this.coupon_end_time = coupon_end_time;
                }

                public int getZs_duo_id() {
                    return zs_duo_id;
                }

                public void setZs_duo_id(int zs_duo_id) {
                    this.zs_duo_id = zs_duo_id;
                }

                public int getMall_coupon_remain_quantity() {
                    return mall_coupon_remain_quantity;
                }

                public void setMall_coupon_remain_quantity(int mall_coupon_remain_quantity) {
                    this.mall_coupon_remain_quantity = mall_coupon_remain_quantity;
                }

                public int getPlan_type() {
                    return plan_type;
                }

                public void setPlan_type(int plan_type) {
                    this.plan_type = plan_type;
                }

                public int getClt_cpn_quantity() {
                    return clt_cpn_quantity;
                }

                public void setClt_cpn_quantity(int clt_cpn_quantity) {
                    this.clt_cpn_quantity = clt_cpn_quantity;
                }

                public int getCoupon_min_order_amount() {
                    return coupon_min_order_amount;
                }

                public void setCoupon_min_order_amount(int coupon_min_order_amount) {
                    this.coupon_min_order_amount = coupon_min_order_amount;
                }

                public int getCategory_id() {
                    return category_id;
                }

                public void setCategory_id(int category_id) {
                    this.category_id = category_id;
                }

                public int getMall_coupon_discount_pct() {
                    return mall_coupon_discount_pct;
                }

                public void setMall_coupon_discount_pct(int mall_coupon_discount_pct) {
                    this.mall_coupon_discount_pct = mall_coupon_discount_pct;
                }

                public int getCoupon_total_quantity() {
                    return coupon_total_quantity;
                }

                public void setCoupon_total_quantity(int coupon_total_quantity) {
                    this.coupon_total_quantity = coupon_total_quantity;
                }

                public int getMall_coupon_min_order_amount() {
                    return mall_coupon_min_order_amount;
                }

                public void setMall_coupon_min_order_amount(int mall_coupon_min_order_amount) {
                    this.mall_coupon_min_order_amount = mall_coupon_min_order_amount;
                }

                public int getMerchant_type() {
                    return merchant_type;
                }

                public void setMerchant_type(int merchant_type) {
                    this.merchant_type = merchant_type;
                }

                public int getClt_cpn_start_time() {
                    return clt_cpn_start_time;
                }

                public void setClt_cpn_start_time(int clt_cpn_start_time) {
                    this.clt_cpn_start_time = clt_cpn_start_time;
                }

                public String getSales_tip() {
                    return sales_tip;
                }

                public void setSales_tip(String sales_tip) {
                    this.sales_tip = sales_tip;
                }

                public boolean isOnly_scene_auth() {
                    return only_scene_auth;
                }

                public void setOnly_scene_auth(boolean only_scene_auth) {
                    this.only_scene_auth = only_scene_auth;
                }

                public String getDesc_txt() {
                    return desc_txt;
                }

                public void setDesc_txt(String desc_txt) {
                    this.desc_txt = desc_txt;
                }

                public String getGoods_thumbnail_url() {
                    return goods_thumbnail_url;
                }

                public void setGoods_thumbnail_url(String goods_thumbnail_url) {
                    this.goods_thumbnail_url = goods_thumbnail_url;
                }

                public int getOpt_id() {
                    return opt_id;
                }

                public void setOpt_id(int opt_id) {
                    this.opt_id = opt_id;
                }

                public boolean isHas_coupon() {
                    return has_coupon;
                }

                public void setHas_coupon(boolean has_coupon) {
                    this.has_coupon = has_coupon;
                }

                public int getMin_normal_price() {
                    return min_normal_price;
                }

                public void setMin_normal_price(int min_normal_price) {
                    this.min_normal_price = min_normal_price;
                }

                public int getMall_coupon_start_time() {
                    return mall_coupon_start_time;
                }

                public void setMall_coupon_start_time(int mall_coupon_start_time) {
                    this.mall_coupon_start_time = mall_coupon_start_time;
                }

                public String getServ_txt() {
                    return serv_txt;
                }

                public void setServ_txt(String serv_txt) {
                    this.serv_txt = serv_txt;
                }

                public int getMall_coupon_total_quantity() {
                    return mall_coupon_total_quantity;
                }

                public void setMall_coupon_total_quantity(int mall_coupon_total_quantity) {
                    this.mall_coupon_total_quantity = mall_coupon_total_quantity;
                }

                public int getMall_coupon_max_discount_amount() {
                    return mall_coupon_max_discount_amount;
                }

                public void setMall_coupon_max_discount_amount(int mall_coupon_max_discount_amount) {
                    this.mall_coupon_max_discount_amount = mall_coupon_max_discount_amount;
                }

                public int getMall_cps() {
                    return mall_cps;
                }

                public void setMall_cps(int mall_cps) {
                    this.mall_cps = mall_cps;
                }

                public List<Integer> getService_tags() {
                    return service_tags;
                }

                public void setService_tags(List<Integer> service_tags) {
                    this.service_tags = service_tags;
                }

                public List<String> getGoods_gallery_urls() {
                    return goods_gallery_urls;
                }

                public void setGoods_gallery_urls(List<String> goods_gallery_urls) {
                    this.goods_gallery_urls = goods_gallery_urls;
                }

                public List<Integer> getOpt_ids() {
                    return opt_ids;
                }

                public void setOpt_ids(List<Integer> opt_ids) {
                    this.opt_ids = opt_ids;
                }

                public List<String> getUnified_tags() {
                    return unified_tags;
                }

                public void setUnified_tags(List<String> unified_tags) {
                    this.unified_tags = unified_tags;
                }

                public List<?> getVideo_urls() {
                    return video_urls;
                }

                public void setVideo_urls(List<?> video_urls) {
                    this.video_urls = video_urls;
                }

                public List<Integer> getCat_ids() {
                    return cat_ids;
                }

                public void setCat_ids(List<Integer> cat_ids) {
                    this.cat_ids = cat_ids;
                }
            }
        }
    }
}
