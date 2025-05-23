/*    */ package com.intellij.ml.llm.matterhorn.helpers;
/*    */ 
/*    */ import kotlin.jvm.functions.Function0;
/*    */ 
/*    */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000*\n\002\030\002\n\002\020\000\n\000\n\002\020\013\n\002\b\003\n\002\020\t\n\002\b\005\n\002\020\002\n\002\b\n\n\002\030\002\n\002\b\002\030\0002\0020\001B\021\022\b\b\002\020\002\032\0020\003¢\006\004\b\004\020\005J\006\020\f\032\0020\rJ\006\020\016\032\0020\rJ\006\020\017\032\0020\rJ\006\020\020\032\0020\007J\006\020\021\032\0020\007J\b\020\022\032\0020\007H\002J\016\020\023\032\0020\r2\006\020\024\032\0020\007J2\020\025\032\002H\026\"\004\b\000\020\0262\f\020\027\032\b\022\004\022\002H\0260\030H\bø\001\000\002\n\n\b\b\001\022\002\020\001 \001¢\006\002\020\031R\016\020\006\032\0020\007X\016¢\006\002\n\000R\016\020\b\032\0020\007X\016¢\006\002\n\000R\032\020\t\032\0020\003X\016¢\006\016\n\000\032\004\b\t\020\n\"\004\b\013\020\005\002\007\n\005\b20\001¨\006\032"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/helpers/Stopwatch;", "", "autostart", "", "<init>", "(Z)V", "startTime", "", "accumulatedTime", "isRunning", "()Z", "setRunning", "start", "", "stop", "reset", "elapsedTimeMillis", "elapsedTimeSeconds", "elapsedTimeNanos", "registerExternalTime", "additionalTime", "runWithPause", "T", "block", "Lkotlin/Function0;", "(Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;", "core"})
/*    */ public final class Stopwatch {
/*    */   private long startTime;
/*    */   
/*  9 */   public Stopwatch(boolean autostart) { this.startTime = autostart ? System.nanoTime() : 0L;
/*    */ 
/*    */     
/* 12 */     this.isRunning = autostart; } private long accumulatedTime; private boolean isRunning; public final boolean isRunning() { return this.isRunning; } public final void setRunning(boolean <set-?>) { this.isRunning = <set-?>; }
/*    */   
/*    */   public final void start() {
/* 15 */     if (!this.isRunning) {
/* 16 */       this.startTime = System.nanoTime();
/* 17 */       this.isRunning = true;
/*    */     } 
/*    */   }
/*    */   
/*    */   public final void stop() {
/* 22 */     if (this.isRunning) {
/* 23 */       this.accumulatedTime += System.nanoTime() - this.startTime;
/* 24 */       this.isRunning = false;
/*    */     } 
/*    */   }
/*    */   
/*    */   public final void reset() {
/* 29 */     this.startTime = 0L;
/* 30 */     this.accumulatedTime = 0L;
/* 31 */     this.isRunning = false;
/*    */   }
/*    */   public final long elapsedTimeMillis() {
/* 34 */     return TimeUnit.NANOSECONDS.toMillis(elapsedTimeNanos());
/*    */   } public final long elapsedTimeSeconds() {
/* 36 */     return elapsedTimeNanos() / 1000000000L;
/*    */   }
/*    */   private final long elapsedTimeNanos() {
/* 39 */     return this.isRunning ? (
/* 40 */       this.accumulatedTime + System.nanoTime() - this.startTime) : 
/*    */       
/* 42 */       this.accumulatedTime;
/*    */   }
/*    */   
/*    */   public final void registerExternalTime(long additionalTime) {
/* 46 */     this.accumulatedTime += additionalTime;
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public final <T> T runWithPause(@NotNull Function0 block) {
/* 54 */     Intrinsics.checkNotNullParameter(block, "block"); int $i$f$runWithPause = 0; boolean wasRunning = isRunning();
/* 55 */     stop();
/*    */     
/* 57 */     Object result = block.invoke();
/* 58 */     if (wasRunning) start(); 
/* 59 */     return (T)result;
/*    */   }
/*    */   
/*    */   public Stopwatch() {
/*    */     this(false, 1, null);
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\helpers\Stopwatch.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */