package com.lx.android_commerce.weight.entity;

import java.util.List;

public
/**
 *@author : 阿森
 *@date : 2020-10-16 15:53
 *@params : 
 *@description:
 */
class HomeRecommendEntity {

    /**
     * message : 获取成功
     * code : 0000
     * success : true
     * entity : {"goods_search_response":{"goods_list":[{"avg_desc":0,"category_name":null,"coupon_remain_quantity":2700,"avg_serv":0,"avg_lgst":0,"serv_pct":0,"promotion_rate":200,"promotion_amount":0,"sold_quantity":999,"sales_tip":"195","coupon_min_order_amount":2000,"lgst_pct":0,"category_id":0,"mall_id":0,"goods_eval_score":0,"mall_name":"乐途精品店","mall_type":"PDD","coupon_total_quantity":5000,"desc_pct":0,"merchant_type":6,"goods_name":"【买一送一/2双装】老北京布鞋男单鞋防滑耐磨休闲工作鞋劳保鞋","goods_eval_count":0,"goods_id":98437724815,"opt_name":"鞋包","goods_thumbnail_url":"https://t00img.yangkeduo.com/goods/images/2020-03-25/d6028cc748fa7c47dcf593a6b6611949.jpeg","goods_image_url":"https://t00img.yangkeduo.com/openapi/images/2020-03-25/b895aa6425a51dbd3d5391ff52697eb4.jpeg","min_normal_price":7120,"has_coupon":true,"create_at":0,"min_group_price":4080,"mall_cps":1,"coupon_start_time":1599494400,"coupon_discount":2000,"coupon_end_time":1606924799,"goods_gallery_urls":null,"platform":null,"coupon_price":0,"awardAmount":208,"plusAmount":332},{"avg_desc":0,"category_name":null,"coupon_remain_quantity":46000,"avg_serv":0,"avg_lgst":0,"serv_pct":0,"promotion_rate":150,"promotion_amount":0,"sold_quantity":999,"sales_tip":"5.3万","coupon_min_order_amount":1200,"lgst_pct":0,"category_id":0,"mall_id":0,"goods_eval_score":0,"mall_name":"富娇家居生活馆","mall_type":"PDD","coupon_total_quantity":50000,"desc_pct":0,"merchant_type":6,"goods_name":"【50卷巨量】50卷/12卷木浆卫生纸卷纸批发家用车用纸巾厕纸手纸","goods_eval_count":0,"goods_id":175081776705,"opt_name":"车品","goods_thumbnail_url":"https://t00img.yangkeduo.com/goods/images/2020-09-17/bab56ee4ee2cc00657da27e0e0d7b4c7.jpeg","goods_image_url":"https://img.pddpic.com/mms-material-img/2020-09-17/b6aecc6d-e7d9-4ac6-b460-a6eda26da48e.jpeg.a.jpeg","min_normal_price":1799,"has_coupon":true,"create_at":0,"min_group_price":1699,"mall_cps":1,"coupon_start_time":1602691200,"coupon_discount":1200,"coupon_end_time":1602950399,"goods_gallery_urls":null,"platform":null,"coupon_price":0,"awardAmount":37,"plusAmount":59},{"avg_desc":0,"category_name":null,"coupon_remain_quantity":46000,"avg_serv":0,"avg_lgst":0,"serv_pct":0,"promotion_rate":260,"promotion_amount":0,"sold_quantity":999,"sales_tip":"1.2万","coupon_min_order_amount":3000,"lgst_pct":0,"category_id":0,"mall_id":0,"goods_eval_score":0,"mall_name":"金皓家居用品","mall_type":"PDD","coupon_total_quantity":50000,"desc_pct":0,"merchant_type":1,"goods_name":"薰衣草香洗衣液 持久留香 护衣亮色 低泡易漂 5斤家庭装批发","goods_eval_count":0,"goods_id":130801587484,"opt_name":"洗护","goods_thumbnail_url":"https://t00img.yangkeduo.com/goods/images/2020-05-31/5e673a87e7227db15ffa1b03d62cf7e0.jpeg","goods_image_url":"https://t00img.yangkeduo.com/goods/images/2020-05-31/2b7b0472-2142-4c59-a553-a114b71192ef.jpg","min_normal_price":4590,"has_coupon":true,"create_at":0,"min_group_price":4490,"mall_cps":1,"coupon_start_time":1602086400,"coupon_discount":3000,"coupon_end_time":1604159999,"goods_gallery_urls":null,"platform":null,"coupon_price":0,"awardAmount":193,"plusAmount":309},{"avg_desc":0,"category_name":null,"coupon_remain_quantity":26000,"avg_serv":0,"avg_lgst":0,"serv_pct":0,"promotion_rate":500,"promotion_amount":0,"sold_quantity":999,"sales_tip":"3225","coupon_min_order_amount":900,"lgst_pct":0,"category_id":0,"mall_id":0,"goods_eval_score":0,"mall_name":"凯瑞玛官方旗舰店","mall_type":"PDD","coupon_total_quantity":30000,"desc_pct":0,"merchant_type":3,"goods_name":"凯瑞玛袋装奶茶粉速溶阿萨姆原味奶茶多口味22g*20条小包装冲饮","goods_eval_count":0,"goods_id":73680376795,"opt_name":"食品","goods_thumbnail_url":"https://t00img.yangkeduo.com/goods/images/2020-03-20/4c5becc9a5ba2733212f4e4613278890.jpeg","goods_image_url":"https://t00img.yangkeduo.com/goods/images/2020-03-20/ec3fe838-ae3c-4a6c-a040-93e8840564b2.jpg","min_normal_price":2480,"has_coupon":true,"create_at":0,"min_group_price":1980,"mall_cps":1,"coupon_start_time":1602518400,"coupon_discount":900,"coupon_end_time":1602950399,"goods_gallery_urls":null,"platform":null,"coupon_price":0,"awardAmount":270,"plusAmount":432},{"avg_desc":0,"category_name":null,"coupon_remain_quantity":0,"avg_serv":0,"avg_lgst":0,"serv_pct":0,"promotion_rate":150,"promotion_amount":0,"sold_quantity":999,"sales_tip":"1.1万","coupon_min_order_amount":0,"lgst_pct":0,"category_id":0,"mall_id":0,"goods_eval_score":0,"mall_name":"诗韵画意精品服饰","mall_type":"PDD","coupon_total_quantity":0,"desc_pct":0,"merchant_type":1,"goods_name":"仙女暖暖套装单件女冬季加绒加厚珊瑚绒宽松懒人束脚居家睡裤睡衣","goods_eval_count":0,"goods_id":163925357832,"opt_name":"女装","goods_thumbnail_url":"https://t00img.yangkeduo.com/goods/images/2020-08-10/7166cd13d2702e9550d3acf8a704fc46.jpeg","goods_image_url":"https://img.pddpic.com/mms-material-img/2020-08-10/35829a01-760e-4364-8d1f-19affbbfed67.jpg.a.jpeg","min_normal_price":5800,"has_coupon":true,"create_at":0,"min_group_price":1572,"mall_cps":1,"coupon_start_time":0,"coupon_discount":0,"coupon_end_time":0,"goods_gallery_urls":null,"platform":null,"coupon_price":0,"awardAmount":117,"plusAmount":188},{"avg_desc":0,"category_name":null,"coupon_remain_quantity":42500,"avg_serv":0,"avg_lgst":0,"serv_pct":0,"promotion_rate":200,"promotion_amount":0,"sold_quantity":999,"sales_tip":"1.4万","coupon_min_order_amount":2000,"lgst_pct":0,"category_id":0,"mall_id":0,"goods_eval_score":0,"mall_name":"如二的店","mall_type":"PDD","coupon_total_quantity":50000,"desc_pct":0,"merchant_type":1,"goods_name":"沐清柔金装30包原木抽纸整箱批发家用妇婴用纸厕纸车载纸巾18包","goods_eval_count":0,"goods_id":156378971037,"opt_name":"车品","goods_thumbnail_url":"https://t00img.yangkeduo.com/goods/images/2020-07-22/c169c51b99b2dfea7001ccbbd29b800d.jpeg","goods_image_url":"https://img.pddpic.com/mms-material-img/2020-07-09/9b4183a7-ed40-4636-b77c-c4c02716f530.jpg.a.jpeg","min_normal_price":5179,"has_coupon":true,"create_at":0,"min_group_price":4339,"mall_cps":1,"coupon_start_time":1601827200,"coupon_discount":2000,"coupon_end_time":1605283199,"goods_gallery_urls":null,"platform":null,"coupon_price":0,"awardAmount":233,"plusAmount":374},{"avg_desc":0,"category_name":null,"coupon_remain_quantity":22000,"avg_serv":0,"avg_lgst":0,"serv_pct":0,"promotion_rate":300,"promotion_amount":0,"sold_quantity":999,"sales_tip":"6133","coupon_min_order_amount":2000,"lgst_pct":0,"category_id":0,"mall_id":0,"goods_eval_score":0,"mall_name":"芊芊优美内衣馆","mall_type":"PDD","coupon_total_quantity":50000,"desc_pct":0,"merchant_type":1,"goods_name":"德国技术晶钻不粘锅炒菜锅电磁炉炒锅铁锅具家用无油烟燃气灶通用","goods_eval_count":0,"goods_id":161714415484,"opt_name":"百货","goods_thumbnail_url":"https://t00img.yangkeduo.com/goods/images/2020-08-05/c91ac995d2e2b7552a032fceaeabed95.jpeg","goods_image_url":"https://t00img.yangkeduo.com/openapi/images/2020-08-05/f810fd3a317e62f0980960847fe916b5.jpeg","min_normal_price":9992,"has_coupon":true,"create_at":0,"min_group_price":4440,"mall_cps":1,"coupon_start_time":1601827200,"coupon_discount":2000,"coupon_end_time":1607529599,"goods_gallery_urls":null,"platform":null,"coupon_price":0,"awardAmount":366,"plusAmount":585},{"avg_desc":0,"category_name":null,"coupon_remain_quantity":0,"avg_serv":0,"avg_lgst":0,"serv_pct":0,"promotion_rate":500,"promotion_amount":0,"sold_quantity":999,"sales_tip":"4万","coupon_min_order_amount":0,"lgst_pct":0,"category_id":0,"mall_id":0,"goods_eval_score":0,"mall_name":"一表钟芯","mall_type":"PDD","coupon_total_quantity":0,"desc_pct":0,"merchant_type":1,"goods_name":"新款LED防水电子表 卡通公仔创意学生文具手表可爱儿童发光手环表","goods_eval_count":0,"goods_id":169718918621,"opt_name":"鞋包","goods_thumbnail_url":"https://t00img.yangkeduo.com/goods/images/2020-09-16/81d81fcb66b736c8cc77d2692525c4de.jpeg","goods_image_url":"https://img.pddpic.com/mms-material-img/2020-08-29/9e0faada-9de9-448e-8870-964c219f0806.jpeg","min_normal_price":780,"has_coupon":true,"create_at":0,"min_group_price":349,"mall_cps":1,"coupon_start_time":0,"coupon_discount":0,"coupon_end_time":0,"goods_gallery_urls":null,"platform":null,"coupon_price":0,"awardAmount":87,"plusAmount":139},{"avg_desc":0,"category_name":null,"coupon_remain_quantity":38000,"avg_serv":0,"avg_lgst":0,"serv_pct":0,"promotion_rate":100,"promotion_amount":0,"sold_quantity":999,"sales_tip":"1279","coupon_min_order_amount":200,"lgst_pct":0,"category_id":0,"mall_id":0,"goods_eval_score":0,"mall_name":"淘韵美服装官方旗舰店","mall_type":"PDD","coupon_total_quantity":50000,"desc_pct":0,"merchant_type":3,"goods_name":"加绒加厚仿羊羔毛宽松外套女冬短款2020新款潮小香风开叉一体上衣","goods_eval_count":0,"goods_id":81105153052,"opt_name":"女装","goods_thumbnail_url":"https://t00img.yangkeduo.com/goods/images/2019-12-27/3d3e7dec73271c73b25aa4774c3598e9.jpeg","goods_image_url":"https://t00img.yangkeduo.com/goods/images/2019-12-27/229ef142-4117-4e42-9b44-f970826ccc1e.jpg","min_normal_price":2089,"has_coupon":true,"create_at":0,"min_group_price":1986,"mall_cps":1,"coupon_start_time":1596988800,"coupon_discount":200,"coupon_end_time":1604246399,"goods_gallery_urls":null,"platform":null,"coupon_price":0,"awardAmount":89,"plusAmount":142},{"avg_desc":0,"category_name":null,"coupon_remain_quantity":46000,"avg_serv":0,"avg_lgst":0,"serv_pct":0,"promotion_rate":300,"promotion_amount":0,"sold_quantity":999,"sales_tip":"4625","coupon_min_order_amount":3900,"lgst_pct":0,"category_id":0,"mall_id":0,"goods_eval_score":0,"mall_name":"小丢3C数码","mall_type":"PDD","coupon_total_quantity":50000,"desc_pct":0,"merchant_type":1,"goods_name":"20000毫安快充大容量充电宝苹果安卓全部手机通用移动电源","goods_eval_count":0,"goods_id":166661406545,"opt_name":"手机","goods_thumbnail_url":"https://t00img.yangkeduo.com/goods/images/2020-08-17/361c30b7cbebb8f4637e895b009df1d7.jpeg","goods_image_url":"https://img.pddpic.com/mms-material-img/2020-08-17/11dd719f-1710-44bf-aa97-cca2d9ba8894.jpeg.a.jpeg","min_normal_price":5880,"has_coupon":true,"create_at":0,"min_group_price":5580,"mall_cps":1,"coupon_start_time":1602777600,"coupon_discount":3900,"coupon_end_time":1603641599,"goods_gallery_urls":null,"platform":null,"coupon_price":0,"awardAmount":252,"plusAmount":403}],"total_count":10}}
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
         * goods_search_response : {"goods_list":[{"avg_desc":0,"category_name":null,"coupon_remain_quantity":2700,"avg_serv":0,"avg_lgst":0,"serv_pct":0,"promotion_rate":200,"promotion_amount":0,"sold_quantity":999,"sales_tip":"195","coupon_min_order_amount":2000,"lgst_pct":0,"category_id":0,"mall_id":0,"goods_eval_score":0,"mall_name":"乐途精品店","mall_type":"PDD","coupon_total_quantity":5000,"desc_pct":0,"merchant_type":6,"goods_name":"【买一送一/2双装】老北京布鞋男单鞋防滑耐磨休闲工作鞋劳保鞋","goods_eval_count":0,"goods_id":98437724815,"opt_name":"鞋包","goods_thumbnail_url":"https://t00img.yangkeduo.com/goods/images/2020-03-25/d6028cc748fa7c47dcf593a6b6611949.jpeg","goods_image_url":"https://t00img.yangkeduo.com/openapi/images/2020-03-25/b895aa6425a51dbd3d5391ff52697eb4.jpeg","min_normal_price":7120,"has_coupon":true,"create_at":0,"min_group_price":4080,"mall_cps":1,"coupon_start_time":1599494400,"coupon_discount":2000,"coupon_end_time":1606924799,"goods_gallery_urls":null,"platform":null,"coupon_price":0,"awardAmount":208,"plusAmount":332},{"avg_desc":0,"category_name":null,"coupon_remain_quantity":46000,"avg_serv":0,"avg_lgst":0,"serv_pct":0,"promotion_rate":150,"promotion_amount":0,"sold_quantity":999,"sales_tip":"5.3万","coupon_min_order_amount":1200,"lgst_pct":0,"category_id":0,"mall_id":0,"goods_eval_score":0,"mall_name":"富娇家居生活馆","mall_type":"PDD","coupon_total_quantity":50000,"desc_pct":0,"merchant_type":6,"goods_name":"【50卷巨量】50卷/12卷木浆卫生纸卷纸批发家用车用纸巾厕纸手纸","goods_eval_count":0,"goods_id":175081776705,"opt_name":"车品","goods_thumbnail_url":"https://t00img.yangkeduo.com/goods/images/2020-09-17/bab56ee4ee2cc00657da27e0e0d7b4c7.jpeg","goods_image_url":"https://img.pddpic.com/mms-material-img/2020-09-17/b6aecc6d-e7d9-4ac6-b460-a6eda26da48e.jpeg.a.jpeg","min_normal_price":1799,"has_coupon":true,"create_at":0,"min_group_price":1699,"mall_cps":1,"coupon_start_time":1602691200,"coupon_discount":1200,"coupon_end_time":1602950399,"goods_gallery_urls":null,"platform":null,"coupon_price":0,"awardAmount":37,"plusAmount":59},{"avg_desc":0,"category_name":null,"coupon_remain_quantity":46000,"avg_serv":0,"avg_lgst":0,"serv_pct":0,"promotion_rate":260,"promotion_amount":0,"sold_quantity":999,"sales_tip":"1.2万","coupon_min_order_amount":3000,"lgst_pct":0,"category_id":0,"mall_id":0,"goods_eval_score":0,"mall_name":"金皓家居用品","mall_type":"PDD","coupon_total_quantity":50000,"desc_pct":0,"merchant_type":1,"goods_name":"薰衣草香洗衣液 持久留香 护衣亮色 低泡易漂 5斤家庭装批发","goods_eval_count":0,"goods_id":130801587484,"opt_name":"洗护","goods_thumbnail_url":"https://t00img.yangkeduo.com/goods/images/2020-05-31/5e673a87e7227db15ffa1b03d62cf7e0.jpeg","goods_image_url":"https://t00img.yangkeduo.com/goods/images/2020-05-31/2b7b0472-2142-4c59-a553-a114b71192ef.jpg","min_normal_price":4590,"has_coupon":true,"create_at":0,"min_group_price":4490,"mall_cps":1,"coupon_start_time":1602086400,"coupon_discount":3000,"coupon_end_time":1604159999,"goods_gallery_urls":null,"platform":null,"coupon_price":0,"awardAmount":193,"plusAmount":309},{"avg_desc":0,"category_name":null,"coupon_remain_quantity":26000,"avg_serv":0,"avg_lgst":0,"serv_pct":0,"promotion_rate":500,"promotion_amount":0,"sold_quantity":999,"sales_tip":"3225","coupon_min_order_amount":900,"lgst_pct":0,"category_id":0,"mall_id":0,"goods_eval_score":0,"mall_name":"凯瑞玛官方旗舰店","mall_type":"PDD","coupon_total_quantity":30000,"desc_pct":0,"merchant_type":3,"goods_name":"凯瑞玛袋装奶茶粉速溶阿萨姆原味奶茶多口味22g*20条小包装冲饮","goods_eval_count":0,"goods_id":73680376795,"opt_name":"食品","goods_thumbnail_url":"https://t00img.yangkeduo.com/goods/images/2020-03-20/4c5becc9a5ba2733212f4e4613278890.jpeg","goods_image_url":"https://t00img.yangkeduo.com/goods/images/2020-03-20/ec3fe838-ae3c-4a6c-a040-93e8840564b2.jpg","min_normal_price":2480,"has_coupon":true,"create_at":0,"min_group_price":1980,"mall_cps":1,"coupon_start_time":1602518400,"coupon_discount":900,"coupon_end_time":1602950399,"goods_gallery_urls":null,"platform":null,"coupon_price":0,"awardAmount":270,"plusAmount":432},{"avg_desc":0,"category_name":null,"coupon_remain_quantity":0,"avg_serv":0,"avg_lgst":0,"serv_pct":0,"promotion_rate":150,"promotion_amount":0,"sold_quantity":999,"sales_tip":"1.1万","coupon_min_order_amount":0,"lgst_pct":0,"category_id":0,"mall_id":0,"goods_eval_score":0,"mall_name":"诗韵画意精品服饰","mall_type":"PDD","coupon_total_quantity":0,"desc_pct":0,"merchant_type":1,"goods_name":"仙女暖暖套装单件女冬季加绒加厚珊瑚绒宽松懒人束脚居家睡裤睡衣","goods_eval_count":0,"goods_id":163925357832,"opt_name":"女装","goods_thumbnail_url":"https://t00img.yangkeduo.com/goods/images/2020-08-10/7166cd13d2702e9550d3acf8a704fc46.jpeg","goods_image_url":"https://img.pddpic.com/mms-material-img/2020-08-10/35829a01-760e-4364-8d1f-19affbbfed67.jpg.a.jpeg","min_normal_price":5800,"has_coupon":true,"create_at":0,"min_group_price":1572,"mall_cps":1,"coupon_start_time":0,"coupon_discount":0,"coupon_end_time":0,"goods_gallery_urls":null,"platform":null,"coupon_price":0,"awardAmount":117,"plusAmount":188},{"avg_desc":0,"category_name":null,"coupon_remain_quantity":42500,"avg_serv":0,"avg_lgst":0,"serv_pct":0,"promotion_rate":200,"promotion_amount":0,"sold_quantity":999,"sales_tip":"1.4万","coupon_min_order_amount":2000,"lgst_pct":0,"category_id":0,"mall_id":0,"goods_eval_score":0,"mall_name":"如二的店","mall_type":"PDD","coupon_total_quantity":50000,"desc_pct":0,"merchant_type":1,"goods_name":"沐清柔金装30包原木抽纸整箱批发家用妇婴用纸厕纸车载纸巾18包","goods_eval_count":0,"goods_id":156378971037,"opt_name":"车品","goods_thumbnail_url":"https://t00img.yangkeduo.com/goods/images/2020-07-22/c169c51b99b2dfea7001ccbbd29b800d.jpeg","goods_image_url":"https://img.pddpic.com/mms-material-img/2020-07-09/9b4183a7-ed40-4636-b77c-c4c02716f530.jpg.a.jpeg","min_normal_price":5179,"has_coupon":true,"create_at":0,"min_group_price":4339,"mall_cps":1,"coupon_start_time":1601827200,"coupon_discount":2000,"coupon_end_time":1605283199,"goods_gallery_urls":null,"platform":null,"coupon_price":0,"awardAmount":233,"plusAmount":374},{"avg_desc":0,"category_name":null,"coupon_remain_quantity":22000,"avg_serv":0,"avg_lgst":0,"serv_pct":0,"promotion_rate":300,"promotion_amount":0,"sold_quantity":999,"sales_tip":"6133","coupon_min_order_amount":2000,"lgst_pct":0,"category_id":0,"mall_id":0,"goods_eval_score":0,"mall_name":"芊芊优美内衣馆","mall_type":"PDD","coupon_total_quantity":50000,"desc_pct":0,"merchant_type":1,"goods_name":"德国技术晶钻不粘锅炒菜锅电磁炉炒锅铁锅具家用无油烟燃气灶通用","goods_eval_count":0,"goods_id":161714415484,"opt_name":"百货","goods_thumbnail_url":"https://t00img.yangkeduo.com/goods/images/2020-08-05/c91ac995d2e2b7552a032fceaeabed95.jpeg","goods_image_url":"https://t00img.yangkeduo.com/openapi/images/2020-08-05/f810fd3a317e62f0980960847fe916b5.jpeg","min_normal_price":9992,"has_coupon":true,"create_at":0,"min_group_price":4440,"mall_cps":1,"coupon_start_time":1601827200,"coupon_discount":2000,"coupon_end_time":1607529599,"goods_gallery_urls":null,"platform":null,"coupon_price":0,"awardAmount":366,"plusAmount":585},{"avg_desc":0,"category_name":null,"coupon_remain_quantity":0,"avg_serv":0,"avg_lgst":0,"serv_pct":0,"promotion_rate":500,"promotion_amount":0,"sold_quantity":999,"sales_tip":"4万","coupon_min_order_amount":0,"lgst_pct":0,"category_id":0,"mall_id":0,"goods_eval_score":0,"mall_name":"一表钟芯","mall_type":"PDD","coupon_total_quantity":0,"desc_pct":0,"merchant_type":1,"goods_name":"新款LED防水电子表 卡通公仔创意学生文具手表可爱儿童发光手环表","goods_eval_count":0,"goods_id":169718918621,"opt_name":"鞋包","goods_thumbnail_url":"https://t00img.yangkeduo.com/goods/images/2020-09-16/81d81fcb66b736c8cc77d2692525c4de.jpeg","goods_image_url":"https://img.pddpic.com/mms-material-img/2020-08-29/9e0faada-9de9-448e-8870-964c219f0806.jpeg","min_normal_price":780,"has_coupon":true,"create_at":0,"min_group_price":349,"mall_cps":1,"coupon_start_time":0,"coupon_discount":0,"coupon_end_time":0,"goods_gallery_urls":null,"platform":null,"coupon_price":0,"awardAmount":87,"plusAmount":139},{"avg_desc":0,"category_name":null,"coupon_remain_quantity":38000,"avg_serv":0,"avg_lgst":0,"serv_pct":0,"promotion_rate":100,"promotion_amount":0,"sold_quantity":999,"sales_tip":"1279","coupon_min_order_amount":200,"lgst_pct":0,"category_id":0,"mall_id":0,"goods_eval_score":0,"mall_name":"淘韵美服装官方旗舰店","mall_type":"PDD","coupon_total_quantity":50000,"desc_pct":0,"merchant_type":3,"goods_name":"加绒加厚仿羊羔毛宽松外套女冬短款2020新款潮小香风开叉一体上衣","goods_eval_count":0,"goods_id":81105153052,"opt_name":"女装","goods_thumbnail_url":"https://t00img.yangkeduo.com/goods/images/2019-12-27/3d3e7dec73271c73b25aa4774c3598e9.jpeg","goods_image_url":"https://t00img.yangkeduo.com/goods/images/2019-12-27/229ef142-4117-4e42-9b44-f970826ccc1e.jpg","min_normal_price":2089,"has_coupon":true,"create_at":0,"min_group_price":1986,"mall_cps":1,"coupon_start_time":1596988800,"coupon_discount":200,"coupon_end_time":1604246399,"goods_gallery_urls":null,"platform":null,"coupon_price":0,"awardAmount":89,"plusAmount":142},{"avg_desc":0,"category_name":null,"coupon_remain_quantity":46000,"avg_serv":0,"avg_lgst":0,"serv_pct":0,"promotion_rate":300,"promotion_amount":0,"sold_quantity":999,"sales_tip":"4625","coupon_min_order_amount":3900,"lgst_pct":0,"category_id":0,"mall_id":0,"goods_eval_score":0,"mall_name":"小丢3C数码","mall_type":"PDD","coupon_total_quantity":50000,"desc_pct":0,"merchant_type":1,"goods_name":"20000毫安快充大容量充电宝苹果安卓全部手机通用移动电源","goods_eval_count":0,"goods_id":166661406545,"opt_name":"手机","goods_thumbnail_url":"https://t00img.yangkeduo.com/goods/images/2020-08-17/361c30b7cbebb8f4637e895b009df1d7.jpeg","goods_image_url":"https://img.pddpic.com/mms-material-img/2020-08-17/11dd719f-1710-44bf-aa97-cca2d9ba8894.jpeg.a.jpeg","min_normal_price":5880,"has_coupon":true,"create_at":0,"min_group_price":5580,"mall_cps":1,"coupon_start_time":1602777600,"coupon_discount":3900,"coupon_end_time":1603641599,"goods_gallery_urls":null,"platform":null,"coupon_price":0,"awardAmount":252,"plusAmount":403}],"total_count":10}
         */

        private GoodsSearchResponseBean goods_search_response;

        public GoodsSearchResponseBean getGoods_search_response() {
            return goods_search_response;
        }

        public void setGoods_search_response(GoodsSearchResponseBean goods_search_response) {
            this.goods_search_response = goods_search_response;
        }

        public static class GoodsSearchResponseBean {
            /**
             * goods_list : [{"avg_desc":0,"category_name":null,"coupon_remain_quantity":2700,"avg_serv":0,"avg_lgst":0,"serv_pct":0,"promotion_rate":200,"promotion_amount":0,"sold_quantity":999,"sales_tip":"195","coupon_min_order_amount":2000,"lgst_pct":0,"category_id":0,"mall_id":0,"goods_eval_score":0,"mall_name":"乐途精品店","mall_type":"PDD","coupon_total_quantity":5000,"desc_pct":0,"merchant_type":6,"goods_name":"【买一送一/2双装】老北京布鞋男单鞋防滑耐磨休闲工作鞋劳保鞋","goods_eval_count":0,"goods_id":98437724815,"opt_name":"鞋包","goods_thumbnail_url":"https://t00img.yangkeduo.com/goods/images/2020-03-25/d6028cc748fa7c47dcf593a6b6611949.jpeg","goods_image_url":"https://t00img.yangkeduo.com/openapi/images/2020-03-25/b895aa6425a51dbd3d5391ff52697eb4.jpeg","min_normal_price":7120,"has_coupon":true,"create_at":0,"min_group_price":4080,"mall_cps":1,"coupon_start_time":1599494400,"coupon_discount":2000,"coupon_end_time":1606924799,"goods_gallery_urls":null,"platform":null,"coupon_price":0,"awardAmount":208,"plusAmount":332},{"avg_desc":0,"category_name":null,"coupon_remain_quantity":46000,"avg_serv":0,"avg_lgst":0,"serv_pct":0,"promotion_rate":150,"promotion_amount":0,"sold_quantity":999,"sales_tip":"5.3万","coupon_min_order_amount":1200,"lgst_pct":0,"category_id":0,"mall_id":0,"goods_eval_score":0,"mall_name":"富娇家居生活馆","mall_type":"PDD","coupon_total_quantity":50000,"desc_pct":0,"merchant_type":6,"goods_name":"【50卷巨量】50卷/12卷木浆卫生纸卷纸批发家用车用纸巾厕纸手纸","goods_eval_count":0,"goods_id":175081776705,"opt_name":"车品","goods_thumbnail_url":"https://t00img.yangkeduo.com/goods/images/2020-09-17/bab56ee4ee2cc00657da27e0e0d7b4c7.jpeg","goods_image_url":"https://img.pddpic.com/mms-material-img/2020-09-17/b6aecc6d-e7d9-4ac6-b460-a6eda26da48e.jpeg.a.jpeg","min_normal_price":1799,"has_coupon":true,"create_at":0,"min_group_price":1699,"mall_cps":1,"coupon_start_time":1602691200,"coupon_discount":1200,"coupon_end_time":1602950399,"goods_gallery_urls":null,"platform":null,"coupon_price":0,"awardAmount":37,"plusAmount":59},{"avg_desc":0,"category_name":null,"coupon_remain_quantity":46000,"avg_serv":0,"avg_lgst":0,"serv_pct":0,"promotion_rate":260,"promotion_amount":0,"sold_quantity":999,"sales_tip":"1.2万","coupon_min_order_amount":3000,"lgst_pct":0,"category_id":0,"mall_id":0,"goods_eval_score":0,"mall_name":"金皓家居用品","mall_type":"PDD","coupon_total_quantity":50000,"desc_pct":0,"merchant_type":1,"goods_name":"薰衣草香洗衣液 持久留香 护衣亮色 低泡易漂 5斤家庭装批发","goods_eval_count":0,"goods_id":130801587484,"opt_name":"洗护","goods_thumbnail_url":"https://t00img.yangkeduo.com/goods/images/2020-05-31/5e673a87e7227db15ffa1b03d62cf7e0.jpeg","goods_image_url":"https://t00img.yangkeduo.com/goods/images/2020-05-31/2b7b0472-2142-4c59-a553-a114b71192ef.jpg","min_normal_price":4590,"has_coupon":true,"create_at":0,"min_group_price":4490,"mall_cps":1,"coupon_start_time":1602086400,"coupon_discount":3000,"coupon_end_time":1604159999,"goods_gallery_urls":null,"platform":null,"coupon_price":0,"awardAmount":193,"plusAmount":309},{"avg_desc":0,"category_name":null,"coupon_remain_quantity":26000,"avg_serv":0,"avg_lgst":0,"serv_pct":0,"promotion_rate":500,"promotion_amount":0,"sold_quantity":999,"sales_tip":"3225","coupon_min_order_amount":900,"lgst_pct":0,"category_id":0,"mall_id":0,"goods_eval_score":0,"mall_name":"凯瑞玛官方旗舰店","mall_type":"PDD","coupon_total_quantity":30000,"desc_pct":0,"merchant_type":3,"goods_name":"凯瑞玛袋装奶茶粉速溶阿萨姆原味奶茶多口味22g*20条小包装冲饮","goods_eval_count":0,"goods_id":73680376795,"opt_name":"食品","goods_thumbnail_url":"https://t00img.yangkeduo.com/goods/images/2020-03-20/4c5becc9a5ba2733212f4e4613278890.jpeg","goods_image_url":"https://t00img.yangkeduo.com/goods/images/2020-03-20/ec3fe838-ae3c-4a6c-a040-93e8840564b2.jpg","min_normal_price":2480,"has_coupon":true,"create_at":0,"min_group_price":1980,"mall_cps":1,"coupon_start_time":1602518400,"coupon_discount":900,"coupon_end_time":1602950399,"goods_gallery_urls":null,"platform":null,"coupon_price":0,"awardAmount":270,"plusAmount":432},{"avg_desc":0,"category_name":null,"coupon_remain_quantity":0,"avg_serv":0,"avg_lgst":0,"serv_pct":0,"promotion_rate":150,"promotion_amount":0,"sold_quantity":999,"sales_tip":"1.1万","coupon_min_order_amount":0,"lgst_pct":0,"category_id":0,"mall_id":0,"goods_eval_score":0,"mall_name":"诗韵画意精品服饰","mall_type":"PDD","coupon_total_quantity":0,"desc_pct":0,"merchant_type":1,"goods_name":"仙女暖暖套装单件女冬季加绒加厚珊瑚绒宽松懒人束脚居家睡裤睡衣","goods_eval_count":0,"goods_id":163925357832,"opt_name":"女装","goods_thumbnail_url":"https://t00img.yangkeduo.com/goods/images/2020-08-10/7166cd13d2702e9550d3acf8a704fc46.jpeg","goods_image_url":"https://img.pddpic.com/mms-material-img/2020-08-10/35829a01-760e-4364-8d1f-19affbbfed67.jpg.a.jpeg","min_normal_price":5800,"has_coupon":true,"create_at":0,"min_group_price":1572,"mall_cps":1,"coupon_start_time":0,"coupon_discount":0,"coupon_end_time":0,"goods_gallery_urls":null,"platform":null,"coupon_price":0,"awardAmount":117,"plusAmount":188},{"avg_desc":0,"category_name":null,"coupon_remain_quantity":42500,"avg_serv":0,"avg_lgst":0,"serv_pct":0,"promotion_rate":200,"promotion_amount":0,"sold_quantity":999,"sales_tip":"1.4万","coupon_min_order_amount":2000,"lgst_pct":0,"category_id":0,"mall_id":0,"goods_eval_score":0,"mall_name":"如二的店","mall_type":"PDD","coupon_total_quantity":50000,"desc_pct":0,"merchant_type":1,"goods_name":"沐清柔金装30包原木抽纸整箱批发家用妇婴用纸厕纸车载纸巾18包","goods_eval_count":0,"goods_id":156378971037,"opt_name":"车品","goods_thumbnail_url":"https://t00img.yangkeduo.com/goods/images/2020-07-22/c169c51b99b2dfea7001ccbbd29b800d.jpeg","goods_image_url":"https://img.pddpic.com/mms-material-img/2020-07-09/9b4183a7-ed40-4636-b77c-c4c02716f530.jpg.a.jpeg","min_normal_price":5179,"has_coupon":true,"create_at":0,"min_group_price":4339,"mall_cps":1,"coupon_start_time":1601827200,"coupon_discount":2000,"coupon_end_time":1605283199,"goods_gallery_urls":null,"platform":null,"coupon_price":0,"awardAmount":233,"plusAmount":374},{"avg_desc":0,"category_name":null,"coupon_remain_quantity":22000,"avg_serv":0,"avg_lgst":0,"serv_pct":0,"promotion_rate":300,"promotion_amount":0,"sold_quantity":999,"sales_tip":"6133","coupon_min_order_amount":2000,"lgst_pct":0,"category_id":0,"mall_id":0,"goods_eval_score":0,"mall_name":"芊芊优美内衣馆","mall_type":"PDD","coupon_total_quantity":50000,"desc_pct":0,"merchant_type":1,"goods_name":"德国技术晶钻不粘锅炒菜锅电磁炉炒锅铁锅具家用无油烟燃气灶通用","goods_eval_count":0,"goods_id":161714415484,"opt_name":"百货","goods_thumbnail_url":"https://t00img.yangkeduo.com/goods/images/2020-08-05/c91ac995d2e2b7552a032fceaeabed95.jpeg","goods_image_url":"https://t00img.yangkeduo.com/openapi/images/2020-08-05/f810fd3a317e62f0980960847fe916b5.jpeg","min_normal_price":9992,"has_coupon":true,"create_at":0,"min_group_price":4440,"mall_cps":1,"coupon_start_time":1601827200,"coupon_discount":2000,"coupon_end_time":1607529599,"goods_gallery_urls":null,"platform":null,"coupon_price":0,"awardAmount":366,"plusAmount":585},{"avg_desc":0,"category_name":null,"coupon_remain_quantity":0,"avg_serv":0,"avg_lgst":0,"serv_pct":0,"promotion_rate":500,"promotion_amount":0,"sold_quantity":999,"sales_tip":"4万","coupon_min_order_amount":0,"lgst_pct":0,"category_id":0,"mall_id":0,"goods_eval_score":0,"mall_name":"一表钟芯","mall_type":"PDD","coupon_total_quantity":0,"desc_pct":0,"merchant_type":1,"goods_name":"新款LED防水电子表 卡通公仔创意学生文具手表可爱儿童发光手环表","goods_eval_count":0,"goods_id":169718918621,"opt_name":"鞋包","goods_thumbnail_url":"https://t00img.yangkeduo.com/goods/images/2020-09-16/81d81fcb66b736c8cc77d2692525c4de.jpeg","goods_image_url":"https://img.pddpic.com/mms-material-img/2020-08-29/9e0faada-9de9-448e-8870-964c219f0806.jpeg","min_normal_price":780,"has_coupon":true,"create_at":0,"min_group_price":349,"mall_cps":1,"coupon_start_time":0,"coupon_discount":0,"coupon_end_time":0,"goods_gallery_urls":null,"platform":null,"coupon_price":0,"awardAmount":87,"plusAmount":139},{"avg_desc":0,"category_name":null,"coupon_remain_quantity":38000,"avg_serv":0,"avg_lgst":0,"serv_pct":0,"promotion_rate":100,"promotion_amount":0,"sold_quantity":999,"sales_tip":"1279","coupon_min_order_amount":200,"lgst_pct":0,"category_id":0,"mall_id":0,"goods_eval_score":0,"mall_name":"淘韵美服装官方旗舰店","mall_type":"PDD","coupon_total_quantity":50000,"desc_pct":0,"merchant_type":3,"goods_name":"加绒加厚仿羊羔毛宽松外套女冬短款2020新款潮小香风开叉一体上衣","goods_eval_count":0,"goods_id":81105153052,"opt_name":"女装","goods_thumbnail_url":"https://t00img.yangkeduo.com/goods/images/2019-12-27/3d3e7dec73271c73b25aa4774c3598e9.jpeg","goods_image_url":"https://t00img.yangkeduo.com/goods/images/2019-12-27/229ef142-4117-4e42-9b44-f970826ccc1e.jpg","min_normal_price":2089,"has_coupon":true,"create_at":0,"min_group_price":1986,"mall_cps":1,"coupon_start_time":1596988800,"coupon_discount":200,"coupon_end_time":1604246399,"goods_gallery_urls":null,"platform":null,"coupon_price":0,"awardAmount":89,"plusAmount":142},{"avg_desc":0,"category_name":null,"coupon_remain_quantity":46000,"avg_serv":0,"avg_lgst":0,"serv_pct":0,"promotion_rate":300,"promotion_amount":0,"sold_quantity":999,"sales_tip":"4625","coupon_min_order_amount":3900,"lgst_pct":0,"category_id":0,"mall_id":0,"goods_eval_score":0,"mall_name":"小丢3C数码","mall_type":"PDD","coupon_total_quantity":50000,"desc_pct":0,"merchant_type":1,"goods_name":"20000毫安快充大容量充电宝苹果安卓全部手机通用移动电源","goods_eval_count":0,"goods_id":166661406545,"opt_name":"手机","goods_thumbnail_url":"https://t00img.yangkeduo.com/goods/images/2020-08-17/361c30b7cbebb8f4637e895b009df1d7.jpeg","goods_image_url":"https://img.pddpic.com/mms-material-img/2020-08-17/11dd719f-1710-44bf-aa97-cca2d9ba8894.jpeg.a.jpeg","min_normal_price":5880,"has_coupon":true,"create_at":0,"min_group_price":5580,"mall_cps":1,"coupon_start_time":1602777600,"coupon_discount":3900,"coupon_end_time":1603641599,"goods_gallery_urls":null,"platform":null,"coupon_price":0,"awardAmount":252,"plusAmount":403}]
             * total_count : 10
             */

            private int total_count;
            private List<GoodsListBean> goods_list;

            public int getTotal_count() {
                return total_count;
            }

            public void setTotal_count(int total_count) {
                this.total_count = total_count;
            }

            public List<GoodsListBean> getGoods_list() {
                return goods_list;
            }

            public void setGoods_list(List<GoodsListBean> goods_list) {
                this.goods_list = goods_list;
            }

            public static class GoodsListBean {
                /**
                 * avg_desc : 0
                 * category_name : null
                 * coupon_remain_quantity : 2700
                 * avg_serv : 0
                 * avg_lgst : 0
                 * serv_pct : 0.0
                 * promotion_rate : 200
                 * promotion_amount : 0
                 * sold_quantity : 999
                 * sales_tip : 195
                 * coupon_min_order_amount : 2000
                 * lgst_pct : 0.0
                 * category_id : 0
                 * mall_id : 0
                 * goods_eval_score : 0
                 * mall_name : 乐途精品店
                 * mall_type : PDD
                 * coupon_total_quantity : 5000
                 * desc_pct : 0.0
                 * merchant_type : 6
                 * goods_name : 【买一送一/2双装】老北京布鞋男单鞋防滑耐磨休闲工作鞋劳保鞋
                 * goods_eval_count : 0
                 * goods_id : 98437724815
                 * opt_name : 鞋包
                 * goods_thumbnail_url : https://t00img.yangkeduo.com/goods/images/2020-03-25/d6028cc748fa7c47dcf593a6b6611949.jpeg
                 * goods_image_url : https://t00img.yangkeduo.com/openapi/images/2020-03-25/b895aa6425a51dbd3d5391ff52697eb4.jpeg
                 * min_normal_price : 7120
                 * has_coupon : true
                 * create_at : 0
                 * min_group_price : 4080
                 * mall_cps : 1
                 * coupon_start_time : 1599494400
                 * coupon_discount : 2000
                 * coupon_end_time : 1606924799
                 * goods_gallery_urls : null
                 * platform : null
                 * coupon_price : 0
                 * awardAmount : 208
                 * plusAmount : 332
                 */

                private int avg_desc;
                private Object category_name;
                private int coupon_remain_quantity;
                private int avg_serv;
                private int avg_lgst;
                private double serv_pct;
                private int promotion_rate;
                private int promotion_amount;
                private int sold_quantity;
                private String sales_tip;
                private int coupon_min_order_amount;
                private double lgst_pct;
                private int category_id;
                private int mall_id;
                private int goods_eval_score;
                private String mall_name;
                private String mall_type;
                private int coupon_total_quantity;
                private double desc_pct;
                private int merchant_type;
                private String goods_name;
                private int goods_eval_count;
                private long goods_id;
                private String opt_name;
                private String goods_thumbnail_url;
                private String goods_image_url;
                private int min_normal_price;
                private boolean has_coupon;
                private int create_at;
                private int min_group_price;
                private int mall_cps;
                private int coupon_start_time;
                private int coupon_discount;
                private int coupon_end_time;
                private Object goods_gallery_urls;
                private Object platform;
                private int coupon_price;
                private int awardAmount;
                private int plusAmount;

                public int getAvg_desc() {
                    return avg_desc;
                }

                public void setAvg_desc(int avg_desc) {
                    this.avg_desc = avg_desc;
                }

                public Object getCategory_name() {
                    return category_name;
                }

                public void setCategory_name(Object category_name) {
                    this.category_name = category_name;
                }

                public int getCoupon_remain_quantity() {
                    return coupon_remain_quantity;
                }

                public void setCoupon_remain_quantity(int coupon_remain_quantity) {
                    this.coupon_remain_quantity = coupon_remain_quantity;
                }

                public int getAvg_serv() {
                    return avg_serv;
                }

                public void setAvg_serv(int avg_serv) {
                    this.avg_serv = avg_serv;
                }

                public int getAvg_lgst() {
                    return avg_lgst;
                }

                public void setAvg_lgst(int avg_lgst) {
                    this.avg_lgst = avg_lgst;
                }

                public double getServ_pct() {
                    return serv_pct;
                }

                public void setServ_pct(double serv_pct) {
                    this.serv_pct = serv_pct;
                }

                public int getPromotion_rate() {
                    return promotion_rate;
                }

                public void setPromotion_rate(int promotion_rate) {
                    this.promotion_rate = promotion_rate;
                }

                public int getPromotion_amount() {
                    return promotion_amount;
                }

                public void setPromotion_amount(int promotion_amount) {
                    this.promotion_amount = promotion_amount;
                }

                public int getSold_quantity() {
                    return sold_quantity;
                }

                public void setSold_quantity(int sold_quantity) {
                    this.sold_quantity = sold_quantity;
                }

                public String getSales_tip() {
                    return sales_tip;
                }

                public void setSales_tip(String sales_tip) {
                    this.sales_tip = sales_tip;
                }

                public int getCoupon_min_order_amount() {
                    return coupon_min_order_amount;
                }

                public void setCoupon_min_order_amount(int coupon_min_order_amount) {
                    this.coupon_min_order_amount = coupon_min_order_amount;
                }

                public double getLgst_pct() {
                    return lgst_pct;
                }

                public void setLgst_pct(double lgst_pct) {
                    this.lgst_pct = lgst_pct;
                }

                public int getCategory_id() {
                    return category_id;
                }

                public void setCategory_id(int category_id) {
                    this.category_id = category_id;
                }

                public int getMall_id() {
                    return mall_id;
                }

                public void setMall_id(int mall_id) {
                    this.mall_id = mall_id;
                }

                public int getGoods_eval_score() {
                    return goods_eval_score;
                }

                public void setGoods_eval_score(int goods_eval_score) {
                    this.goods_eval_score = goods_eval_score;
                }

                public String getMall_name() {
                    return mall_name;
                }

                public void setMall_name(String mall_name) {
                    this.mall_name = mall_name;
                }

                public String getMall_type() {
                    return mall_type;
                }

                public void setMall_type(String mall_type) {
                    this.mall_type = mall_type;
                }

                public int getCoupon_total_quantity() {
                    return coupon_total_quantity;
                }

                public void setCoupon_total_quantity(int coupon_total_quantity) {
                    this.coupon_total_quantity = coupon_total_quantity;
                }

                public double getDesc_pct() {
                    return desc_pct;
                }

                public void setDesc_pct(double desc_pct) {
                    this.desc_pct = desc_pct;
                }

                public int getMerchant_type() {
                    return merchant_type;
                }

                public void setMerchant_type(int merchant_type) {
                    this.merchant_type = merchant_type;
                }

                public String getGoods_name() {
                    return goods_name;
                }

                public void setGoods_name(String goods_name) {
                    this.goods_name = goods_name;
                }

                public int getGoods_eval_count() {
                    return goods_eval_count;
                }

                public void setGoods_eval_count(int goods_eval_count) {
                    this.goods_eval_count = goods_eval_count;
                }

                public long getGoods_id() {
                    return goods_id;
                }

                public void setGoods_id(long goods_id) {
                    this.goods_id = goods_id;
                }

                public String getOpt_name() {
                    return opt_name;
                }

                public void setOpt_name(String opt_name) {
                    this.opt_name = opt_name;
                }

                public String getGoods_thumbnail_url() {
                    return goods_thumbnail_url;
                }

