package com.example.mylogs.Doc;

/**
 * Activity启动流程
 * https://www.jianshu.com/p/53d63374619d   参数说明
 *
 * https://juejin.cn/post/6844903959581163528
 *https://zhuanlan.zhihu.com/p/433901409
 *
 * Launcher进程请求AMS
 * AMS发送创建应用进程请求
 * Zygote进程接受请求并孵化应用进程
 * 应用进程启动ActivityThread
 * 应用进程绑定到AMS
 * AMS发送启动Activity的请求
 * ActivityThread的Handler处理启动Activity的请求
 *
 */
public class FrameWorkDoc {
}
