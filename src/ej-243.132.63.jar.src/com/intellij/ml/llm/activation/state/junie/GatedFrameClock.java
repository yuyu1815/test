/*     */ package com.intellij.ml.llm.activation.state.junie;
/*     */ 
/*     */ import androidx.compose.runtime.BroadcastFrameClock;
/*     */ import androidx.compose.runtime.MonotonicFrameClock;
/*     */ import androidx.compose.runtime.internal.StabilityInferred;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.Unit;
/*     */ import kotlin.coroutines.Continuation;
/*     */ import kotlin.coroutines.CoroutineContext;
/*     */ import kotlin.coroutines.jvm.internal.SuspendLambda;
/*     */ import kotlin.jvm.functions.Function1;
/*     */ import kotlin.jvm.functions.Function2;
/*     */ import kotlinx.coroutines.CoroutineScope;
/*     */ import kotlinx.coroutines.channels.Channel;
/*     */ import kotlinx.coroutines.channels.ChannelKt;
/*     */ import org.jetbrains.annotations.NotNull;
/*     */ import org.jetbrains.annotations.Nullable;
/*     */ 
/*     */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000F\n\002\030\002\n\002\030\002\n\000\n\002\030\002\n\002\b\003\n\002\030\002\n\002\020\002\n\000\n\002\020\013\n\002\b\005\n\002\020\t\n\000\n\002\020\b\n\002\b\002\n\002\030\002\n\002\b\003\n\002\030\002\n\002\030\002\n\002\b\004\b\001\030\0002\0020\001B\017\022\006\020\002\032\0020\003¢\006\004\b\004\020\005J\b\020\023\032\0020\bH\002J7\020\026\032\002H\027\"\004\b\000\020\0272!\020\030\032\035\022\023\022\0210\020¢\006\f\b\032\022\b\b\033\022\004\b\b(\034\022\004\022\002H\0270\031H@¢\006\002\020\035R\024\020\006\032\b\022\004\022\0020\b0\007X\004¢\006\002\n\000R$\020\013\032\0020\n2\006\020\t\032\0020\n@FX\016¢\006\016\n\000\032\004\b\013\020\f\"\004\b\r\020\016R\016\020\017\032\0020\020X\016¢\006\002\n\000R\016\020\021\032\0020\022X\016¢\006\002\n\000R\016\020\024\032\0020\025X\004¢\006\002\n\000¨\006\036"}, d2 = {"Lcom/intellij/ml/llm/activation/state/junie/GatedFrameClock;", "Landroidx/compose/runtime/MonotonicFrameClock;", "scope", "Lkotlinx/coroutines/CoroutineScope;", "<init>", "(Lkotlinx/coroutines/CoroutineScope;)V", "frameSends", "Lkotlinx/coroutines/channels/Channel;", "", "value", "", "isRunning", "()Z", "setRunning", "(Z)V", "lastNanos", "", "lastOffset", "", "sendFrame", "clock", "Landroidx/compose/runtime/BroadcastFrameClock;", "withFrameNanos", "R", "onFrame", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "frameTimeNanos", "(Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "state.junie.impl"})
/*     */ @StabilityInferred(parameters = 0)
/*     */ public final class GatedFrameClock implements MonotonicFrameClock {
/*     */   @NotNull
/*     */   private final Channel<Unit> frameSends;
/*     */   private boolean isRunning;
/*     */   private long lastNanos;
/*     */   private int lastOffset;
/*     */   @NotNull
/*     */   private final BroadcastFrameClock clock;
/*     */   public static final int $stable = 8;
/*     */   
/*     */   public <R> R fold(Object initial, @NotNull Function2 operation) {
/*     */     return (R)MonotonicFrameClock.DefaultImpls.fold(this, initial, operation);
/*     */   }
/*     */   
/*     */   @Nullable
/*     */   public <E extends CoroutineContext.Element> E get(@NotNull CoroutineContext.Key key) {
/*     */     return (E)MonotonicFrameClock.DefaultImpls.get(this, key);
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public CoroutineContext minusKey(@NotNull CoroutineContext.Key key) {
/*     */     return MonotonicFrameClock.DefaultImpls.minusKey(this, key);
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public CoroutineContext plus(@NotNull CoroutineContext context) {
/*     */     return MonotonicFrameClock.DefaultImpls.plus(this, context);
/*     */   }
/*     */   
/*     */   public final boolean isRunning() {
/*     */     return this.isRunning;
/*     */   }
/*     */   
/*     */   public final void setRunning(boolean value) {
/*     */     boolean started = (value && !this.isRunning);
/*     */     this.isRunning = value;
/*     */     if (started)
/*     */       sendFrame(); 
/*     */   }
/*     */   
/*  61 */   public GatedFrameClock(@NotNull CoroutineScope scope) { this.frameSends = ChannelKt.Channel$default(-1, null, null, 6, null);
/*     */ 
/*     */     
/*  64 */     BuildersKt.launch$default(scope, null, null, new Function2<CoroutineScope, Continuation<? super Unit>, Object>(null) { Object L$0; int label; public final Object invokeSuspend(Object $result) { // Byte code:
/*     */             //   0: invokestatic getCOROUTINE_SUSPENDED : ()Ljava/lang/Object;
/*     */             //   3: astore_3
/*     */             //   4: aload_0
/*     */             //   5: getfield label : I
/*     */             //   8: tableswitch default -> 119, 0 -> 32, 1 -> 76
/*     */             //   32: aload_1
/*     */             //   33: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */             //   36: aload_0
/*     */             //   37: getfield this$0 : Lcom/intellij/ml/llm/activation/state/junie/GatedFrameClock;
/*     */             //   40: invokestatic access$getFrameSends$p : (Lcom/intellij/ml/llm/activation/state/junie/GatedFrameClock;)Lkotlinx/coroutines/channels/Channel;
/*     */             //   43: invokeinterface iterator : ()Lkotlinx/coroutines/channels/ChannelIterator;
/*     */             //   48: astore_2
/*     */             //   49: aload_2
/*     */             //   50: aload_0
/*     */             //   51: checkcast kotlin/coroutines/Continuation
/*     */             //   54: aload_0
/*     */             //   55: aload_2
/*     */             //   56: putfield L$0 : Ljava/lang/Object;
/*     */             //   59: aload_0
/*     */             //   60: iconst_1
/*     */             //   61: putfield label : I
/*     */             //   64: invokeinterface hasNext : (Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*     */             //   69: dup
/*     */             //   70: aload_3
/*     */             //   71: if_acmpne -> 89
/*     */             //   74: aload_3
/*     */             //   75: areturn
/*     */             //   76: aload_0
/*     */             //   77: getfield L$0 : Ljava/lang/Object;
/*     */             //   80: checkcast kotlinx/coroutines/channels/ChannelIterator
/*     */             //   83: astore_2
/*     */             //   84: aload_1
/*     */             //   85: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */             //   88: aload_1
/*     */             //   89: checkcast java/lang/Boolean
/*     */             //   92: invokevirtual booleanValue : ()Z
/*     */             //   95: ifeq -> 115
/*     */             //   98: aload_2
/*     */             //   99: invokeinterface next : ()Ljava/lang/Object;
/*     */             //   104: pop
/*     */             //   105: aload_0
/*     */             //   106: getfield this$0 : Lcom/intellij/ml/llm/activation/state/junie/GatedFrameClock;
/*     */             //   109: invokestatic access$sendFrame : (Lcom/intellij/ml/llm/activation/state/junie/GatedFrameClock;)V
/*     */             //   112: goto -> 49
/*     */             //   115: getstatic kotlin/Unit.INSTANCE : Lkotlin/Unit;
/*     */             //   118: areturn
/*     */             //   119: new java/lang/IllegalStateException
/*     */             //   122: dup
/*     */             //   123: ldc 'call to 'resume' before 'invoke' with coroutine'
/*     */             //   125: invokespecial <init> : (Ljava/lang/String;)V
/*     */             //   128: athrow
/*     */             // Line number table:
/*     */             //   Java source line number -> byte code offset
/*     */             //   #64	-> 3
/*     */             //   #65	-> 36
/*     */             //   #64	-> 74
/*     */             //   #65	-> 89
/*     */             //   #66	-> 115
/*     */             //   #64	-> 119
/*     */             // Local variable table:
/*     */             //   start	length	slot	name	descriptor
/*     */             //   0	129	0	this	Lcom/intellij/ml/llm/activation/state/junie/GatedFrameClock$1;
/*  64 */             //   36	83	1	$result	Ljava/lang/Object; } public final Continuation<Unit> create(Object value, Continuation<? super null> $completion) { return (Continuation)new Function2<>(GatedFrameClock.this, $completion); } public final Object invoke(CoroutineScope p1, Continuation<?> p2) { return ((null)create(p1, p2)).invokeSuspend(Unit.INSTANCE); } }3, null);
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*  69 */     this.isRunning = true;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*  97 */     this.clock = new BroadcastFrameClock(this::clock$lambda$0); }
/*  98 */   private final void sendFrame() { long timeNanos = System.nanoTime(); this.lastNanos = timeNanos; int offset = (timeNanos == this.lastNanos) ? (this.lastOffset + 1) : 0; this.lastOffset = offset; this.clock.sendFrame(timeNanos + offset); } private static final Unit clock$lambda$0(GatedFrameClock this$0) { if (this$0.isRunning) ChannelResult.getOrThrow-impl(this$0.frameSends.trySend-JP2dKIU(Unit.INSTANCE)); 
/*  99 */     return Unit.INSTANCE; }
/*     */    @Nullable
/*     */   public <R> Object withFrameNanos(@NotNull Function1 onFrame, @NotNull Continuation $completion) {
/* 102 */     return this.clock.withFrameNanos(onFrame, $completion);
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\activation\state\junie\GatedFrameClock.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */