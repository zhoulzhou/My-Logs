package com.example.mylogs.callfutrue;

public class CallableFutureRD {
    /**
     * Future<V>获取异步计算结果的
     *
     * 取消任务
     * boolean cancel(Boolean mayInterrupterIfRunning)
     *
     *如果任务完成前被取消，则返回True
     * boolean isCancelled()
     *
     * 如果任务执行结束，无论正常结束，或被中途取消，或异常结束，都返回true
     *boolean isDone()
     *
     *获取异步执行的结果，如果没有结果可用，此方法会被阻塞直到异步计算完成。
     * V get() throws InterruptedException ExecutedException
     *
     * 有时间限制，如果阻塞时间超过timeout的时间，返回null
     *V get(long timeout，TimeUnit unit) throws InterruptedException ExecutedException
     *
     *
     *
     * public interface Callable<V>{
     *     V call() throws Exception
     * }
     *
     * **/
}
