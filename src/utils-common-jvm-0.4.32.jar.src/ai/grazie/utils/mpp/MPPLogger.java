/*    */ package ai.grazie.utils.mpp;@Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000:\n\002\030\002\n\002\020\000\n\000\n\002\020\013\n\002\b\t\n\002\020\002\n\000\n\002\030\002\n\000\n\002\020\016\n\002\b\003\n\002\020\003\n\002\b\005\n\002\030\002\n\002\030\002\n\002\b\002\bf\030\0002\0020\001J$\020\f\032\0020\r2\f\020\016\032\b\022\004\022\0020\0030\0172\f\020\020\032\b\022\004\022\0020\0210\017H\026J\026\020\022\032\0020\r2\f\020\020\032\b\022\004\022\0020\0210\017H&J\"\020\023\032\0020\r2\f\020\020\032\b\022\004\022\0020\0210\0172\n\b\002\020\024\032\004\030\0010\025H\027J\"\020\023\032\0020\r2\n\b\002\020\024\032\004\030\0010\0252\f\020\020\032\b\022\004\022\0020\0210\017H&J\026\020\026\032\0020\r2\f\020\020\032\b\022\004\022\0020\0210\017H&J\"\020\027\032\0020\r2\f\020\020\032\b\022\004\022\0020\0210\0172\n\b\002\020\024\032\004\030\0010\025H\027J\"\020\027\032\0020\r2\n\b\002\020\024\032\004\030\0010\0252\f\020\020\032\b\022\004\022\0020\0210\017H&J@\020\030\032\002H\031\"\004\b\000\020\0312\f\020\020\032\b\022\004\022\0020\0210\0172\034\020\032\032\030\b\001\022\n\022\b\022\004\022\002H\0310\034\022\006\022\004\030\0010\0010\033H@¢\006\002\020\035R\022\020\002\032\0020\003X¦\004¢\006\006\032\004\b\004\020\005R\022\020\006\032\0020\003X¦\004¢\006\006\032\004\b\007\020\005R\022\020\b\032\0020\003X¦\004¢\006\006\032\004\b\t\020\005R\022\020\n\032\0020\003X¦\004¢\006\006\032\004\b\013\020\005ø\001\000\002\006\n\004\b!0\001¨\006\036À\006\001"}, d2 = {"Lai/grazie/utils/mpp/MPPLogger;", "", "debugEnabled", "", "getDebugEnabled", "()Z", "errorEnabled", "getErrorEnabled", "infoEnabled", "getInfoEnabled", "warningEnabled", "getWarningEnabled", "bomb", "", "condition", "Lkotlin/Function0;", "message", "", "debug", "error", "e", "", "info", "warning", "withTimer", "T", "body", "Lkotlin/Function1;", "Lkotlin/coroutines/Continuation;", "(Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "utils-common"})
/*    */ public interface MPPLogger {
/*    */   boolean getDebugEnabled();
/*    */   
/*    */   boolean getInfoEnabled();
/*    */   
/*    */   boolean getWarningEnabled();
/*    */   
/*    */   boolean getErrorEnabled();
/*    */   
/*    */   void debug(@NotNull Function0<String> paramFunction0);
/*    */   
/*    */   void info(@NotNull Function0<String> paramFunction0);
/*    */   
/*    */   @Deprecated(message = "Use implementation with lambda in the end")
/*    */   default void warning(@NotNull Function0<String> message, @Nullable Throwable e) {
/* 17 */     Intrinsics.checkNotNullParameter(message, "message"); warning(e, message);
/*    */   }
/*    */   void warning(@Nullable Throwable paramThrowable, @NotNull Function0<String> paramFunction0);
/*    */   @Deprecated(message = "Use implementation with lambda in the end")
/* 21 */   default void error(@NotNull Function0<String> message, @Nullable Throwable e) { Intrinsics.checkNotNullParameter(message, "message"); error(e, message); }
/*    */   void error(@Nullable Throwable paramThrowable, @NotNull Function0<String> paramFunction0);
/*    */   @Nullable default <T> Object withTimer(@NotNull Function0<String> message, @NotNull Function1<? super Continuation<?>, ? extends Object> body, @NotNull Continuation<?> $completion) { return withTimer$suspendImpl(this, message, body, $completion); }
/*    */   @DebugMetadata(f = "Logger.kt", l = {35}, i = {0, 0, 0}, s = {"L$0", "L$1", "L$2"}, n = {"$this", "message", "start"}, m = "withTimer$suspendImpl", c = "ai.grazie.utils.mpp.MPPLogger") @Metadata(mv = {1, 7, 0}, k = 3, xi = 48)
/*    */   static final class MPPLogger$withTimer$1<T> extends ContinuationImpl {
/*    */     Object L$0; Object L$1; Object L$2; int label; MPPLogger$withTimer$1(Continuation $completion) { super($completion); } @Nullable
/*    */     public final Object invokeSuspend(@NotNull Object $result) { this.result = $result;
/*    */       this.label |= Integer.MIN_VALUE;
/* 29 */       return MPPLogger.withTimer$suspendImpl(MPPLogger.this, null, null, (Continuation)this); } } default void bomb(@NotNull Function0 condition, @NotNull Function0<String> message) { Intrinsics.checkNotNullParameter(condition, "condition"); Intrinsics.checkNotNullParameter(message, "message"); if (((Boolean)condition.invoke()).booleanValue()) error((Throwable)null, message);  }
/*    */    @Metadata(mv = {1, 7, 0}, k = 3, xi = 48, d1 = {"\000\n\n\000\n\002\020\016\n\002\b\002\020\000\032\0020\001\"\004\b\000\020\002H\n¢\006\002\b\003"}, d2 = {"<anonymous>", "", "T", "invoke"})
/*    */   static final class MPPLogger$withTimer$2 extends Lambda implements Function0<String> { MPPLogger$withTimer$2(Function0<String> $message) {
/*    */       super(0);
/*    */     } public final String invoke() {
/* 34 */       return "Start " + this.$message.invoke(); } } @Metadata(mv = {1, 7, 0}, k = 3, xi = 48, d1 = {"\000\n\n\000\n\002\020\016\n\002\b\002\020\000\032\0020\001\"\004\b\000\020\002H\n¢\006\002\b\003"}, d2 = {"<anonymous>", "", "T", "invoke"})
/*    */   static final class MPPLogger$withTimer$3 extends Lambda implements Function0<String> { MPPLogger$withTimer$3(Function0<String> $message, Timer $start) { super(0); }
/* 36 */     public final String invoke() { return "Finish " + this.$message.invoke() + "; Total time " + this.$start.elapsed().getMillis() + "ms."; }
/*    */      }
/*    */ 
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\li\\utils-common-jvm-0.4.32.jar!\ai\grazi\\utils\mpp\MPPLogger.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */