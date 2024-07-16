package com.xxl.job.core.enums;

/**
 * Created by xuxueli on 17/5/10.
 */
public class RegistryConfig {

    public static final int BEAT_TIMEOUT = 30;
    public static final int DEAD_TIMEOUT = BEAT_TIMEOUT * 3; // 3倍心跳时间，如果没有收到心跳，就判断为下线

    public enum RegistType{ EXECUTOR, ADMIN }

}
