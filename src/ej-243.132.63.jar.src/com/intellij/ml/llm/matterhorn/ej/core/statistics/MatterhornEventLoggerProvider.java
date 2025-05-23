/*    */ package com.intellij.ml.llm.matterhorn.ej.core.statistics;
/*    */ import com.intellij.util.ApplicationKt;
/*    */ 
/*    */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000\024\n\002\030\002\n\002\030\002\n\002\b\003\n\002\020\013\n\002\b\002\030\0002\0020\001B\007¢\006\004\b\002\020\003J\b\020\004\032\0020\005H\026J\b\020\006\032\0020\005H\026¨\006\007"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/core/statistics/MatterhornEventLoggerProvider;", "Lcom/intellij/internal/statistic/eventLog/StatisticsEventLoggerProvider;", "<init>", "()V", "isRecordEnabled", "", "isSendEnabled", "ej-core"})
/*    */ public final class MatterhornEventLoggerProvider extends StatisticsEventLoggerProvider {
/*    */   public MatterhornEventLoggerProvider() {
/*  7 */     super(
/*  8 */         "MTHC", 
/*  9 */         1, 
/* 10 */         TimeUnit.MINUTES.toMillis(5L), 
/* 11 */         10240, 
/* 12 */         true, 
/* 13 */         false, false, 64, null);
/*    */   } public boolean isRecordEnabled() {
/* 15 */     return !ApplicationKt.getApplication().isUnitTestMode();
/*    */   }
/*    */   public boolean isSendEnabled() {
/* 18 */     return isRecordEnabled();
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\ej\core\statistics\MatterhornEventLoggerProvider.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */