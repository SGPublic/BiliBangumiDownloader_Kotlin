package io.github.sgpublic.bilidownload.core.forest.data;

import com.google.gson.JsonArray;

import java.util.List;

import io.github.sgpublic.bilidownload.base.forest.DataResp;
import lombok.Data;

/**
 * @author Madray Haven
 * @date 2022/10/21 11:06
 */
public class SeasonInfoResp extends DataResp<SeasonInfoResp.SeasonInfoData> {
    @Data
    public static class SeasonInfoData {
        /** 演员 */
        private Actor actor;
        /** 地区 */
        private List<Area> areas;
        /** 简介 */
        private String evaluate;
        /** APP 内查看链接 */
        private String link;
        /** 模式，作用暂时未知 */
        private int mode;
        /** 模块，包含季、剧集等信息 */
        private JsonArray modules;
        /** 最新一集信息 */
        private NewEp newEp;
        /** 原名 */
        private String originName;
        /** 封面图片 */
        private String refineCover;
        /** SID */
        private int seasonId;
        /** 标题 */
        private String seasonTitle;
        /** 方形封面 */
        private String squareCover;
        /** 制作信息 */
        private Staff staff;
        /** 热度信息 */
        private Stat stat;
        /** 状态，作用暂时未知 */
        private int status;
        /** 风格 */
        private List<Style> styles;
        /** 总集数 */
        private int total;
        /**
         * <p>类型
         * <br>1. 番剧<br>2. 电影<br>3. 纪录片
         * <br>4. 国创<br>5. 电视剧<br>6. 漫画
         * <br>7. 综艺
         */
        private int type;
        /** 类型名称 */
        private String typeName;
        /** 用户状态 */
        private UserStatus userStatus;

        @Data
        public static class UserStatus {
            /** 播放进度 */
            private Progress progress;

            @Data
            public static class Progress {
                /** 上次播放 ep_id */
                private int lastEpId;
                /** 上次播放集数 */
                private int lastEpIndex;
                /** 上次播放进度 */
                private long lastTime;
            }
        }

        @Data
        public static class Style {
            /** 风格名称 */
            private String name;
            /** APP 内查看链接 */
            private String url;
        }

        @Data
        public static class Stat {
            /** 追番数展示信息 */
            private String followers;
            /** 播放量展示信息 */
            private String play;
        }

        @Data
        public static class Staff {
            /** 演员信息 */
            private String info;
            /** API 控制的标题 */
            private String title;
        }

        @Data
        public static class Rights {
            /** 是否地区限制 */
            private int areaLimit;
        }

        @Data
        public static class Publish {
            /** 是否完结 */
            private int isFinish;
            /** 是否开播 */
            private int isStarted;
            /** 发布时间显示 */
            private String releaseDateShow;
            /** 当前状态 */
            private String timeLengthShow;
        }

        @Data
        public static class NewEp {
            /** 最近更新状态 */
            private String desc;
        }

        @Data
        public static class Actor {
            /** 演员信息 */
            private String info;
            /** API 控制的标题 */
            private String title;
        }

        @Data
        public static class Area {
            /** 地区名称 */
            private String name;
        }
    }
}