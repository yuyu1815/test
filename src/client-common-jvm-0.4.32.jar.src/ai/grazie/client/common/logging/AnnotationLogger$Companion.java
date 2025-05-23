/*    */ package ai.grazie.client.common.logging;
/*    */ 
/*    */ import ai.grazie.utils.mpp.MPPLogger;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.jvm.internal.DefaultConstructorMarker;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import kotlin.jvm.internal.SourceDebugExtension;
/*    */ import org.jetbrains.annotations.NotNull;
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
/*    */ @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000.\n\002\030\002\n\002\020\000\n\002\b\002\n\002\020\016\n\000\n\002\030\002\n\002\b\003\n\002\030\002\n\000\n\002\020\013\n\000\n\002\030\002\n\002\b\003\b\003\030\0002\0020\001B\007\b\002¢\006\002\020\002J$\020\t\032\0020\n2\b\b\002\020\013\032\0020\f2\b\b\002\020\r\032\0020\0162\b\b\002\020\017\032\0020\006J\016\020\020\032\0020\n2\006\020\017\032\0020\006R\016\020\003\032\0020\004XT¢\006\002\n\000R\021\020\005\032\0020\006¢\006\b\n\000\032\004\b\007\020\b¨\006\021"}, d2 = {"Lai/grazie/client/common/logging/AnnotationLogger$Companion;", "", "()V", "DEPRECATION_LOGGER", "", "defaultLogger", "Lai/grazie/utils/mpp/MPPLogger;", "getDefaultLogger", "()Lai/grazie/utils/mpp/MPPLogger;", "default", "Lai/grazie/client/common/logging/AnnotationLogger;", "logAnnotation", "", "level", "Lai/grazie/client/common/logging/LogLevel;", "baseLogger", "gatewayLogger", "client-common"})
/*    */ @SourceDebugExtension({"SMAP\nAnnotationLogger.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AnnotationLogger.kt\nai/grazie/client/common/logging/AnnotationLogger$Companion\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,43:1\n1#2:44\n*E\n"})
/*    */ public final class Companion
/*    */ {
/*    */   private Companion() {}
/*    */   
/*    */   @NotNull
/*    */   public final MPPLogger getDefaultLogger() {
/* 27 */     return AnnotationLogger.access$getDefaultLogger$cp();
/*    */   }
/*    */ 
/*    */ 
/*    */   
/*    */   @NotNull
/*    */   public final AnnotationLogger default(boolean logAnnotation, @NotNull LogLevel level, @NotNull MPPLogger baseLogger) {
/* 34 */     Intrinsics.checkNotNullParameter(level, "level"); Intrinsics.checkNotNullParameter(baseLogger, "baseLogger");
/*    */     
/* 36 */     LoggerConfig loggerConfig1 = new LoggerConfig(logAnnotation), loggerConfig2 = loggerConfig1;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */     
/* 44 */     MPPLogger mPPLogger1 = baseLogger; int $i$a$-apply-AnnotationLogger$Companion$default$1 = 0;
/*    */     loggerConfig2.enableAll(level);
/*    */     LoggerConfig loggerConfig3 = loggerConfig1;
/*    */     MPPLogger mPPLogger2 = mPPLogger1;
/*    */     return new AnnotationLogger(mPPLogger2, loggerConfig3);
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final AnnotationLogger gatewayLogger(@NotNull MPPLogger baseLogger) {
/*    */     Intrinsics.checkNotNullParameter(baseLogger, "baseLogger");
/*    */     return default$default(this, true, null, baseLogger, 2, null);
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\client-common-jvm-0.4.32.jar!\ai\grazie\client\common\logging\AnnotationLogger$Companion.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */