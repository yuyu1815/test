/*    */ package com.intellij.ml.llm.matterhorn.ej.core.terminal.block.session.util;
/*    */ import kotlin.jvm.functions.Function0;
/*    */ 
/*    */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\0008\n\002\030\002\n\002\020\000\n\000\n\002\020\b\n\000\n\002\030\002\n\002\b\003\n\002\030\002\n\000\n\002\030\002\n\000\n\002\020\013\n\000\n\002\020\002\n\002\b\002\n\002\030\002\n\000\b\000\030\0002\0020\001B\027\022\006\020\002\032\0020\003\022\006\020\004\032\0020\005¢\006\004\b\006\020\007J\006\020\016\032\0020\017J\024\020\020\032\0020\0172\f\020\021\032\b\022\004\022\0020\0170\022R\016\020\002\032\0020\003X\004¢\006\002\n\000R\016\020\b\032\0020\tX\004¢\006\002\n\000R\016\020\n\032\0020\013X\004¢\006\002\n\000R\016\020\f\032\0020\rX\016¢\006\002\n\000¨\006\023"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/session/util/Debouncer;", "", "delay", "", "parentDisposable", "Lcom/intellij/openapi/Disposable;", "<init>", "(ILcom/intellij/openapi/Disposable;)V", "scheduled", "Ljava/util/concurrent/atomic/AtomicBoolean;", "alarm", "Lcom/intellij/util/Alarm;", "useExtendedDelayOnce", "", "setExtendedDelayOnce", "", "execute", "action", "Lkotlin/Function0;", "ej-core"})
/*    */ public final class Debouncer {
/*    */   private final int delay;
/*    */   
/*    */   public Debouncer(int delay, @NotNull Disposable parentDisposable) {
/*  9 */     this.delay = delay;
/*    */ 
/*    */     
/* 12 */     this.scheduled = new AtomicBoolean(false);
/* 13 */     this.alarm = new Alarm(Alarm.ThreadToUse.POOLED_THREAD, parentDisposable);
/*    */   }
/*    */   @NotNull
/*    */   private final AtomicBoolean scheduled; @NotNull
/*    */   private final Alarm alarm; private volatile boolean useExtendedDelayOnce;
/*    */   public final void setExtendedDelayOnce() {
/* 19 */     this.useExtendedDelayOnce = true;
/*    */   }
/*    */   public final void execute(@NotNull Function0 action) {
/*    */     // Byte code:
/*    */     //   0: aload_1
/*    */     //   1: ldc 'action'
/*    */     //   3: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*    */     //   6: aload_0
/*    */     //   7: getfield scheduled : Ljava/util/concurrent/atomic/AtomicBoolean;
/*    */     //   10: iconst_0
/*    */     //   11: iconst_1
/*    */     //   12: invokevirtual compareAndSet : (ZZ)Z
/*    */     //   15: ifeq -> 81
/*    */     //   18: aload_0
/*    */     //   19: aload_1
/*    */     //   20: <illegal opcode> invoke : (Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/session/util/Debouncer;Lkotlin/jvm/functions/Function0;)Lkotlin/jvm/functions/Function0;
/*    */     //   25: astore_2
/*    */     //   26: aload_0
/*    */     //   27: getfield useExtendedDelayOnce : Z
/*    */     //   30: ifeq -> 43
/*    */     //   33: bipush #100
/*    */     //   35: aload_0
/*    */     //   36: getfield delay : I
/*    */     //   39: iadd
/*    */     //   40: goto -> 47
/*    */     //   43: aload_0
/*    */     //   44: getfield delay : I
/*    */     //   47: istore_3
/*    */     //   48: aload_0
/*    */     //   49: iconst_0
/*    */     //   50: putfield useExtendedDelayOnce : Z
/*    */     //   53: iload_3
/*    */     //   54: ifgt -> 67
/*    */     //   57: aload_2
/*    */     //   58: invokeinterface invoke : ()Ljava/lang/Object;
/*    */     //   63: pop
/*    */     //   64: goto -> 81
/*    */     //   67: aload_0
/*    */     //   68: getfield alarm : Lcom/intellij/util/Alarm;
/*    */     //   71: aload_2
/*    */     //   72: <illegal opcode> run : (Lkotlin/jvm/functions/Function0;)Ljava/lang/Runnable;
/*    */     //   77: iload_3
/*    */     //   78: invokevirtual addRequest : (Ljava/lang/Runnable;I)V
/*    */     //   81: return
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #23	-> 6
/*    */     //   #24	-> 18
/*    */     //   #28	-> 26
/*    */     //   #29	-> 48
/*    */     //   #30	-> 53
/*    */     //   #31	-> 57
/*    */     //   #34	-> 67
/*    */     //   #37	-> 81
/*    */     // Local variable table:
/*    */     //   start	length	slot	name	descriptor
/*    */     //   26	55	2	request	Lkotlin/jvm/functions/Function0;
/*    */     //   48	33	3	delay	I
/*    */     //   0	82	0	this	Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/session/util/Debouncer;
/*    */     //   0	82	1	action	Lkotlin/jvm/functions/Function0;
/*    */   }
/*    */   private static final Unit execute$lambda$0(Debouncer this$0, Function0 $action) {
/* 25 */     this$0.scheduled.set(false);
/* 26 */     $action.invoke();
/* 27 */     return Unit.INSTANCE;
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   private static final void execute$lambda$1(Function0 $tmp0) {
/* 34 */     $tmp0.invoke();
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\ej\core\terminal\block\sessio\\util\Debouncer.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */