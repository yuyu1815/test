/*    */ package ai.grazie.utils.mpp;
/*    */ import kotlin.jvm.functions.Function0;
/*    */ 
/*    */ @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\0004\n\002\030\002\n\002\030\002\n\000\n\002\030\002\n\002\b\002\n\002\020\013\n\002\b\t\n\002\020\002\n\000\n\002\030\002\n\002\020\016\n\002\b\002\n\002\020\003\n\002\b\003\030\0002\0020\001B\r\022\006\020\002\032\0020\003¢\006\002\020\004J\026\020\017\032\0020\0202\f\020\021\032\b\022\004\022\0020\0230\022H\026J \020\024\032\0020\0202\b\020\025\032\004\030\0010\0262\f\020\021\032\b\022\004\022\0020\0230\022H\026J\026\020\027\032\0020\0202\f\020\021\032\b\022\004\022\0020\0230\022H\026J \020\030\032\0020\0202\b\020\025\032\004\030\0010\0262\f\020\021\032\b\022\004\022\0020\0230\022H\026R\024\020\005\032\0020\0068VX\004¢\006\006\032\004\b\007\020\bR\024\020\t\032\0020\0068VX\004¢\006\006\032\004\b\n\020\bR\024\020\013\032\0020\0068VX\004¢\006\006\032\004\b\f\020\bR\016\020\002\032\0020\003X\004¢\006\002\n\000R\024\020\r\032\0020\0068VX\004¢\006\006\032\004\b\016\020\b¨\006\031"}, d2 = {"Lai/grazie/utils/mpp/Slf4jLogger;", "Lai/grazie/utils/mpp/MPPLogger;", "logger", "Lorg/slf4j/Logger;", "(Lorg/slf4j/Logger;)V", "debugEnabled", "", "getDebugEnabled", "()Z", "errorEnabled", "getErrorEnabled", "infoEnabled", "getInfoEnabled", "warningEnabled", "getWarningEnabled", "debug", "", "message", "Lkotlin/Function0;", "", "error", "e", "", "info", "warning", "utils-common"})
/*    */ public final class Slf4jLogger implements MPPLogger {
/*    */   public Slf4jLogger(@NotNull Logger logger) {
/*  7 */     this.logger = logger;
/*    */   } @NotNull
/*    */   private final Logger logger; public boolean getDebugEnabled() {
/* 10 */     return this.logger.isDebugEnabled();
/*    */   } public boolean getInfoEnabled() {
/* 12 */     return this.logger.isInfoEnabled();
/*    */   } public boolean getWarningEnabled() {
/* 14 */     return this.logger.isWarnEnabled();
/*    */   } public boolean getErrorEnabled() {
/* 16 */     return this.logger.isErrorEnabled();
/*    */   }
/*    */   public void debug(@NotNull Function0 message) {
/* 19 */     Intrinsics.checkNotNullParameter(message, "message"); if (!getDebugEnabled())
/* 20 */       return;  this.logger.debug((String)message.invoke());
/*    */   }
/*    */   
/*    */   public void info(@NotNull Function0 message) {
/* 24 */     Intrinsics.checkNotNullParameter(message, "message"); if (!getInfoEnabled())
/* 25 */       return;  this.logger.info((String)message.invoke());
/*    */   }
/*    */   
/*    */   public void warning(@Nullable Throwable e, @NotNull Function0 message) {
/* 29 */     Intrinsics.checkNotNullParameter(message, "message"); if (!getWarningEnabled())
/* 30 */       return;  this.logger.warn((String)message.invoke(), e);
/*    */   }
/*    */   
/*    */   public void error(@Nullable Throwable e, @NotNull Function0 message) {
/* 34 */     Intrinsics.checkNotNullParameter(message, "message"); if (!getErrorEnabled())
/* 35 */       return;  this.logger.error((String)message.invoke(), e);
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\li\\utils-common-jvm-0.4.32.jar!\ai\grazi\\utils\mpp\Slf4jLogger.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */