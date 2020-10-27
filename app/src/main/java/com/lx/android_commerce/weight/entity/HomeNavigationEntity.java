package com.lx.android_commerce.weight.entity;

import java.util.List;

public
/**
 *@author : 阿森
 *@date : 2020-10-16 14:52
 *@params : 
 *@description:
 */
class HomeNavigationEntity {

    /**
     * message : 成功
     * code : 0000
     * success : true
     * entity : [[{"title":"每日免单","imagesUrl":"/upload/mavendemo/bannerImages/20190705/1562340020058104182.gif","type":"FREE","opt_id":200,"linkAddress":null},{"title":"今日爆款","imagesUrl":"/upload/mavendemo/bannerImages/20190705/1562339933274327547.png","type":"","opt_id":210,"linkAddress":null},{"title":"Plus会员","imagesUrl":"/upload/mavendemo/bannerImages/20190705/1562339919922447628.png","type":"PLUS","opt_id":0,"linkAddress":null},{"title":"优惠频道","imagesUrl":"/upload/mavendemo/bannerImages/20190802/1564713003367304194.gif","type":"QUAN","opt_id":0,"linkAddress":"http://www.58cangshu.com/app/tk/optional/taobao/category?cat=quan"},{"title":"邀新好礼","imagesUrl":"/upload/mavendemo/bannerImages/20190705/1562340037345789782.gif","type":"HAOLI","opt_id":0,"linkAddress":null}],[{"title":"潮流女装","imagesUrl":"/upload/mavendemo/bannerImages/20190705/1562339897210335844.png","type":"","opt_id":1,"linkAddress":null},{"title":"美妆个护","imagesUrl":"/upload/mavendemo/bannerImages/20190705/1562339878776667840.png","type":"","opt_id":4,"linkAddress":null},{"title":"美食生鲜","imagesUrl":"/upload/mavendemo/bannerImages/20190705/1562339860374653455.png","type":"","opt_id":11,"linkAddress":null},{"title":"数码家电","imagesUrl":"/upload/mavendemo/bannerImages/20190705/1562339844452150035.jpg","type":"","opt_id":13,"linkAddress":null},{"title":"精选男装","imagesUrl":"/upload/mavendemo/bannerImages/20190705/1562339825154158698.jpg","type":"","opt_id":2,"linkAddress":null}]]
     */

    private String message;
    private String code;
    private boolean success;
    private List<List<EntityBean>> entity;

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

    public List<List<EntityBean>> getEntity() {
        return entity;
    }

    public void setEntity(List<List<EntityBean>> entity) {
        this.entity = entity;
    }

    @Override
    public String toString() {
        return "HomeNavigationEntity{" +
                "message='" + message + '\'' +
                ", code='" + code + '\'' +
                ", success=" + success +
                ", entity=" + entity +
                '}';
    }

    public static class EntityBean {
        /**
         * title : 每日免单
         * imagesUrl : /upload/mavendemo/bannerImages/20190705/1562340020058104182.gif
         * type : FREE
         * opt_id : 200
         * linkAddress : null
         */

        private String title;
        private String imagesUrl;
        private String type;
        private int opt_id;
        private Object linkAddress;

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public String getImagesUrl() {
            return imagesUrl;
        }

        public void setImagesUrl(String imagesUrl) {
            this.imagesUrl = imagesUrl;
        }

        public String getType() {
            return type;
        }

        public void setType(String type) {
            this.type = type;
        }

        public int getOpt_id() {
            return opt_id;
        }

        public void setOpt_id(int opt_id) {
            this.opt_id = opt_id;
        }

        public Object getLinkAddress() {
            return linkAddress;
        }

        public void setLinkAddress(Object linkAddress) {
            this.linkAddress = linkAddress;
        }

        @Override
        public String toString() {
            return "EntityBean{" +
                    "title='" + title + '\'' +
                    ", imagesUrl='" + imagesUrl + '\'' +
                    ", type='" + type + '\'' +
                    ", opt_id=" + opt_id +
                    ", linkAddress=" + linkAddress +
                    '}';
        }
    }

}
