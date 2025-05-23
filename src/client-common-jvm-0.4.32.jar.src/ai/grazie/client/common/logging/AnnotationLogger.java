/*    */ package ai.grazie.client.common.logging;
/*    */ 
/*    */ import ai.grazie.utils.mpp.MPPLogger;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ 
/*    */ @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\0004\n\002\030\002\n\002\020\000\n\000\n\002\030\002\n\000\n\002\030\002\n\002\b\004\n\002\020\013\n\002\b\003\n\002\020\002\n\000\n\002\030\002\n\000\n\002\020\016\n\002\b\002\030\000 \0232\0020\001:\001\023B\025\022\006\020\002\032\0020\003\022\006\020\004\032\0020\005¢\006\002\020\006J\026\020\r\032\0020\0162\006\020\017\032\0020\0202\006\020\021\032\0020\022R\021\020\004\032\0020\005¢\006\b\n\000\032\004\b\007\020\bR\021\020\t\032\0020\n8F¢\006\006\032\004\b\013\020\fR\016\020\002\032\0020\003X\004¢\006\002\n\000¨\006\024"}, d2 = {"Lai/grazie/client/common/logging/AnnotationLogger;", "", "logger", "Lai/grazie/utils/mpp/MPPLogger;", "config", "Lai/grazie/client/common/logging/LoggerConfig;", "(Lai/grazie/utils/mpp/MPPLogger;Lai/grazie/client/common/logging/LoggerConfig;)V", "getConfig", "()Lai/grazie/client/common/logging/LoggerConfig;", "logAnnotation", "", "getLogAnnotation", "()Z", "logEvent", "", "event", "Lai/grazie/model/cloud/annotations/AnnotationType;", "message", "", "Companion", "client-common"})
/*    */ public final class AnnotationLogger {
/* 10 */   public AnnotationLogger(@NotNull MPPLogger logger, @NotNull LoggerConfig config) { this.logger = logger; this.config = config; } @NotNull public final LoggerConfig getConfig() { return this.config; }
/*    */   
/* 12 */   public final boolean getLogAnnotation() { return this.config.getLogAnnotation(); } @Metadata(mv = {1, 7, 0}, k = 3, xi = 48, d1 = {"\000\b\n\000\n\002\020\016\n\000\020\000\032\0020\001H\n¢\006\002\b\002"}, d2 = {"<anonymous>", "", "invoke"}) static final class AnnotationLogger$logEvent$1 extends Lambda implements Function0<String> {
/*    */     AnnotationLogger$logEvent$1(String $message) { super(0); }
/*    */     public final String invoke() { return this.$message; } }
/* 15 */   public final void logEvent(@NotNull AnnotationType event, @NotNull String message) { Intrinsics.checkNotNullParameter(event, "event"); Intrinsics.checkNotNullParameter(message, "message"); LogLevel level = this.config.getLogLevel(event);
/* 16 */     switch ((level == null) ? -1 : WhenMappings.$EnumSwitchMapping$0[level.ordinal()]) { case true:
/* 17 */         this.logger.info(new AnnotationLogger$logEvent$1(message)); break;
/* 18 */       case true: MPPLogger.warning$default(this.logger, null, new AnnotationLogger$logEvent$2(message), 1, null); break;
/* 19 */       case true: MPPLogger.error$default(this.logger, null, new AnnotationLogger$logEvent$3(message), 1, null); break; }  } @Metadata(mv = {1, 7, 0}, k = 3, xi = 48, d1 = {"\000\b\n\000\n\002\020\016\n\000\020\000\032\0020\001H\n¢\006\002\b\002"}, d2 = {"<anonymous>", "", "invoke"}) static final class AnnotationLogger$logEvent$2 extends Lambda implements Function0<String> { AnnotationLogger$logEvent$2(String $message) { super(0); } public final String invoke() { return this.$message; } } @Metadata(mv = {1, 7, 0}, k = 3, xi = 48, d1 = {"\000\b\n\000\n\002\020\016\n\000\020\000\032\0020\001H\n¢\006\002\b\002"}, d2 = {"<anonymous>", "", "invoke"}) static final class AnnotationLogger$logEvent$3 extends Lambda implements Function0<String> { public final String invoke() { return this.$message; }
/*    */      AnnotationLogger$logEvent$3(String $message) {
/*    */       super(0);
/*    */     } } @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000.\n\002\030\002\n\002\020\000\n\002\b\002\n\002\020\016\n\000\n\002\030\002\n\002\b\003\n\002\030\002\n\000\n\002\020\013\n\000\n\002\030\002\n\002\b\003\b\003\030\0002\0020\001B\007\b\002¢\006\002\020\002J$\020\t\032\0020\n2\b\b\002\020\013\032\0020\f2\b\b\002\020\r\032\0020\0162\b\b\002\020\017\032\0020\006J\016\020\020\032\0020\n2\006\020\017\032\0020\006R\016\020\003\032\0020\004XT¢\006\002\n\000R\021\020\005\032\0020\006¢\006\b\n\000\032\004\b\007\020\b¨\006\021"}, d2 = {"Lai/grazie/client/common/logging/AnnotationLogger$Companion;", "", "()V", "DEPRECATION_LOGGER", "", "defaultLogger", "Lai/grazie/utils/mpp/MPPLogger;", "getDefaultLogger", "()Lai/grazie/utils/mpp/MPPLogger;", "default", "Lai/grazie/client/common/logging/AnnotationLogger;", "logAnnotation", "", "level", "Lai/grazie/client/common/logging/LogLevel;", "baseLogger", "gatewayLogger", "client-common"})
/*    */   @SourceDebugExtension({"SMAP\nAnnotationLogger.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AnnotationLogger.kt\nai/grazie/client/common/logging/AnnotationLogger$Companion\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,43:1\n1#2:44\n*E\n"})
/*    */   public static final class Companion { private Companion() {}
/*    */     @NotNull
/*    */     public final MPPLogger getDefaultLogger() {
/* 27 */       return AnnotationLogger.defaultLogger;
/*    */     }
/*    */ 
/*    */ 
/*    */     
/*    */     @NotNull
/*    */     public final AnnotationLogger default(boolean logAnnotation, @NotNull LogLevel level, @NotNull MPPLogger baseLogger) {
/* 34 */       Intrinsics.checkNotNullParameter(level, "level"); Intrinsics.checkNotNullParameter(baseLogger, "baseLogger");
/*    */       
/* 36 */       LoggerConfig loggerConfig1 = new LoggerConfig(logAnnotation), loggerConfig2 = loggerConfig1;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */       
/* 44 */       MPPLogger mPPLogger1 = baseLogger; int $i$a$-apply-AnnotationLogger$Companion$default$1 = 0;
/*    */       loggerConfig2.enableAll(level);
/*    */       LoggerConfig loggerConfig3 = loggerConfig1;
/*    */       MPPLogger mPPLogger2 = mPPLogger1;
/*    */       return new AnnotationLogger(mPPLogger2, loggerConfig3);
/*    */     }
/*    */     
/*    */     @NotNull
/*    */     public final AnnotationLogger gatewayLogger(@NotNull MPPLogger baseLogger) {
/*    */       Intrinsics.checkNotNullParameter(baseLogger, "baseLogger");
/*    */       return default$default(this, true, null, baseLogger, 2, null);
/*    */     } }
/*    */ 
/*    */   
/*    */   @NotNull
/*    */   public static final Companion Companion = new Companion(null);
/*    */   @NotNull
/*    */   private final MPPLogger logger;
/*    */   @NotNull
/*    */   private final LoggerConfig config;
/*    */   @NotNull
/*    */   private static final String DEPRECATION_LOGGER = "deprecationLogger";
/*    */   @NotNull
/*    */   private static final MPPLogger defaultLogger = LoggerFactory.INSTANCE.create("deprecationLogger");
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\client-common-jvm-0.4.32.jar!\ai\grazie\client\common\logging\AnnotationLogger.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */