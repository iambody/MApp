package com.m.app.ui.module.test;

import com.m.app.ui.module.BBase;

import java.util.List;

/**
 * Created by datutu on 2017/1/24.
 */

public class tsns extends BBase {

    /**
     * code : 200
     * msg : success
     * data : {"count":24,"startTime":"2017012415","endTime":"2017012514","reqTime":"20170124150005","aqi_level":0,"aqi":25,"aqi_detail":"优","list":[{"aqi":25,"aqi_level":0,"hour":"现在"},{"aqi":26,"aqi_level":0,"hour":"16时"},{"aqi":28,"aqi_level":0,"hour":"17时"},{"aqi":28,"aqi_level":0,"hour":"18时"},{"aqi":29,"aqi_level":0,"hour":"19时"},{"aqi":28,"aqi_level":0,"hour":"20时"},{"aqi":28,"aqi_level":0,"hour":"21时"},{"aqi":28,"aqi_level":0,"hour":"22时"},{"aqi":27,"aqi_level":0,"hour":"23时"},{"aqi":27,"aqi_level":0,"hour":"00时"},{"aqi":25,"aqi_level":0,"hour":"01时"},{"aqi":22,"aqi_level":0,"hour":"02时"},{"aqi":20,"aqi_level":0,"hour":"03时"},{"aqi":19,"aqi_level":0,"hour":"04时"},{"aqi":18,"aqi_level":0,"hour":"05时"},{"aqi":19,"aqi_level":0,"hour":"06时"},{"aqi":20,"aqi_level":0,"hour":"07时"},{"aqi":22,"aqi_level":0,"hour":"08时"},{"aqi":22,"aqi_level":0,"hour":"09时"},{"aqi":20,"aqi_level":0,"hour":"10时"},{"aqi":16,"aqi_level":0,"hour":"11时"},{"aqi":13,"aqi_level":0,"hour":"12时"},{"aqi":11,"aqi_level":0,"hour":"13时"},{"aqi":9,"aqi_level":0,"hour":"14时"}],"seven_list":[{"date":"01月25日 星期三","list":[{"aqi_level":0,"hour":"00时","aqi":27},{"aqi_level":0,"hour":"03时","aqi":20},{"aqi_level":0,"hour":"06时","aqi":19},{"aqi_level":0,"hour":"09时","aqi":22},{"aqi_level":0,"hour":"12时","aqi":13},{"aqi_level":0,"hour":"15时","aqi":10},{"aqi_level":0,"hour":"18时","aqi":17},{"aqi_level":0,"hour":"21时","aqi":16}]},{"date":"01月26日 星期四","list":[{"aqi_level":0,"hour":"00时","aqi":15},{"aqi_level":0,"hour":"03时","aqi":36},{"aqi_level":0,"hour":"06时","aqi":40},{"aqi_level":0,"hour":"09时","aqi":43},{"aqi_level":0,"hour":"12时","aqi":39},{"aqi_level":0,"hour":"15时","aqi":33},{"aqi_level":0,"hour":"18时","aqi":39},{"aqi_level":0,"hour":"21时","aqi":44}]},{"date":"01月27日 星期五","list":[{"aqi_level":0,"hour":"00时","aqi":41},{"aqi_level":0,"hour":"03时","aqi":45},{"aqi_level":0,"hour":"06时","aqi":44},{"aqi_level":1,"hour":"09时","aqi":55},{"aqi_level":0,"hour":"12时","aqi":42},{"aqi_level":0,"hour":"15时","aqi":35},{"aqi_level":0,"hour":"18时","aqi":34},{"aqi_level":0,"hour":"21时","aqi":31}]},{"date":"01月28日 星期六","list":[{"aqi_level":0,"hour":"00时","aqi":25},{"aqi_level":0,"hour":"03时","aqi":25},{"aqi_level":0,"hour":"06时","aqi":25},{"aqi_level":0,"hour":"09时","aqi":31},{"aqi_level":0,"hour":"12时","aqi":27},{"aqi_level":0,"hour":"15时","aqi":27},{"aqi_level":0,"hour":"18时","aqi":31},{"aqi_level":0,"hour":"21时","aqi":32}]},{"date":"01月29日 星期日","list":[{"aqi_level":0,"hour":"00时","aqi":29},{"aqi_level":0,"hour":"03时","aqi":35},{"aqi_level":0,"hour":"06时","aqi":42},{"aqi_level":0,"hour":"09时","aqi":50},{"aqi_level":1,"hour":"12时","aqi":58},{"aqi_level":1,"hour":"15时","aqi":64},{"aqi_level":1,"hour":"18时","aqi":67},{"aqi_level":1,"hour":"21时","aqi":74}]},{"date":"01月30日 星期一","list":[{"aqi_level":1,"hour":"00时","aqi":65},{"aqi_level":1,"hour":"03时","aqi":63},{"aqi_level":1,"hour":"06时","aqi":60},{"aqi_level":1,"hour":"09时","aqi":61},{"aqi_level":1,"hour":"12时","aqi":58},{"aqi_level":1,"hour":"15时","aqi":53},{"aqi_level":1,"hour":"18时","aqi":55},{"aqi_level":1,"hour":"21时","aqi":58}]},{"date":"01月31日 星期二","list":[{"aqi_level":1,"hour":"00时","aqi":55},{"aqi_level":1,"hour":"03时","aqi":54},{"aqi_level":1,"hour":"06时","aqi":53},{"aqi_level":1,"hour":"09时","aqi":64},{"aqi_level":1,"hour":"12时","aqi":64},{"aqi_level":1,"hour":"15时","aqi":64},{"aqi_level":1,"hour":"18时","aqi":66}]}]}
     */

    private int code;
    private String msg;
    private DataBean data;

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public DataBean getData() {
        return data;
    }

    public void setData(DataBean data) {
        this.data = data;
    }

    public static class DataBean {
        /**
         * count : 24
         * startTime : 2017012415
         * endTime : 2017012514
         * aqi_level : 0
         * reqTime : 20170124150005
         * aqi : 25
         * aqi_detail : 优
         * list : [{"aqi":25,"aqi_level":0,"hour":"现在"},{"aqi":26,"aqi_level":0,"hour":"16时"},{"aqi":28,"aqi_level":0,"hour":"17时"},{"aqi":28,"aqi_level":0,"hour":"18时"},{"aqi":29,"aqi_level":0,"hour":"19时"},{"aqi":28,"aqi_level":0,"hour":"20时"},{"aqi":28,"aqi_level":0,"hour":"21时"},{"aqi":28,"aqi_level":0,"hour":"22时"},{"aqi":27,"aqi_level":0,"hour":"23时"},{"aqi":27,"aqi_level":0,"hour":"00时"},{"aqi":25,"aqi_level":0,"hour":"01时"},{"aqi":22,"aqi_level":0,"hour":"02时"},{"aqi":20,"aqi_level":0,"hour":"03时"},{"aqi":19,"aqi_level":0,"hour":"04时"},{"aqi":18,"aqi_level":0,"hour":"05时"},{"aqi":19,"aqi_level":0,"hour":"06时"},{"aqi":20,"aqi_level":0,"hour":"07时"},{"aqi":22,"aqi_level":0,"hour":"08时"},{"aqi":22,"aqi_level":0,"hour":"09时"},{"aqi":20,"aqi_level":0,"hour":"10时"},{"aqi":16,"aqi_level":0,"hour":"11时"},{"aqi":13,"aqi_level":0,"hour":"12时"},{"aqi":11,"aqi_level":0,"hour":"13时"},{"aqi":9,"aqi_level":0,"hour":"14时"}]
         * seven_list : [{"date":"01月25日 星期三","list":[{"aqi_level":0,"hour":"00时","aqi":27},{"aqi_level":0,"hour":"03时","aqi":20},{"aqi_level":0,"hour":"06时","aqi":19},{"aqi_level":0,"hour":"09时","aqi":22},{"aqi_level":0,"hour":"12时","aqi":13},{"aqi_level":0,"hour":"15时","aqi":10},{"aqi_level":0,"hour":"18时","aqi":17},{"aqi_level":0,"hour":"21时","aqi":16}]},{"date":"01月26日 星期四","list":[{"aqi_level":0,"hour":"00时","aqi":15},{"aqi_level":0,"hour":"03时","aqi":36},{"aqi_level":0,"hour":"06时","aqi":40},{"aqi_level":0,"hour":"09时","aqi":43},{"aqi_level":0,"hour":"12时","aqi":39},{"aqi_level":0,"hour":"15时","aqi":33},{"aqi_level":0,"hour":"18时","aqi":39},{"aqi_level":0,"hour":"21时","aqi":44}]},{"date":"01月27日 星期五","list":[{"aqi_level":0,"hour":"00时","aqi":41},{"aqi_level":0,"hour":"03时","aqi":45},{"aqi_level":0,"hour":"06时","aqi":44},{"aqi_level":1,"hour":"09时","aqi":55},{"aqi_level":0,"hour":"12时","aqi":42},{"aqi_level":0,"hour":"15时","aqi":35},{"aqi_level":0,"hour":"18时","aqi":34},{"aqi_level":0,"hour":"21时","aqi":31}]},{"date":"01月28日 星期六","list":[{"aqi_level":0,"hour":"00时","aqi":25},{"aqi_level":0,"hour":"03时","aqi":25},{"aqi_level":0,"hour":"06时","aqi":25},{"aqi_level":0,"hour":"09时","aqi":31},{"aqi_level":0,"hour":"12时","aqi":27},{"aqi_level":0,"hour":"15时","aqi":27},{"aqi_level":0,"hour":"18时","aqi":31},{"aqi_level":0,"hour":"21时","aqi":32}]},{"date":"01月29日 星期日","list":[{"aqi_level":0,"hour":"00时","aqi":29},{"aqi_level":0,"hour":"03时","aqi":35},{"aqi_level":0,"hour":"06时","aqi":42},{"aqi_level":0,"hour":"09时","aqi":50},{"aqi_level":1,"hour":"12时","aqi":58},{"aqi_level":1,"hour":"15时","aqi":64},{"aqi_level":1,"hour":"18时","aqi":67},{"aqi_level":1,"hour":"21时","aqi":74}]},{"date":"01月30日 星期一","list":[{"aqi_level":1,"hour":"00时","aqi":65},{"aqi_level":1,"hour":"03时","aqi":63},{"aqi_level":1,"hour":"06时","aqi":60},{"aqi_level":1,"hour":"09时","aqi":61},{"aqi_level":1,"hour":"12时","aqi":58},{"aqi_level":1,"hour":"15时","aqi":53},{"aqi_level":1,"hour":"18时","aqi":55},{"aqi_level":1,"hour":"21时","aqi":58}]},{"date":"01月31日 星期二","list":[{"aqi_level":1,"hour":"00时","aqi":55},{"aqi_level":1,"hour":"03时","aqi":54},{"aqi_level":1,"hour":"06时","aqi":53},{"aqi_level":1,"hour":"09时","aqi":64},{"aqi_level":1,"hour":"12时","aqi":64},{"aqi_level":1,"hour":"15时","aqi":64},{"aqi_level":1,"hour":"18时","aqi":66}]}]
         */

        private int count;
        private String startTime;
        private String endTime;
        private String reqTime;
        private int aqi_level;
        private int aqi;
        private String aqi_detail;
        private List<ListBean> list;
        private List<SevenListBean> seven_list;

        public int getCount() {
            return count;
        }

        public void setCount(int count) {
            this.count = count;
        }

        public String getStartTime() {
            return startTime;
        }

        public void setStartTime(String startTime) {
            this.startTime = startTime;
        }

        public String getEndTime() {
            return endTime;
        }

        public void setEndTime(String endTime) {
            this.endTime = endTime;
        }

        public String getReqTime() {
            return reqTime;
        }

        public void setReqTime(String reqTime) {
            this.reqTime = reqTime;
        }

        public int getAqi_level() {
            return aqi_level;
        }

        public void setAqi_level(int aqi_level) {
            this.aqi_level = aqi_level;
        }

        public int getAqi() {
            return aqi;
        }

        public void setAqi(int aqi) {
            this.aqi = aqi;
        }

        public String getAqi_detail() {
            return aqi_detail;
        }

        public void setAqi_detail(String aqi_detail) {
            this.aqi_detail = aqi_detail;
        }

        public List<ListBean> getList() {
            return list;
        }

        public void setList(List<ListBean> list) {
            this.list = list;
        }

        public List<SevenListBean> getSeven_list() {
            return seven_list;
        }

        public void setSeven_list(List<SevenListBean> seven_list) {
            this.seven_list = seven_list;
        }

        public static class ListBean {
            /**
             * aqi : 25
             * aqi_level : 0
             * hour : 现在
             */

            private int aqi;
            private int aqi_level;
            private String hour;

            public int getAqi() {
                return aqi;
            }

            public void setAqi(int aqi) {
                this.aqi = aqi;
            }

            public int getAqi_level() {
                return aqi_level;
            }

            public void setAqi_level(int aqi_level) {
                this.aqi_level = aqi_level;
            }

            public String getHour() {
                return hour;
            }

            public void setHour(String hour) {
                this.hour = hour;
            }
        }

        public static class SevenListBean {
            /**
             * date : 01月25日 星期三
             * list : [{"aqi_level":0,"hour":"00时","aqi":27},{"aqi_level":0,"hour":"03时","aqi":20},{"aqi_level":0,"hour":"06时","aqi":19},{"aqi_level":0,"hour":"09时","aqi":22},{"aqi_level":0,"hour":"12时","aqi":13},{"aqi_level":0,"hour":"15时","aqi":10},{"aqi_level":0,"hour":"18时","aqi":17},{"aqi_level":0,"hour":"21时","aqi":16}]
             */

            private String date;
            private List<ListBeanX> list;

            public String getDate() {
                return date;
            }

            public void setDate(String date) {
                this.date = date;
            }

            public List<ListBeanX> getList() {
                return list;
            }

            public void setList(List<ListBeanX> list) {
                this.list = list;
            }

            public static class ListBeanX {
                /**
                 * aqi_level : 0
                 * hour : 00时
                 * aqi : 27
                 */

                private int aqi_level;
                private String hour;
                private int aqi;

                public int getAqi_level() {
                    return aqi_level;
                }

                public void setAqi_level(int aqi_level) {
                    this.aqi_level = aqi_level;
                }

                public String getHour() {
                    return hour;
                }

                public void setHour(String hour) {
                    this.hour = hour;
                }

                public int getAqi() {
                    return aqi;
                }

                public void setAqi(int aqi) {
                    this.aqi = aqi;
                }
            }
        }
    }
}