                public void setGoods_thumbnail_url(String goods_thumbnail_url) {
                    this.goods_thumbnail_url = goods_thumbnail_url;
                }

                public String getGoods_image_url() {
                    return goods_image_url;
                }

                public void setGoods_image_url(String goods_image_url) {
                    this.goods_image_url = goods_image_url;
                }

                public int getMin_normal_price() {
                    return min_normal_price;
                }

                public void setMin_normal_price(int min_normal_price) {
                    this.min_normal_price = min_normal_price;
                }

                public boolean isHas_coupon() {
                    return has_coupon;
                }

                public void setHas_coupon(boolean has_coupon) {
                    this.has_coupon = has_coupon;
                }

                public int getCreate_at() {
                    return create_at;
                }

                public void setCreate_at(int create_at) {
                    this.create_at = create_at;
                }

                public int getMin_group_price() {
                    return min_group_price;
                }

                public void setMin_group_price(int min_group_price) {
                    this.min_group_price = min_group_price;
                }

                public int getMall_cps() {
                    return mall_cps;
                }

                public void setMall_cps(int mall_cps) {
                    this.mall_cps = mall_cps;
                }

                public int getCoupon_start_time() {
                    return coupon_start_time;
                }

                public void setCoupon_start_time(int coupon_start_time) {
                    this.coupon_start_time = coupon_start_time;
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

                public Object getGoods_gallery_urls() {
                    return goods_gallery_urls;
                }

                public void setGoods_gallery_urls(Object goods_gallery_urls) {
                    this.goods_gallery_urls = goods_gallery_urls;
                }

                public Object getPlatform() {
                    return platform;
                }

                public void setPlatform(Object platform) {
                    this.platform = platform;
                }

                public int getCoupon_price() {
                    return coupon_price;
                }

                public void setCoupon_price(int coupon_price) {
                    this.coupon_price = coupon_price;
                }

                public int getAwardAmount() {
                    return awardAmount;
                }

                public void setAwardAmount(int awardAmount) {
                    this.awardAmount = awardAmount;
                }

                public int getPlusAmount() {
                    return plusAmount;
                }

                public void setPlusAmount(int plusAmount) {
                    this.plusAmount = plusAmount;
                }

                @Override
                public String toString() {
                    return "GoodsListBean{" +
                            "avg_desc=" + avg_desc +
                            ", category_name=" + category_name +
                            ", coupon_remain_quantity=" + coupon_remain_quantity +
                            ", avg_serv=" + avg_serv +
                            ", avg_lgst=" + avg_lgst +
                            ", serv_pct=" + serv_pct +
                            ", promotion_rate=" + promotion_rate +
                            ", promotion_amount=" + promotion_amount +
                            ", sold_quantity=" + sold_quantity +
                            ", sales_tip='" + sales_tip + '\'' +
                            ", coupon_min_order_amount=" + coupon_min_order_amount +
                            ", lgst_pct=" + lgst_pct +
                            ", category_id=" + category_id +
                            ", mall_id=" + mall_id +
                            ", goods_eval_score=" + goods_eval_score +
                            ", mall_name='" + mall_name + '\'' +
                            ", mall_type='" + mall_type + '\'' +
                            ", coupon_total_quantity=" + coupon_total_quantity +
                            ", desc_pct=" + desc_pct +
                            ", merchant_type=" + merchant_type +
                            ", goods_name='" + goods_name + '\'' +
                            ", goods_eval_count=" + goods_eval_count +
                            ", goods_id=" + goods_id +
                            ", opt_name='" + opt_name + '\'' +
                            ", goods_thumbnail_url='" + goods_thumbnail_url + '\'' +
                            ", goods_image_url='" + goods_image_url + '\'' +
                            ", min_normal_price=" + min_normal_price +
                            ", has_coupon=" + has_coupon +
                            ", create_at=" + create_at +
                            ", min_group_price=" + min_group_price +
                            ", mall_cps=" + mall_cps +
                            ", coupon_start_time=" + coupon_start_time +
                            ", coupon_discount=" + coupon_discount +
                            ", coupon_end_time=" + coupon_end_time +
                            ", goods_gallery_urls=" + goods_gallery_urls +
                            ", platform=" + platform +
                            ", coupon_price=" + coupon_price +
                            ", awardAmount=" + awardAmount +
                            ", plusAmount=" + plusAmount +
                            '}';
                }
            }
        }
    }
}
