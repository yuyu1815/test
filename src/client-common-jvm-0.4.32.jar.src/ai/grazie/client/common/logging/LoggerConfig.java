/*    */ package ai.grazie.client.common.logging;
/*    */ 
/*    */ import ai.grazie.model.cloud.annotations.AnnotationType;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ 
/*    */ @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000*\n\002\030\002\n\002\020\000\n\000\n\002\020\013\n\002\b\004\n\002\020%\n\002\030\002\n\002\030\002\n\002\b\003\n\002\020\002\n\002\b\004\030\0002\0020\001B\017\022\b\b\002\020\002\032\0020\003¢\006\002\020\004J\020\020\013\032\004\030\0010\n2\006\020\f\032\0020\tJ\030\020\r\032\0020\0162\006\020\f\032\0020\t2\b\b\002\020\017\032\0020\nJ\020\020\020\032\0020\0162\b\b\002\020\017\032\0020\nJ\020\020\021\032\004\030\0010\n2\006\020\f\032\0020\tR\021\020\002\032\0020\003¢\006\b\n\000\032\004\b\005\020\006R\032\020\007\032\016\022\004\022\0020\t\022\004\022\0020\n0\bX\004¢\006\002\n\000¨\006\022"}, d2 = {"Lai/grazie/client/common/logging/LoggerConfig;", "", "logAnnotation", "", "(Z)V", "getLogAnnotation", "()Z", "logInfo", "", "Lai/grazie/model/cloud/annotations/AnnotationType;", "Lai/grazie/client/common/logging/LogLevel;", "disable", "event", "enable", "", "logLevel", "enableAll", "getLogLevel", "client-common"})
/*    */ @SourceDebugExtension({"SMAP\nLoggerConfig.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LoggerConfig.kt\nai/grazie/client/common/logging/LoggerConfig\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,30:1\n13402#2,2:31\n*S KotlinDebug\n*F\n+ 1 LoggerConfig.kt\nai/grazie/client/common/logging/LoggerConfig\n*L\n19#1:31,2\n*E\n"})
/*    */ public final class LoggerConfig {
/*    */   private final boolean logAnnotation;
/*    */   
/* 11 */   public LoggerConfig(boolean logAnnotation) { this.logAnnotation = logAnnotation;
/* 12 */     this.logInfo = new LinkedHashMap<>(); }
/*    */   @NotNull
/*    */   private final Map<AnnotationType, LogLevel> logInfo; public final boolean getLogAnnotation() { return this.logAnnotation; } public final void enable(@NotNull AnnotationType event, @NotNull LogLevel logLevel) {
/* 15 */     Intrinsics.checkNotNullParameter(event, "event"); Intrinsics.checkNotNullParameter(logLevel, "logLevel"); this.logInfo.put(event, logLevel);
/*    */   }
/*    */   
/*    */   public final void enableAll(@NotNull LogLevel logLevel) {
/* 19 */     Intrinsics.checkNotNullParameter(logLevel, "logLevel"); AnnotationType[] arrayOfAnnotationType = AnnotationType.values(); int $i$f$forEach = 0;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */     
/* 31 */     byte b = 0; int i = arrayOfAnnotationType.length; if (b < i) { Object element$iv = arrayOfAnnotationType[b], object1 = element$iv; int $i$a$-forEach-LoggerConfig$enableAll$1 = 0;
/*    */       this.logInfo.put(object1, logLevel); }
/*    */   
/*    */   }
/*    */   
/*    */   @Nullable
/*    */   public final LogLevel disable(@NotNull AnnotationType event) {
/*    */     Intrinsics.checkNotNullParameter(event, "event");
/*    */     return this.logInfo.remove(event);
/*    */   }
/*    */   
/*    */   @Nullable
/*    */   public final LogLevel getLogLevel(@NotNull AnnotationType event) {
/*    */     Intrinsics.checkNotNullParameter(event, "event");
/*    */     return this.logInfo.get(event);
/*    */   }
/*    */   
/*    */   public LoggerConfig() {
/*    */     this(false, 1, null);
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\client-common-jvm-0.4.32.jar!\ai\grazie\client\common\logging\LoggerConfig.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */