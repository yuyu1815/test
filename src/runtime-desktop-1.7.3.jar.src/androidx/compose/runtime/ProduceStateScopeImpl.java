/*    */ package androidx.compose.runtime;
/*    */ 
/*    */ import kotlin.Metadata;
/*    */ import kotlin.Unit;
/*    */ import kotlin.coroutines.Continuation;
/*    */ import kotlin.coroutines.CoroutineContext;
/*    */ import kotlin.coroutines.jvm.internal.ContinuationImpl;
/*    */ import kotlin.coroutines.jvm.internal.DebugMetadata;
/*    */ import kotlin.jvm.functions.Function0;
/*    */ import kotlin.jvm.functions.Function1;
/*    */ import kotlin.jvm.internal.SourceDebugExtension;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ import org.jetbrains.annotations.Nullable;
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
/*    */ @Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\0002\n\002\030\002\n\000\n\002\030\002\n\002\030\002\n\002\b\002\n\002\030\002\n\002\b\t\n\002\020\001\n\000\n\002\030\002\n\002\020\002\n\002\b\003\n\002\030\002\n\000\b\002\030\000*\004\b\000\020\0012\b\022\004\022\002H\0010\0022\b\022\004\022\002H\0010\003B\033\022\f\020\004\032\b\022\004\022\0028\0000\003\022\006\020\005\032\0020\006¢\006\002\020\007J\034\020\017\032\0020\0202\f\020\021\032\b\022\004\022\0020\0230\022H@¢\006\002\020\024J\016\020\025\032\0028\000H\003¢\006\002\020\fJ\025\020\026\032\016\022\004\022\0028\000\022\004\022\0020\0230\027H\003R\024\020\005\032\0020\006X\004¢\006\b\n\000\032\004\b\b\020\tR\030\020\n\032\0028\000X\017¢\006\f\032\004\b\013\020\f\"\004\b\r\020\016¨\006\030"}, d2 = {"Landroidx/compose/runtime/ProduceStateScopeImpl;", "T", "Landroidx/compose/runtime/ProduceStateScope;", "Landroidx/compose/runtime/MutableState;", "state", "coroutineContext", "Lkotlin/coroutines/CoroutineContext;", "(Landroidx/compose/runtime/MutableState;Lkotlin/coroutines/CoroutineContext;)V", "getCoroutineContext", "()Lkotlin/coroutines/CoroutineContext;", "value", "getValue", "()Ljava/lang/Object;", "setValue", "(Ljava/lang/Object;)V", "awaitDispose", "", "onDispose", "Lkotlin/Function0;", "", "(Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "component1", "component2", "Lkotlin/Function1;", "runtime"})
/*    */ @SourceDebugExtension({"SMAP\nProduceState.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ProduceState.kt\nandroidx/compose/runtime/ProduceStateScopeImpl\n+ 2 CancellableContinuation.kt\nkotlinx/coroutines/CancellableContinuationKt\n*L\n1#1,223:1\n310#2,11:224\n*S KotlinDebug\n*F\n+ 1 ProduceState.kt\nandroidx/compose/runtime/ProduceStateScopeImpl\n*L\n50#1:224,11\n*E\n"})
/*    */ final class ProduceStateScopeImpl<T>
/*    */   implements ProduceStateScope<T>, MutableState<T>
/*    */ {
/*    */   @NotNull
/*    */   private final CoroutineContext coroutineContext;
/*    */   
/*    */   public ProduceStateScopeImpl(@NotNull MutableState<T> state, @NotNull CoroutineContext coroutineContext) {
/* 45 */     this.coroutineContext = coroutineContext;
/* 46 */     this.$$delegate_0 = state;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public CoroutineContext getCoroutineContext() {
/*    */     return this.coroutineContext;
/*    */   }
/*    */   
/*    */   public T getValue() {
/*    */     return this.$$delegate_0.getValue();
/*    */   }
/*    */   
/*    */   public void setValue(Object <set-?>) {
/*    */     this.$$delegate_0.setValue((T)<set-?>);
/*    */   }
/*    */   
/*    */   public T component1() {
/*    */     return this.$$delegate_0.component1();
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public Function1<T, Unit> component2() {
/*    */     return this.$$delegate_0.component2();
/*    */   }
/*    */   
/*    */   @Nullable
/*    */   public Object awaitDispose(@NotNull Function0 onDispose, @NotNull Continuation<?> paramContinuation) {
/*    */     // Byte code:
/*    */     //   0: aload_2
/*    */     //   1: instanceof androidx/compose/runtime/ProduceStateScopeImpl$awaitDispose$1
/*    */     //   4: ifeq -> 39
/*    */     //   7: aload_2
/*    */     //   8: checkcast androidx/compose/runtime/ProduceStateScopeImpl$awaitDispose$1
/*    */     //   11: astore #9
/*    */     //   13: aload #9
/*    */     //   15: getfield label : I
/*    */     //   18: ldc -2147483648
/*    */     //   20: iand
/*    */     //   21: ifeq -> 39
/*    */     //   24: aload #9
/*    */     //   26: dup
/*    */     //   27: getfield label : I
/*    */     //   30: ldc -2147483648
/*    */     //   32: isub
/*    */     //   33: putfield label : I
/*    */     //   36: goto -> 50
/*    */     //   39: new androidx/compose/runtime/ProduceStateScopeImpl$awaitDispose$1
/*    */     //   42: dup
/*    */     //   43: aload_0
/*    */     //   44: aload_2
/*    */     //   45: invokespecial <init> : (Landroidx/compose/runtime/ProduceStateScopeImpl;Lkotlin/coroutines/Continuation;)V
/*    */     //   48: astore #9
/*    */     //   50: aload #9
/*    */     //   52: getfield result : Ljava/lang/Object;
/*    */     //   55: astore #8
/*    */     //   57: invokestatic getCOROUTINE_SUSPENDED : ()Ljava/lang/Object;
/*    */     //   60: astore #10
/*    */     //   62: aload #9
/*    */     //   64: getfield label : I
/*    */     //   67: tableswitch default -> 217, 0 -> 88, 1 -> 178
/*    */     //   88: aload #8
/*    */     //   90: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*    */     //   93: nop
/*    */     //   94: iconst_0
/*    */     //   95: istore_3
/*    */     //   96: aload #9
/*    */     //   98: aload_1
/*    */     //   99: putfield L$0 : Ljava/lang/Object;
/*    */     //   102: aload #9
/*    */     //   104: iconst_1
/*    */     //   105: putfield label : I
/*    */     //   108: aload #9
/*    */     //   110: checkcast kotlin/coroutines/Continuation
/*    */     //   113: astore #4
/*    */     //   115: iconst_0
/*    */     //   116: istore #5
/*    */     //   118: new kotlinx/coroutines/CancellableContinuationImpl
/*    */     //   121: dup
/*    */     //   122: aload #4
/*    */     //   124: invokestatic intercepted : (Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;
/*    */     //   127: iconst_1
/*    */     //   128: invokespecial <init> : (Lkotlin/coroutines/Continuation;I)V
/*    */     //   131: astore #6
/*    */     //   133: aload #6
/*    */     //   135: invokevirtual initCancellability : ()V
/*    */     //   138: aload #6
/*    */     //   140: checkcast kotlinx/coroutines/CancellableContinuation
/*    */     //   143: pop
/*    */     //   144: iconst_0
/*    */     //   145: istore #7
/*    */     //   147: nop
/*    */     //   148: nop
/*    */     //   149: aload #6
/*    */     //   151: invokevirtual getResult : ()Ljava/lang/Object;
/*    */     //   154: dup
/*    */     //   155: invokestatic getCOROUTINE_SUSPENDED : ()Ljava/lang/Object;
/*    */     //   158: if_acmpne -> 169
/*    */     //   161: aload #9
/*    */     //   163: checkcast kotlin/coroutines/Continuation
/*    */     //   166: invokestatic probeCoroutineSuspended : (Lkotlin/coroutines/Continuation;)V
/*    */     //   169: dup
/*    */     //   170: aload #10
/*    */     //   172: if_acmpne -> 197
/*    */     //   175: aload #10
/*    */     //   177: areturn
/*    */     //   178: iconst_0
/*    */     //   179: istore_3
/*    */     //   180: aload #9
/*    */     //   182: getfield L$0 : Ljava/lang/Object;
/*    */     //   185: checkcast kotlin/jvm/functions/Function0
/*    */     //   188: astore_1
/*    */     //   189: nop
/*    */     //   190: aload #8
/*    */     //   192: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*    */     //   195: aload #8
/*    */     //   197: nop
/*    */     //   198: pop
/*    */     //   199: new kotlin/KotlinNothingValueException
/*    */     //   202: dup
/*    */     //   203: invokespecial <init> : ()V
/*    */     //   206: athrow
/*    */     //   207: astore_3
/*    */     //   208: aload_1
/*    */     //   209: invokeinterface invoke : ()Ljava/lang/Object;
/*    */     //   214: pop
/*    */     //   215: aload_3
/*    */     //   216: athrow
/*    */     //   217: new java/lang/IllegalStateException
/*    */     //   220: dup
/*    */     //   221: ldc 'call to 'resume' before 'invoke' with coroutine'
/*    */     //   223: invokespecial <init> : (Ljava/lang/String;)V
/*    */     //   226: athrow
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #48	-> 60
/*    */     //   #49	-> 93
/*    */     //   #50	-> 94
/*    */     //   #224	-> 96
/*    */     //   #225	-> 118
/*    */     //   #231	-> 133
/*    */     //   #232	-> 138
/*    */     //   #50	-> 147
/*    */     //   #232	-> 148
/*    */     //   #233	-> 149
/*    */     //   #224	-> 154
/*    */     //   #48	-> 175
/*    */     //   #234	-> 197
/*    */     //   #50	-> 199
/*    */     //   #52	-> 207
/*    */     //   #48	-> 217
/*    */     // Local variable table:
/*    */     //   start	length	slot	name	descriptor
/*    */     //   93	55	1	onDispose	Lkotlin/jvm/functions/Function0;
/*    */     //   148	30	1	onDispose	Lkotlin/jvm/functions/Function0;
/*    */     //   189	9	1	onDispose	Lkotlin/jvm/functions/Function0;
/*    */     //   198	9	1	onDispose	Lkotlin/jvm/functions/Function0;
/*    */     //   207	10	1	onDispose	Lkotlin/jvm/functions/Function0;
/*    */     //   115	39	4	uCont$iv	Lkotlin/coroutines/Continuation;
/*    */     //   133	21	6	cancellable$iv	Lkotlinx/coroutines/CancellableContinuationImpl;
/*    */     //   147	1	7	$i$a$-suspendCancellableCoroutine-ProduceStateScopeImpl$awaitDispose$2	I
/*    */     //   118	36	5	$i$a$-suspendCoroutineUninterceptedOrReturn-CancellableContinuationKt$suspendCancellableCoroutine$2$iv	I
/*    */     //   96	82	3	$i$f$suspendCancellableCoroutine	I
/*    */     //   50	167	9	$continuation	Lkotlin/coroutines/Continuation;
/*    */     //   57	160	8	$result	Ljava/lang/Object;
/*    */     //   180	18	3	$i$f$suspendCancellableCoroutine	I
/*    */     // Exception table:
/*    */     //   from	to	target	type
/*    */     //   93	169	207	finally
/*    */     //   189	207	207	finally
/*    */     //   207	208	207	finally
/*    */   }
/*    */   
/*    */   @DebugMetadata(f = "ProduceState.kt", l = {224}, i = {0}, s = {"L$0"}, n = {"onDispose"}, m = "awaitDispose", c = "androidx.compose.runtime.ProduceStateScopeImpl")
/*    */   @Metadata(mv = {1, 9, 0}, k = 3, xi = 48)
/*    */   static final class ProduceStateScopeImpl$awaitDispose$1 extends ContinuationImpl {
/*    */     Object L$0;
/*    */     int label;
/*    */     
/*    */     ProduceStateScopeImpl$awaitDispose$1(Continuation $completion) {
/*    */       super($completion);
/*    */     }
/*    */     
/*    */     @Nullable
/*    */     public final Object invokeSuspend(@NotNull Object $result) {
/*    */       this.result = $result;
/*    */       this.label |= Integer.MIN_VALUE;
/*    */       return ProduceStateScopeImpl.this.awaitDispose(null, (Continuation)this);
/*    */     }
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\runtime-desktop-1.7.3.jar!\androidx\compose\runtime\ProduceStateScopeImpl.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */