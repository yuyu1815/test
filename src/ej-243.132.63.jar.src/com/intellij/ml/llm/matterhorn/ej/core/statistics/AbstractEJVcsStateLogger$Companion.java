/*    */ package com.intellij.ml.llm.matterhorn.ej.core.statistics;
/*    */ 
/*    */ import com.intellij.internal.statistic.eventLog.events.EventField;
/*    */ import com.intellij.internal.statistic.eventLog.events.IntEventField;
/*    */ import com.intellij.internal.statistic.eventLog.events.LongEventField;
/*    */ import com.intellij.internal.statistic.eventLog.events.PrimitiveEventField;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.jvm.internal.DefaultConstructorMarker;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\0000\n\002\030\002\n\002\020\000\n\002\b\003\n\002\030\002\n\002\020\016\n\002\b\003\n\002\030\002\n\002\b\003\n\002\030\002\n\002\b\003\n\002\030\002\n\002\b\005\b\003\030\0002\0020\001B\t\b\002¢\006\004\b\002\020\003R\034\020\004\032\n\022\006\022\004\030\0010\0060\005X\004¢\006\b\n\000\032\004\b\007\020\bR\024\020\t\032\0020\nX\004¢\006\b\n\000\032\004\b\013\020\fR\034\020\r\032\n\022\006\022\004\030\0010\0060\016X\004¢\006\b\n\000\032\004\b\017\020\020R\024\020\021\032\0020\022X\004¢\006\b\n\000\032\004\b\023\020\024R\024\020\025\032\0020\022X\004¢\006\b\n\000\032\004\b\026\020\024¨\006\027"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/core/statistics/AbstractEJVcsStateLogger$Companion;", "", "<init>", "()V", "VCS_STATE_ID", "Lcom/intellij/internal/statistic/eventLog/events/PrimitiveEventField;", "", "getVCS_STATE_ID$ej_core", "()Lcom/intellij/internal/statistic/eventLog/events/PrimitiveEventField;", "TIMESTAMP_MS", "Lcom/intellij/internal/statistic/eventLog/events/LongEventField;", "getTIMESTAMP_MS$ej_core", "()Lcom/intellij/internal/statistic/eventLog/events/LongEventField;", "ORIGIN_URL", "Lcom/intellij/internal/statistic/eventLog/events/EventField;", "getORIGIN_URL$ej_core", "()Lcom/intellij/internal/statistic/eventLog/events/EventField;", "USERS_COUNT", "Lcom/intellij/internal/statistic/eventLog/events/IntEventField;", "getUSERS_COUNT$ej_core", "()Lcom/intellij/internal/statistic/eventLog/events/IntEventField;", "LOCAL_CHANGED_FILES_COUNT", "getLOCAL_CHANGED_FILES_COUNT$ej_core", "ej-core"})
/*    */ public final class Companion
/*    */ {
/*    */   private Companion() {}
/*    */   
/*    */   @NotNull
/*    */   public final PrimitiveEventField<String> getVCS_STATE_ID$ej_core() {
/* 25 */     return AbstractEJVcsStateLogger.access$getVCS_STATE_ID$cp(); } @NotNull
/* 26 */   public final LongEventField getTIMESTAMP_MS$ej_core() { return AbstractEJVcsStateLogger.access$getTIMESTAMP_MS$cp(); } @NotNull
/* 27 */   public final EventField<String> getORIGIN_URL$ej_core() { return AbstractEJVcsStateLogger.access$getORIGIN_URL$cp(); } @NotNull
/* 28 */   public final IntEventField getUSERS_COUNT$ej_core() { return AbstractEJVcsStateLogger.access$getUSERS_COUNT$cp(); } @NotNull
/* 29 */   public final IntEventField getLOCAL_CHANGED_FILES_COUNT$ej_core() { return AbstractEJVcsStateLogger.access$getLOCAL_CHANGED_FILES_COUNT$cp(); }
/*    */ 
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\ej\core\statistics\AbstractEJVcsStateLogger$Companion.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */